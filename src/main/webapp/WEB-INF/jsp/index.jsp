<%-- 
    Document   : index
    Created on : 30.12.2015, 23:46:53
    Author     : Alexey
--%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Frameset//EN" "http://www.w3.org/TR/html4/frameset.dtd">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" type="text/css" href="/resource/informer.css">
         <spring:url value="/resources/informer.css" var="mainCss" />
        <link href="${mainCss}" rel="stylesheet" />
    </head>
    
    <body>
        <!--<h1>Проверяем</h1>
        <a href ="http://localhost:8080/Informer/test.htm">Перейти на тестову страницу </a>
        -->
        <div id="head"> Шапка сайта </div>
        <div id="left-column"> Левая колонка 
            
        </div>
        
        <div id="right-column"> Правая колонка </div>
        <div id="center-column"> Центральная колонка </div>
        <div id="footer"> Подвал сайта </div>
    </body>
    
</html>
