<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Product display</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<!-- <link href="//netdna.bootstrapcdn.com/bootstrap/3.1.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//netdna.bootstrapcdn.com/bootstrap/3.1.0/js/bootstrap.min.js"></script>
<script src="//code.jquery.com/jquery-1.11.1.min.js"></script> -->
</head>
<body>

	<div class="container">
		<div class="row">
			<div class="col-md-12">
				<c:forEach var="prod" items="${allproducts}">

					<div class="col-sm-6 col-md-4">
						<div class="thumbnail">
							<%-- <h4 class="text-center"><!-- <span class="label label-info"> -->${prod.productCategory()}<!-- </span> --></h4>
					 --%>
							<img src="http://placehold.it/650x450&text=Galaxy S5"
								class="img-responsive">
							<div class="caption">
								<div class="row">
									<div class="col-md-6 col-xs-6">
										<h3>${prod.getProductName()}</h3>
									</div>
									<div class="col-md-6 col-xs-6 price">
										<h3>
											<label>${prod.getProductPrice()}</label>
										</h3>
									</div>
								</div>
								<%-- 	<p>${prod.productDescription()}</p>
					 --%>
								<div class="row">
									<div class="col-md-6">
										<a class="btn btn-primary btn-product"><span
											class="glyphicon glyphicon-thumbs-up"></span> Like</a>
									</div>
									<div class="col-md-6">
										<a href="singleProduct?productid=${prod.getProductId()}"
											class="btn btn-success btn-product"><span
											class="glyphicon glyphicon-shopping-cart"></span> Buy</a>
									</div>
								</div>

								<p></p>
							</div>
						</div>
					</div>
				</c:forEach>
			</div>
		</div>

		

	</div>

	<%-- <c:forEach var="prod" items="${allproducts}">
<div class="col-md-2 column productbox">
    <img src="http://placehold.it/460x250/e67e22/ffffff&text=HTML5" class="img-responsive">
    <div class="producttitle">${prod.getProductName()}</div>
    <div class="productprice"><div class="pull-right"><a href="singleProduct?productid=${prod.getProductId()}" class="btn btn-danger btn-sm" role="button">BUY</a></div><div class="pricetext">${prod.getProductPrice()}</div></div>
</div>
</c:forEach> --%>
</body>
</html>