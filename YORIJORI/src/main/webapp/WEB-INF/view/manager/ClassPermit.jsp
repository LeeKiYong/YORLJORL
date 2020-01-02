<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!-- 태그 라이브러리를 사용하기 위한 include -->
<%@ include file="../publicFile/taglib.jsp" `%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>수업 승인</title>
</head>
<body>
<table width=90% border="0" cellpadding="0" cellspacing="0" >
<c:if test="${! empty plan }">
	<tr align="center" valign="middle" >	
		<td width="10%" height="29">셰프이름</td>
		<td width="10%" height="29">수업이름</td>
		<td width="10%" height="29">수업주제</td>
		<td width="10%" height="29">수업목표</td>
		<td width="10%" height="29">수업비용</td>
		<td width="5%" height="29">준비물</td>
		<td width="10%" height="29">수업일시</td>
		<td width="20%" height="29">수업장소</td>
		<td width="10%" height="29">수업정원</td>
		<td width="5%" height="29">승인</td>
	</tr>
	<c:forEach var="plan" items="${plan }" varStatus="status" >
	<tr align="left" valign="middle" >
		<td width="10%" height="29" align="center">${plan.chefName }</td>
		<td width="10%" height="29" align="center">${plan.className }</td>
		<td width="10%" height="29" align="center">${plan.classSub }</td>
		<td width="10%" height="29" align="center">${plan.classGoal }</td>
		<td width="10%" height="29" align="center">${plan.classCost }</td>
		<c:if test = ${! empty plan.classMate }>
			<td width="5%" height="29" align="center">${plan.classMate }</td>
		</c:if>
		<c:if test = ${ empty plan.classMate }>
			<td width="5%" height="29" align="center">준비물 없음</td>
		</c:if>
		<td width="10%" height="29" align="center">
			<fmt:formatDate value="${plan.classDate }" pattern="yyyy-MM-dd"/>
		</td>
		<td width="20%" height="29" align="center">${plan.classPlace }</td>
		<td width="10%" height="29" align="center">${plan.classPsn }</td>
		<td width="5%" height="29" align="center"><input type="button" value="승인" /></td>
	</tr>
	</c:forEach>
</c:if>
<c:if test="${ empty plan }">
	<tr align="center" valign="middle" >
		<td align=left colspan="2">
			<font size=2>신청된 수업이 없습니다.</font>
		</td>
	</tr>
</c:if>	
</table>		
</body>
</html>