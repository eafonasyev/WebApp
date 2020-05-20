<%--
  Created by IntelliJ IDEA.
  User: Mi Notebook
  Date: 5/16/2020
  Time: 10:04 AM
  To change this template use File | Settings | File Templates.
  <%@ taglib prefix="security" uri="http://www.springframework.org/security/tags" %>
--%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
hi this is me this is my new page
<br>
You login as: <security:authentication property="principal.username"/>
<br>
Your role id: <security:authentication property="principal.authorities"/>
<security:authorize access="hasRole('MANAGER')">
<p>
    <a href="${pageContext.request.contextPath}/leaders">go to leaders(only for leaders)</a>
</p>
</security:authorize>
<security:authorize access="hasRole('ADMIN')">
<p>
    <a href="${pageContext.request.contextPath}/systems">go to system(only for admin)</a>
</p>
</security:authorize>
</body>
</html>
