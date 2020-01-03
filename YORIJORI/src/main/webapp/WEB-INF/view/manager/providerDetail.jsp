<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!-- taglib모음 include -->
<%@ include file="../publicFile/taglib.jsp"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>providerDetailForm</title>
</head>
<script type="text/javascript"
	src="http://code.jquery.com/jquery-latest.js"></script>

<script type="text/javascript">
	$(function(){
		$("#providerModify").click(function() {
			location.href="providerModification?providerNum=" + ${provider.providerNum};
		});
		$("#providerList").click(function() {
			location.href="providerList";
		});
		$("#providerDelete").click(function() {
			location.href="providerDelete?providerNum=" + ${provider.providerNum};
		});
		$("#contract").click(function() {
			location.href="contract?providerNum=" + ${provider.providerNum};
		});
	});
</script>

<!-- 상단 mainTop(메뉴바) include -->
<div>
	<jsp:include page="../main/mainTop.jsp" />
</div>

<body>
		<h3 align="center">공급자 상세보기</h3>
		<hr size=5px align="center" color="" />

		<table width=900 align="center" border=1 cellpadding=15px;">
			<tr>
				<td width="200">사업자 번호</td>
				<td width="400">${provider.providerNum }</td>
			</tr>
			<tr>
				<td width="200">공급자 이름</td>
				<td width="400">${provider.providerName }</td>
			</tr>
			<tr>
				<td width="200">공급자 연락처</td>
				<td width="400">${provider.providerPh }</td>
			</tr>
			<tr>
				<td width="200">공급자 이메일주소</td>
				<td width="400">${provider.providerEmail }</td>
			</tr>
			<tr>
				<td width="200">공급자 계좌번호</td>
				<td width="400">${provider.providerAccount }</td>
			</tr>
			<tr>
				<td width="200">외상매입금</td>
				<td width="400">${provider.accountsPayable }&nbsp;원</td>
			</tr>
			<tr height="auto">
				<td width="200">외상매입내역</td>
				<td width="400">여기에 매입내역 넣기~</td>
			</tr>
		</table>
		<br />
		
		<div id="btn"
			style="text-align: center; vertical-align: middle; text-decoration: none; ">
			<button id = "contract" style="width:75px; height:30px; align:center;">계약</button>
			<button id = "providerModify" style="width:75px; height:30px; align:center;" >수정</button>
			<button id = "providerList"  style="width:85px; height:30px; align:center;">공급자목록</button>
			<button id = "providerDelete"  style="width:85px; height:30px; align:center;">삭제</button>
		</div>
</body>
<div>
	==================================================================
	<div>
		<jsp:include page="../main/mainFooter.jsp" />
	</div>
</div>
</html>