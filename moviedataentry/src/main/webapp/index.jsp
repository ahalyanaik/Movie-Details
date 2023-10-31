<head>
<style>
body{
box-sizing:border-box;
background-color: rgb(3,15,102);
display:flex;
flex-direction: column;
}
.main{
background-color: white;
height: 80%;
width: 30%;
position:relative;
top:10%;
left:35%;
border-radius:2%;
display:flex;
flex-direction: column;
justify-content: center;
align-items: center;
}
.form{
width: 80%;
margin:0% 0%;
padding:2%;
}
h3{
margin:0%;
}
form{
height:100%;
width:100%;
}
input{
height: 20%;
width: 100%;
margin-bottom: 1%;
}
.selectdelete>input{
height: 40%;
}
</style>
</head>

<html>
<body>
<div class="main">
<h3>Movie Details</h3>
<div class="form">
<form action="insert">
<input type="text" name="mId" placeholder="Enter the Movie Id"><br>
<input type="text" name="mName" placeholder="Enter the Movie Name" ><br>
<input type="text" name="mPrice" placeholder="Enter the Movie Price"><br>
<input type="submit">
</form>
</div>
<div class="form">
<form class="selectdelete" action="select">
Display the Movie details: <input type="submit"value="Select">
</form>
</div>
<div class="form">
<form action="update">
<input type="text" name="mId" placeholder="Enter the Movie Id"><br>
<input type="text" name="mName" placeholder="Enter the Movie Name else enter NA" ><br>
<input type="text" name="mPrice" placeholder="Enter the Movie Price else enter 0"><br>
<input type="submit"value="Update">
</form>
</div>
<div class="form">
<form class="selectdelete" action="delete">
<input type="text" name="mId" placeholder="Enter the Movie Id">
<input type="submit"value="Delete">
</form>
</div>
</div>
</body>
</html>

