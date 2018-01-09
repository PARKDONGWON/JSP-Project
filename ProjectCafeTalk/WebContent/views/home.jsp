<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>views/home.jsp</title>
<jsp:include page="/resource.jsp"></jsp:include>
</head>
<body>
<div class="navbar navbar-difault">
	<div class="navbar-header">
		<a href="#" class="navbar-brand">Apple</a>
		<!-- data-target="선택자" -->
		<button class="navbar-toggle" data-toggle="collapse" data-target="#one">
			<span class="icon-bar"></span>
			<span class="icon-bar"></span>
			<span class="icon-bar"></span>
		</button>
	</div>
	<!-- xs 영역에서 숨겨질 contents 를 담을 div -->
	<div class="collapse navbar-collapse" id="one">
		<a href="#" class="navbar-text navbar-link">Link</a>
		<button class="btn btn-info btn-xs navbar-btn">버튼</button>
	</div>
</div>	
<div class="container">
<h3>인덱스 페이지 입니다.</h3>
<!-- Button trigger modal -->
<button type="button" class="btn btn-default btn-lg" data-toggle="modal" data-target="#myModal">
  로그인하기
</button>
<!-- Modal -->
<div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
  <div class="modal-dialog">
    <div class="modal-content">
      <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
        <h4 class="modal-title" id="myModalLabel">Modal title</h4>
      </div>
      <div class="modal-body">
       		<a href="users/login_form.do?url=${pageContext.request.contextPath }/">로그인</a> 
      </div>
      <div class="modal-footer">
        <button type="button" class="btn btn-default" data-dismiss="modal">취소</button> 
 가입     </div>
    </div>
  </div>
</div>

<c:if test="${not empty id }">
	<p><a href="users/private/info.do">${id }</a>님 로그인중...</p>
	<a href="users/logout.do">로그아웃</a>
</c:if>
<ul>
	<li><a href="cafe/list.do">카페 글 목록보기</a></li>
	<li><a href="file/list.do">자료실 목록보기</a></li>
</ul>
<h3>공지사항</h3>
<ul>
	<c:forEach var="tmp" items="${news }">
		<li>${tmp }</li>
	</c:forEach>
</ul>
</div>
<script>
//모달에 옵션 전달하기
$("#myModal").modal({
	backdrop:false,//로딩시점에 창뜸  , 입력시 배경화면 검은색바탕 적용안되있음.(backdrop 표시여부)
	show:false  //특정시점에 창뜸 (javascript 가 수행될때 모달이 뜨지 않게)
});

$("#myBtn").click(function(){
	//모달 보이게 하기
	$("#myModal").modal("show");
});

// modal 에서 발생하는 이벤트 명
// 1. "show.bs.modal"
// 2. "shown.bs.modal"
// 3. "hide.bs.modal"
// 4. "hidden.bs.modal"
//모달 완전히 보여 졌을때 실행할 함수 등록
$("$myModal").on("shown.bs.modal",function(){});
//모달이 완전히 숨겨 졌을때 실행할 함수 등록
$("myModal").on("hidden.bs.modal",function(){});
</script>
</body>
</html>














