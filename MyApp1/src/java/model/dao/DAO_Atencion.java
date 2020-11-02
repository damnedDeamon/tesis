package model.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Atencion;
import model.Conexion;

public class DAO_Atencion extends Conexion implements DAO<Atencion>{
    private Conexion con;
    private ResultSet rs;
    private Atencion a;

    public DAO_Atencion() throws ClassNotFoundException, SQLException {
        super("veterinaria");
    }

    
    @Override
    public void create(Atencion ob) throws SQLException {
        ejecutar("insert into atencion values(null, '"+ob.getFechaHora()+
                                                "','"+ob.getResumen()+
                                                "','"+ob.getVeterinarioAFK()+
                                                "','"+ob.getMascotaAFK()+
                                                "','"+ob.getTipoAtencionAFK()+"');");
    }

    @Override
    public void update(Atencion ob) throws SQLException {
        ejecutar("update atencion set fecha = '"+ob.getFechaHora()+"', \n" +
                "                    resumen = '"+ob.getResumen()+"',\n" +
                "                    atendido_fk = '"+ob.getVeterinarioAFK()+"',\n" +
                "                    mascota_fk = '"+ob.getMascotaAFK()+"',\n" +
                "                    tipo_atencion_fk = '"+ob.getTipoAtencionAFK()+"' \n" +
                "                    where id = "+ob.getId()+";");
    }

    @Override
    public void delete(int id) throws SQLException {
        ejecutar("delete from atencion where id = '"+id+"';");
    }

    @Override
    public List<Atencion> read() throws SQLException {
         List<Atencion> lista = new ArrayList<>();
        
        rs = ejecutar("select * from atencion;");
        
        while(rs.next()){
            a = new Atencion();
            
            a.setId(rs.getInt(1));
            a.setFechaHora(rs.getString(2));
            a.setResumen(rs.getString(3));
            a.setVeterinarioAFK(rs.getString(4));
            a.setMascotaAFK(rs.getString(5));
            a.setTipoAtencionAFK(rs.getString(6));
            
            lista.add(a);
        }
        
        return lista;
    }
    
    public List<Atencion> readIdMascota(int id) throws SQLException {
         List<Atencion> lista = new ArrayList<>();
        
        rs = ejecutar("select a.id, v.nombre, m.nombreMascota, ta.nombreAtencion, a.resumen, a.fecha\n" +
                        "from atencion a \n" +
                        "inner join veterinario v\n" +
                        "on a.atendido_fk = v.id\n" +
                        "inner join mascota m\n" +
                        "on a.mascota_fk = m.id\n" +
                        "inner join tipo_atencion ta\n" +
                        "on a.tipo_atencion_fk = ta.id\n" +
                        "where m.id = "+id+";");
       
        while(rs.next()){
            a = new Atencion();
            
            a.setId(rs.getInt(1));
            a.setVeterinarioAFK(rs.getString(2));
            a.setMascotaAFK(rs.getString(3));
            a.setTipoAtencionAFK(rs.getString(4));
            a.setResumen(rs.getString(5));
            a.setFechaHora(rs.getString(6));
            
            lista.add(a);
        }
        
        return lista;
    }
    public List<Atencion> readIdAtencion(int id) throws SQLException {
         List<Atencion> lista = new ArrayList<>();
        
        rs = ejecutar("select m.id, v.id, ta.id\n" +
                        "from atencion a\n" +
                        "inner join mascota m\n" +
                        "on m.id = a.mascota_fk\n" +
                        "inner join veterinario v\n" +
                        "on v.id = a.atendido_fk\n" +
                        "inner join tipo_atencion ta\n" +
                        "on ta.id = a.tipo_atencion_fk\n" +
                        "where a.id = '"+id+"';");
       
        while(rs.next()){
            a = new Atencion();
            
            a.setMascotaAFK(rs.getString(1));
            a.setVeterinarioAFK(rs.getString(2));
            a.setTipoAtencionAFK(rs.getString(3));
            
            lista.add(a);
        }
        
        return lista;
    }
    
    public List<Atencion> buscarAtencion(String id) throws SQLException {
         List<Atencion> lista = new ArrayList<>();
        
        rs = ejecutar("select a.id, v.nombre, m.nombreMascota, ta.nombreAtencion, a.resumen, a.fecha\n" +
                        "from atencion a \n" +
                        "inner join veterinario v\n" +
                        "on a.atendido_fk = v.id\n" +
                        "inner join mascota m\n" +
                        "on a.mascota_fk = m.id\n" +
                        "inner join tipo_atencion ta\n" +
                        "on a.tipo_atencion_fk = ta.id\n" +
                        "where a.id = "+id+";");
       
        while(rs.next()){
            a = new Atencion();
            
            a.setId(rs.getInt(1));
            a.setVeterinarioAFK(rs.getString(2));
            a.setMascotaAFK(rs.getString(3));
            a.setTipoAtencionAFK(rs.getString(4));
            a.setResumen(rs.getString(5));
            a.setFechaHora(rs.getString(6));
            
            lista.add(a);
        }
        
        return lista;
    }
    
    

    @Override
    public List<Atencion> findBy(String nombreAtencion) throws SQLException {
       List<Atencion> lista = new ArrayList<>();
        
        rs = ejecutar("select * from atencion "
                    + "where tipo_atencion_fk like '%"+nombreAtencion+"%';");
        
        while(rs.next()){
            a = new Atencion();
            
            a.setId(rs.getInt(1));
            a.setFechaHora(rs.getString(2));
            a.setResumen(rs.getString(3));
            a.setVeterinarioAFK(rs.getString(4));
            a.setMascotaAFK(rs.getString(5));
            a.setTipoAtencionAFK(rs.getString(6));
            
            lista.add(a);
        }
        
        return lista;
    }

    @Override
    public Atencion read(int id) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}
