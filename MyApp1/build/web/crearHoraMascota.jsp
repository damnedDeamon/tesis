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
    <body class="cuerpoCrearHora">
        <%            String id;
            id = request.getParameter("idMascota");
        %>

        <form name="entrada" action="crearHora.do" method="POST">  
            <h1 class="titulo">Crear Hora</h1><br>
            <div class="container">
                <table>
                    <thead>
                        <tr>
                            <th class="fecha1">Fecha</th>
                            <th class="hora1">hora</th>
                            <th>
                                <input class="fecha" id="fecha" type="text" name="txtFecha" value="" />
                                <input class="hora" type="time"  name="txtHora"/>
                            </th>
                        </tr>
                    </thead>
                </table>
                <table>
                    <thead>
                        <tr>
                            <th class="resumen">Resumen</th>
                            <th><input class="resumen1"  type="text" name="txtResumen" value="" /></th>
                        </tr>
                    </thead>
                </table>
                <table>
                    <thead>
                        <tr>
                            <th class="tipo">Tipo de atencion</th>
                            <th class="selec">
                                <select name="tipoAtencion">
                                    <%
                                        DAO_TipoAtencion dt = new DAO_TipoAtencion();
                                        for (TipoAtencion t : dt.read()) {
                                    %>
                                    <option  value="<%=t.getId()%>"><%=t.getNombreAtencion()%></option>
                                    <%}%>

                                </select>
                            </th>
                        </tr>
                    </thead>
                </table>
                <input type="hidden" name="idVete" value="<%=v.getId()%>"/>
                <input type="hidden" name="idMascota" value="<%=id%>"/>
                <input class="crear" type="submit" value="Crear"/>
            </div>
        </form>
        <br>
        <a class="volver" href="menuVeterinario.jsp">Volver</a>
    </body>
</html>
