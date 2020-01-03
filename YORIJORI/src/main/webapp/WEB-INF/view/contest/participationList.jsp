<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!-- taglib모음 include -->
<%@ include file="../publicFile/taglib.jsp" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title><spring:message code="site.name"/></title>
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
</head>
<body>

<!-- 상단 mainTop(메뉴바) include -->
<div>
	<jsp:include page="../main/mainTop.jsp" />
</div>

<div class="parList_form">
	<!--  수정 전 List -->
	<div class="parList_pass">
	<h3 align="center">대회 참가 신청서 승인 전</h3>
	<hr size=5px align="center" color="" />
	<form action="parPass" method="post" >
		<table width="600" align="center" border=1 cellpadding="15px">
			<tr>
				<td width="150">경연대회 회차</td>
				<td width="200">회원 아이디</td>
				<td width="150">관리자 승인 여부</td>
				<td width="100">승인 체크</td>
			</tr>
		<c:forEach var="parList" items="${participation }">
			<tr>
				<td width="150">${parList.contestNum }회</td>
				<td width="200">${parList.memId }</td>
				<td width="150">${parList.participationApp }</td>
				<td width="100">
					<input type="checkbox" name="check" value="${parList.participationNum }" />
				</td>
			</tr>
		</c:forEach>
			<tr>
				<td colspan="4" style="text-align: center">
					<input class="w3-button w3-black w3-round-xlarge" 
						style="width:290px" type="submit" value="통과" />
				</td>				
			</tr>
		</table>
	</form>
	</div>
	
	<!-- 수정 후 List -->
	<div class="parList_afterPass">
		<table width="600" align="center" border=1 cellpadding="15px">
			<tr>
				<td width="150">경연대회 회차</td>
				<td width="200">회원 아이디</td>
				<td width="150">관리자 승인 여부</td>
				<td width="100">승인 체크</td>
			</tr>
		<c:forEach var="parAfterList" items="${UpParticipation }">
			<tr>
				<td width="150">${paparAfterListrList.contestNum }회</td>
				<td width="200">${parAfterList.memId }</td>
				<td width="150">${parAfterList.participationApp }</td>
				<td width="100">
					<input type="checkbox" name="check" value="${parAfterList.participationNum }" />
				</td>
			</tr>
		</c:forEach>
		</table>
	</div>
</div>

</body>
</html>