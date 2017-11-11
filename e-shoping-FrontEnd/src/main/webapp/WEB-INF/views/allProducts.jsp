<div class="container">
	<div class="col-lg-3">

		<%@include file="./shared/sidebar.jsp"%>

	</div>

	<div class="col-lg-9">

		<c:if test="${userClickAllProducts == true}">
			<nav class="breadcrumb">
				<a class="breadcrumb-item" href="<c:url value='/home'/>">Home</a> <span
					class="breadcrumb-item active">All Products</span>
			</nav>

			<div class="row">

				<div class="col-xs-12">

					<table class="table table-striped table-borderd" id="product-datatable">
						<thead>
							<tr>
								<th></th>
								<th>Product Name</th>
								<th>Brand</th>
								<th>Price</th>
								<th>Qty Available</th>
								<th></th>
							</tr>
						</thead>
						<tbody>
							<c:forEach items="${products}" var="product">
								<tr id="table-content">
									<td><img
										src="<c:url value="/resources/images/${product.id}.jpg"/>"
										class="datatable-img" /></td>
									<td>${product.name}</td>
									<td>${product.brand}</td>
									<td>$ ${product.unitPrice}</td>
									<td>${product.quantity}USD</td>
									<td>
									<a href="<spring:url value="/product/viewProduct/${product.id}"/>" class="btn btn-primary">
											<span class="glyphicon glyphicon-eye-open"></span></a>
									<a href="<spring:url value="/product/addToCart/${product.id}"/>" class="btn btn-success">
											<span class="glyphicon glyphicon-shopping-cart"></span></a>
									</td>
								</tr>
							</c:forEach>
						</tbody>

					</table>

				</div>

			</div>

		</c:if>

		<c:if test="${userClickCategoryProducts == true}">
			<nav class="breadcrumb">
				<a class="breadcrumb-item" href="<c:url value='/home'/>">Home</a> <span
					class="breadcrumb-item active">Category</span> <span
					class="breadcrumb-item active">${category.name}</span>
			</nav>
			
			
			<div class="row">

				<div class="col-xs-12">

					<table class="table table-striped table-borderd" id="product-datatable">
						<thead>
							<tr>
								<th></th>
								<th>Product Name</th>
								<th>Brand</th>
								<th>Price</th>
								<th>Qty Available</th>
								<th></th>
							</tr>
						</thead>
						<tbody>
							<c:forEach items="${products}" var="product">
								<tr id="table-content">
									<td><img
										src="<c:url value="/resources/images/${product.id}.jpg"/>"
										class="datatable-img" /></td>
									<td>${product.name}</td>
									<td>${product.brand}</td>
									<td>$ ${product.unitPrice}</td>
									<td>${product.quantity}USD</td>
									<td>
									<a href="<spring:url value="/product/viewProduct/${product.id}"/>" class="btn btn-primary">
											<span class="glyphicon glyphicon-eye-open"></span></a>
									<a href="<spring:url value="/product/addToCart/${product.id}"/>" class="btn btn-success">
											<span class="glyphicon glyphicon-shopping-cart"></span></a>
									</td>
								</tr>
							</c:forEach>
						</tbody>

					</table>

				</div>

			</div>
			
			
		</c:if>

	</div>
</div>