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
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Cliente;
import model.Mascota;
import model.dao.DAO_Cliente;
import model.dao.DAO_Mascota;

/**
 *
 * @author Matias
 */
@WebServlet(name = "CrearClienteServlet", urlPatterns = {"/crearCliente.do"})
public class CrearClienteServlet extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }

  
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        Cliente c = new Cliente();
        
        DAO_Cliente dc;
        try {
            
            c.setDireccion(request.getParameter("txtDireccion"));
            c.setNombre(request.getParameter("txtNombre"));
            c.setGmail(request.getParameter("txtGmail"));
            c.setRut(request.getParameter("txtRut"));
            c.setTelefono(request.getParameter("txtTelefono"));
            
            dc = new DAO_Cliente();
            dc.create(c);
            String rut = request.getParameter("txtRut");
            for(Cliente cli: dc.buscarUsuario(rut)){
                
                int id = cli.getId();
                request.setAttribute("id", id);
                RequestDispatcher rd =  request.getRequestDispatcher("registrarCliente.jsp");
                rd.forward(request, response);
            }
            
            
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(CrearClienteServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }

}
