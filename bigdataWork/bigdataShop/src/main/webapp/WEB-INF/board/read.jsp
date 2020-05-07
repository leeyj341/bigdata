<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" session="true"%>
<!DOCTYPE>
<html>
<head>
<title>쇼핑몰</title>

</head>
<body>
		<form class="form-horizontal">
			
		<input type="hidden" name="id" id="id" value="jang">
		<div class="form-group">
			<div class="col-md-2 text-right">
				<label for="id" class="control-label">작성자</label>
			</div>
			<div class="col-md-8">
				${board.id}
			</div>
		</div>
		<div class="form-group">
			<div class="col-md-2 text-right">
				<label for="title" class="control-label">제목</label>
			</div>
			<div class="col-md-8">
				${board.title}
			</div>
		</div>
		<div class="form-group">
			<div class="col-md-2 text-right">
				<label for="text" class="control-label">내용</label>
			</div>
			<div class="col-md-8">
				${board.text }
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