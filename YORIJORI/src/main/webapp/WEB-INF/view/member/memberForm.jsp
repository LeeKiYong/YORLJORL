<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!-- taglib모음 include -->
<%@ include file="../publicFile/taglib.jsp" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title><spring:message code="site.name" /></title>
<style>
	.errors_message {
		font-weight: bold;
		color: red;
	}
</style>
</head>
<body>

<!-- 상단 mainTop(메뉴바) include -->
<div>
	<jsp:include page="../main/mainTop.jsp" />
</div>
<!-- 메인 왼쪽 -->
    <div class="div_left">
    	<div>
		<jsp:include page="../main/sideNav.jsp" />
	</div></div>
<div class="member_Reg">
<!-- 회원가입 폼 -->
<form:form action="memberJoinAction" name="frm" id="frm" method="post" commandName="memberCommand">
	<div class="member_form">
		<h3 align="center">회원가입</h3>
		<table width=900 align="center" border=1 cellpadding=15px;>
			<tr>
				<td width="200"><spring:message code="id" /></td>		
				<td width="400">
					<form:input path="memId" size="40" maxlength="10" id="memId" style="line-height: 20px" />			
					<div class="errors_message"><form:errors path="memId" /></div>
				</td>
			</tr>
			<tr>
				<td width="200"><spring:message code="password" /></td>
				<td width="400">
					<form:password path="memPw" id="memPw" size="40" maxlength="10" style="line-height: 20px" /><br />
					<div class="errors_message"><form:errors path="memPw" /></div>
				</td>
			</tr>
			<tr>
				<td width="200"><spring:message code="password.confirm" /></td>
				<td width="400">
					<form:password path="memPwCon" id="memPwCon" size="40" maxlength="10" style="line-height: 20px" /><br />
					<div class="errors_message"><form:errors path="memPwCon" /></div>
				</td>
			</tr>
			<tr>
				<td width="200"><spring:message code="name" /></td>
				<td width="400">
					<form:input path="memName" id="memName" size="40" maxlength="10" style="line-height: 20px" /><br />
					<div class="errors_message"><form:errors path="memName" /></div>
				</td>
			</tr>
			<tr>
				<td width="200">사용자 생년월일</td>
				<td width="400">
					<form:input path="memBirth" id="memBirth" size="40" maxlength="10" placeholder="19XX-XX-XX" style="line-height: 20px" /><br />
					<div class="errors_message"><form:errors path="memBirth" /></div>
				</td>
			</tr>
			<tr>
				<td width="200">사용자 이메일</td>
				<td width="400">
					<form:input path="memEmail" id="memEmail" size="40" maxlength="30" style="line-height: 20px" /><br />
					<div class="errors_message"><form:errors path="memEmail" /></div>
				</td>
			</tr>
			<tr>
				<td width="200">사용자 주소</td>
				<td width="400">
					<form:input path="memAddr" id="memAddr" size="40" maxlength="30" style="line-height: 20px" /><br />
					<div class="errors_message"><form:errors path="memAddr" /></div>
				</td>
			</tr>
			<tr>
				<td width="200">사용자 연락처</td>
				<td width="400">
					<form:input path="memPh" id="memPh" size="40" maxlength="28" placeholder="010XXXXXXXX" style="line-height: 20px" /><br />
					<div class="errors_message"><form:errors path="memPh" /></div>
				</td>
			</tr>
		</table>
	</div>
	<div class="member_button" style="margin-top:30px; text-align: center; vertical-align: middle;">
		<input type="submit" value="<spring:message code="register.btn" />" />
		<input type="reset" value="다시입력" />
		<input type="button" value="가입안함" onclick="location.href='../main'"/>
	</div>
</form:form>
</div>
</body>
</html>