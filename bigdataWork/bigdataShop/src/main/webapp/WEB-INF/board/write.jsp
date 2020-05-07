<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR" session="true"%>
<!DOCTYPE
>
<html>
<head>
<title>bigdataShop</title>

</head>
<body>
		<form class="form-horizontal" method="post" 
			enctype="multipart/form-data"
					action="/bigdataShop/board/user/insert.do">
			
		<input type="hidden" name="id" id="id" value="kang">
		<div class="form-group">
			<div class="col-md-2 text-right">
				<label for="id" class="control-label">작성자</label>
			</div>
			<div class="col-md-8">
				${"kang"}
			</div>
		</div>
		<div class="form-group">
			<div class="col-md-2 text-right">
				<label for="title" class="control-label">제목</label>
			</div>
			<div class="col-md-8">
				<input type="text" class="form-control input-lg" name="title"
					id="title" placeholder="제목"> 
			</div>
		</div>
		<div class="form-group">
			<div class="col-md-2 text-right">
				<label for="text" class="control-label">내용</label>
			</div>
			<div class="col-md-8">
				<textarea class="form-control" rows="20" name="text" id="text"></textarea>
			</div>
		</div>
		<div class="form-group">
			<div class="col-md-2 text-right">
				<label for="files" class="control-label">파일1</label>
			</div>
			<div class="col-md-8">
				<input type="file" class="form-control input-lg" name="files"
					id="files" placeholder="파일선택"> 
			</div>
		</div>
		<div class="form-group">
			<div class="col-md-2 text-right">
				<label for="title" class="control-label">파일2</label>
			</div>
			<div class="col-md-8">
				<input type="file" class="form-control input-lg" name="files"
					id="title" placeholder="파일선택"> 
			</div>
		</div>
		<div class="form-group">
			<div class="col-md-2 text-right">
				<label for="files" class="control-label">파일3</label>
			</div>
			<div class="col-md-8">
				<input type="file" class="form-control input-lg" name="files"
					id="files" placeholder="파일선택"> 
			</div>
		</div>
		<div class="form-group">
			<div class="col-md-2 text-right">
				<label for="files" class="control-label">파일4</label>
			</div>
			<div class="col-md-8">
				<input type="file" class="form-control input-lg" name="files"
					id="files" placeholder="파일선택"> 
			</div>
		</div>
		<div class="form-group">
			<div class="col-md-2 text-right">
				<label for="title" class="control-label">파일5</label>
			</div>
			<div class="col-md-8">
				<input type="file" class="form-control input-lg" name="files"
					id="title" placeholder="파일선택"> 
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