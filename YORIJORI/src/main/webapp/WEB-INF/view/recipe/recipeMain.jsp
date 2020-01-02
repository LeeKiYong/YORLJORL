<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!-- taglib모음 include -->
<%@ include file="../publicFile/taglib.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>YORIJORI</title>
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
<div>
<div style="border: 2px solid black; width:70%; height:40%; margin: 5px;">
집가고싶따<br />
<c:if test="${!empty manauthInfo }">
<div style = "botton: 70%">
	<a href="recipeRegister">레시피등록</a>
</div>
</c:if>
</div>
</div>
	<div>
		<jsp:include page="../main/mainFooter.jsp" />
	</div>
</body>
</html>