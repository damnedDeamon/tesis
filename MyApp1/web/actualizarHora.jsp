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
    <body>
        <%
            String id;
            id = request.getParameter("idAtencion");
            DAO_Atencion da = new DAO_Atencion();
            for (Atencion a : da.buscarAtencion(id)) {
                

        %>
        
        <form name="entrada" action="actualizarHora.do" method="POST">  

            <div id="basIn">

                <h1>Actualizar Datos</h1><br>
                <table>
                    <tr>
                        <th height="20px" width="100px">
                            Veterinario
                        </th>
                        <th>
                            <input class="txt1"  type="text" name="txtVeterinario" value="<%=a.getVeterinarioAFK() %>" />
                        </th>
                    </tr>
                </table>
                <table>
                    <tr>
                        <th height="20px" width="100px">
                            Nombre Mascota
                        </th>
                        <th>
                            <input class="txt1" id="fecha" type="text" name="txtMascota" value="<%=a.getMascotaAFK() %>" />
                        </th>
                    </tr>
                </table>
                <table>
                    <tr>
                        <th height="20px" width="100px">
                            Tipo de atencion
                        </th>
                        <th>
                            <input class="txt1"  type="text" name="txtAtencion" value="<%=a.getTipoAtencionAFK() %>" />
                        </th>
                    </tr>
                </table>
                <table>
                    <tr>
                        <th height="20px" width="100px">
                            Resumen
                        </th>
                        <th>
                            <input class="txt1"  type="text" name="txtResumen" value="<%=a.getResumen() %>" />
                        </th>
                    </tr>
                </table>
                <table>
                    <tr>
                        <th height="20px" width="100px">
                            Fecha de Atencion
                        </th>
                        <th>
                            <%
                                String fecha = a.getFechaHora();
                                int cantidad = 5; /* Total de elementos a Eliminar*/  
                                 /* Total de elementos a Mostrar*/      
                                int m = Math.max(0, fecha.length() - cantidad);
                            %>
                           <input class="txt1"  type="text" name="txtFecha" value="<%=fecha.subSequence(0, m).toString() %>" />
                        </th>
                    </tr>
                </table>
               
                <br>
                <input type="hidden" name="idAtencion" value="<%=a.getId() %>"/>
                <input class="button" type="submit" value="Actualizar" name="update"/>
            </div>
            <%}%>
        </form>
        <br>
        <a href="menuVeterinario.jsp">Volver</a>
    </body>
</html>
