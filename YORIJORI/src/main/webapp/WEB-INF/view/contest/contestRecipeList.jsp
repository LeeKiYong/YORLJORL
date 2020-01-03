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

<div class="contestRecipe_list">
	<div class="list_form">
		<h3 align="center">경연 레시피 등록</h3>
		<hr size=5px align="center" color="" />
		<br />
		
		<table width=1200px align="center" border=1 cellpadding=15px>
			<tr>
				<td width="300">글 번호</td>
				<td width="200">글 제목</td>
				<td width="300"></td>
				<td width="300"></td>
				<td width="300"></td>
				<td width="300"></td>
			</tr>
			<c:if test="">
			<c:forEach var="" items="">
			<tr>
				<td width="300"></td>
				<td width="200"></td>
				<td width="300"></td>
				<td width="300"></td>
				<td width="300"></td>
				<td width="300"></td>
			</tr>
			</c:forEach>
			</c:if>
		</table>
	</div>
</div>
</body>

</html>