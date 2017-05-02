<%-- 
    Document   : NavigationJSP
    Author     : Dzhuman Bohdan
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<nav>
    <ol>
        <li <c:if test="${page=='bacheca'}">class="active"</c:if>><a href="bacheca.html">Bacheca</a></li>
        <li <c:if test="${page=='profilo'}">class="active"</c:if>><a href="profilo.html">Profilo</a></li>
        <li <c:if test="${page=='login'}">class="active"</c:if>><a href="login.html">Login</a></li>
        <li <c:if test="${page=='descrizione'}">class="active"</c:if>><a href="descrizione.html">Descrizione</a></li>
    </ol>
</nav>

