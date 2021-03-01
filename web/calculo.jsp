<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

        <title>Resultado IMC</title>
    </head>
    <body>
        <h1><center>Su IMC es </center></h1>
        <form>
       <center><h2>
        <input type="text" size="10" value="<%= request.getAttribute("total") %>"><br>     
        <% 
        String condicion = (String) request.getAttribute("condicion");
        out.print(condicion);
        %>
        <br>
        <br>
        <input type="button" value="Hacer Nuevo Calculo" onclick="history.back()">
         
        </h2>   
        </center>
        </form>  
     
    </body>
</html>
