<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<body>
<h2>Hello World!</h2>
<c:forEach var="item" items="${videoList }">
	<a href="${item.playUrl }">${item.name }</a>
</c:forEach>
</body>
<script src="<c:url value="/assets/js/jquery-3.0.0.min.js"/>"></script>
</html>
