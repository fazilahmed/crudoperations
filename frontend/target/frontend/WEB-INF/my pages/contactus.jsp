<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>ContactUs</title>
<style>
h1 {
  font-weight: bold;
  font-family:forte;color:purple;text-align:center;
  font-size: 30px;
}
h2 {
  	font-weight: bold;
  	
	color:black;
	text-align:left;
  	font-size: 30px;
}
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
  <li><a class="active" href="http://localhost:8080/frontend/contactus">Reach Us</a></li>
  <li style="float:right"><a href="http://localhost:8080/frontend/aboutus">About us</a></li>
</ul>
<h2 style="color:red;"> contact us</h2> 
no.3,kurinchi nagar extn.<br>
perichaipalayam north<br>
2nd street<br>
tirupur-641604<br>
<h3>phone no:  9677460355</h3>
<h3>GSTIN:  33ADKS5050P1ZN</h3>


</body>
</html>