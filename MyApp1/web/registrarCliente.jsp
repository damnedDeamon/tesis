<%@page import="model.Raza"%>
<%@page import="model.TipoMascota"%>
<%@page import="model.dao.DAO_TipoMascota"%>
<%@page import="model.dao.DAO_Raza"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="css/main.css">
        <link rel="stylesheet" href="css/reset.css">
        <link href="https://fonts.googleapis.com/css?family=Lato:400,900" rel="stylesheet">
        <script src="js/jquery-3.3.1.min.js"></script>
        <link rel="stylesheet" href="http://code.jquery.com/ui/1.10.1/themes/base/jquery-ui.css" />
        <script src="http://code.jquery.com/jquery-1.9.1.js"></script>
        <script src="http://code.jquery.com/ui/1.10.1/jquery-ui.js"></script>
    </head>
    <body>
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
        <div class="container">
            <div class="form__top">
                <h2>Formulario <span>Registro</span></h2>
            </div>

            <%
                System.out.println(request.getAttribute("id"));
                
                if (request.getAttribute("id") == null) {
            %>
            <form class="form__reg" action="crearCliente.do" method="POST">
                <input class="input" name="txtNombre" id="nombre" type="text" placeholder="&#128100;  Nombre" required autofocus>
                <input class="input" name="txtGmail" id="gmail" type="email" placeholder="&#9993;  Gmail" required>
                <input class="input" name="txtTelefono" id="telefono" type="text" placeholder="&#128222;  Telefono" required>
                <input class="input" name="txtDireccion" id="direc" type="text" placeholder="&#8962;  Dirección" required>
                <input class="input" name="txtRut" id="rut" type="text" placeholder="&#8962;  Rut" required>
                <input class="input" name="txtCantidad" id="cantidad" type="text" placeholder="&#8962;  Cantidad de animales" required>
                <div class="btn__form">
                    <input class="btn__submit" type="submit" value="REGISTRAR" onchange="registrarCliente()">
                    <input class="btn__reset" type="reset" value="LIMPIAR">	
                </div>

            </form>

            <%} else {

            %>
            <form class="form__reg" action="crearCliente.do" method="POST">
                <input class="input" name="txtNombre" id="nombre" type="text" placeholder="&#128100;  Nombre Mascota" required autofocus>
                <input class="input" name="txtGmail" id="gmail" type="text" placeholder="&#9993;  Fecha de nacimiento" required>
                <input class="input" name="txtTelefono" id="telefono" type="text" placeholder="&#128222;  Edad" required>
                <input class="input" name="txtDireccion" id="direc" type="text" placeholder="&#8962;  Peso" required>
                <select name="selectSexo">
                    <option id="cboSexo" name="cboSexo" value="1">Macho</option> 
                    <option id="cboSexo" name="cboSexo" value="2">Hembra</option>
                </select>

                <script>

                    $(document).ready(function () {
                        buscar();
                    });

                    function buscar() {
                        var idMascota = $("#tipoMascota").val();

                        $.ajax({
                            type: 'POST',
                            url: 'http://localhost:8090/MyApp1/buscarRaza.do',
                            data: {
                                tipoMascota: idMascota
                            }
                        }).done(function (resultadoHtml) {
                            $("#divMascota").html(resultadoHtml);
                        });
                    }
                </script>

                <select id="tipoMascota" name="tipoMascota" onchange="buscar()"> 
                    <%                                DAO_TipoMascota dt = new DAO_TipoMascota();

                        for (TipoMascota tm : dt.read()) {
                            out.print("<option value='" + tm.getId() + "'>" + tm.getTipoMascota() + "</option>");
                        }

                    %>
                </select>

                <div id="divMascota" >
                    <select></select>
                </div> 
                <div class="btn__form">
                    <input class="btn__submit" type="submit" value="REGISTRAR" onchange="registrarCliente()">
                    <input class="btn__reset" type="reset" value="LIMPIAR">	
                </div>

            </form>
            <%}%>



        </div>
    </body>
</html>
