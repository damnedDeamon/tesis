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
        <script src="js/jquery-3.3.1.min.js"></script>
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

        <h1>Añadir Cliente</h1><br>

        <form action="crearCliente.do" method="post">
            <table  style="width: 50%">
                <tr>

                    <th >
                        Nombre
                    </th>
                    <th >
                        Dirección
                    </th>
                    <th >
                        Rut
                    </th>
                    <th >
                        Gmail
                    </th>
                    <th >
                        Celular
                    </th>
                </tr>
                <tr>
                    <td><input class="txt1" type="text" name="txtNombre" value="" /> </td>
                    <td><input class="txt1"  type="text" name="txtDireccion" value="" /> </td>
                    <td><input class="txt1"  type="text" name="txtRut" value="" /> </td>
                    <td><input class="txt1"  type="text" name="txtGmail" value="" /> </td>
                    <td><input class="txt1"  type="text" name="txtCelular" value="" /> </td>
                </tr>

            </table>

            <h1>Añadir Mascota</h1><br>
            <table  style="width: 50%">
                <tr>

                    <th >
                        Nombre
                    </th>
                    <th >
                        Fecha
                    </th>
                    <th >
                        Edad
                    </th>
                    <th >
                        Peso
                    </th>
                    <th >
                        Sexo
                    </th>
                    <th >
                        Animal
                    </th>
                    <th >
                        Raza
                    </th>

                </tr>
                <tr>
                    <td><input class="txt1" type="text" name="txtNombreMascota" value="" /> </td>
                    <td>
                        <input class="txt1" id="fecha" type="text" name="txtFecha" value="" /> 
                    </td>
                    <td><input class="txt1"  type="text" name="txtEdad" value="" /> </td>
                    <td><input class="txt1"  type="text" name="txtPeso" value="" /> </td>

                    <td><select name="selectSexo">
                            <option id="cboSexo" name="cboSexo" value="1">Macho</option> 
                            <option id="cboSexo" name="cboSexo" value="2">Hembra</option>
                        </select></td>

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

                <td><select id="tipoMascota" name="tipoMascota" onchange="buscar()"> 
                        <%
                            DAO_TipoMascota dt = new DAO_TipoMascota();

                            for (TipoMascota tm : dt.read()) {
                                out.print("<option value='" + tm.getId() + "'>" + tm.getTipoMascota() + "</option>");
                            }

                        %>
                    </select></td>
                <td><div id="divMascota" > <!-- Se va a cargar con ajax -->
                        <select></select>
                    </div> </td>
                </tr>
            </table>


            <input class="button" type="submit" value="Registrar" name="entrar"/>
        </form>
        <a href="menuVeterinario.jsp">Volver</a>

    </div>


</body>
</html>
