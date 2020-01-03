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
<body>
<!-- header로고 -->
<div class="header_logo" style="text-align:center">
	<a href="main">
		<img src="/YORIJORI/images/요리조리로고.png" alt="메인로고" style="margin-top: 10px;" />
	</a>
</div>
<!-- 메인 왼쪽 -->
    <div class="div_left">
    	<div>
		<jsp:include page="../main/sideNav.jsp" />
	</div></div>


어서오세욧!
</body>
</html>