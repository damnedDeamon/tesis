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
    </head>
    <body>
        
        <div class="container">
            <div class="form__top">
                <h2>Formulario <span>Registro</span></h2>
            </div>
            
            <form class="form__reg" action="crearCliente.do" method="POST">
                <input class="input" name="txtNombre" id="nombre" type="text" placeholder="&#128100;  Nombre" required autofocus>
                <input class="input" name="txtGmail" id="gmail" type="email" placeholder="&#9993;  Gmail" required>
                <input class="input" name="txtTelefono" id="telefono" type="text" placeholder="&#128222;  Telefono" required>
                <input class="input" name="txtDireccion" id="direc" type="text" placeholder="&#8962;  Dirección" required>
                <input class="input" name="txtRut" id="rut" type="text" placeholder="&#8962;  Rut" required>
                <input class="input" name="txtCantidad" id="cantidad" type="text" placeholder="&#8962;  Cantidad de animales" required>
                <div class="btn__form">
                    <input class="btn__submit" type="submit" value="REGISTRAR">
                    <input class="btn__reset" type="reset" value="LIMPIAR">	
                </div>

            </form>



        </div>
    </body>
</html>
