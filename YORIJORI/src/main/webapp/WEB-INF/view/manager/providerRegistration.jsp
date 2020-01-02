<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	
<!-- taglib모음 include -->
<%@ include file="../publicFile/taglib.jsp" %>
	
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>contractForm</title>
</head>
<script type="text/javascript"
	src="http://code.jquery.com/jquery-latest.js"></script>
<script type="text/javascript">
$(function() {
	$("#frm").submit(function() {
		if ($("#providerNum").val() == "") {
			$("#providerNum").focus();
			alert("공급자의 사업자 번호를 '-'없이 입력하세요.");
			return false;
		}
		if ($("#providerName").val() == "") {
			$("#providerName").focus();
			alert("공급자 이름을 입력하세요.");
			return false;
		}
		if ($("#providerPh").val() == "") {
			$("#providerPh").focus();
			alert("공급자의 연락처를 '-'없이 입력하세요.");
			return false;
		}
		
		if ($("#providerEmail").val() == "") {
			$("#providerEmail").focus();
			alert("공급자의 이메일주소를  @꺄지 입력하세요.");
			return false;
		}
 		if ($("#providerAccount").val() == "") {
			$("#providerAccount").focus();
			alert("공급자의 계좌번호를  '-'없이 입력하세요.");
			return false;
		}
		
	
	});

});
</script>

<script type="text/javascript">
</script>

<!-- 상단 mainTop(메뉴바) include -->
<div>
	<jsp:include page="../main/mainTop.jsp" />
</div>

<body>
	<form:form action="providerRegistration/action" id="frm" name="frm" method="post" commandName="proRegistCommand">
		<h3 align="center">공급자 등록</h3>
		<hr size=5px align="center" color="" />
		<table width=900 align="center" border=1 cellpadding=15px;">
			<tr>
				<td width="200">사업자 번호</td>
				<td width="400"><form:input path="providerNum" 
					style="line-height: 20px" size="40" maxlength="10"
					id="providerNum" placeholder="공급자의 사업자번호를  '-'없이 입력하세요."/></td>
			</tr>
			<tr>
				<td width="200">공급자 이름</td>
				<td width="400"><form:input path="providerName"  size="40"
					maxlength="20" id="providerName" style="line-height: 20px" placeholder="공급자의 이름을 입력하세요."/></td>
			</tr>
			<tr>
				<td width="200">공급자 연락처</td>
				<td width="400"><form:input path="providerPh"  size="40"
					maxlength="11" id="providerPh" style="line-height: 20px" placeholder="공급자의 연락처를 '-'없이 입력하세요."/></td>
			</tr>
				<tr>
				<td width="200">공급자 이메일주소</td>
				<td width="400"><form:input path="providerEmail" size="40"
					maxlength="50" id="providerEmail" style="line-height: 20px" placeholder="공급자의 이메일주소를  @꺄지 입력하세요."/></td>
			</tr>
			<tr>
				<td width="200">공급자 계좌번호</td>
				<td width="400"><form:input path="providerAccount" size="40"
					maxlength="14" id="providerAccount" style="line-height: 20px" placeholder="공급자의 계좌번호를  '-'없이 입력하세요."/></td>
			</tr>
			<tr>
				<td width="200">외상매입금</td>
				<td width="400"><form:input path="accountsPayable" size="40"
					id="providerAccount" style="line-height: 20px" placeholder="외상매입금을 입력하세요."/>&nbsp;원</td>
			</tr>
		</table>
		<br />
		<div id="btn"
			style="text-align: center; vertical-align: middle; text-decoration: none;">
			<input type="submit" value="공급자등록" style="width:75px; height:30px; align:center;"/> <input type="reset"
				value="다시 입력" style="width:75px; height:30px; align:center;"/> <input type="button" value="등록취소" style="width:75px; height:30px; align:center;"/>
		</div>
	</form:form>
</body>
<div>
	==================================================================
	<div>
		<jsp:include page="../main/mainFooter.jsp" />
	</div>
</div>
</html>