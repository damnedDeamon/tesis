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
    <body>
        <h1>Menu Veterinario</h1>
        <br>
        <h1>Listado de pacientes</h1>

        Bienvenid@ <%= v.getNombre()%>
        <div class="container">
            <table>
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

                </tbody>
            </table>
            <%

                DAO_Veterinario dv = new DAO_Veterinario();
            %>
            <%for (DetalleAnimal d : dv.detalleMascota()) {%>

            <table>

                <tr>
                    <td height="20px" width="124px"><%= d.getNombreCliente()%></td>
                    <td height="20px" width="125px"><%= d.getNombreMascota()%></td>
                    <td height="20px" width="150px"><%= d.getFechaNacimiento()%></td>
                    <td height="20px" width="54px"><%= d.getEdad()%></td>
                    <%
                        String sexo = d.isSexo();
                        int sexo2 = Integer.parseInt(sexo);
                        if (sexo2 == 1) {

                    %>
                    <td height="20px" width="53px">Macho</td>
                    <%                    } else {
                    %>
                    <td height="20px" width="53px">Hembra</td>
                    <%
                    }%>
                    <td height="20px" width="46px"><%= d.getPeso()%></td>
                    <td height="20px" width="81px"><%= d.getTipoMascota()%></td>
                    <td height="20px" width="81px"><%= d.getRaza()%></td>
                    <td height="20px" width="100px">
                        <form action="listaDetallada.jsp" method="post">
                            <input type="hidden" name="idMascota" value="<%= d.getId()%>"/>
                            <input type="submit" value="Ver detalles" name="btnFechaAtencion">
                        </form>
                    </td>
                    <td height="20px" width="100px">
                        <form action="actualizarDatos.jsp" method="post">
                            <input type="hidden" name="idMascota" value="<%= d.getId()%>"/>
                            <input type="submit" value="Actualizar" name="btnFechaAtencion">
                        </form>
                    </td>
                    <td height="20px" width="100px">
                        <form action="crearHoraMascota.jsp" method="post">
                            <input type="hidden" name="idMascota" value="<%= d.getId()%>"/>
                            <input type="submit" value="Añadir" name="btnFechaAtencion">
                        </form>
                    </td>
                </tr>
            </table>
        </div>
        <%}%>

        <br>
        <a href="index.jsp">Cerrar sesión</a><br>
        <a href="registrarCliente.jsp">Agregar mascota</a>
    </body>
</html>
