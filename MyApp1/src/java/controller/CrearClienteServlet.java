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
        Mascota m = new Mascota();
        
        DAO_Mascota dm;
        DAO_Cliente dc;
        
        
        try {
            
            
            c.setDireccion(request.getParameter("txtDireccion"));
            c.setNombre(request.getParameter("txtNombre"));
            c.setGmail(request.getParameter("txtGmail"));
            c.setRut(request.getParameter("txtRut"));
            c.setTelefono(request.getParameter("txtCelular"));
            
            dc = new DAO_Cliente();
            dc.create(c);
            
            for(Cliente cli: dc.findBy(request.getParameter("txtNombre"))){
                
                m.setNombreMacota(request.getParameter("txtNombreMascota"));
                m.setFechaNacimiento(request.getParameter("txtFecha"));
                m.setEdad(Integer.parseInt(request.getParameter("txtEdad")));
                m.setPeso(Float.parseFloat(request.getParameter("txtPeso")));
                
                String macho = request.getParameter("selectSexo");
                if("1".equals(macho)){
                    m.setSexo("1");
                }else{
                    m.setSexo("2");
                }
                
                m.setClienteAFK(cli.getId());
                m.setTipoAnimalAFK(Integer.parseInt(request.getParameter("tipoMascota")));
                m.setRazaAFK(Integer.parseInt(request.getParameter("txtRaza")));
                
                dm = new DAO_Mascota();
                dm.create(m);
            }
           
            response.sendRedirect("menuVeterinario.jsp");
            
            
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(CrearClienteServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }

}
