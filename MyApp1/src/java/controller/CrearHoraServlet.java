/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Atencion;
import model.TipoAtencion;
import model.dao.DAO_Atencion;
import model.dao.DAO_TipoAtencion;

/**
 *
 * @author Matias
 */
@WebServlet(name = "CrearHoraServlet", urlPatterns = {"/crearHora.do"})
public class CrearHoraServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
    }

  
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        try {
            DAO_Atencion da = new DAO_Atencion();
            
            Atencion a = new Atencion();
            
            
            String fecha = request.getParameter("txtFecha");
            String hora = request.getParameter("txtHora");
            String unidos = fecha+" "+hora;
            
            a.setFechaHora(unidos);
            a.setMascotaAFK(request.getParameter("idMascota"));
            a.setResumen(request.getParameter("txtResumen"));
            a.setTipoAtencionAFK(request.getParameter("tipoAtencion"));
            a.setVeterinarioAFK(request.getParameter("idVete"));
            
            da.create(a);
            response.sendRedirect("menuVeterinario.jsp");
            
            
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(CrearHoraServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }

}
