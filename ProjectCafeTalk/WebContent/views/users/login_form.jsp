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
<a href="signup_form.do">회원가입</a>
			


</div>
</body>
</html>




