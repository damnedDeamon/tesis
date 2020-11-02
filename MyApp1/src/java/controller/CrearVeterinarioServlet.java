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
import model.Veterinario;
import model.dao.DAO_Veterinario;

/**
 *
 * @author Matias
 */
@WebServlet(name = "CrearVeterinarioServlet", urlPatterns = {"/crearVeterinario.do"})
public class CrearVeterinarioServlet extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
        try {
            Veterinario v = new Veterinario();
            
            v.setNombre(request.getParameter("txtNombre"));
            v.setGmail(request.getParameter("txtGmail"));
            v.setRut(request.getParameter("txtRut"));
            
            DAO_Veterinario dc = new DAO_Veterinario();
            dc.create(v);
            
            response.sendRedirect("index.jsp");
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(CrearClienteServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
