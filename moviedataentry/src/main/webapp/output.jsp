<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
body{
box-sizing:border-box;
background-color: rgb(3,15,102);
display:flex;
}
div{
background-color: white;
height: 30%;
width: 25%;
padding:1%;
position:absolute;
top:35%;
left:35%;
border-radius:2%;
display:flex;
flex-direction:column;
justify-content: center;
align-items: center;
}
h3{
margin-bottom: 1%}

</style>
</head>
<body>
<div>
<h3>Movie Details</h3>
<%=request.getAttribute("output")%>
</div>
</body>
</html>