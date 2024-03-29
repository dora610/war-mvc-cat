<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<html>
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Conference</title>
</head>
<body>
    <h1>Registration</h1>
    <h3>${successMessage}</h3>
    <form:form modelAttribute="registration">
    	<table>
            <tr>
                <td>
                	<spring:message code="name"/>:
                </td>
                <td>
                    <form:input path="name" />
                </td>
            </tr>
            <tr>
                <td colspan="2">
                    <input type="submit" value="<spring:message code="add.registration" text="default"/>" />
                </td>
            </tr>
        </table>
    </form:form>
</body>
</html>