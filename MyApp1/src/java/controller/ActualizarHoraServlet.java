/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
import model.Atencion;
import model.dao.DAO_Atencion;

/**
 *
 * @author Matias
 */
@WebServlet(name = "ActualizarHoraServlet", urlPatterns = {"/actualizarHora.do"})
public class ActualizarHoraServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
    }

 
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        try {
            DAO_Atencion da = new DAO_Atencion();
            Atencion at = new Atencion();
            String resumen, fecha;
            int id;
            
            id = Integer.parseInt(request.getParameter("idAtencion"));
            resumen = request.getParameter("txtResumen");
            fecha = request.getParameter("txtFecha");
            
            
            for(Atencion a: da.readIdAtencion(id)){
                at.setId(id);
                at.setVeterinarioAFK(a.getVeterinarioAFK());
                at.setTipoAtencionAFK(a.getTipoAtencionAFK());
                at.setMascotaAFK(a.getMascotaAFK());
                at.setResumen(resumen);
                at.setFechaHora(fecha);
            }
            
            
            da.update(at);
            response.sendRedirect("menuVeterinario.jsp");
            
            
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(ActualizarHoraServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }

   

}
