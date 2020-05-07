<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.*,spring.data.mongodb.dto.*"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<% List<ScoreDTO> mongolist  =
			(List<ScoreDTO>)request.getAttribute("mongolist"); 
	   int size = mongolist.size();	%>
	<h1>Score(Mongo)</h1>
	
	<hr/>
	<table align="center" border="1" width="600">
		<tr bgcolor="skyblue">
			<th>아이디</th><th>성명</th><th>주소</th>
			<th>부서</th><th>보너스</th>
			<th>삭제</th>
		</tr>
		<%for(int i = 0;i<size;i++){
			ScoreDTO user = mongolist.get(i);%>
			<tr>
				<td><a
 href="/mongoTest/score/detail?key=id&value=<%=user.getId()%>&action=READ"><%= user.getId() %></a></td>
				<td><%= user.getName() %></td>
				<td><%= user.getAddr() %></td>
				<td><%= user.getDept()%></td>
				<td>
		<a href="/mongoTest/score/delete?id=<%=user.getId() %>">삭제</a></td>
			</tr>
			
		<%} %>
		<tr>
			<td colspan="6">
			<a href="/mongoTest/score/paginglist?pageNo=0">1</a>
			<a href="/mongoTest/score/paginglist?pageNo=1">2</a>
			<a href="/mongoTest/score/paginglist?pageNo=2">3</a>
			</td>
		</tr>
	</table>
	
</body>
</html>










