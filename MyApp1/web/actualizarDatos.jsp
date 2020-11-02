<%@page import="model.Raza"%>
<%@page import="model.TipoMascota"%>
<%@page import="model.dao.DAO_TipoMascota"%>
<%@page import="model.dao.DAO_Raza"%>
<%@page import="model.dao.DAO_Mascota"%>
<%@page import="model.Mascota"%>
<%@page import="model.dao.DAO_Cliente"%>
<%@page import="model.Cliente"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
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

        <%
            String id;
            id = request.getParameter("idMascota");
            DAO_Mascota dm = new DAO_Mascota();
            for (Mascota m : dm.findBy(id)) {
                m.getNombreMacota();
        %>   



        <form name="entrada" action="actualizarDato.do" method="POST">  

            <div id="basIn">

                <h1>Actualizar Datos</h1><br>
                <table>
                    <tr>
                        <th height="20px" width="100px">
                            Nombre
                        </th>
                        <th>
                            <input class="txt1"  type="text" name="txtNombreMascota" value="<%= m.getNombreMacota()%>" />
                        </th>
                    </tr>
                </table>
                <table>
                    <tr>
                        <th height="20px" width="100px">
                            Fecha
                        </th>
                        <th>
                            <input class="txt1" id="fecha" type="text" name="txtFecha" value="<%= m.getFechaNacimiento()%>" />
                        </th>
                    </tr>
                </table>
                <table>
                    <tr>
                        <th height="20px" width="100px">
                            Edad
                        </th>
                        <th>
                            <input class="txt1"  type="text" name="txtEdad" value="<%= m.getEdad()%>" />
                        </th>
                    </tr>
                </table>
                <table>
                    <tr>
                        <th height="20px" width="100px">
                            Peso
                        </th>
                        <th>
                            <input class="txt1"  type="text" name="txtPeso" value="<%= m.getPeso()%>" />
                        </th>
                    </tr>
                </table>
                <table>
                    <tr>
                        <th height="20px" width="100px">
                            Sexo
                        </th>
                        <th>
                            <%
                                String sexo = m.getSexo();
                                int sexo2 = Integer.parseInt(sexo);
                                if (sexo2 == 1) {
                            %>  <input type="radio"  name="cboSexo" value="1" checked>Macho
                            <input type="radio"  name="cboSexo" value="2">Hembra<br><br><%
                            } else {
                            %>  <input type="radio"  name="cboSexo" value="1">Macho  
                            <input type="radio"  name="cboSexo" value="2" checked>Hembra<br><br><%
                                }%>
                        </th>
                    </tr>
                </table>
                <table>
                    <%
                        DAO_Raza dr = new DAO_Raza();
                        DAO_TipoMascota dt = new DAO_TipoMascota();

                        for (TipoMascota t : dt.readId(m.getTipoAnimalAFK())) {
                    %>
                    <tr>
                        <th height="20px" width="100px">
                            Animal
                        </th>
                        <th>
                            <input class="txt1"  type="text" name="txtAnimal" value="<%= t.getTipoMascota()%>" />
                        </th>
                    </tr>
                </table>        
                <table>
                    <%
                        for (Raza r : dr.readId(m.getTipoAnimalAFK(), m.getRazaAFK())) {
                    %>
                    <tr>
                        <th height="20px" width="100px">
                            Raza
                        </th>
                        <th>
                            <input class="txt1"  type="text" name="txtRaza" value="<%= r.getNombreRaza()%>" />
                        </th>
                    </tr>
                </table>
                <br>
                <input type="hidden" name="idMascota" value="<%= id%>"/>
                <input type="hidden" name="idCliente" value=""/>
                <input class="button" type="submit" value="Actualizar" name="update"/>
            </div>
            <%}%>
            <%}%>
            <%}%>
        </form>
        <br>
        <a href="menuVeterinario.jsp">Volver</a>
    </body>
</html>
