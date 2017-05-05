<%-- 
    Document   : bachecaJSP
    Author     : Dzhuman Bohdan
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <c:if test="${denied == false}">
            <title> Nerdbook | Bacheca aSocial Network </title>
        </c:if>
        <c:if test="${denied == true}">
            <title> "ACCESS IS DENIED" / "ACCESSO NEGATO" </title>
        </c:if>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta name="author" content="Dzhuman Bohdan">
        <meta name="keywords" content="">
        <meta http-equiv="refresh" content="86400">
        <link rel="stylesheet" type="text/css" href="style.css"
              media="screen">
        <link rel="icon" href="../Asset/logoCardWhite.jpg" type="image/jpg"/>
    </head>
    
    <body id="bodyBacheca">
        <c:if test="${denied == false}">
            <div id="divBacheca">
                <nav>
                    <ul>
                        <c:set var="t" value="Bacheca" scope="request"></c:set>
                        <c:set var="c" value="bacheca" scope="request"></c:set>
                        <jsp:include page="nav.jsp"/>
                    </ul>
                </nav>
                    <div id="divBody">
                        <div id="postOne">
                            <div id="idWho1">
                                <img title="FotoProfiloMini" alt="La foto dell'utente" src="../Asset/imgAsuna.jpg">
                                <b> Miyagi Asuna </b> ha condiviso un post
                            </div>
                            <div id="idPost1">
                                <p> "Quando mi vedi per la prima volta, mi valuti. Non sei l'unico a farlo,
                                    lo fanno anche gli altri, semplicemente perché siamo fatti così. <br>
                                    Però ammettilo, non puoi vedere i miei pensieri o atti che compio. Vedi
                                    semplicemente i miei vestiti, il mio taglio di capelli e mi attribuisci un
                                    etichetta. <br>
                                    Spesso, commettiamo degli errori e di una brava persona parliamo male e di uno
                                    non bravo bene. <br>
                                    Forse, sarebbe meglio non attribuire etichette..., perché l'importante  non è
                                    la forma, ma il contenuto!?" </p>
                            </div>
                        </div>
                        <div id="postTwo">
                            <div id="idWho2">
                                <img title="FotoProfiloMini" alt="La foto dell'utente" src="../Asset/imgGoara.jpg">
                                <b> Go Ara</b> ha condiviso un post
                            </div>
                            <div id="idPost2">
                                <ul id="postMusic">
                                    <li> Ed Sheeran - Shape Of You <br>
                                        <audio controls>
                                            <source src="../Asset/EdSheeran-ShapeOfYou.ogg" type="audio/ogg">
                                            <source src="../Asset/EdSheeran-ShapeOfYou.mp3" type="audio/mpeg">
                                            Your browser does not support the audio element.
                                        </audio>
                                    </li>
                                    <li> MiyaGi & Эндшпиль - I Got Love ft. Рем Дигга <br>
                                        <audio controls>
                                            <source src="../Asset/MiyaGi_Эндшпиль-IGotLoveft.РемДигга.ogg" type="audio/ogg">
                                            <source src="../Asset/MiyaGi_Эндшпиль-IGotLoveft.РемДигга.mp3" type="audio/mpeg">
                                            Your browser does not support the audio element.
                                        </audio>
                                    </li>
                                </ul>
                            </div>
                        </div>
                    
                        <div id="postThree">
                            <div id="idWho3">
                                <img title="FotoProfiloMini" alt="La foto dell'utente" src="../Asset/imgJiyeon.jpg">
                                <b> Ji-Yeon Park </b> ha condiviso un post
                            </div>
                            <div id="idPost3">
                                <img  alt="Post di Ji-Yeon Park" src="../Asset/postJiyeon.jpg">
                            </div>
                        </div>
                        <div id="postFour">
                            <div id="idWho4">
                                <img title="FotoProfiloMini" alt="La foto dell'utente" src="../Asset/imgTaeyeon.jpg">
                                <b> Tae-Yeon Kim </b> ha condiviso un post
                            </div>
                            <div id="idPost4">
                                <p> "Questo è il <a href="http://kpopselca.com/selca/3999_go-ara.jpg"> link </a>
                                    relativo a quella foto di cui vi parlavo." 
                                </p>
                            </div>
                        </div>
                    </div>
            </div>
            <div id="sideBar">
                    <div id="sideBarPersone">
                        <ul><li id="idPersone"><strong> Persone </strong></li></ul>
                        <ul id="personList">
                            <li id="persona1"> <a href=""> Ji-Yeon Park </a> </li>
                            <li id="persona2"> <a href=""> Go Ara </a> </li>
                            <li id="persona3"> <a href=""> Tae-Yeon Kim</a> </li>
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
        </c:if>
        <c:if test="${denied == true}">
            <h1> "ACCESS IS DENIED" / "ACCESSO NEGATO" </h1>
            <p> Non dispone delle autorizzazioni necessarie per accedere alla pagina. </p>
        </c:if>
    </body>
</html>
