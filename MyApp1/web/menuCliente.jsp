<%@page import="model.ClienteAndMascota"%>
<%@page import="model.dao.DAO_Cliente"%>
<%@page import="model.Cliente"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@include file="validar.jsp" %>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Menu Cliente</h1>

        Bienvenid@ <%= c.getNombre()%>
        <style type="text/css">
            table, th, td {
                border: 1px solid black;
            }

            td, th {
                padding: 10px;
            }
            th {
                text-align: left;
            }
        </style>

        <%
            DAO_Cliente dc = new DAO_Cliente();

            for (ClienteAndMascota cm : dc.readMascotaCliente(c.getId())) {%> 

        <table style="width: 70%">
            <tr>
                <th>
                    Nombre Mascota
                </th>
                <th>
                    Fecha de nacimiento
                </th>
                <th>
                    Edad
                </th>
                <th>
                    Peso
                </th>
                <th>
                    Mascota
                </th>
                <th>
                    Raza
                </th>
                <th>
                    Atencion
                </th>
            </tr>
            <tr>
                <td><%= cm.getNombreMascota()%></td>
                <td><%= cm.getFechaNacimiento()%></td>
                <td><%= cm.getEdad()%></td>
                <td><%= cm.getPeso()%></td>
                <td><%= cm.getTipoMascota()%></td>
                <td><%= cm.getRaza()%></td>
                <td>
                    <form action="detalleMascotaCliente.jsp" method="post">
                        <input type="hidden" name="idMascota" value="<%= cm.getId()%>"/>
                        <input type="submit" value="Ver detalles">
                    </form>
                </td>
            </tr>
        </table>
        <%}%>
        <a href="index.jsp">Cerrar sesión</a><br>

    </body>
</html>
