<%@taglib uri = "http://www.springframework.org/tags/form" prefix = "form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
  <style>
  .navbar{
 	width:100vw;
 	height:5vw;
 	display:flex;
  }
   .logopart{
   width:20vw;
   height:5vw;
   background-color:red;
   }
   .linkpart{
   width:80vw;
   height:5vw;
   background-color:yellow;
   }
   .leftcontent{
   width:100vw;
   height:80vw;
   background-color:lightgreen;
   display:flex;
   }
   .rightcontent{
   width:100vw;
   height:80vw;
   background-color:lightblue;
   }
   .form{
   display:flex;
   }
   .signupform{
   padding-left:5vw;
   }
   table tbody tr td {
	border: 2px;
	border-width: 2px;
	border-color: black;
	border-style: double;
}
tr td{
padding-left: 20px;
}
  </style>
</head>
<body>
<div class="navbar">
<div class="logopart">

</div> <div class="linkpart">

</div>
</div>
<div class="form">
<div class="leftcontent">

<form:form class="signupform" modelAttribute="categoryModelAgent" action="addcat">

<label>category Id</label>
<form:input type="text" path="categoryId"></form:input>
<br>
<label>category Name</label>
<form:input type="text" path="categoryName"></form:input>
<br>
<br>
<input type="submit" class="btn btn-submit">
</form:form>
<div class="rightcontent">


			<table>
				<tbody>
					<tr>
						<td>Category ID</td>
						<td>Category Name</td>
						<td>Delete</td>
						<td>Edit</td>
					</tr>
					<c:forEach var="cats" items="${allcategories}">
						<tr>
							<td>${cats.getCategoryId()}</td>
							<td>${cats.getCategoryName()}</td>
							<td><a href="deletecategory/${cats.getCategoryName()}/"><button class="btn btn-submit">Delete</button></a></td>
							<td><a href="singleCategory?categoryid=${cats.getCategoryName()}"><button class="btn btn-submit">Edit</button></td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
</div>
</body>
</html>