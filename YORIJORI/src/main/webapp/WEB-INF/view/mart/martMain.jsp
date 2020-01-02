<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!-- taglib모음 include -->
<%@ include file="../publicFile/taglib.jsp" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
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
<c:if test="${!empty manauthInfo }">
<a href="providerRegistration">공급자등록</a>
<a href="providerList">공급자목록</a>
</c:if>
상품목록들~.~
</body>

<div>
	==================================================================
	<div>
		<jsp:include page="../main/mainFooter.jsp" />
	</div>
</html>