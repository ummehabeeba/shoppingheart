<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<style>
body {
    background-color:#07a;
    height:100%;
    margin:0;
}
*{
    box-sizing: border-box;
}
</style>
</head>
<body>

<h2 style="text-align:center;margin:100px auto;">ShoppingHeart</h2>
<form action="./Search" method="post" style="text-align:center">
  <input type="text" placeholder="Search product..." name="name" style="width:80%;padding:8px;"><br>
  <button type="submit" style="padding:8px;border:none;width:100px;">Search</button>
</form>

</body>
</html> 