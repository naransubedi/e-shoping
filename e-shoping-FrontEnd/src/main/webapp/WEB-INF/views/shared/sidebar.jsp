<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<h1 class="my-4">Shop Name</h1>
<div class="list-group">
	<c:forEach items="${categories}" var="category">
		<a href="<c:url value='/category/${category.id}/products'/>" class="list-group-item" id="a_${category.name}">${category.name}</a>
	</c:forEach>
</div>