<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<!DOCTYPE html>
<html lang="en">

<head>

<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta name="description" content="">
<meta name="author" content="">

<title>Online Shoping-${title}</title>

<script type="text/javascript">
	window.menu = '${title}';
</script>

<!-- Bootstrap core CSS -->
<!-- <link href="resources/css/bootstrap.min.css" rel="stylesheet"> -->

<link href="<c:url value="/resources/css/bootstrap.min.css" />" rel="stylesheet">

<!-- <link href="resources/css/bootstrap-readable-theme.css" rel="stylesheet"> -->

<link href="<c:url value="/resources/css/bootstrap-readable-theme.css" />" rel="stylesheet">

<link href="<c:url value="/resources/css/jquery.dataTables.css" />" rel="stylesheet">

<!-- <link href="resources/css/myapp.css" rel="stylesheet"> -->

<link href="<c:url value="/resources/css/myapp.css" />" rel="stylesheet">

</head>

<body>

	<div class="wrapper">

		<%@include file="./shared/navbar.jsp"%>


		<!-- Page Content -->
		
		<div class="content">
			<c:if test="${userClickHome == true}">
			<%@include file="./shared/container.jsp"%>
		</c:if>

		<c:if test="${userClickAbout == true}">
			<%@include file="./about.jsp"%>
		</c:if>

		<c:if test="${userClickContact == true}">
			<%@include file="./contact.jsp"%>
		</c:if>
		
		<c:if test="${userClickAllProducts == true or userClickCategoryProducts == true}">
			<%@include file="./allProducts.jsp"%>
		</c:if>
		
		<c:if test="${userClickProductShow == true}">
			<%@include file="./product.jsp"%>
		</c:if>

		</div>


		<%@include file="./shared/footer.jsp"%>



		<!-- Bootstrap core JavaScript -->
		
		 <script src="<c:url value="/resources/js/jquery.min.js" />"></script>
		  <script src="<c:url value="/resources/js/popper.min.js" />"></script>
		   <script src="<c:url value="/resources/js/bootstrap.min.js" />"></script>
		   <script src="<c:url value="/resources/js/jquery.dataTables.js" />"></script>
		    <script src="<c:url value="/resources/js/myapp.js" />"></script>

	</div>

</body>

</html>

