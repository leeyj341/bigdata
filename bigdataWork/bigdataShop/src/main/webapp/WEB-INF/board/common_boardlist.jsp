
<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<title>인사관리시스템</title>

</head>
<body>

	<form action="/bigdataShop/board/search2.do">
		
		<select name="tag">
			<option value="writer">작성자</option>
			<option value="title">제목</option>
			<option value="content">본문</option>
		</select> <input type="text" name="search" /> <input type="submit" value="검색">
		<ul class="nav navbar-nav navbar-right">
			<li><a href="/bigdataShop/board/user/insert.do"
				style="text-align: right;">글쓰기</a></li>
		</ul>
	</form>


	<table class="table">
		<thead>
			<tr>
				<th>번호</th>
				<th>제목</th>
				<th>작성자</th>
				<th>작성날짜</th>
				<th>조회수</th>
				<th>삭제</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="board" items="${boardlist}">
				<tr>
					<td><a href="/bigdataShop/board/user/read.do?board_no=${board.board_no}&action=READ">${board.board_no}</a></td>
					<td>${board.title}</td>
					<td>${board.id}</td>
					<td>${board.reg_dtm}</td>
					<td>${board.hit}</td>
					<td><a href="/bigdataShop/board/delete.do?id=${board.board_no}">삭제</a></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	<div>
		<ul class="pagination">
			<li class="active"><a href="#">1</a></li>
			<li><a href="#">2</a></li>
			<li><a href="#">3</a></li>
			<li><a href="#">4</a></li>
			<li><a href="#">5</a></li>
		</ul>
	</div>

</body>
</html>










