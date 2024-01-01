<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.ArrayList"%>
    <!-- only import attribute can be used by several times -->
<%@page import="java.util.Random" %>
<!--<%@include file="header.jsp"%> -->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>First JSP Page</title>
</head>
<!-- Directive tag -->
<%@page import="java.util.*" %>
<body bgcolor="cyan">
	<!-- Declarative tag -->
	<%!
		int i=23; 
		ArrayList<Integer> ls = new ArrayList<>();
	%>
	<!-- Scriptlet Tag -->
	<%
	int num1 = Integer.parseInt(request.getParameter("num1"));
	int num2 = Integer.parseInt(request.getParameter("num2"));
	ls.add(num1);
	ls.add(num2);
	int k = num1+num2;
	
	
	%>
	<br>
	<!-- Expression tag -->
	sum is :<%= k %>
	i value is : <%= i %>
	Package is imported because ArrayList is :<%=ls %>	
</body>
</html>