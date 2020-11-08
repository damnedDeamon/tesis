<%@page import="model.dao.DAO_Veterinario"%>
<%@page import="model.Veterinario"%>
<%@page import="model.DetalleAnimal"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@include file="validar.jsp" %>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="css/menu.css">
        <title>JSP Page</title>
    </head>
    <body class="cuerpoMenuVeterinario">
        <h1 class="titulo">Menu Veterinario</h1>
        <br>
        <h3 class="subTitulo">Listado de pacientes</h3>

        <div class="container">
            <table class="tabla1">
                <thead>
                    <tr>
                        <th>Nombre Dueño</th>
                        <th>Nombre Mascota</th>
                        <th>Fecha de nacimiento</th>
                        <th>Edad</th>
                        <th>sexo</th>
                        <th>Peso</th>
                        <th>Mascota</th>
                        <th>Raza</th>
                        <th>Atencion</th>
                        <th>Actualizar Info</th>
                        <th>Agregar hora</th>
                    </tr>
                </thead>
                <tbody>
                    <%

                        DAO_Veterinario dv = new DAO_Veterinario();
                    %>
                    <%for (DetalleAnimal d : dv.detalleMascota()) {%>
                    <tr>
                        <td><%= d.getNombreCliente()%></td>
                        <td><%= d.getNombreMascota()%></td>
                        <td><%= d.getFechaNacimiento()%></td>
                        <td><%= d.getEdad()%></td>
                        <%
                            String sexo = d.isSexo();
                            int sexo2 = Integer.parseInt(sexo);
                            if (sexo2 == 1) {

                        %>
                        <td>Macho</td>
                        <%} else {%>
                        <td>Hembra</td>
                        <%
                        }%>
                        <td><%= d.getPeso()%></td>
                        <td><%= d.getTipoMascota()%></td>
                        <td><%= d.getRaza()%></td>
                        <td>
                            <form action="listaDetallada.jsp" method="post">
                                <input type="hidden" name="idMascota" value="<%= d.getId()%>"/>
                                <input class="button button5" type="submit" value="Ver detalles" name="btnFechaAtencion">
                            </form>
                        </td>
                        <td>
                            <form action="actualizarDatos.jsp" method="post">
                                <input type="hidden" name="idMascota" value="<%= d.getId()%>"/>
                                <input class="button button5" type="submit" value="Actualizar" name="btnFechaAtencion">
                            </form>
                        </td>
                        <td>
                            <form action="crearHoraMascota.jsp" method="post">
                                <input type="hidden" name="idMascota" value="<%= d.getId()%>"/>
                                <input class="button button5" type="submit" value="Añadir" name="btnFechaAtencion">
                            </form>
                        </td>
                    </tr>
                    <%}%>
                </tbody>
            </table>
        </div>
        

        <br>
        <a href="index.jsp" class="cierre">Cerrar sesión</a><br>
        <a href="registrarCliente.jsp" class="agregarMascota">Agregar mascota</a>
    </body>
</html>
