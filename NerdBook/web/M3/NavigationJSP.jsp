<%-- 
    Document   : NavigationJSP
    Author     : Dzhuman Bohdan
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<c:if test="${c=='bacheca' || c=='profilo'}">
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
</c:if>
