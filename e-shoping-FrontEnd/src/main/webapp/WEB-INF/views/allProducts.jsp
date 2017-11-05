<div class="container">
	<div class="col-lg-3">

		<%@include file="./shared/sidebar.jsp"%>

	</div>

	<div class="col-lg-9">

		<c:if test="${userClickAllProducts == true}">
			<nav class="breadcrumb">
				<a class="breadcrumb-item" href="<c:url value='/home'/>">Home</a> 
				<span class="breadcrumb-item active">All Products</span>
			</nav>
		</c:if>

		<c:if test="${userClickCategoryProducts == true}">
			<nav class="breadcrumb">
				<a class="breadcrumb-item" href="<c:url value='/home'/>">Home</a> 
				<span class="breadcrumb-item active">Category</span>
				<span class="breadcrumb-item active">${category.name}</span>
			</nav>
		</c:if>

	</div>
</div>