<%@page import="model.Atencion"%>
<%@page import="model.dao.DAO_Atencion"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="css/actualizarHora.css">
        <title>JSP Page</title>
    </head>
    <body class="cuerpoActualizarHora">
        <%
            String id;
            id = request.getParameter("idAtencion");
            DAO_Atencion da = new DAO_Atencion();
            for (Atencion a : da.buscarAtencion(id)) {


        %>

        <form name="entrada" action="actualizarHora.do" method="POST">  
            <h1 class="titulo">Actualizar Datos</h1><br>
            
            <div class="divTabla">
                <table>
                    <thead>
                        <tr>
                            <th>Veterinario</th>
                            <th class="nombreVet"><input class="txt1"  type="text" name="txtVeterinario" value="<%=a.getVeterinarioAFK()%>" /></th>
                        </tr>
                    </thead>
                </table>
                <table>
                    <thead>
                        <tr>
                            <th>Nombre Mascota</th>
                            <th class="nombreMascota"><input class="txt1" id="fecha" type="text" name="txtMascota" value="<%=a.getMascotaAFK()%>" /></th>
                        </tr>
                    </thead>
                </table>
                <table>
                    <thead>
                        <tr>
                            <th>Tipo de atencion</th>
                            <th class="tipoAtencion"><input class="txt1"  type="text" name="txtAtencion" value="<%=a.getTipoAtencionAFK()%>" /></th>
                        </tr>
                    </thead>
                </table>
                <table>
                    <thead>
                        <tr>
                            <th>Resumen</th>
                            <th class="resumen"><input class="txt1"  type="text" name="txtResumen" value="<%=a.getResumen()%>" /></th>
                        </tr>
                    </thead>
                </table>
                <table>
                    <thead>
                        <tr>
                            <th>Fecha de Atencion</th>
                            <th class="fecha">
                                <%
                                    String fecha = a.getFechaHora();
                                    int cantidad = 5;
                                    /* Total de elementos a Eliminar*/
     /* Total de elementos a Mostrar*/
                                    int m = Math.max(0, fecha.length() - cantidad);
                                %>
                                <input class="txt1"  type="text" name="txtFecha" value="<%=fecha.subSequence(0, m).toString()%>" />
                            </th>
                        </tr>
                    </thead>
                </table>

                <br>
                <input type="hidden" name="idAtencion" value="<%=a.getId()%>"/>
                <input class="actualizar" type="submit" value="Actualizar" name="update"/>
            </div>
            <%}%>
        </form>
        <br>
        <a class="volver" href="menuVeterinario.jsp">Volver</a>
    </body>
</html>
