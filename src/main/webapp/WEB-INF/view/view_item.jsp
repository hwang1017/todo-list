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
    <title>View Items</title>
</head>
<body>
    <div align="center">


        <table>
            <tr>
                <td><label>ID</label></td>
                <td><c:out value="${toDoItem.id}" /></td>
            </tr>

            <tr>
                <td><label>Title</label></td>
                <td><c:out value="${toDoItem.title}" /></td>
            </tr>

            <tr>
                <td><label>Deadline</label></td>
                <td><c:out value="${toDoItem.deadline}" /></td>
            </tr>

            <tr>
                <td><label>Details</label></td>
                <td><c:out value="${toDoItem.details}" /></td>
            </tr>

        </table>

        <c:url var="tableUrl" value="${Mappings.ITEMS}"/>
        <a href="${tableUrl}">Back</a>
    </div>

</body>
</html>
