<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="CSS/CSSLogin.css" rel="stylesheet" type="text/css"/>}
        <link rel="stylesheet" href="css/tablaRegistro.css">
        <title>JSP Page</title>
    </head>
    <body class="cuerpoRegistrar">
        <h1 class="titulo">Crear cuenta</h1><br>
        <div class="container">
            <form name="entrada" action="crearVeterinario.do" method="POST">
                <table>
                    <tr>
                        <th>Nombre</th>
                        <th class="nombre"><input class="txt1" type="text" name="txtNombre" value="" /></th>
                    </tr>
                </table>
                <table>
                    <tr>
                        <th>Gmail</th>
                        <th class="gmail"><input class="txt1"  type="text" name="txtGmail" value="" /></th>
                    </tr>
                </table>
                <table>
                    <tr>
                        <th>Rut</th>
                        <th class="rut"><input class="txt1"  type="text" name="txtRut" value="" /></th>
                    </tr>
                </table>
                <table>
                    <tr>
                        <th ><input class="registrar" type="submit" value="Registrar" name="entrar"/></th>
                    </tr>
                </table>
                <a class="index" href="index.jsp">Volver</a>
            </form>
        </div>
    </body>
</html>
