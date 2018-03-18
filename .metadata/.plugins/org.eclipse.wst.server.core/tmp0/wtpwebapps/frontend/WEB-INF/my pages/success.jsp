<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style>
body {
    background-image: url("yarn.jpg");
	background-position:center;
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
  <li><a class="active" href="http://localhost:8080/frontend/login">Enquiry</a></li>
  <li><a href="http://localhost:8080/frontend/contactus">Reach Us</a></li>
  <li style="float:right"><a href="http://localhost:8080/frontend/aboutus">About us</a></li>
</ul>
<h2>inserted successfully</h2>
</body>
</html>