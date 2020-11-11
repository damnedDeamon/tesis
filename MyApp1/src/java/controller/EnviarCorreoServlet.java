/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Mail;

/**
 *
 * @author Matias
 */
@WebServlet(name = "EnviarCorreoServlet", urlPatterns = {"/enviarCorreo.do"})
public class EnviarCorreoServlet extends HttpServlet {

   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            Mail email = new Mail();
            String correoCliente = request.getParameter("corre");
            String hora = request.getParameter("hora");
            String minuto = request.getParameter("minuto");
            
            
            String de = "PetsTender2020@gmail.com";
            String clave = "mismascotas2020";
            String para = correoCliente;
            System.out.println(correoCliente+"asssssssssssssssssssssssssssssssssssssssssssssssssssssssssssss");
            String asunto = "Recordatorio Hora Veterinario";           
            String mensaje = "Recuerde que tiene hora al veterinario mañana a las "+hora+":"+minuto+".";
            
            
            
            /* 
                
                String[] direcciones = {"correo numero 1","correo numero 2","correo numero 3","correo ..."}
                boolean resultado = email.enviarCorreo(de, clave, direcciones, mensaje, asunto);
            
            */
            
            boolean resultado = email.enviarCorreo(de, clave, para, mensaje, asunto);
            
            if(resultado){
                response.sendRedirect("listaDetallada.jsp");
            }else{
                response.sendRedirect("error.jsp");
            }
       
    }

}
