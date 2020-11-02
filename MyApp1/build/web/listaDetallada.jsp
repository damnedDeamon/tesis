<%@page import="model.dao.DAO_Cliente"%>
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
        <link rel="stylesheet" href="css/fecha.css">
        <script src="js/jquery-3.3.1.min.js"></script>
        <meta name="viewport" content="width=device-width, user-scalable=no, initial-scale=1.0, minium-scale=1.0">


        <title>JSP Page</title>
    </head>
    <body>

        <br>
        <h1>Horarios del paciente</h1>

        Bienvenid@ <%= v.getNombre()%>

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
        <table  style="width: 80%">
            <tr>
                <th height="20px" width="100px">
                    Veterinario
                </th>
                <th height="20px" width="125px">
                    Nombre Mascota
                </th>
                <th height="20px" width="100px">
                    Tipo de atencion
                </th>
                <th height="20px" width="100px">
                    Resumen
                </th>
                <th height="20px" width="100px">
                    Fecha de Atencion
                </th>
                <th height="20px" width="100px">
                    Modificar Atencion
                </th>
                <th height="20px" width="50px">
                    Estado
                </th>
            </tr>

        </table>
        <%
            int id;
            id = Integer.parseInt(request.getParameter("idMascota"));
            DAO_Atencion da = new DAO_Atencion();
        %>

        <%for (Atencion a : da.readIdMascota(id)) {


        %>
        <table style="width: 80%">

            <tr>
                <td height="20px" width="100px"><%=a.getVeterinarioAFK()%></td>
                <td height="20px" width="125px"><%=a.getMascotaAFK()%></td>
                <td height="20px" width="100px"><%=a.getTipoAtencionAFK()%></td>
                <td height="20px" width="100px"><%=a.getResumen()%></td>
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

                    String anioCompleto = String.valueOf(anioCita);
                    String meses = "";
                    String diaCompleto = "";
                    String horaCompleta = "";
                    String minutoCompleto = "";
                    int otroDia = diaCita--;

                    if (otroDia < 10) {
                        diaCompleto = String.valueOf(otroDia);
                        diaCompleto = "0" + otroDia;
                    } else {
                        diaCompleto = String.valueOf(diaCita);
                    }

                    if (horaCita < 10) {
                        horaCompleta = String.valueOf(horaCita);
                        horaCompleta = "0" + horaCita;
                    } else {
                        horaCompleta = String.valueOf(horaCita);
                    }

                    if (minutoCita < 10) {
                        minutoCompleto = String.valueOf(minutoCita);
                        minutoCompleto = "0" + minutoCita;
                    } else {
                        minutoCompleto = String.valueOf(minutoCita);
                    }

                    switch (mesCita) {

                        case 1:
                            meses = "Jan";
                            break;
                        case 2:
                            meses = "Feb";
                            break;
                        case 3:
                            meses = "Mar";
                            break;
                        case 4:
                            meses = "Apr";
                            break;
                        case 5:
                            meses = "May";
                            break;
                        case 6:
                            meses = "Jun";
                            break;
                        case 7:
                            meses = "Jul";
                            break;
                        case 8:
                            meses = "Aug";
                            break;
                        case 9:
                            meses = "Sep";
                            break;
                        case 10:
                            meses = "Oct";
                            break;
                        case 11:
                            meses = "Nov";
                            break;
                        case 12:
                            meses = "Dec";
                            break;

                        default:
                    }

                    String fechaCompleta = meses + " " + diaCompleto + " " + anioCompleto + " " + horaCompleta + ":" + minutoCompleto + ":00 GMT-0300";

                    System.out.println(fechaCompleta);

                %>
            <script>
                var fechaComplet = "<%=fechaCompleta%>";
            </script>
            <div id="clock"></div>
            <script src="js/cuentaRegresiva_1.js" ></script>
            <%

                int unDiaDespues = diaActual + 1;
                int dosDiasDespues = diaActual + 2;

                if (anioActual == anioCita && mesActual == mesCita && diaCita == unDiaDespues) {
                    System.out.println(unDiaDespues);
            %>
            <td class="unDia" height="20px" width="100px"><%=fecha.subSequence(0, m).toString()%></td>
            <%
                }
                if (anioActual == anioCita && mesActual == mesCita && diaCita == dosDiasDespues) {
                    System.out.println(dosDiasDespues);
            %>
            <td class="dosDias" height="20px" width="100px"><%=fecha.subSequence(0, m).toString()%></td>
            <%
                }
                if (anioActual == anioCita && mesActual == mesCita && diaCita == diaActual) {
            %>
            <td class="atrasado" height="20px" width="100px"><%=fecha.subSequence(0, m).toString()%></td>
            
            <%
                DAO_Cliente dc = new DAO_Cliente();

                for (Cliente cli : dc.buscarGmail(id)) {

                    String correo = cli.getGmail();
            %>

            <script>

                function cambia_de_pagina() {
                    var correo = $("#cor").val();
                    var hora = $("#hora").val();
                    var minuto = $("#minuto").val();

                    $.ajax({
                        type: 'POST',
                        url: 'http://localhost:8090/MyApp1/enviarCorreo.do',
                        data: {corre: correo, hora: hora, minuto: minuto}

                    });
                };
            </script>

            <input type="hidden" id="cor" value="<%= correo%>"/>
            <input type="hidden" id="hora" value="<%= horaCita%>"/>
            <input type="hidden" id="minuto" value="<%= minutoCita%>"/>

            <% } %>
            <%
                }
                if (diaCita != dosDiasDespues && diaCita != unDiaDespues && diaCita != diaActual) {
            %>
            <td height="20px" width="100px"><%=fecha.subSequence(0, m).toString()%></td>
            <%
                }


            %>


            <td height="20px" width="100px">
                <form action="actualizarHora.jsp" method="post">
                    <input type="hidden" name="idAtencion" value="<%=a.getId()%>"/>
                    <input type="submit" value="modificar" name="btnFechaAtencion">
                </form>
            </td>
            <td height="20px" width="50px">
                <form action="#" method="post">
                    <input type="hidden" name="idAtencion" value="<%=a.getId()%>"/>
                    <input type="submit" value="?" name="btnFechaAtencion" >
                </form>
            </td>
        </tr>
    </table>
    <%}%>
    <br>




    <a href="menuVeterinario.jsp">volver</a><br><br>



</body>
</html>
