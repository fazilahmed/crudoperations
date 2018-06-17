<html>
<html>
<head>
<title>Home</title>
<style>
h1 {
  font-weight: bold;
  font-family:forte;color:purple;text-align:center;
  font-size: 30px;
}
table, th, td {
    border: 1px solid black;
font-family:forte;
color:red;
text-align:center;
  font-size: 30px;
background-color:black;

}
body {
    background-image: url("yarn4.jpg");
	background-position:full;
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
  <li><a class="active" href="http://localhost:8080/frontend/">Home</a></li>
  <li><a href="http://localhost:8080/frontend/login">Enquiry</a></li>
  <li><a href="http://localhost:8080/frontend/reg">Reach Us</a></li>
  <li><a href="http://localhost:8080/frontend/cat">Category register</a></li>
  <li style="float:right"><a href="http://localhost:8080/frontend/aboutus">About us</a></li>
</ul>
<h1>Hello World!</h1>
</body>
</html>
