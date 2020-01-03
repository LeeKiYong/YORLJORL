<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <!-- taglib모음 include -->
<%@ include file="../publicFile/taglib.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>공급자 목록</title>
<script type="text/javascript">
</script>
</head>

<!-- 상단 mainTop(메뉴바) include -->
<div>
	<jsp:include page="../main/mainTop.jsp" />
</div>

<body>
	<h3 align="center">공급자 목록</h3>
	<hr size=5px align="center" color="" />
	<div id="btn"
		style="text-align: center; vertical-align: middle; text-decoration: none;">
		<button>
			<a href="providerRegistration" style="text-decoration: none; width:75px; height:30px; align:center;">공급자등록</a>
		</button>
	</div>
	<br />
	
	<table width = 1200px align="center" border=1 cellpadding=15px>
	
		<tr>
			<td width="300">사업자 번호</td>
			<td width="200">공급자 이름</td>
			<td width="300">공급자 연락처</td>
			<td width="300">공급자 이메일주소</td>
			<td width="300">공급자 계좌번호</td>
			<td width="300">외상매입금</td>
		</tr>
		<c:if test="${! empty list }">
			<c:forEach var="providerList" items="${list }"
				varStatus="status">
				<tr>
					<td width="300">
 				<a href="providerDetail?providerNum=${providerList.providerNum}">
				${providerList.providerNum }</a>
<%-- 				<form:form commandName = "proRegistCommand" action = "providerDetail">
				
				<form:input type="submit" path="providerNum" value = "${providerList.providerNum }" />
				</form:form> --%>
				</td>
					<td width="200">${providerList.providerName }</td>
					<td width="300">${providerList.providerPh }</td>
					<td width="300">${providerList.providerEmail }</td>
					<td width="300">${providerList.providerAccount }</td>
					<td width="300">${providerList.accountsPayable }</td>
				</tr>
			</c:forEach>
		</c:if>
	</table>
	<c:if test="${ empty list }">
		<font size=2>등록된 공급자가 없습니다.</font>
	</c:if>
	
</body>
<div>
	==================================================================
	<div>
		<jsp:include page="../main/mainFooter.jsp" />
	</div>
</div>
</html>