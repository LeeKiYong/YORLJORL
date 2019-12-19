<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!-- taglib모음 include -->
<%@ include file="../publicFile/taglib.jsp" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title><spring:message code="site.name" /></title>
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">

<script type="text/javascript">
</script>
<style>
	
	.login_form {
		margin-top: 30px;
	}

	.login_insert {
		width: 400px;
		margin-left: 35%;
	}
	
	.login_option a {
		font-weight: bold;
		text-decoration: none;
	}
	
	.errors_message {
		font-weight: bold;
		color: red;
	}
</style>
</head>
<!-- 상단 mainTop(메뉴바) include -->
<div>
	<jsp:include page="mainTop.jsp" />
</div>
<body>
<form:form id="frm" name="frm" action="login" method="post" commandName="loginCommand">
<div class="login_form">
	<div class="login_insert" >
		<label><strong><spring:message code="id"/></strong></label>&nbsp;&nbsp;&nbsp;
		<span>
			<spring:message code="rememberId" />
			<form:checkbox path="idStore"/>
		</span>
		<form:input path="id1" class="w3-input w3-border w3-round-large" />
		<div class="errors_message"><form:errors path="id1"/></div>
		<label><strong><spring:message code="password"/></strong></label>
		<form:password path="pw" class="w3-input w3-border w3-round-large"/>
		<div class="errors_message"><form:errors path="pw" /></div>
	</div>	
	<div class="login_option" style="text-align:center;">
		<a href="register/agree">회원가입</a>&nbsp;&nbsp;&nbsp;&nbsp;
		<a href="##" class="" >아이디</a>&middot;
		<a href="###" class="" >비밀번호 찾기</a>&nbsp;&nbsp;
		<spring:message code="autoLogin"/>
		<form:checkbox path="autoLogin"/>
    </div>
    <div class="login_action">
    	<input class="w3-button w3-black w3-round-xlarge" type="submit" value="로그인" 
    	style="width: 300px; text-align: center;" id="btn" /> 
    </div>
</div>
</form:form>
<div>
	<jsp:include page="mainFooter.jsp" />
</div>
</body>
</html>