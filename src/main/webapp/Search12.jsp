<%@page import="java.util.List"%>
<%@page import="com.shoppingheart.dto.ProductDetails"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.o
rg/TR/html4/loose.dtd">
 <%List<ProductDetails> pro= (List<ProductDetails>)request.getAttribute("name"); %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style>
#products p{
margin:0;
font-size:18px;
margin-left:20px;
}
body{
background-color:#07a;
}
</style>
</head>
<body>
<% if (pro!=null && !pro.isEmpty()){ %>
<h2>Your search product :</h2>
<div id="products"><hr>
<% for (ProductDetails product : pro) {%>
<p>Product Id : <%=product.getProductid() %> </p>
<p>Product Name : <%=product.getProductName() %></p>
<p>Product Price : <%=product.getProductPrice() %></p><hr>

<%}%>
</div>


<% }else{%>
<h1 style="text-align:center;margin-top:25%">Product Not Available<br>!!!</h1>
<% }%>
</body>
</html>