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
import model.Mascota;
import model.dao.DAO_Mascota;

/**
 *
 * @author Matias
 */
@WebServlet(name = "CrearMascotaServlet", urlPatterns = {"/crearMascota.do"})
public class CrearMascotaServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    
    }
    
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        Mascota m = new Mascota();
        
        DAO_Mascota dm;
        try {
            dm = new DAO_Mascota();
            // sin ayax
//            m.setNombreMacota(request.getParameter("txtNombreMascota"));
//            m.setFechaNacimiento(request.getParameter("txtFecha"));
//            m.setEdad(Integer.parseInt(request.getParameter("txtEdad")));
//            m.setPeso(Float.parseFloat(request.getParameter("txtPeso")));
//
//            String macho = request.getParameter("selectSexo");
//            if("1".equals(macho)){
//                m.setSexo("1");
//            }else{
//                m.setSexo("2");
//            }
//
////            m.setClienteAFK(cli.getId());
//            m.setTipoAnimalAFK(Integer.parseInt(request.getParameter("tipoMascota")));
//            m.setRazaAFK(Integer.parseInt(request.getParameter("txtRaza")));
            


            // con ayax
            m.setNombreMacota(request.getParameter("nombre"));
            m.setFechaNacimiento(request.getParameter("fecha"));
            m.setEdad(Integer.parseInt(request.getParameter("edad")));
            m.setPeso(Float.parseFloat(request.getParameter("peso")));
            
            String macho = request.getParameter("sexo");
            System.out.println(request.getParameter("sexo"));
            System.out.println("qqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqq");
            if("Macho".equals(macho)){
                m.setSexo("1");
            }else{
                m.setSexo("2");
            }
            
            m.setClienteAFK(Integer.parseInt(request.getParameter("idCliente")));
            m.setTipoAnimalAFK(Integer.parseInt(request.getParameter("tipoMascota")));
            m.setRazaAFK(Integer.parseInt(request.getParameter("tipoRaza")));
            
            dm.create(m);
            System.out.println(Integer.parseInt(request.getParameter("idCliente")));
            
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(CrearMascotaServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
       
    }
    
            
        
        
    

    
}
