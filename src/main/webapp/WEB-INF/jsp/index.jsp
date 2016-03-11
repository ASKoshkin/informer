<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<div style="margin:10px;">
	<h3>Индексная страница</h3>
	<p>Надо заполнить страницу</p>
</div>


<sec:authorize access="hasRole('ROLE_ADMIN')">
Эту строку видет только админ
</sec:authorize>