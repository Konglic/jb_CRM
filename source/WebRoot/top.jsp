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

<body style="border-bottom:solid 1px #666;">

<TABLE style="width:100%;">
<TR >
	<td ><img src="images/logo.gif"></td>
	<td style="font-family:����;font-size:33px;font-weight:bold;"> 客户关系管理系统</td>	
	<td width="30%" align="right" style="font-size:12px;" valign="bottom">当前用户：WILLIAN（系统管理员）&nbsp;&nbsp; 退出系统</td>
</tr>
</table>
</body>
</html>
