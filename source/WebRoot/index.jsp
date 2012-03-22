<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    <title>客户关系管理系统</title>   
  </head>
<frameset rows="85,*,40" frameborder="NO" noresize Borders="NO" framespacing="0"> 
 <frame name="topFrame" frameborder="NO" scrolling="NO" noresize Borders="NO" src="top.jsp"  marginwidth="value" marginheight="value" >
 <frame name="mainFrame" noresize Borders="NO" src="index-ec.jsp" marginwidth="value" marginheight="value" >
 <frame src="footer.jsp" name="top1Frame" frameborder="NO" scrolling="NO" noresize  marginwidth="0" marginheight="0" Borders="NO" >
</frameset>
<noframes>
  <body bgcolor="#FFFFFF">
  </body>
</noframes>
</html>
