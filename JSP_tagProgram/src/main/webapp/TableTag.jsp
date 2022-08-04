<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"  import="com.Package.JSPCustom.*" %>
   
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Hi </h1>
<jsp:useBean id="emp" class="com.Package.JSPCustom.Employees" scope="page"></jsp:useBean>
<jsp:setProperty property="id" name="emp" value="200"/>
<jsp:getProperty property="id" name="emp"/>
<%

//Employees empone=new Employees();
//request.setAtrribute("emp",empone);
out.println(emp.getId());

%>
</body>
</html>