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
<form:form action="memberJoinAction" name="frm" id="frm" method="post" commandName="memberCommand">
	<table width=600 align="center" border=1>
		<tr>
			<td width="200"><spring:message code="id" /></td>		
			<td width="400">
				<form:input path="memId" size="12" maxlength="10" id="memId" />			
				<div class="errors_message"><form:errors path="memId" /></div>
			</td>
		</tr>
		<tr>
			<td width="200"><spring:message code="password" /></td>
			<td width="400">
				<form:password path="memPw" id="memPw" size="12" maxlength="10" /><br />
				<div class="errors_message"><form:errors path="memPw" /></div>
			</td>
		</tr>
		<tr>
			<td width="200"><spring:message code="password.confirm" /></td>
			<td width="400">
				<form:password path="memPwCon" id="memPwCon" size="12" maxlength="10" /><br />
				<div class="errors_message"><form:errors path="memPwCon" /></div>
			</td>
		</tr>
		<tr>
			<td width="200"><spring:message code="name" /></td>
			<td width="400">
				<form:input path="memName" id="memName" size="12" maxlength="10" /><br />
				<div class="errors_message"><form:errors path="memName" /></div>
			</td>
		</tr>
		<tr>
			<td width="200">사용자 생년월일</td>
			<td width="400">
				<form:input path="memBirth" id="memBirth" size="12" maxlength="10" placeholder="19XX-XX-XX" /><br />
				<div class="errors_message"><form:errors path="memBirth" /></div>
			</td>
		</tr>
		<tr>
			<td width="200">사용자 이메일</td>
			<td width="400">
				<form:input path="memEmail" id="memEmail" size="30" maxlength="30" /><br />
				<div class="errors_message"><form:errors path="memEmail" /></div>
			</td>
		</tr>
		<tr>
			<td width="200">사용자 주소</td>
			<td width="400">
				<form:input path="memAddr" id="memAddr" size="30" maxlength="30" /><br />
				<div class="errors_message"><form:errors path="memAddr" /></div>
			</td>
		</tr>
		<tr>
			<td width="200">사용자 연락처</td>
			<td width="400">
				<form:input path="memPh" id="memPh" size="30" maxlength="28" /><br />
				<div class="errors_message"><form:errors path="memPh" /></div>
			</td>
		</tr>
		
		<tr>
			<td colspan=2>
				<input type="submit" value="<spring:message code="register.btn" />" />
				<input type="reset" value="다시입력" />
				<input type="button" value="가입안함" onclick="location.href='../main'"/>
			</td>
		</tr>
	</table>
</form:form>
</body>
</html>