<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!-- taglib모음 include -->
<%@ include file="../publicFile/taglib.jsp"%>

<%
	String num = request.getParameter("providerNum");
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>

<!-- 상단 mainTop(메뉴바) include -->
<div>
	<jsp:include page="../main/mainTop.jsp" />
</div>

<body>
<div class="contract_insert">
	<div class="contract_form">
		<form action="contractAction" id="frm" name="frm" method="post">
			<h3 align="center">계약서</h3>
			<hr size=5px align="center" color="" />
			<table width=900 align="center" border=1 cellpadding=15px;">
				<tr>
					<td width="200">사업자번호</td>
					<td width="400">
						<input type="hidden" name="providerNum" style="line-height: 20px" size="40" maxlength="10" 
							value="<%=num %>"/>
						<%=num %>
					</td>
				</tr>
				<tr>
					<td width="200">계약날짜</td>
					<td width="400">
						<input type="date" name="contractDate" size="40" maxlength="20" style="line-height: 20px" />
					</td>
				</tr>
				<tr>
					<td width="200">계약만료날짜</td>
					<td width="400">
						<input type="date" name="contractExirationDate" size="40" maxlength="20" style="line-height: 20px" />
					</td>
				</tr>
					<tr>
					<td width="200">재료이름</td>
					<td width="400">
						<input type="text" name="ingredientName" size="40" maxlength="50" style="line-height: 20px"/>
					</td>
				</tr>
				<tr>
					<td width="200">공급단가</td>
					<td width="400">
						<input type="text" name="contractPrice" size="40" maxlength="14" style="line-height: 20px"/>
					</td>
				</tr>
				<tr>
					<td width="200">재료생산지</td>
					<td width="400">
						<input type="text" name="ingredientRegion" size="40" style="line-height:20px" />
					</td>
				</tr>
			</table>
			<div class="contract_button" style="margin-top:30px; text-align: center; vertical-align: middle;">
				<input type="submit" value="계약" style="width:75px; height:30px; align:center;"/> 
				<input type="reset" value="다시입력" style="width:75px; height:30px; align:center;"/> 
				<input type="button" value="등록취소" style="width:75px; height:30px; align:center;"
					onclick="location.href='martMain'"/>
			</div>
		</form>
	</div>
</div>
</body>
</html>