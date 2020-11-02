package model.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Conexion;
import model.TipoAtencion;

public class DAO_TipoAtencion extends Conexion implements DAO<TipoAtencion>{

    private Conexion con;
    private ResultSet rs;
    
    public DAO_TipoAtencion() throws ClassNotFoundException, SQLException {
        super("veterinaria");
    }

    @Override
    public void create(TipoAtencion ob) throws SQLException {
        ejecutar("insert into tipo_atencion values(null, '"+ob.getNombreAtencion()+"');");
    }

    @Override
    public void update(TipoAtencion ob) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(int id) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<TipoAtencion> read() throws SQLException {
         List<TipoAtencion> lista = new ArrayList<>();
            rs = ejecutar("select * from tipo_atencion;");
        
        TipoAtencion ta;
        while(rs.next()){
            ta = new TipoAtencion();
            
            ta.setId(rs.getInt(1));
            ta.setNombreAtencion(rs.getString(2));
            lista.add(ta);
        }
        
        return lista;
    }
    
    public List<TipoAtencion> readId(String tipoAtencion) throws SQLException {
         List<TipoAtencion> lista = new ArrayList<>();
            rs = ejecutar("select * from tipo_atencion where nombreAtencion = '"+tipoAtencion+"';");
        
        TipoAtencion ta;
        while(rs.next()){
            ta = new TipoAtencion();
            
            ta.setId(rs.getInt(1));
            ta.setNombreAtencion(rs.getString(2));
            lista.add(ta);
        }
        
        return lista;
    }

    @Override
    public List<TipoAtencion> findBy(String txt) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public TipoAtencion read(int id) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
}
