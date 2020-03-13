<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>
<!DOCTYPE html>
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
	<div id="outer" >
		<div id="header" >
			<!-- 여기에 top메뉴가 연결되도록 하세요 -->
			<tiles:insertAttribute name="top"></tiles:insertAttribute>
		</div>
		<div id="left" class="col-sm-2 sidenav">
			<!-- 여기에 adminleft메뉴가 연결되도록 하세요 -->
			<tiles:insertAttribute name="menu"></tiles:insertAttribute>
		</div>
		<div id="content" class="col-sm-10">
			<!-- 여기에 admincontent가 연결되도록 하세요 -->
			<tiles:insertAttribute name="content"></tiles:insertAttribute>
		</div>
	</div>
</body>
</html>