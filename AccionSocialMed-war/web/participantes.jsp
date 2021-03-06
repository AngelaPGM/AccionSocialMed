<%-- 
    Document   : participantes
    Created on : 09-ene-2020, 0:47:11
    Author     : Angela
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="entity.Usuario"%>
<%@page import="entity.Actividad"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
    Actividad act = (Actividad) request.getAttribute("act");
    List<Usuario> part = act.getUsuarioList();
%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Participantes</title>
    </head>
    <body>
        <div style="float:right">
            <a href="IndexServlet">Inicio</a>
        </div>
        <h1>Participantes en <%= act.getTitulo() %></h1>
        <%
            for (Usuario u: part){%>
                <%= u.getNombre()%>
            <%}
            %>
    </body>
</html>
