<div class="container">
	<div class="row">
		<div class="col-xs-12">
			<nav class="breadcrumb">
				<a class="breadcrumb-item" href="<c:url value='/home'/>">Home</a> <a
					class="breadcrumb-item" href="<c:url value='/allProducts'/>">Products</a>
				<span class="breadcrumb-item active">${product.name}</span>
			</nav>
		</div>
	</div>

	<div class="row">
		<div class="col-xs-12 col-lg-4">
			<img src="<c:url value="/resources/images/${product.id}.jpg"/>" class="img img-responsive" />
		</div>
		<div class="col-xs-12 col-lg-8">
			<h3>${product.name}</h3>
			<hr/>
			
			<p>${product.description}</p>
			<hr/>
			
			<h4>Price: $<strong>${product.unitPrice}</strong></h4>
			<hr/>
			
			<h6>Qty Available: ${product.quantity}</h6>
			<hr/>
			
			<a href="<spring:url value="/product/addToCart/${product.id}"/>" class="btn btn-success">
											<span class="glyphicon glyphicon-shopping-cart"></span>Add To Cart</a>
			<a href="<spring:url value="/allProducts"/>" class="btn btn-primary">Back</a>
		</div>
	</div>
</div>