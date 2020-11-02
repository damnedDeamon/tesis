package model.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Conexion;
import model.TipoMascota;

public class DAO_TipoMascota extends Conexion implements DAO<TipoMascota>{

    private ResultSet rs;

    public DAO_TipoMascota() throws ClassNotFoundException, SQLException {
        super("veterinaria");
    }

    @Override
    public void create(TipoMascota ob) throws SQLException {
        ejecutar("insert into tipo_mascota values(null, '"+ob.getTipoMascota()+"');");
    }

    @Override
    public void update(TipoMascota ob) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(int id) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<TipoMascota> read() throws SQLException {
        List<TipoMascota> lista = new ArrayList<>();
            rs = ejecutar("select * from tipo_mascota;");
        
        TipoMascota tm;
        while(rs.next()){
            tm = new TipoMascota();
            
            tm.setId(rs.getInt(1));
            tm.setTipoMascota(rs.getString(2));
            lista.add(tm);
        }
        
        return lista;
    }
    
    public List<TipoMascota> readId(int id) throws SQLException {
        List<TipoMascota> lista = new ArrayList<>();
            rs = ejecutar("select * from tipo_mascota where id = '"+id+"';");
        
        TipoMascota tm;
        while(rs.next()){
            tm = new TipoMascota();
            
            tm.setId(rs.getInt(1));
            tm.setTipoMascota(rs.getString(2));
            lista.add(tm);
        }
        
        return lista;
    }
    
    public List<TipoMascota> readnombre(String nombre) throws SQLException {
        List<TipoMascota> lista = new ArrayList<>();
            rs = ejecutar("select * from tipo_mascota where tipoMascota = '"+nombre+"';");
        
        TipoMascota tm;
        while(rs.next()){
            tm = new TipoMascota();
            
            tm.setId(rs.getInt(1));
            tm.setTipoMascota(rs.getString(2));
            lista.add(tm);
        }
        
        return lista;
    }

    @Override
    public List<TipoMascota> findBy(String txt) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public TipoMascota read(int id) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
