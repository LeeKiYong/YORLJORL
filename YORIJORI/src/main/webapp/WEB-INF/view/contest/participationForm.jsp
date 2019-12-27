<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!-- taglib모음 include -->
<%@ include file="../publicFile/taglib.jsp" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title><spring:message code="site.name"/></title>
</head>
<body>

<!-- 상단 mainTop(메뉴바) include -->
<div>
	<jsp:include page="../main/mainTop.jsp" />
</div>
<c:if test="${!empty authInfo }">
<div class="participation_form">
<form:form action="participationInsert" id="frm" name="frm" method="post" commandName="participationCommand" enctype="multipart/form-data">
	<div class="participation_insert">
		<h3 align="center">참가자 등록</h3>
		<table width=900 align="center" border=1 cellpadding=15px;">
			<tr>
				
				<td width="200">경연대회 회차</td>
				<td width="400">
					<form:select path="contestNum">
						<option selected>--선택--</option>
						<c:forEach var="num" items="${contestNum }">
						<form:option value="${num }" label="${num }회" />
						</c:forEach>
					</form:select>
				</td>
			</tr>
			<tr>
				<td width="200">아이디</td>
				<td width="400">
					${authInfo.id }
				</td>
			</tr>
			<tr>
				<td width="200">자기소개</td>
				<td width="400">
					<form:textarea path="participationIntro" style="width:550px; height:320; font-size:15px;"/>
				</td>
			</tr>
			<tr>
				<td width="200">레시피 샘플</td>
				<td width="400">
					<!-- multiple >> 같은 폴더 내에서 여러개의 파일을 선택 할 수 있게함. -->
					<!-- 여러개 파일  업로드 할 시 command 필드 배열로 받음. -->
					<input type="file" name="report" multiple />
				</td>
			</tr>
		</table>
	</div>
	<div style="text-align: center; vertical-align: middle;">
		<input type="submit" value="등록" style="width:75px; height:30px; align:center;"/>
		<input type="reset" value="다시 입력" style="width:75px; height:30px; align:center;"/>
		<input type="button" value="등록취소" style="width:75px; height:30px; align:center;" 
			onclick="location.href='contest'"/>
	</div>
</form:form>
</div>
</c:if>
<c:if test="${empty authInfo }">
	<% 
		out.println("<script>");
		out.println("alert('먼저 로그인을 해주세요.');");
		out.println("</script>");
		response.sendRedirect("../login"); 
	%>
</c:if>
</body>
</html>