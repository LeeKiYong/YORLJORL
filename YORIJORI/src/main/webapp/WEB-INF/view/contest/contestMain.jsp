<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!-- taglib모음 include -->
<%@ include file="../publicFile/taglib.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title><spring:message code="site.name" /></title>
</head>
<body style="margin:0px;">

<!-- 상단 mainTop(메뉴바) include -->
<div>
	<jsp:include page="../main/mainTop.jsp" />
</div>
<div class="contest_main">
	<a href="contest/regForm">경연대회 등록</a>
	<a href="contest/participation">참가자 등록</a>
</div>
</body>
</html>