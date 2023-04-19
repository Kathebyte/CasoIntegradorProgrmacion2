<%-- 
    Document   : CalculoNotas
    Created on : 18 Apr 2023, 5:21:05 PM
    Author     : kathemacbook
--%>

<%@page import="backend.Alumno"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Notas</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ" crossorigin="anonymous">
        
    </head>
    <body>
        <% 
            Alumno alumno1 = (Alumno)request.getSession().getAttribute("alumno");
            double corte1,corte2,corte3;
            corte1=alumno1.getCorte1();
            corte2=alumno1.getCorte2();
            corte3=alumno1.getCorte3();
        %>
        <div class="container">
            <div class="row mt-4">
                <h1 class="display-3 ">Nota del Estudiante</h1>
                <table class="table table-striped table-bordered table-hover text-center" >
                    <thead class="text-bg-primary p-3">  
                        <tr>
                            <th class="py-4">Nombre Alumno</th>
                            <th class="py-4">Corte 1(35%) </th>
                            <th class="py-4">Corte 2(35%)</th>
                            <th class="py-4">Corte 3(30%)</th>
                            <th class="py-4">Definitiva</th>
                        </tr>
                    </thead>
                    <tr>
                        <td class="py-2"> <%=alumno1.getNombre() %> </td> 
                        <td class="py-2"><%=alumno1.getCorte1() %></td> 
                        <td class="py-2"><%=alumno1.getCorte2() %> </td> 
                        <td class="py-2"><%=alumno1.getCorte3() %> </td> 
                        <td class="py-2"><%=alumno1.calcularNotaFinal(corte1, corte2, corte3) %></td>
                    </tr>
                </table>
            </div>
        </div>
    </body>
</html>
