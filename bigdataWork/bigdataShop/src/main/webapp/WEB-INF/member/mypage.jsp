<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>로그인 관리</h2>
${loginUser.mem_id}회원님께서 로그인 정보를 확인하고 이상 상황인 경우 신고할 수 있도록 제공되는 페이지입니다. 
<table class="table">
		<thead>
			<tr>
				<th>번호</th>
				<th>로그인 IP</th>
				<th>최근접속시간</th>
				<th>최초로그인시간</th>
				<th>상태</th>
				<th>정보확인</th>
				<th>신고</th>
				<th>로그아웃</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="info" items="${loginInfoList}">
				<tr>
					<td>${info.num}</td>
					<td>${info.login_ip}</td>
					<td>${info.lastlogintime}</td>
					<td>${info.lastlogintime}</td>
					<td>${info.loginoutstate}</td>
					<td><a href="/bigdataShop/member/login/read.do?num=1">상세보기</a></td>
					<td><a href="#">신고하기</a></td>
					<td><a href="/bigdataShop/member/logout">로그아웃</a></td>
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