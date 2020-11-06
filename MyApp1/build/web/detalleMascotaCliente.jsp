<%@page import="java.time.LocalDate"%>
<%@page import="java.util.GregorianCalendar"%>
<%@page import="java.util.Calendar"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.sql.Date"%>
<%@page import="model.Atencion"%>
<%@page import="model.dao.DAO_Atencion"%>
<%@page import="model.dao.DAO_Veterinario"%>
<%@page import="model.Veterinario"%>
<%@page import="model.DetalleAnimal"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@include file="validar.jsp" %>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="css/prueba.css">
        <title>JSP Page</title>
    </head>
    <body>
        <br>
        <h1>Horarios del paciente</h1>
        <div class="container">
            <table>
                <thead>
                    <tr>
                        <th>Veterinario</th>
                        <th>Nombre Mascota</th>
                        <th>Tipo de atencion</th>
                        <th>Resumen</th>
                        <th>Fecha de Atencion</th>
                        <th>Estado</th>
                    </tr>
                </thead>
                <tbody>
                    <%
                        int id;
                        id = Integer.parseInt(request.getParameter("idMascota"));
                        DAO_Atencion da = new DAO_Atencion();
                    %>
                    <%for (Atencion a : da.readIdMascota(id)) {


                    %>
                    <tr>
                        <td><%=a.getVeterinarioAFK()%></td>
                        <td><%=a.getMascotaAFK()%></td>
                        <td><%=a.getTipoAtencionAFK()%></td>
                        <td><%=a.getResumen()%></td>
                        <%
                            String fecha = a.getFechaHora();
                            int cantidad = 5;
                            /* Total de elementos a Eliminar*/
     /* Total de elementos a Mostrar*/
                            int m = Math.max(0, fecha.length() - cantidad);
                        %>


                        <%
                            Calendar calendario = new GregorianCalendar();

                            LocalDate fechaActual = LocalDate.now();

                            String fechaAhora = fechaActual.toString();

                            // Fecha actual.
                            int anio2 = 17;
                            int anioahora = Math.max(0, fecha.length() - anio2);
                            int anioActual = Integer.parseInt(fechaAhora.subSequence(0, anioahora).toString());

                            int mes2 = 14;
                            int mesahora = Math.max(0, fecha.length() - mes2);
                            int mesActual = Integer.parseInt(fechaAhora.subSequence(5, mesahora).toString());

                            int dia2 = 11;
                            int diaAhora = Math.max(0, fecha.length() - dia2);
                            int diaActual = Integer.parseInt(fechaAhora.subSequence(8, diaAhora).toString());

                            // Hora actual.
                            int horaActual, minutoActual;
                            horaActual = calendario.get(Calendar.HOUR_OF_DAY);
                            minutoActual = calendario.get(Calendar.MINUTE);

                            String fecha1 = a.getFechaHora();

                            // Fecha de la hora pedida.
                            int anio1 = 17;
                            int anio = Math.max(0, fecha.length() - anio1);
                            int anioCita = Integer.parseInt(fecha1.subSequence(0, anio).toString());

                            int mes1 = 14;
                            int mes = Math.max(0, fecha.length() - mes1);
                            int mesCita = Integer.parseInt(fecha1.subSequence(5, mes).toString());

                            int dia1 = 11;
                            int dia = Math.max(0, fecha.length() - dia1);
                            int diaCita = Integer.parseInt(fecha1.subSequence(8, dia).toString());

                            // Hora de la hora pedida.
                            int hora1 = 8;
                            int hora = Math.max(0, fecha.length() - hora1);
                            int horaCita = Integer.parseInt(fecha1.subSequence(11, hora).toString());

                            int minuto1 = 5;
                            int minuto = Math.max(0, fecha.length() - minuto1);
                            int minutoCita = Integer.parseInt(fecha1.subSequence(14, minuto).toString());

                            int unDiaDespues = diaActual + 1;
                            int dosDiasDespues = diaActual + 2;
                            if (anioActual == anioCita && mesActual == mesCita && diaCita == unDiaDespues) {
                                System.out.println(unDiaDespues);
                        %>
                        <td class="unDia"><%=fecha.subSequence(0, m).toString()%></td>
                        <%
                            }
                            if (anioActual == anioCita && mesActual == mesCita && diaCita == dosDiasDespues) {
                                System.out.println(dosDiasDespues);
                        %>
                        <td class="dosDias"><%=fecha.subSequence(0, m).toString()%></td>
                        <%
                            }
                            if (anioActual == anioCita && mesActual == mesCita && diaCita == diaActual) {
                        %>
                        <td class="atrasado"><%=fecha.subSequence(0, m).toString()%></td>
                        <%
                            }
                            if (diaCita != dosDiasDespues && diaCita != unDiaDespues && diaCita != diaActual) {
                        %>
                        <td><%=fecha.subSequence(0, m).toString()%></td>
                        <%
                            }

                        %>

                        <td>
                            <form action="#" method="post">
                                <input type="hidden" name="idAtencion" value="<%=a.getId()%>"/>
                                <input type="submit" value="?" name="btnFechaAtencion">
                            </form>
                        </td>
                    </tr>
                    <%}%>

                </tbody>
            </table>

        </div>
        <br>
        <a class="cerrar" href="menuCliente.jsp">volver</a><br>
    </body>
</html>
