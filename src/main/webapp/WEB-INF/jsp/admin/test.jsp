<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<sec:authorize access="hasRole('ROLE_ADMIN')">
Тестовая страница
</sec:authorize>

