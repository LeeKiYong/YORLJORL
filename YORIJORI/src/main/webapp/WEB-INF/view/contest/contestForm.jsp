<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!-- taglib모음 include -->
<%@ include file="../publicFile/taglib.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title><spring:message code="site.name"/></title>

</head>
<body>

<!-- 상단 mainTop(메뉴바) include -->
<div>
	<jsp:include page="../main/mainTop.jsp" />
</div>

<!-- 경연대회 등록 폼 -->
<div class="contest_container">
	<form:form action="regAction" id="frm" name="frm" method="post">
		<div class="cotest_form">
			<h3 align="center">경연대회 등록</h3>
			<table width=900 align="center" border=1 cellpadding="15px">
				<tr>
					<td width="200">경연대회 이름</td>
					<td width="400">
						<input type="text" name="contestName" size="40" maxlength="10" style="line-height: 20px" />
						<form:errors path="contestName" />
					</td>
				</tr>
				<tr>
					<td width="200">경연대회 시작날짜</td>
					<td width="400">
						<input type="datetime-local" id="contestStart" name="contestStart" size="40" maxlength="20" style="line-height: 20px" />
						<form:errors path="contestStart" />
					</td>
				</tr>
				<tr>
					<td width="200">경연대회 종료날짜</td>
					<td width="400">
						<input type="datetime-local" id="contestEnd" name="contestEnd" size="40" maxlength="11" style="line-height: 20px" />
						<form:errors path="contestEnd" />
					</td>
				</tr>
			</table>
		</div>
		<div class="contest_button" style="margin-top:30px; text-align: center; vertical-align: middle;">
			<input type="submit" value="등록" style="width:75px; height:30px; align:center;"/> 
			<input type="reset" value="다시입력" style="width:75px; height:30px; align:center;"/> 
			<input type="button" value="등록취소" style="width:75px; height:30px; align:center;"
				onclick="location.href='contest'"/>
		</div>
	</form:form>
</div>
</body>
</html>