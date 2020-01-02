<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!-- taglib모음 include -->
<%@ include file="../publicFile/taglib.jsp" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="/YORIJORI/css/main.css" />
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
</head>
<body>
<div>
	<jsp:include page="../main/mainTop.jsp" />
</div>
<form:form action = "chefSignUpPro?num=${authInfo.num }" path = "chefSignUpPro" method = "post" commandName = "chefSignUpCommand">
<h3 align="center">쉐프 등록</h3>
<hr size=5px align="center" color="" />

		<table width=900 align="center" border=1 cellpadding=15px;>
			<tr>
				<td width="200">회원 이름</td>
				<td width="400">${authInfo.name }, ${authInfo.num }</td>
			</tr>
			<tr>
				<td width="200">자격증</td>
				<td width="400"><form:input type = "text" path="license" size="50" maxlength="100"
				 style="line-height: 20px" placeholder="자신의 요리분야의 취득자격증 이름을 입력해주세요" /></td>
			</tr>
			<tr>
				<td width="200">요리경력</td>
				<td width="400"><form:input type = "text" path="career" size="50" maxlength="300"
				 style="line-height: 20px" placeholder="자신의 요리분야의 경력을 입력해주세요" /></td>
			</tr>
			<tr>
				<td width="200">자기소개서</td>
				<td width="400"><form:input type = "text" path="intro" size="50" maxlength="1000"
				 style="line-height: 20px" placeholder="쉐프로써의 다짐을 입력해주세요" /></td>
			</tr>
</table>
			<br />
			<div id="btn" style="text-align: center; vertical-align: middle; text-decoration: none;">
			<input type="submit" name="submit" value="신    청" style="width:75px; height:30px; align:center;" />
			<input type="button" name="back" value="뒤로가기" onclick="history.back()" style="width:75px; height:30px; align:center;" />
		</div>
</form:form>
<div>
	==================================================================
	<div>
		<jsp:include page="../main/mainFooter.jsp" />
	</div>
</div>
</body>
</html>