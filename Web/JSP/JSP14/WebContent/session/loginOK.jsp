<%@ page import = "java.util.Enumeration" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%!
		String id,pw,name;
	%>
	<%
		request.setCharacterEncoding("UTF-8");
		id=request.getParameter("id");
		pw=request.getParameter("pw");
		name=request.getParameter("name");
		
		if(id.equals("asd") && pw.equals("123456")){
			session.setAttribute("id",id);
			session.setAttribute("pw", pw);
			session.setAttribute("name", name);
			session.setMaxInactiveInterval(0);
			
			response.sendRedirect("welcome.jsp");
		}else{
			response.sendRedirect("login.html");
		}
	%>
</body>
</html>