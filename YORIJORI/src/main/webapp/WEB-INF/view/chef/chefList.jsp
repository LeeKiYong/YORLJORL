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
<div>
	<jsp:include page="../main/mainTop.jsp" />
</div>
<form action = "" name = "chefListPro" method = "post">
<h3 align="center">쉐프 신청 리스트</h3>
<hr size=5px align="center" color="" />
	<table width=900 align="center" border=1 cellpadding=15px;>
	
	</table>
</form>
<div>
	==================================================================
	<div>
		<jsp:include page="../main/mainFooter.jsp" />
	</div>
</div>
</body>
</html>