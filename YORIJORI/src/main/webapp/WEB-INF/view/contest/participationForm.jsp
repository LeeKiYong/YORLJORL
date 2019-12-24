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

<div class="participation_form">
<form:form action="participation/participationInsert" id="frm" name="frm" method="post" commandName="participationCommand" enctype="multipart/form-data">
	<div =class="participation_insert">
		<h3 align="center"></h3>
		<hr size=5px align="center" color="black" />
		<table width=900 align="center" border=1 cellpadding=15px;">
			<tr>
				<td width="200">경연대회 회차</td>
				<td width="400">
					<select>
						<option value="1">1회</option>
						<option value="2">2회</option>
						<option value="3">3회</option>
						<option value="4">4회</option>
						<option value="5">5회</option>
					</select>
				</td>
			</tr>
			<tr>
				<td width="200">아이디</td>
				<td width="400">
					아이디들어감
				</td>
			</tr>
			<tr>
				<td width="200">자기소개</td>
				<td width="400">
					<form:textarea path="participationIntro" cols="40" rows="20" />
				</td>
			</tr>
			<tr>
				<td width="200">레시피 샘플</td>
				<td width="400">
					<!-- multiple >> 같은 폴더 내에서 여러개의 파일을 선택 할 수 있게함. -->
					<!-- 여러개 파일  업로드 할 시 command 필드 배열로 받음. -->
					<input type="file" name="report" multiple />
				</td>
			</tr>
		</table>
	</div>
	<div style="text-align: center; vertical-align: middle;">
		<input type="submit" value="등록" style="width:75px; height:30px; align:center;"/>
		<input type="reset" value="다시 입력" style="width:75px; height:30px; align:center;"/>
		<input type="button" value="등록취소" style="width:75px; height:30px; align:center;" 
			onclick="location.href='contest'"/>
	</div>
</form:form>
</div>
</body>
</html>