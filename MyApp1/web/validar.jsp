<%@page import="model.Cliente"%>
<%@page import="model.Veterinario"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
Cliente c = (Cliente)session.getAttribute("cliente");
Veterinario v = (Veterinario)session.getAttribute("veterinario");
if(c == null){
    // no he iniciado sesión
    if(v == null){
        request.getRequestDispatcher("index.jsp").forward(request, response);
    }
}
%>