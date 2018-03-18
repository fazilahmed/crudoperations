<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
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
<h1 style="text-align:center;font-size:300%;font-family:forte;color:purple;">About Us</h1>

<p style="font-size:36px;">Established in the year 2010 stap apparels is engaged in manufacturing, supplying and exporting of high quality knitted and hosiery garments. Professional
 management with a zeal and determination to redefine fashion in the industry made our collection reflect designs from the remotest antiquity to the most elegant of 
contemporary statements. Our knitted garments seem to be a blend of traditional and contemporary styles 

Our garments have carved a niche in Europe, USA, Australia and Latin America markets due to their extensive range and consistent quality. Our satisfied customers
have made us achieve a sustainable competitive edge and thereby made us remain a key differentiator in the market.</p>

</body>
</html>