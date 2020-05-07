<%@page import="spring.data.mongodb.dto.ScoreDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet"
	href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.0/jquery.min.js"></script>
<script
	src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
</head>
<body>
	<%ScoreDTO dto = (ScoreDTO)request.getAttribute("document"); %>
	<div class="container-fluid">
		<form role="form" class="form-horizontal"
			action="/mongoTest/score/insert" method="POST">
			<fieldset>
				<div id="legend">
					<legend>아래 양식을 작성해주세요.</legend>
				</div>
				<div class="form-group">
					<!-- 부서코드 -->
					<label class="control-label col-sm-2" for="orgcode">아이디</label>
					<%= dto.getId() %>
				</div>



				<div class="form-group">
					<!-- 부서명-->
					<label class="control-label col-sm-2" for="orgname">성명</label>
					<%= dto.getName() %>
				</div>







				<div class="form-group">
					<!-- 부서위치-->
					<label class="control-label col-sm-2" for="orgloc">부서명</label>
					<%= dto.getDept() %>
				</div>
				<div class="form-group">
					<!-- 전화번호-->
					<label class="control-label col-sm-2" for="orgtel">주소</label>
					<%= dto.getAddr() %>
				</div>
				<div class="form-group">
					<!-- 부서코드 -->
					<label class="control-label col-sm-2" for="orgcode">자바점수</label>
					<%= dto.getJava() %>
				</div>



				<div class="form-group">
					<!-- 부서명-->
					<label class="control-label col-sm-2" for="orgname">서블릿</label>
					<%= dto.getServlet() %>
				</div>







				<%-- <div class="form-group">
					<!-- 부서위치-->
					<label class="control-label col-sm-2" for="orgloc">spring</label>
					<%= dto.getSpring() %>
				</div>
				<div class="form-group">
					<!-- 전화번호-->
					<label class="control-label col-sm-2" for="orgtel">보너스</label>
					<%= dto.getBonus() %>
				</div> --%>

				<div class="form-group">
					<!-- Button -->
					<div class="col-sm-3 col-sm-offset-2">
						<input type="button" 
						value="수정하기" 
onclick="location.href='/mongoTest/score/detail?key=id&value=<%=dto.getId()%>&action=update'"						class="btn btn-success" />

					</div>
				</div>
			</fieldset>
		</form>
	</div>
</body>
</html>