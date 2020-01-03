<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!-- 태그 라이브러리를 사용하기 위한 include -->
<%@ include file="../publicFile/taglib.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>수업 상세</title>
</head>
<body>
<table width=50% border="1" cellpadding="0" cellspacing="0" >
	<tr align="center" valign="middle">
		<td height = "16">셰프 이름</td>
		<td >${plan.chefName }</td>
	</tr>
	<tr align="center" valign="middle">
		<td height = "16">수업 이름</td>
		<td>${plan.className }</td>
	</tr>
	<tr align="center" valign="middle">
		<td height = "16">수업 주제</td>
		<td >${plan.classSub }</td>
	</tr>
	<tr align="center" valign="middle">
		<td height = "16">수업 목표</td>
		<td >${plan.classGoal }</td>
	</tr>
	<tr align="center" valign="middle">
		<td height = "16">수업 비용</td>
		<td >${plan.classCost }</td>
	</tr>
	<tr align="center" valign="middle">
		<td height = "16">수업 준비물</td>
		<c:if test = ${! empty plan.classMate }>
			<td >${plan.classMate }</td>
		</c:if>
		<c:if test = ${ empty plan.classMate }>
			<td>없음</td>
		</c:if>
	</tr>
	<tr align="center" valign="middle">
		<td height = "16">수업 일시</td>
		<td ><fmt:formatDate value="${plan.classDate }" pattern="yyyy-MM-dd"/></td>
	</tr>
	<tr align="center" valign="middle">
		<td height = "16">수업 장소</td>
		<td >${plan.classPlace }</td>
	</tr>
	<tr align="center" valign="middle">
		<td height = "16">정원</td>
		<td >${plan.classPsn }</td>
	</tr>
	<tr align="right" valign="middle">
		<td colspan = 2>		
			<a href = "ClassBook?num=${plan.classNum }" >예약하기</a> &nbsp;
			<a href = "ClassList" >목록으로</a>
		</td>
	</tr>
</table>
</body>
</html>