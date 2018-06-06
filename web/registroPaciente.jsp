<%-- 
    Document   : registroPaciente
    Created on : May 25, 2018, 11:35:41 AM
    Author     : umbrella
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>

    <head>

        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

        <title>Registro</title>

    </head>
    <div align="center">
        <body  background="img/fondoJSP.jpg" >
            <!--#01DFD7-->
            
            <div align="left"><img src="img/UmbrellaLogoRe.png" alt="" style='width:34%; height:10%'/></div>
            <h1 style="font-family: times, serif;  " align="center"s>Regístrate</h1>

            <form action="./PacienteServlet" method="POST">
                <font face="italic,arial">
                <table >

                    <tr>

                        <th >Cédula</th>

                        <th><input type="text" name="id" value=""/> </th>

                    </tr>

                    <tr>

                        <th>Nombre</th>

                        <th> <input type="text" name="nombre" value=""/></th>

                    </tr>

                    <tr>

                        <th>Apellido</th>

                        <th><input type="text" name="apellidos" value=""/> </th>

                    </tr>

                    <tr>

                        <th>Edad</th>

                        <th> <input type="text" name="edad" value=""/></th>

                    </tr>

                    <tr>

                        <th>EPS</th>

                        <th> <input type="text" name="eps" value=""/></th>

                    </tr>

                    <tr>

                        <th>Direccion</th>

                        <th> <input type="text" name="direccion" value=""/></th>

                    </tr>

                    <tr>

                        <th>Telefono</th>

                        <th> <input type="text" name="telefono" value=""/></th>

                    </tr>

                    <tr>

                        <td>
                            <div align="center"><input type="submit" name="action" value="Add" style='width:100%; height:25px'/></div>
                        </td>


                        <td>
                            
                            <div align="center"><a href="citas.html" style="text-decoration: none;"><input type="button" name="volver" value="Volver" style='width:100%; height:25px'/></a></div>
                        </td>


                    </tr>

                </table>
                </font>
            </form>

            <br>

            <table border="5px">

                <th height="30" width="100">id</th>

                <th height="30" width="100">nombre</th>

                <th height="30" width="100">apellidos</th>

                <th height="30" width="100">edad</th>

                <th height="30" width="100">eps</th>

                <th height="30" width="100">direccion</th>

                <th height="30" width="100">telefono</th>

                <c:forEach items="${pacientes}" var="paci">

                    <tr>

                        <td>${paci.id}</td>

                        <td>${paci.nombre}</td>

                        <td>${paci.apellidos}</td>

                        <td>${paci.edad}</td>

                        <td>${paci.eps}</td>

                        <td>${paci.direccion}</td>

                        <td>${paci.telefono}</td>


                    </tr>

                </c:forEach>

            </table>

        </body>
    </div>

</html>