package model.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Conexion;
import model.DetalleAnimal;
import model.Veterinario;

public class DAO_Veterinario extends Conexion implements DAO<Veterinario>{

    private ResultSet rs;
    
    public DAO_Veterinario() throws ClassNotFoundException, SQLException {
        super("veterinaria");
    }

    @Override
    public void create(Veterinario ob) throws SQLException {
        ejecutar("insert into veterinario values(null, '"+ob.getNombre()+
                                                "','"+ob.getGmail()+
                                                "','"+ob.getRut()+"');");
    }
    
    public Veterinario getVeterinario(String rut) throws SQLException{
        ResultSet rs = ejecutar("select * from veterinario where clave = '"+rut+"';");
        
        Veterinario v = null;
        if(rs.next()){
            v = new Veterinario();
            
            v.setId(rs.getInt(1));
            v.setNombre(rs.getString(2));
            v.setGmail(rs.getString(3));
            v.setRut(rs.getString(4));
            
            
        }
        
        close();
        
        return v;
    }
    public List<DetalleAnimal> detalleMascota() throws SQLException {
        List<DetalleAnimal> lista = new ArrayList<>();
        
        rs = ejecutar("select m.id, c.nombre, m.nombreMascota, m.fechaDeNacimeinto, m.edad, m.sexo, m.peso, tm.tipoMascota, r.nombreRaza \n" +
                    "from mascota m\n" +
                    "inner join tipo_mascota tm\n" +
                    "on m.tipo_fk = tm.id\n" +
                    "inner join raza r\n" +
                    "on m.raza_fk = r.id\n" +
                    "inner join cliente c\n" +
                    "on m.cliente_fk = c.id;");
        DetalleAnimal d;
        while(rs.next()){
            d = new DetalleAnimal();
            
            d.setId(rs.getInt(1));
            d.setNombreCliente(rs.getString(2));
            d.setNombreMascota(rs.getString(3));
            d.setFechaNacimiento(rs.getString(4));
            d.setEdad(rs.getInt(5));
            d.setSexo(rs.getString(6));
            d.setPeso(rs.getFloat(7));
            d.setTipoMascota(rs.getString(8));
            d.setRaza(rs.getString(9));
            
            lista.add(d);
        }
        
        return lista;
    }

    @Override
    public void update(Veterinario ob) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(int id) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Veterinario> read() throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Veterinario> findBy(String txt) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Veterinario read(int id) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public void readUser(int id, String clave) throws SQLException {
        
        rs = ejecutar("select * from cliente "
                    + "where id = '"+id+"';");
        
        Veterinario v = null;
        if(rs.next()){
            v = new Veterinario();
            
            v.setId(rs.getInt(1));
            v.setNombre(rs.getString(2));
            v.setRut(rs.getString(3));
            
        }
        
    }


   
}
