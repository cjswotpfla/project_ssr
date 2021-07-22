<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!doctype html>
<html>
<head>
	<title>게시글 수정</title>
	<link href="https://cdn.jsdelivr.net/npm/summernote@0.8.18/dist/summernote-bs4.min.css" rel="stylesheet">
    <script src="https://cdn.jsdelivr.net/npm/summernote@0.8.18/dist/summernote-bs4.min.js"></script>
</head>
<body>
<form class="container" enctype="multipart/form-data" method="post" action="<%=request.getContextPath()%>/board/modify">
	<h2>게시글 수정</h2>
	<div class="form-group">
		<label>제목:</label>
		<input type="text" class="form-control" name="title" value="${board.title}">
	</div>
		<div class="form-group">
		<label>작성자:</label>
		<input type="text" class="form-control" name="writer" value="${board.writer}" readonly>
	</div>
	<div class="form-group">
		<label>내용:</label>
		<textarea id="summernote" name="contents">${board.contents}</textarea>
	</div>
	<div class="form-group file-box">
		<label>첨부파일:</label>
		<c:forEach items="${fileList}" var="file">
			<div class="form-control mb-2">
				<span>${file.ori_name}</span>
				<input type="hidden" value="${file.num}" name="filenums">
				<button type="button" class="btn btn-outline-danger del-btn">X</button>
			</div>
		</c:forEach>
		<c:forEach begin="1" end="${3 - fileList.size()}">
			<input type="file" class="form-control mb-2" name="files">
		</c:forEach>
	</div>
	<input type="hidden" value="${board.num}" name="num">

	<button type="submit" class="btn btn-outline-success">등록</button>
</form>
<script type="text/javascript">
	$(function(){
		$('.del-btn').click(function(){
			$(this).parent().remove();
			$('.file-box').append('<input type="file" class="form-control mb-2" name="files">');
		})
	})
$('#summernote').summernote({
	placeholder: '내용을 작성하세요.',
	tabsize: 2,
	height: 100
});
</script>
</body>
</html>