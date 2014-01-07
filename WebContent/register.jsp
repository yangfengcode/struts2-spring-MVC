<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
	<%
	String path = request.getContextPath();
	String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
	%>
	 
	<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
	<html>
	  <head>	    <base href="<%=basePath%>">
	     
	    <title>My JSP 'register.jsp' starting page</title>
	     
	    <meta http-equiv="pragma" content="no-cache">
	    <meta http-equiv="cache-control" content="no-cache">
	    <meta http-equiv="expires" content="0">   
	    <meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	    <meta http-equiv="description" content="This is my page">
	    <!--
	    <link rel="stylesheet" type="text/css" href="styles.css">
    -->
	 
	  </head>
	   
	  <body>
	    <form action="Register" method="post">
     
    <Table>
        <Tr>
	            <td>用户名:</Td>
	            <td><input type="text" name="username" /></Td>
	        </Tr>
	        <Tr>
            <td>密码:</Td>
	            <td><input type="password" name="password" /></Td>
	        </Tr>
	        <Tr>
	            <td><input type="submit" name="submit" value="注册"/></Td>
	            <td><input type="reset" name="reset" value="重置"/></Td>
	        </Tr>
	    </Table>
	     
	     
	    </form> 
	  </body>
	</html>