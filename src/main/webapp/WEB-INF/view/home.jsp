<%--
  Created by IntelliJ IDEA.
  User: hru_w
  Date: 9/10/2020
  Time: 2:00 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page import="learn.util.Mappings"%>
<html>
<head>
    <title>ToDo List Application</title>
</head>
<body>
    <div align="center">
        <c:url var= "itemLink" value= "${Mappings.ITEMS}"/>
        <h2><a href="${itemLink}">Show ToDo Items</a></h2>
    </div>

</body>
</html>
