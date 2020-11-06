<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="CSS/CSSLogin.css" rel="stylesheet" type="text/css"/>}
        <link rel="stylesheet" href="css/tablaRegistro.css">
        <title>JSP Page</title>
    </head>
    <body>
        <div class="tablaRegistro">
            <h1>Crear cuenta</h1><br>
            <div id="Entrada">
                <form name="entrada" action="crearVeterinario.do" method="POST">
                    <table>
                        <tr>
                            <th height="20px" width="100px" class="nombre">
                                Nombre
                            </th>
                            <th>
                                <input class="txt1" type="text" name="txtNombre" value="" />
                            </th>
                        </tr>
                    </table>
                    <table>
                        <tr>
                            <th height="20px" width="100px">
                                Gmail
                            </th>
                            <th>
                                <input class="txt1"  type="text" name="txtGmail" value="" />
                            </th>
                        </tr>
                    </table>
                    <table>
                        <tr>
                            <th height="20px" width="100px">
                                Rut
                            </th>
                            <th>
                                <input class="txt1"  type="text" name="txtRut" value="" />
                            </th>
                        </tr>
                    </table>
                    <table>
                        <tr>
                            <th height="20px" width="70px">
                            </th>
                        </tr>
                    </table> 
                    <table>
                        <tr>
                            <th height="20px" width="70px">
                            </th>
                            <th height="20px" width="100px">
                                <input class="button" type="submit" value="ENTRAR" name="entrar"/> 
                            </th>
                        </tr>
                    </table>
                    <table>
                        <tr>
                            <th height="20px" width="70px">
                            </th>
                            <th height="20px" width="100px">
                                <a href="index.jsp">Volver</a>
                            </th>
                        </tr>
                    </table>
                </form>
            </div>
        </div>
    </body>
</html>
