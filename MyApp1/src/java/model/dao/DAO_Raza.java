package model.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Conexion;
import model.Raza;

public class DAO_Raza extends Conexion implements DAO<Raza>{

    private ResultSet rs;
    
    public DAO_Raza() throws ClassNotFoundException, SQLException {
        super("veterinaria");
    }

    @Override
    public void create(Raza ob) throws SQLException {
        ejecutar("insert into raza values(null, '"+ob.getNombreRaza()+"');");
    }

    @Override
    public void update(Raza ob) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(int id) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Raza> read() throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Raza> findBy(String id) throws SQLException {
        List<Raza> lista = new ArrayList<>();
            rs = ejecutar("select r.id, r.nombreRaza from raza r inner join tipo_mascota tm on tm.id = r.tipo_mascota where tm.id = "+id+";");
        
        Raza r;
        while(rs.next()){
            r = new Raza();
            
            r.setId(rs.getInt(1));
            r.setNombreRaza(rs.getString(2));
            lista.add(r);
        }
        
        return lista;
    }
    
    public List<Raza> readId(int idTipo, int idRaza) throws SQLException {
        List<Raza> lista = new ArrayList<>();
            rs = ejecutar("select r.id, r.nombreRaza from raza r inner join tipo_mascota tm on r.tipo_mascota = tm.id where tm.id = "+idTipo+" and r.id = "+idRaza+";");
        
        Raza r;
        while(rs.next()){
            r = new Raza();
            
            r.setId(rs.getInt(1));
            r.setNombreRaza(rs.getString(2));
            lista.add(r);
        }
        
        return lista;
    }
    
    public List<Raza> readName(int idTipo, String nameRaza) throws SQLException {
        List<Raza> lista = new ArrayList<>();
            rs = ejecutar("select r.id, r.nombreRaza from raza r inner join tipo_mascota tm on r.tipo_mascota = tm.id where tm.id = "+idTipo+" and r.nombreRaza = '"+nameRaza+"';");
        
        Raza r;
        while(rs.next()){
            r = new Raza();
            
            r.setId(rs.getInt(1));
            r.setNombreRaza(rs.getString(2));
            lista.add(r);
        }
        
        return lista;
    }

    @Override
    public Raza read(int id) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
}
