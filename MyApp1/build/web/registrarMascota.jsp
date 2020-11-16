<%@page import="model.TipoMascota"%>
<%@page import="model.dao.DAO_TipoMascota"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="css/main.css">
        <link rel="stylesheet" href="css/reset.css">
        <script src="js/jquery-3.3.1.min.js"></script>
        <title>JSP Page</title>
    </head>
    <body>
        <div class="container">
            <div class="form__top">
                <h2>Formulario <span>Registro</span></h2>
            </div>

            <form id="formulario" class="form__reg" action="#" method="POST">

                <input class="input" name="txtNombreMascota" id="nombre" type="text" placeholder="Nombre" required autofocus>
                <input class="input" name="txtFecha" id="fecha" type="text" placeholder="Fecha" required>
                <input class="input" name="txtPeso" id="peso" type="text" placeholder="Peso" required>
                <label class="input-radioMacho">
                    <input class="input" name="txtSexo" value="Macho" id="sexo" type="radio"> Macho
                    <input class="input-radioHembra" name="txtSexo" value="Hembra" id="sexo" type="radio"> Hembra
                </label>
                <input class="input" name="txtEdad" id="edad" type="text" placeholder="Edad" required>
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
                        
                        var i = 0;
                        var cantidadMascota = '<%= session.getAttribute("cantidadMascota") %>'; 
                        
                        function enviarInfo() {
                            
                            i = i + 1;
                        var btn = document.getElementById("boton");
                        btn.value = "REGISTRAR";

                        if (i == cantidadMascota) {
                            
                            location.href="menuVeterinario.jsp";
                        }
                 
                            let sexo = $('input[name="txtSexo"]:checked').val();
                            var idCliente = $("#idCliente").val();
                            var nombre = $("#nombre").val();
                            var fecha = $("#fecha").val();
                            var peso = $("#peso").val();
                            var edad = $("#edad").val();
                            var tipoMascota = $("#tipoMascota").val();
                            var tipoRaza = $("#tipoRaza").val();
                            

                        $.ajax({
                            type: 'POST',
                            url: 'http://localhost:8090/MyApp1/crearMascota.do',
                            data: {nombre: nombre, fecha: fecha, peso: peso, sexo: sexo, edad: edad, tipoMascota: tipoMascota, tipoRaza: tipoRaza, idCliente: idCliente}

                        });
                        document.getElementById("formulario").reset();
                    }
                    ;
                    </script>
                    <input type="hidden" value="<%= session.getAttribute("idCliente") %>" id="idCliente">
                    <select id="tipoMascota" class="select-css" name="tipoMascota" onchange="buscar()"> 
                            <%
                                DAO_TipoMascota dt = new DAO_TipoMascota();

                                for (TipoMascota tm : dt.read()) {
                                    out.print("<option value='" + tm.getId() + "'>" + tm.getTipoMascota() + "</option>");
                                }

                            %>
                        </select></td>
                    <td><div id="divMascota" > <!-- Se va a cargar con ajax -->
                            <select></select>
                        </div> 
                <div class="btn__form">
                    <input class="btn__submit" type="button" id="boton" value="REGISTRAR" onclick="enviarInfo()">
                    <input class="btn__reset" type="reset" value="LIMPIAR">	
                </div>

            </form>
                        
                        



        </div>
    </body>
</html>
