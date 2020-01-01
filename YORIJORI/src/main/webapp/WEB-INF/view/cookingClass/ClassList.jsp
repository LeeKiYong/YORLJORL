<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!-- 태그 라이브러리를 사용하기 위한 include -->
<%@ include file="../publicFile/taglib.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>쿠킹 클래스</title>
</head>
<body>
<table width=100% border="1" cellpadding="0" cellspacing="0" align="center">
<!-- 수업이 없을 시 나오지않고, 있을 시 리스트가 생성되도록 태그 사용 -->
<c:if test="${! empty plan }">
	<tr align="center" valign="middle" >	
		<td width="10%" height="29">날짜</td>
		<td width="40%" height="29">수업</td>
		<td width="10%" height="29">정원</td>
	</tr>
	<c:forEach var="plan" items="${plan }" varStatus="status" >
	<tr align="left" valign="middle" >
		<td width="10%" height="29" align="center">
			<fmt:formatDate value="${plan.classDate }" pattern="yyyy-MM-dd"/>
		</td>
		<td width="40%" height="29">
			<a href = "classDetail?num=${plan.classNum }">${plan.className }</a>
		</td>
		<td width="10%" height="29" align="center">${plan.classPsn }</td>
	</tr>
	</c:forEach>
</c:if>
<c:if test="${ empty plan }">
	<tr align="center" valign="middle" >
		<td align=left colspan="2">
			<font size=2>등록된 수업이 없습니다.</font>
		</td>
	</tr>
</c:if>			
</table>
</body>
</html>