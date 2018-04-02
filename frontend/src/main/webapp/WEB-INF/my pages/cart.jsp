<%@taglib uri = "http://www.springframework.org/tags/form" prefix = "form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Bootstrap Example</title>
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
   width:30vw;
   height:80vw;
   background-color:lightgreen;
   }
   .rightcontent{
   width:30vw;
   height:80vw;
   background-color:lightblue;
   }
   .middlecontent{
   width:40vw;
   height:80vw;
   background-color:white;
   }
   .form{
   display:flex;
   }
   .signupform{
   padding-left:5vw;
   }
  </style>
</head>
<body>
<div class="navbar">
<div class="logopart">

</div> <div class="linkpart">

</div>
</div>>
<div class="form">
<div class="leftcontent">

</div>
<div class="middlecontent">
<form:form class="signupform" modelAttribute="cartModelAgent" action="addcart">



<br>
<label>Cart userName</label>
<form:input type="text" path="cartUsername"></form:input>
<br>
<label>Cart product Name</label>
<form:input type="text" path="cartProductname"></form:input>
<br>
<label>Cart product Id</label>
<form:input type="number" path="cartProductId"></form:input>
<br>
<label>Cart Product price</label>
<form:input type="number" path="cartProductPrice"></form:input>

<br>
<label>Cart Product Quantity</label>
<form:input type="number" path="cartProductQuantity"></form:input>
<br>
<input type="submit" class="btn btn-submit">
</form:form>
</div>
<div class="rightcontent">

</div>
</div>
</body>
</html>