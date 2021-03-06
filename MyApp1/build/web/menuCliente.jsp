<%@page import="model.ClienteAndMascota"%>
<%@page import="model.dao.DAO_Cliente"%>
<%@page import="model.Cliente"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@include file="validar.jsp" %>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="css/barraMenu.css">
        <link rel="stylesheet" href="css/prueba.css">
        <title>JSP Page</title>
    </head>
    <body class="cuerpoDetalle">
        <header>
            <section>
                <nav>
                    <ul>
                        <li><a href="#"><i class="home"></i>Home</a></li>
                        <li><a href="#"><i class="Contacto"></i>Contacto</a></li>
                        <li><a href="#"><i class="informacion"></i>informacion</a></li>
                        <li><a href="#"><i class="fotos"></i>fotos</a></li>
                        <li><a href="index.jsp"><i class="cerrar-sesion"></i>cerrar sesion</a></li>
                    </ul>
                </nav>
            </section>
        </header>
        <h1>Menu Paciente</h1>

        <h3>Bienvenid@ <%= c.getNombre()%></h3>
        <br>
        <div class="container">
            <table>
                <thead>
                    <tr>
                        <th>Nombre Mascota</th>
                        <th>Fecha de nacimiento</th>
                        <th>Edad</th>
                        <th>Peso</th>
                        <th>Mascota</th>
                        <th>Raza</th>
                        <th>Atencion</th>
                    </tr>
                </thead>
                <tbody>
                     <%DAO_Cliente dc = new DAO_Cliente();
                          for (ClienteAndMascota cm : dc.readMascotaCliente(c.getId())) {%> 
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
                                <input type="submit" class="button button5" value="Ver detalles">
                                
                            </form>
                        </td>
                    </tr>
                    <%}%>
                </tbody>
            </table>
        </div>
        

    </body>
</html>
