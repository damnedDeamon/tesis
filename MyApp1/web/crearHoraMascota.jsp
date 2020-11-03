<%@page import="model.TipoAtencion"%>
<%@page import="model.dao.DAO_TipoAtencion"%>
<%@page import="model.Atencion"%>
<%@page import="model.dao.DAO_Atencion"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@include file="validar.jsp" %>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="css/horaMascota.css">
        <title>JSP Page</title>
    </head>
    <link rel="stylesheet" href="http://code.jquery.com/ui/1.10.1/themes/base/jquery-ui.css" />
    <script src="http://code.jquery.com/jquery-1.9.1.js"></script>
    <script src="http://code.jquery.com/ui/1.10.1/jquery-ui.js"></script>
    <script>
        $(function () {
            $("#fecha").datepicker();
        });
    </script>
    <script>
        $.datepicker.regional['es'] = {
            closeText: 'Cerrar',
            prevText: '< Ant',
            nextText: 'Sig >',
            currentText: 'Hoy',
            monthNames: ['Enero', 'Febrero', 'Marzo', 'Abril', 'Mayo', 'Junio', 'Julio', 'Agosto', 'Septiembre', 'Octubre', 'Noviembre', 'Diciembre'],
            monthNamesShort: ['Ene', 'Feb', 'Mar', 'Abr', 'May', 'Jun', 'Jul', 'Ago', 'Sep', 'Oct', 'Nov', 'Dic'],
            dayNames: ['Domingo', 'Lunes', 'Martes', 'Miércoles', 'Jueves', 'Viernes', 'Sábado'],
            dayNamesShort: ['Dom', 'Lun', 'Mar', 'Mié', 'Juv', 'Vie', 'Sáb'],
            dayNamesMin: ['Do', 'Lu', 'Ma', 'Mi', 'Ju', 'Vi', 'Sá'],
            weekHeader: 'Sm',
            dateFormat: 'yy-mm-dd',
            firstDay: 1,
            isRTL: false,
            showMonthAfterYear: false,
            yearSuffix: ''
        };
        $.datepicker.setDefaults($.datepicker.regional['es']);
        $(function () {
            $("#fecha").datepicker();
        });
    </script>
    <body>
        <%            String id;
            id = request.getParameter("idMascota");
        %>

        <form name="entrada" action="crearHora.do" method="POST">  

            <div id="basIn">

                <h1>Crear Hora</h1><br>
                <table>
                    <tr>
                        <th height="20px" width="100px">
                            Fecha
                        </th>
                        <th>
                            <input class="txt1" id="fecha" type="text" name="txtFecha" value="" />
                            <input type="time"  name="txtHora"/>
                        </th>
                    </tr>
                </table>
                <table>
                    <tr>
                        <th height="20px" width="100px">
                            Resumen
                        </th>
                        <th>
                            <input class="txt1"  type="text" name="txtResumen" value="" />
                        </th>
                    </tr>
                </table>
                <table>
                    <tr>
                        <th height="20px" width="100px">
                            Tipo de atencion
                        </th>
                        <th>
                            <select name="tipoAtencion">
                                <%
                                    DAO_TipoAtencion dt = new DAO_TipoAtencion();
                                    for (TipoAtencion t : dt.read()) {
                                %>
                                <option value="<%=t.getId()%>"><%=t.getNombreAtencion()%></option>
                                <%}%>

                            </select>
                        </th>
                    </tr>
                </table>
                <input type="hidden" name="idVete" value="<%=v.getId()%>"/>
                <input type="hidden" name="idMascota" value="<%=id%>"/>
                <input class="button" type="submit" value="Crear"/>
            </div>
        </form>
        <br>
        <a href="menuVeterinario.jsp">Volver</a>
    </body>
</html>
