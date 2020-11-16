package model.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Cliente;
import model.ClienteAndMascota;
import model.Conexion;
import model.exceptions.ClienteNotFoundException;

public class DAO_Cliente extends Conexion implements DAO<Cliente>{
    
    private ResultSet rs;
    

    public DAO_Cliente() throws ClassNotFoundException, SQLException {
        super("veterinaria");
    }
    
    public Cliente getCliente(String rut) throws SQLException{
        rs = ejecutar("select * from cliente where clave = '"+rut+"';");
        
        Cliente c = null;
        if(rs.next()){
            c = new Cliente();
            
            c.setId(rs.getInt(1));
            c.setDireccion(rs.getString(2));
            c.setNombre(rs.getString(3));
            c.setGmail(rs.getString(4));
            c.setRut(rs.getString(5));
            c.setTelefono(rs.getString(6));
            
            
        }
        
        close();
        
        return c;
    }

    @Override
    public void create(Cliente ob) throws SQLException {
        ejecutar("insert into cliente values(null, '"+ob.getDireccion()+
                                                "','"+ob.getNombre()+
                                                "','"+ob.getGmail()+
                                                "','"+ob.getRut()+
                                                "','"+ob.getTelefono()+"');");
        
       // ejecutar("insert into cliente values(null,'Jose Toribio Medina','Matias Diaz','matias@gmail.com','11-1','+56945608192');");
    }

    @Override
    public void update(Cliente ob) throws SQLException {
        ejecutar("update cliente set direccion = '"+ob.getDireccion()+"',"
                                + "  nombre = '"+ob.getNombre()+"', "
                                + " gmail = '"+ob.getGmail()+"', "
                                + " clave = '"+ob.getRut()+"', "
                                + " telefono = '"+ob.getTelefono()+"' "
                                + "where id = '"+ob.getId()+"';");
    }
    
    

    @Override
    public void delete(int id) throws SQLException {
        ejecutar("delete from cliente where id = '"+id+"';");
    }

    @Override
    public List<Cliente> read() throws SQLException {
        List<Cliente> lista = new ArrayList<>();
        
        rs = ejecutar("select * from cliente;");
        Cliente c;
        while(rs.next()){
            c = new Cliente();
            
            c.setId(rs.getInt(1));
            c.setDireccion(rs.getString(2));
            c.setNombre(rs.getString(3));
            c.setGmail(rs.getString(4));
            c.setRut(rs.getString(5));
            c.setTelefono(rs.getString(6));
            
            lista.add(c);
        }
        
        return lista;
    }
    
    public List<Cliente> buscarGmail(int idMascota) throws SQLException {
        List<Cliente> lista = new ArrayList<>();
        
        rs = ejecutar("select c.gmail from cliente c\n" +
                        "inner join mascota m\n" +
                        "on c.id = m.cliente_fk\n" +
                        "where m.id = "+idMascota+";");
        Cliente c;
        while(rs.next()){
            c = new Cliente();
            
            c.setGmail(rs.getString(1));
            
            lista.add(c);
        }
        
        return lista;
    }
    
    
    public List<ClienteAndMascota> buscarUsuario(String clave) throws SQLException {
        List<ClienteAndMascota> lista = new ArrayList<>();
        
        rs = ejecutar("select * from cliente where clave = '"+clave+"';");
        ClienteAndMascota c;
        while(rs.next()){
            c = new ClienteAndMascota();
            
            c.setId(rs.getInt(1));
            
            lista.add(c);
        }
        
        return lista;
    }
    
    public List<Cliente> buscarId(int id) throws SQLException {
        List<Cliente> lista = new ArrayList<>();
        
        rs = ejecutar("select c.id from cliente c\n" +
                        "inner join mascota m\n" +
                        "on m.cliente_fk = c.id \n" +
                        "where m.id = "+id+"; ");
        Cliente c;
        while(rs.next()){
            c = new Cliente();
            
            c.setId(rs.getInt(1));
            
            lista.add(c);
        }
        
        return lista;
    }

    @Override
    public List<Cliente> findBy(String nombre) throws SQLException {
        List<Cliente> lista = new ArrayList<>();
        
        rs = ejecutar("select * from cliente "
                    + "where nombre like '%"+nombre+"%';");
        Cliente c;
        while(rs.next()){
            c = new Cliente();
            
            c.setId(rs.getInt(1));
            c.setDireccion(rs.getString(2));
            c.setNombre(rs.getString(3));
            c.setGmail(rs.getString(4));
            c.setRut(rs.getString(5));
            c.setTelefono(rs.getString(6));
            
            lista.add(c);
        }
        
        return lista;
    }
    
    public List<ClienteAndMascota> readMascotaCliente(int id) throws SQLException {
        List<ClienteAndMascota> lista = new ArrayList<>();
        
        rs = ejecutar("select m.id, m.nombreMascota, m.fechaDeNacimeinto, m.edad, m.peso, tm.tipoMascota, r.nombreRaza \n" +
                    "from mascota m\n" +
                    "inner join tipo_mascota tm\n" +
                    "on m.tipo_fk = tm.id\n" +
                    "inner join raza r\n" +
                    "on m.raza_fk = r.id\n" +
                    "inner join cliente c\n" +
                    "on m.cliente_fk = c.id\n" +
                    "where c.id = "+id+";");
        ClienteAndMascota cm;
        while(rs.next()){
            cm = new ClienteAndMascota();
            
            cm.setId(rs.getInt(1));
            cm.setNombreMascota(rs.getString(2));
            cm.setFechaNacimiento(rs.getString(3));
            cm.setEdad(rs.getInt(4));
            cm.setPeso(rs.getFloat(5));
            cm.setTipoMascota(rs.getString(6));
            cm.setRaza(rs.getString(7));
            
            lista.add(cm);
        }
        
        return lista;
    }

    @Override
    public Cliente read(int id) throws SQLException {
            rs = ejecutar("select * from cliente "
                    + "where id = '"+id+"';");
        
        Cliente c = null;
        if(rs.next()){
            c = new Cliente();
            
            c.setId(rs.getInt(1));
            c.setDireccion(rs.getString(2));
            c.setNombre(rs.getString(3));
            c.setGmail(rs.getString(4));
            c.setRut(rs.getString(5));
            c.setTelefono(rs.getString(6));
            
        }
        
        return c;
    }
    
    public List<Cliente> buscar(int id) throws SQLException {
        List<Cliente> lista = new ArrayList<>();
            rs = ejecutar("select * from cliente "
                    + "where id = '"+id+"';");
        
        Cliente c;
        while(rs.next()){
            c = new Cliente();
            
            c.setId(rs.getInt(1));
            c.setDireccion(rs.getString(2));
            c.setNombre(rs.getString(3));
            c.setGmail(rs.getString(4));
            c.setRut(rs.getString(5));
            c.setTelefono(rs.getString(6));
            lista.add(c);
        }
        
        return lista;
    }
    
    public Cliente readCliente(String nombre) throws SQLException, ClienteNotFoundException {
        
        rs = ejecutar("select * from cliente "
                    + "where nombre = '"+nombre+"';");
        
        Cliente c = null;
        if(rs.next()){
            c = new Cliente();
            
            c.setId(rs.getInt(1));
            c.setDireccion(rs.getString(2));
            c.setNombre(rs.getString(3));
            c.setGmail(rs.getString(4));
            c.setRut(rs.getString(5));
            c.setTelefono(rs.getString(6));
            
        }
        
        return c;
    }

    
    
}
