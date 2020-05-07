<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" session="true"%>

<!DOCTYPE>
<html>
<head>
<title>인사관리시스템</title>

</head>
<body>
		<form class="form-horizontal" method="post" enctype="multipart/form-data"
					action="/bigdataShop/member/insert.do">
			
	
		<div class="form-group">
			<div class="col-md-2 text-right">
				<label for="title" class="control-label">아이디</label>
			</div>
			<div class="col-md-8">
				<input type="text" class="form-control input-lg" name="mem_id"
					id="mem_id" placeholder="아이디"> 
			</div>
		</div>
		<div class="form-group">
			<div class="col-md-2 text-right">
				<label for="mem_nm" class="control-label">성명</label>
			</div>
			<div class="col-md-8">
				<input type="text" class="form-control input-lg" name="mem_nm"
					id="mem_nm" placeholder="성명"> 
			</div>
		</div>
	
		<div class="form-group">
			<div class="col-md-2 text-right">
				<label for="pwd" class="control-label">비밀번호</label>
			</div>
			<div class="col-md-8">
				<input type="password" class="form-control input-lg" name="pwd"
					id="pwd" placeholder="비밀번호"> 
			</div>
		</div>
		

























		<div class="form-group">
			<div class="col-md-10 text-center">
				<input type="submit" class="btn btn-lg btn-primary" value="글쓰기">
				
				<button type="button" class="btn btn-danger btn-lg"
					onclick="javascript:cancelCheck()">
					<i class="fa fa-fw fa-close"></i> 취소
				</button>
			</div>
		</div>
	</form>

</body>
</html>