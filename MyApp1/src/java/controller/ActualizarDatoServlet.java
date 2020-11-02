package controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Cliente;
import model.Mascota;
import model.Raza;
import model.TipoMascota;
import model.dao.DAO_Cliente;
import model.dao.DAO_Mascota;
import model.dao.DAO_Raza;
import model.dao.DAO_TipoMascota;

/**
 *
 * @author Matias
 */
@WebServlet(name = "ActualizarDatoServlet", urlPatterns = {"/actualizarDato.do"})
public class ActualizarDatoServlet extends HttpServlet {

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        
        Mascota m = new Mascota();
        
        DAO_Cliente dc; 
        DAO_Mascota dm;
        
        
        
        try {
            int idUsiario;
            int id = Integer.parseInt(request.getParameter("idMascota"));
           
            dc = new DAO_Cliente();
            
            for(Cliente cli: dc.buscarId(id)){
                idUsiario = cli.getId();
                
                dm = new DAO_Mascota();
                m.setIid(id);
                m.setNombreMacota(request.getParameter("txtNombreMascota"));
                m.setFechaNacimiento(request.getParameter("txtFecha"));
                m.setEdad(Integer.parseInt(request.getParameter("txtEdad")));
                m.setPeso(Float.parseFloat(request.getParameter("txtPeso")));
                
                String macho = request.getParameter("cboSexo");
                if("1".equals(macho)){
                    m.setSexo("1");
                }else{
                    m.setSexo("2");
                }
                
                m.setClienteAFK(idUsiario);
                String nombreAnimal = request.getParameter("txtAnimal");
                String raza =request.getParameter("txtRaza");
                
                DAO_Raza dr = new DAO_Raza();
                DAO_TipoMascota dt = new DAO_TipoMascota();
                
                for(TipoMascota tm: dt.readnombre(nombreAnimal) ){
                    m.setTipoAnimalAFK(tm.getId());
                    
                    for(Raza r: dr.readName(tm.getId(), raza)){
                        m.setRazaAFK(r.getId());
                    }
                }
                dm.update(m);
                
                }
            response.sendRedirect("menuVeterinario.jsp");
            
            
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(ActualizarDatoServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
        
            
            
            
           
        
    }

}
