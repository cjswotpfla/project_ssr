<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!doctype html>
<html>
<head>
	<title>게시판 리스트</title>
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
	<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</head>
<body>
	<div class="container">
	  <h2>게시판</h2>
	  <table class="table table-hover">
	    <thead>
	      <tr>
	        <th>번호</th>
	        <th>제목</th>
	        <th>작성자</th>
	        <th>작성일</th>
	        <th>조회수</th>
	      </tr>
	    </thead>
	    <tbody>
	      <c:forEach items="${list}" var="board"><!-- items값은 Controller 값과 맞춰줘야함 -->
		      <tr>
		        <td>${board.num}</td>
		        <td><a href="<%=request.getContextPath()%>/board/detail?num=${board.num}">${board.title}</a></td>
		        <td>${board.writer}</td>
		        <td>${board.dateTime}</td>
		        <td>${board.views}</td>
		      </tr>
	      </c:forEach>
	    </tbody>
	  </table>
	  <a href="<%=request.getContextPath()%>/board/register"><button class="btn btn-outline-danger">글쓰기</button></a>
	</div>

</body>
</html>