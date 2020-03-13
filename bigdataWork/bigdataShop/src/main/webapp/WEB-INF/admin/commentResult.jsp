<%@page import="kr.multi.bigdataShop.product.comment.CommentResultDTO"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
    <link rel="stylesheet" type="text/css" href="/bigdataShop/common/css/jqcloud.css" />
    <script type="text/javascript" src="http://ajax.googleapis.com/ajax/libs/jquery/1.4.4/jquery.js"></script>
    <script type="text/javascript" src="/bigdataShop/common/js/jqcloud-1.0.4.js"></script>
</head>
<body>
	
	<h1>상품댓글분석</h1>
	<hr/>
	
	<div id="content">
		<table style="display: inline-block;">
			<tr>
				<th style="font-size: 15pt; padding-bottom: 10px">키워드</th>
				<th style="font-size: 15pt; padding-bottom: 10px">반복횟수</th>
			</tr>
			<c:forEach var="word" items="${commentResult}" end="9">
				<tr style="border-top: 1px solid;">
					<td style="padding: 8px; padding-right: 50px;'">${word.word}</td>
					<td style="padding: 8px; padding-right: 50px;">${word.count_word}</td>
				</tr>
			</c:forEach>
		</table>
		<div id="commentResult" style="width: 450px; height: 300px; display: inline-block; vertical-align: top; margin-left: 100px;"></div>
	</div>
	
	<script type="text/javascript">
		$(document).ready(function() {
			<% ArrayList<CommentResultDTO> arrList = (ArrayList<CommentResultDTO>)request.getAttribute("commentResult"); %>
			var words = new Array();
			<%for(int i=0;i<arrList.size();i++){%>
			var word = '<%=arrList.get(i).getWord()%>';
			var count = '<%=arrList.get(i).getCount_word()%>'
				words[<%=i%>]={text: word, weight: count};
			<%}%>
			$("#commentResult").jQCloud(words);
		})
	</script>
</body>
</html>