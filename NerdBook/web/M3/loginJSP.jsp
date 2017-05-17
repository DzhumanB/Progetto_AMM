<%-- 
    Document   : loginJSP
    Author     : Dzhuman Bohdan
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>
    <head>
        <title> Nerdbook | LogIn aSocial Network </title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta name="author" content="Dzhuman Bohdan">
        <meta name="keywords" content="nerdbook social per nerd login">
        <meta http-equiv="refresh" content="86400">
        <link rel="stylesheet" type="text/css" href="M2/style.css"
              media="screen">
        <link rel="icon" href="../Asset/logoCardWhite.jpg" type="image/jpg"/>
    </head>
    <body>
        <nav id="navLogin">
            <ul>
                <li id="titleLogin"> NERDBOOK </li>
                <li id="linkDescrizione"> <a href="M2/descrizione.hmtl"> Descrizione </a></li>
                <li id="linkProfile"> <a href="M2/profilo.html"> Profilo </a></li>
                <li id="linkBacheca"> <a href="M2/bacheca.html"> Bacheca </a></li>
            </ul>
        </nav>
        <div id="divLogin">
            <div id="windowLogin">  
                <form id="formLogin" action="" method="get">
                    <c:if test="${errore == true}">
                        <div id="errati">
                            <h2>Errore autenticazione</h2>
                            <p>Username o password sono errati.</p>
                        </div>
                    </c:if>
                    <label class="loginLogin" for="login"> Login </label>
                    <input type="text" name="login" id="login" value="Inserisci Login" />
                    <br />
                    <label class="pswdLogin" for="pswd"> Password </label>
                    <input type="password" name="pswd” " id="pswd" value="password" />
                    <br />
                    <input type="submit" value="Accedi"/>
                </form>
            </div>
        </div>
    </body>
</html>
