<%-- 
    Document   : profiloJSP
    Author     : Dzhuman Bohdan
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
 <!DOCTYPE html>

<html>
    <head>
        <c:if test="${negato == false}">
            <title> Nerdbook | Profilo aSocial Network </title>
        </c:if>
        <c:if test="${negato == true}">
            <title>Accesso negato</title>
        </c:if>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta name="author" content="Dzhuman Bohdan">
        <meta name="keywords" content="">
        <meta http-equiv="refresh" content="86400">
        <link rel="stylesheet" type="text/css" href="M2/style.css"
              media="screen">
        <link rel="icon" href="../Asset/logoCardWhite.jpg" type="image/jpg"/>
    </head>
    <body>
        <div id="divProfilo">
            <nav id="navBarProfile">
                <ul>
                    <li id="titleProfile"> NERDBOOK </li>
                    <li id="linkProfile"><a href="profilo.html"> Profilo </a></li>
                    <li id="linkBacheca"><a href="bacheca.html"> Bacheca </a></li>
                    <li id="logoutUtente" > Miyagi Asuna <a href="login.html"> <br> Logout </a> </li>
                </ul>
            </nav>
            <div id="formProfile">
                <div id="compilazioneForm">
                <form action="professoIscr.java" method="post">
                    <div id="idPX1">
                        <label id="idPreFoto" class="sugInput" for="name"> Nome </label>
                        <input type="text" name="name" id="name" value="  Asuna" />
                        <br />
                    </div>
                    <div id="idPX2">
                        <label class="sugInput" for="cname"> Cognome </label>
                        <input type="text" name="cname" id="cname" value="  Miyagi" />
                        <br />
                    </div>
                    <div id="idPX3">
                        <label class="sugInput" for="pres"> Frase di Presentazione </label>
                        <textarea   rows="1" cols="25" name="pres" id="pres"> "Kill noob, save mob!" </textarea>
                        <br />
                    </div>
                    <div id="idPX4">
                        <label class="sugInput" for="dataNasc"> Data di nascità </label>
                        <input  type="text" name="dataNasc" id="dataNasc" value="  22 / 03 / 1991" />
                        <br />
                    </div>
                    <div id="idPX5">
                        <label class="sugInput" for="username"> Username </label>
                        <input type="text" name="username" id="username" value="  miyagiasuna@gmail.com" />
                        <br />
                    </div>
                    <div id="idPX6">
                        <label class="sugInput" for="pswd"> Password </label>
                        <input type="password" name="pswd" id="pswd" value="xFatal1991x" />
                        <br />
                    </div>
                    <div id="idPX7">
                        <label class="sugInput" for="pswd2"> Riinserisci la password</label>
                        <input type="password" name="pswd2" id="pswd2" value="xFatal1991x" />
                        <br />
                    </div>
                    <div id="buttonProfile">
                        <button id="buttomPushProfile" type="submit"> Conferma </button>
                    </div>
                </form>
                </div>
            </div>
            <div id="sideBar">
                <div id="sideBarPersone">
                    <ul><li id="idPersone"><strong> Persone </strong></li></ul>
                    <ul id="personList">
                        <li id="persona1"> <a href=""> Ji-Yeon Park </a> </li>
                        <li id="persona2"> <a href=""> Go Ara </a> </li>
                        <li id="persona3"> <a href=""> Tae-Yeon Kim </a> </li>
                    </ul>
                </div>
                <div id="sideBarGruppi">
                    <ul><li id="idGruppi"><strong> Gruppi </strong></li></ul>
                    <ul id="groupList">
                        <li id="gruppi1"> <a href=""> Softair </a> </li>
                        <li id="gruppi2"> <a href=""> Music </a> </li>
                        <li id="gruppi3"> <a href=""> Lineage </a> </li>
                    </ul>
                </div>
            </div>
        </div>
    </body>
</html>
