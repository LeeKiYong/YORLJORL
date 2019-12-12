<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!-- taglib모음 include -->
<%@ include file="../publicFile/taglib.jsp" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="http://code.jquery.com/jquery-latest.js"></script>
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<script type="text/javascript">
</script>
</head>
<!-- 상단 mainTop(메뉴바) include -->
<div>
	<jsp:include page="mainTop.jsp" />
</div>
<body>
<form id="frm" name="frm" action="login" method="post" >
<div class="login_form">
	<div class="login_insert" >
		<label>아이디</label>
		<input type="text"  name="id1" class="w3-input w3-border w3-round-large"  />
		<label>비밀번호</label>
		<input type="text" name="pw" class="w3-input w3-border w3-round-large"  />
	</div>	
	<div>
		<a href="#">회원가입</a>&nbsp;&nbsp;&nbsp;&nbsp;
		<a href="##" class="" >아이디</a>&middot;
		<a href="###" class="" >비밀번호 찾기</a>
    </div>
</div>
</form>
<div>
	<jsp:include page="mainFooter.jsp" />
</div>
</body>
</html>