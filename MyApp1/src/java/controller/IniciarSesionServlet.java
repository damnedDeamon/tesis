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
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Cliente;
import model.Veterinario;
import model.dao.DAO_Cliente;
import model.dao.DAO_Veterinario;

/**
 *
 * @author Matias
 */
@WebServlet(name = "IniciarSesionServlet", urlPatterns = {"/iniciarSesion.do"})
public class IniciarSesionServlet extends HttpServlet {

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.sendRedirect("index.jsp");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        try {
            Veterinario v = new DAO_Veterinario().getVeterinario(request.getParameter("rut"));
            Cliente c = new DAO_Cliente().getCliente(request.getParameter("rut"));
            
            if(v == null){
                if(c == null){
                    response.sendRedirect("error.jsp");
                }else{
                    request.getSession().setAttribute("cliente", c);
                    response.sendRedirect("menuCliente.jsp");
                }
                
            }else{
                // menu
                request.getSession().setAttribute("veterinario", v);
                response.sendRedirect("menuVeterinario.jsp");
            }
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(IniciarSesionServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }


}
