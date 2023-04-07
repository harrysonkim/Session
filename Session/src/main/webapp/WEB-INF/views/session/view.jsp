<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h1>세션 확인</h1>
<hr>

<p>세션 아이디 : <%= session.getId() %></p>

<p>세션 생성 시간 : <%= new Date( session.getCreationTime() ) %></p>

<p>마지막 접속 시간 : <%= new Date(session.getLastAccessedTime()) %></p>

<p>유지 시간 : <%= session.getMaxInactiveInterval() %></p>

<p>세션이 새롭게 만들어진 건지 확인 : <%= session.isNew() %></p>

<a href="./create"><button>세션 생성</button></a>
<a href="./delete"><button>세션 삭제</button></a>


</body>
</html>