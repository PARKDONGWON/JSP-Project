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
<h3>회원 가입 페이지 입니다.</h3>
<form action="signup.do" method="post">
	<label for="id">아이디</label>
	<input type="text" name="id" id="id"/><br/>
	<label for="pwd">비밀번호</label>
	<input type="text" name="pwd" id="pwd"/><br/>
	<label for="email">이메일</label>
	<input type="text" name="email" id="email"/><br/>
	<button type="submit">가입</button>
</form> 
</div>
</body>
</html>






