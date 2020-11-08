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
        <link rel="stylesheet" href="css/actualizar.css">
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
    <body class="cuerpoActualizar">

        <%
            String id;
            id = request.getParameter("idMascota");
            DAO_Mascota dm = new DAO_Mascota();
            for (Mascota m : dm.findBy(id)) {
                m.getNombreMacota();
        %>   



        <form name="entrada" action="actualizarDato.do" method="POST">  


            <h1 class="titulo" >Actualizar Datos</h1><br>
            <div class="container">
                <table>
                    <thead>
                        <tr>
                            <th>Nombre</th>
                            <th class="nombre"><input class="txt1"  type="text" name="txtNombreMascota" value="<%= m.getNombreMacota()%>" /></th>
                        </tr>
                    </thead>
                </table>
                <table>
                    <thead>
                        <tr>
                            <th>Fecha</th>
                            <th class="fecha"><input class="txt1" id="fecha" type="text" name="txtFecha" value="<%= m.getFechaNacimiento()%>" /></th>
                        </tr>
                    </thead>
                </table>
                <table>
                    <thead>
                        <tr>
                            <th>Edad</th>
                            <th class="edad"><input class="txt1"  type="text" name="txtEdad" value="<%= m.getEdad()%>" /></th>
                        </tr>
                    </thead>
                </table>
                <table>
                    <thead>
                        <tr>
                            <th>Peso</th>
                            <th class="peso"><input class="txt1"  type="text" name="txtPeso" value="<%= m.getPeso()%>" /></th>
                        </tr>
                    </thead>
                </table>
                <table>
                    <thead>
                        <tr>
                            <th>Sexo</th>
                            <th class="sexo">
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
                    </thead>
                </table>
                <table>
                    <thead>
                        <%
                            DAO_Raza dr = new DAO_Raza();
                            DAO_TipoMascota dt = new DAO_TipoMascota();

                            for (TipoMascota t : dt.readId(m.getTipoAnimalAFK())) {
                        %>
                        <tr>
                            <th>Animal</th>
                            <th class="animal"><input class="txt1"  type="text" name="txtAnimal" value="<%= t.getTipoMascota()%>" /></th>
                        </tr>
                    </thead>
                </table>        
                <table>
                    <thead>
                        <%
                            for (Raza r : dr.readId(m.getTipoAnimalAFK(), m.getRazaAFK())) {
                        %>
                        <tr>
                            <th>Raza</th>
                            <th class="raza"><input class="txt1"  type="text" name="txtRaza" value="<%= r.getNombreRaza()%>" /></th>
                        </tr>
                    </thead>
                </table>
                <br>
                <input type="hidden" name="idMascota" value="<%= id%>"/>
                <input type="hidden" name="idCliente" value=""/>
                <input class="actualizar" type="submit" value="Actualizar" name="update"/>
            </div>
            <%}%>
            <%}%>
            <%}%>
        </form>
        <br>
        <a class="volver" href="menuVeterinario.jsp">Volver</a>
    </body>
</html>
