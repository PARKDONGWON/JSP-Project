<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>views/users/login_form.jsp</title>
<jsp:include page="/resource.jsp"></jsp:include>
</head>
<body>
<%
	//로그인후 이동할 url 을 읽어온다.
	String url=(String)request.getAttribute("url");
%>
  <h3>로그인 페이지 입니다.</h3>
			<form action="login.do?url=<%=url %>" method="post">
				<label for="id">아이디</label>
				<input type="text" name="id" id="id"/>
				<label for="pwd">비밀번호</label>
				<input type="text" name="pwd" id="pwd"/>
				<button type="submit">로그인</button>
			</form>

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
       		<div></div>
      </div>
      <div class="modal-footer">
        <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
        <button type="button" class="btn btn-primary">Save changes</button>
      </div>
    </div>
  </div>
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




