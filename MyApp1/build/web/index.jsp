<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        
    </head>
    <title>Veterinaria</title>
    <link rel="stylesheet" href="css/master.css">

    <script>
        function crearVeterinario() {
            var validacion = prompt("Ingrese codigo");
            if (validacion == 1234) {
                window.location.assign("registrar.jsp");
            } else {
                alert("El codigo es invalido");
            }

        }
    </script> 

    <body>
        <div class="login">
            <img class="avatar" src="img/img_logo.png" alt="fondo">  
            <h1>Ingresar</h1>
            <form action="iniciarSesion.do" method="post">
                <label for="clave">Rut </label>
                <input type="password" placeholder="Ingrese su Rut" required="" name="rut">
                <input type="submit" value="ingresar" >
                <a href="#" onclick="crearVeterinario();">Registrar</a><br>
                <a href="#">Informacion sobre la pagina</a>
            </form>
        </div>

        <%%>


    </body>
</html>
