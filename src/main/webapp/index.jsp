<%@page isELIgnored="false" contentType="text/html; utf-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<body>
<h2>Hello World!eeeeeeeeeeeeeeeeeeee</h2>
<table>
    <c:forEach var="u" items="${sessionScope.list}">
        <tr>
            <td>
                    ${u.name}
            </td>
        </tr>
    </c:forEach>

</table>
</body>
</html>
