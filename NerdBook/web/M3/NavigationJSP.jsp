<%-- 
    Document   : NavigationJSP
    Author     : Dzhuman Bohdan
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<c:if test="${c=='bacheca' || c=='profilo'}">
    <li id="titleProfile"> NERDBOOK </li>
    <li id="linkProfile"><a href="profilo.html"> Profilo </a></li>
    <li id="linkBacheca"><a href="bacheca.html"> Bacheca </a></li>
    <li id="logoutUtente"> Miyagi Asuna <a href="login.html"> <br> Logout </a> </li>
</c:if>
