<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page import="kr.multi.bigdataShop.product.*"%>
<%@page import="java.util.List"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<title>Bootstrap Example</title>
	<meta charset="utf-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<link type="text/css" href="/bigdataShop/common/css/master.css"
		rel="stylesheet" media="screen,print" />
	<link type="text/css" href="/bigdataShop/common/css/print.css"
		rel="stylesheet" media="print" />
	<link type="text/css" href="/bigdataShop/common/css/mall.css"
		rel="stylesheet" media="screen,print" />
	<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>





<style>
A.applink:hover {
	border: 2px dotted #DCE6F4;
	padding: 2px;
	background-color: #ffff00;
	color: green;
	text-decoration: none
}

A.applink {
	border: 2px dotted #DCE6F4;
	padding: 2px;
	color: #2F5BFF;
	background: transparent;
	text-decoration: none
}

A.info {
	color: #2F5BFF;
	background: transparent;
	text-decoration: none
}

A.info:hover {
	color: green;
	background: transparent;
	text-decoration: underline
}

#sky {
	position: absolute;
	width: 100px;
	left: 50%;
	top: 150px;
	margin-left: 400px;
	background: #ffffff;
	border: solid #ccc;
	height: 200px;
	padding: 30px
}
</style>



</head>
<body>
	
	<div id="header"></div>
	<!-- /header -->
	<hr />

	<!-- content/-->


	<!-- lyt-main/ -->
	<div class="lyt-main">
		<!-- title -->
		<h2></h2>
		<div class="goodsDetailWrap">
			<div class="leftWrap">
				<!---------------------- 상품사진  ----------------------->
				<div class="photoWrap">
					<div class="photo">
						<!-- 메인사진 -->
						<a href="#"><img
							src="/bigdataShop/images/product/${ product.img_gen_file_nm}"
							alt="썸이미지" /></a>
					</div>
					<div class="zoomBtn">
						<!-- 확대  -->
						<a href="#" onclick="imageZoom( '918' );"><img
							src="/bigdataShop/images/btn_zoom.gif" alt="확대" /></a>
					</div>
				</div>
			</div>
			<!-- leftWrap END-->

			<div class="rightWrap">
				<form name="frm" method="post" action="">
					<!-------------------------- 오른쪽 상품 가격 기타 정보 ------------------------>
					<dl class="goodsDetail">
						<!-- 상품 정보 -->

						<!-- 가격정보처리 -->















						<!-- 가격정보처리 -->
						<dt>상품명</dt>
						<dd>
							${ product.prd_nm}
						</dd>

						<dt>판매가</dt>
						<dd>
							${ product.sell_prc_unit}원
						</dd>









					</dl>

					<dl class="goodsDetail">
						<dt>공급사</dt>
						<dd>자바나라</dd>
					</dl>

					<dl class="goodsDetail" id="defaultDl">
						<dt>상품코드</dt>
						<dd></dd>

						<dt>규격</dt>
						<dd>standard</dd>

						<dt>단위/최소구매단위</dt>
						<dd>1EA EA</dd>

						<dt>원산지/제조사</dt>
						<dd>한국 /</dd>

						<!-- 											<dt>배송정보</dt> -->
						<!-- 												<dd>무료 배송상품</dd> -->

						<dt>주문수량</dt>
						<dt><a href="#">가격비교</a></dt>
						<!------------------ 상품상세 일반형  ---------------------->

						<dd>
							<!-- 상품 수량 조절 영역-->
							<div class="gCnt">
								<input type="text" name="v_prbuyea" value="1"
									style="width: 35px;" title="수량입력칸" onchange="eaChange( this );" />
								<input type="hidden" name="h_prcode"
									value="G4042_F0002_X0004_K0040" /> <input type="hidden"
									name="h_prname" value="FXK-UTM V300" /> <input type="hidden"
									name="h_prmoney" value="8800000" /> <input type="hidden"
									name="h_prstock" value="10000" /> <input type="hidden"
									name="h_prminbuyea" value="1" />
							</div>
							<div class="btns">
								<a href="#" onclick="eaUp( this, 1 ); return false;"><img
									src="/bigdataShop/images/b_up.gif" alt="증가" class="al" /></a> <a href="#"
									onclick="eaUp( this, -1 ); return false;"><img
									src="/bigdataShop/images/b_down.gif" alt="감소" class="al" /></a>
							</div>
						</dd>




						<div class="delBtn">
							<a href="#" onclick="optionAdd( this, 0 ); return false;"> <img
								src="/bigdataShop/images/btn_icon_plus.gif" alt="추가" />
							</a>
						</div>



						<!------------------ 상품상세 일반형  끝 ---------------------->


						<!-- *선택옵션 -->


						<!-- *입력옵션 -->


					</dl>

					<!-- *옵션추가영역 -->
					<div id="optionAdd"></div>
					<!-- *옵션추가영역 -->

					<dl class="goodsDetail">

						<div class="optionGoods h50 fr">
							<span id="v_prtotmoney" class="sale fl">0 </span><span
								class="sale02 fnt20">원</span>
						</div>


						<!------------------ 상품상세 일반형 끝 ---------------------->
					</dl>

					<ul class="btnArea mgt20">
						<!-- 구매버튼 -->

						<li><a href="#" onclick="dialogOpen('N'); return false;"><img
								src="/bigdataShop/images/btnm_nowBuy.gif" alt="바로구매" /></a></li>
						<li class="marL07"><a href="#"
							onclick="basketIn('N'); return false;"><img
								src="/bigdataShop/images/btnm_cart.gif" alt="장바구니" /></a></li>
						<li class="fl_right marL07"><a href="#"
							onclick="history.back();"><img
								src="/bigdataShop/images/btnm_list.gif" alt="목록" /></a></li>
						<li class="fl_right"><a href="#"
							onclick="productWishIn( 'G4042_F0002_X0004_K0040', 'N' );return false;"><img
								src="/bigdataShop/images/btnm_wish.gif" alt="위시리스트" /></a></li>
						<li class="fl_right"><a
							href="/bigdataShop/proread.do?prdno=&action=UPDATE">업데이트</a></li>

					</ul>
				</form>
			</div>
			<!-- rightWrap : 오른쪽 상품정보 END-->
		</div>
		<!-- goodsDetailWrap : 상품상세정보 전체 END-->

		<img src="/bigdataShop/images/product/${product.img_org_file_nm }"
			alt="썸이미지" />
		<div id="sky">
			<img src="/bigdataShop/images/product/${product.img_org_file_nm }"
			alt="썸이미지" width="50px" height="50px" />
		</div>
		</div>
	
		<!-- =================댓글등록화면과 조회화면================================= -->
		<form method="post" 
				action="/bigdataShop/product/comment/insert.do">
				<input type="hidden" name="prd_no" 
					value="${product.prd_no}"/>
				<!-- 세션에 있는 로그인 아이디 정보를 꺼내서 넣어야 하나 임의로 
				   바꿔가며 테스트 한다. -->
				<input type="hidden" name="mem_id" 	value="lee"/>
			
				<textarea rows="2" cols="100" name="pro_comment"></textarea>
						<input type="submit" value="등록"/>
			<table border="1" style="border-collapse: collapse">
				<!-- 댓글리스트를 출력 (ProductController read메소드에서
				 comment list정보를 같이 조회
				 EL &JSTL로 commentlist의 정보를 출력하기
				 -->
				 <c:if test="${!empty commentlist}">
			 		<c:forEach var="comment" items="${commentlist}">
			 			<tr>
			 				<td>${comment.pro_comment}</td>
			 			</tr>	
			 		</c:forEach>
				 </c:if>
			</table>
		</form>		
		
	
</body>
</html>


