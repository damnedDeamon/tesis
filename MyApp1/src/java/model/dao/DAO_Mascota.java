package model.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Conexion;
import model.Mascota;

public class DAO_Mascota extends Conexion implements DAO<Mascota>{

    private ResultSet rs;
    
    
    public DAO_Mascota() throws ClassNotFoundException, SQLException {
        super("veterinaria");
    }

    @Override
    public void create(Mascota ob) throws SQLException {
        ejecutar("insert into mascota values(null, '"+ob.getNombreMacota()+
                                                "','"+ob.getFechaNacimiento()+
                                                "','"+ob.getEdad()+
                                                "','"+ob.getPeso()+
                                                "','"+ob.getSexo()+
                                                "','"+ob.getClienteAFK()+
                                                "','"+ob.getTipoAnimalAFK()+
                                                "','"+ob.getRazaAFK()+"');");
    }
    
    public List<Mascota> buscarMascota(int id) throws SQLException {
        List<Mascota> lista = new ArrayList<>();
            rs = ejecutar("select * from mascota m inner join cliente c on m.cliente_fk = c.id where c.id = "+id+";");
        
        Mascota m;
        while(rs.next()){
            m = new Mascota();
            
            m.setIid(rs.getInt(1));
            m.setNombreMacota(rs.getString(2));
            m.setFechaNacimiento(rs.getString(3));
            m.setEdad(rs.getInt(4));
            m.setPeso(rs.getFloat(5));
            m.setSexo(rs.getString(6));
            m.setClienteAFK(rs.getInt(7));
            m.setTipoAnimalAFK(rs.getInt(8));
            m.setRazaAFK(rs.getInt(9));
            lista.add(m);
        }
        
        return lista;
    }

    @Override
    public void update(Mascota ob) throws SQLException {
        ejecutar("update mascota set nombreMascota = '"+ob.getNombreMacota()+"',"
                                + " fechaDeNacimeinto = '"+ob.getFechaNacimiento()+"', "
                                + " edad = '"+ob.getEdad()+"', "
                                + " peso = '"+ob.getPeso()+"', "
                                + " sexo = '"+ob.getSexo()+"', "
                                + " cliente_fk = '"+ob.getClienteAFK()+"', "
                                + " tipo_fk = '"+ob.getTipoAnimalAFK()+"', "
                                + " raza_fk = '"+ob.getRazaAFK()+"' "
                                + " where id = "+ob.getIid()+";");
    }
    
    
    

    @Override
    public void delete(int id) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Mascota> read() throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Mascota> findBy(String txt) throws SQLException {
        List<Mascota> lista = new ArrayList<>();
            rs = ejecutar("select * from mascota where id = "+txt+";");
        
        Mascota m;
        while(rs.next()){
            m = new Mascota();
            
            m.setIid(rs.getInt(1));
            m.setNombreMacota(rs.getString(2));
            m.setFechaNacimiento(rs.getString(3));
            m.setEdad(rs.getInt(4));
            m.setPeso(rs.getFloat(5));
            m.setSexo(rs.getString(6));
            m.setClienteAFK(rs.getInt(7));
            m.setTipoAnimalAFK(rs.getInt(8));
            m.setRazaAFK(rs.getInt(9));
            lista.add(m);
        }
        
        return lista;
    }

    @Override
    public Mascota read(int id) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}
