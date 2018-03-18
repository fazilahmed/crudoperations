<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>login page</title>
<style>
ul {
    list-style-type: none;
    margin: 0;
    padding: 0;
    overflow: hidden;
    background-color: black;
}

li {
    float: left;
    border-right:1px solid #bbb;
}

li:last-child {
    border-right: none;
}

li a {
    display: block;
    color: white;
    text-align: center;
    padding: 14px 16px;
    text-decoration: none;
}

li a:hover:not(.active) {
    background-color: green;
}

.active {
    background-color: blue;
}


</style>
</head>
<body>
<ul>
  <li><a  href="http://localhost:8080/frontend/">Home</a></li>
  <li><a class="active" href="http://localhost:8080/frontend/login">Enquiry</a></li>
  <li><a href="http://localhost:8080/frontend/contactus">Reach Us</a></li>
  <li style="float:right"><a href="http://localhost:8080/frontend/aboutus">About us</a></li>
</ul>
<form action="http://localhost:8080/frontend/success">
   Name:
  <input type="text" name="firstname" >
  <br>
  Gender:<br>
<input type="radio" name="gender" value="male" checked> Male<br>
  <input type="radio" name="gender" value="female"> Female<br>
Mobile:<br>
<input type="number" name="mobile" ><br>
Email:<br>
<input type="text" name="mail id" ><br>
Comments:<br>
 <textarea name="message" rows="10" cols="30">
</textarea><br>

  <input type="submit" value="Submit">
<input type="submit" value="cancel">
</form> 

</body>
</html>
<!-- <html>
<head>
  <title>Bootstrap Example</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

	<style>
ul {
    list-style-type: none;
    margin: 0;
    padding: 0;
    overflow: hidden;
    background-color: black;
}

li {
    float: left;
    border-right:1px solid #bbb;
}

li:last-child {
    border-right: none;
}

li a {
    display: block;
    color: white;
    text-align: center;
    padding: 14px 16px;
    text-decoration: none;
}

li a:hover:not(.active) {
    background-color: green;
}

.active {
    background-color: blue;
}


</style>
	

</head>
<body>
<ul>
  <li><a  href="http://localhost:8080/frontend/">Home</a></li>
  <li><a href="http://localhost:8080/frontend/login">Enquiry</a></li>
  <li><a href="http://localhost:8080/frontend/contactus">Reach Us</a></li>
  <li style="float:right"><a  class="active" href="http://localhost:8080/frontend/aboutus">About us</a></li>
</ul>
</body>
</html>
 -->