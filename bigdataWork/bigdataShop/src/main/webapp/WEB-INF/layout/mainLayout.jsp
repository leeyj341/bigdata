<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>
<html>
<head>
<title>Bootstrap Example</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<style>
/* Remove the navbar's default rounded borders and increase the bottom margin */
.navbar {
	margin-bottom: 50px;
	border-radius: 0;
}

/* Remove the jumbotron's default bottom margin */
.jumbotron {
	margin-bottom: 0;
}

/* Add a gray background color and some padding to the footer */
footer {
	background-color: #f2f2f2;
	padding: 25px;
}

#outer {
	width: 95%;
	margin-left: auto;
	margin-right: auto;
}
</style>
</head>
<body>
	<div id="outer">
		<!-- 여기에 top메뉴를 연결하세요 -->
		<tiles:insertAttribute name="top"></tiles:insertAttribute>
		<div class="container">
			<!-- 여기에 content.jsp가 연결되도록 tiles설정 파일을 보고 작성하세요. -->
			<tiles:insertAttribute name="content"></tiles:insertAttribute>
		</div>


		<footer class="container-fluid text-center">
			<p>Online Store Copyright</p>
			<form class="form-inline">
				상품검색: <input type="email" class="form-control" size="50"
					placeholder="Email Address">
				<button type="button" class="btn btn-danger">검색</button>
			</form>
		</footer>
	</div>
</body>
</html>
