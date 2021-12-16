<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>HelloServlet.jsp</title>
</head>
<body>
	<h2>web.xml에서 매핑 후 JSP 출력하기</h2>
	<p>
	<!-- 리퀘스트 영역에 저장된 message를 출력한다. -->
	<strong><%=request.getAttribute("message") %></strong>
	<br />
	<a href="./HelloServlet.do">바로가기</a>
	<!-- 요청명을 결정 => 상대 경로 이기 때문에 현재 디렉토리명을 포함한 경로가 요청명이 됨.  -->
	</p>
</body>
</html>