<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!-- 태그 라이브러리를 사용하기 위한 include -->
<%@ include file="../publicFile/taglib.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>수업 등록</title>
</head>
<body>

<form:form action="ClassWritePro" name="classfrm" id = "classfrm" method="post" commandName="cookingCommand">
     <table cellpadding="0" cellspacing="0" > 
     	<tr>
			<td style="font-size:12" height="16" >
				<div align="center">셰프 이름</div>
			</td>
			<td>
				<input type="text" name = "chefName" size="10" maxlength="10"/>
			</td>
		</tr>
		<tr>
			<td style="font-size:12" height="16" >
				<div align="center">수업 이름</div>
			</td>
			<td>
				<input type="text" name = "className" size="10" maxlength="10"/>
			</td>
		</tr>
		<tr>
			<td style="font-size:12" height="16" >
				<div align="center">수업 주제</div>
			</td>
			<td>
				<input type="text" name = "classSub" size="10" maxlength="10"/>
			</td>
		</tr>
		<tr>
			<td style="font-size:12" height="16" >
				<div align="center">수업 목표</div>
			</td>
			<td>
				<input type="text" name = "classGoal" size="10" maxlength="10"/>
			</td>
		</tr>
		<tr>
			<td style="font-size:12" height="16" >
				<div align="center">수업 비용</div>
			</td>
			<td>
				<input type="text" name = "classCost" size="10" maxlength="10"/>
			</td>
		</tr>
		<tr>
			<td style="font-size:12" height="16" >
				<div align="center">준비물</div>
			</td>
			<td>
				<input type="text" name = "classMate" size="10" maxlength="10"/>
			</td>
		</tr>
		<tr>
			<td style="font-size:12" height="16" >
				<div align="center">수업 일시</div>
			</td>
			<td>
				<input type="text" name = "classDate" size="10" maxlength="10"/>
			</td>
		</tr>
		<tr>
			<td style="font-size:12" height="16" >
				<div align="center">수업 장소</div>
			</td>
			<td>
				<input type="text" name = "classPlace" size="10" maxlength="10"/>
			</td>
		</tr>
		<tr>
			<td style="font-size:12" height="16" >
				<div align="center">수업 정원</div>
			</td>
			<td>
				<input type="text" name = "classPsn" size="10" maxlength="10"/>
			</td>
		</tr>
		<tr>
			<td colspan=2 align=right>			
				<input type="submit" value="등록" > &nbsp;
				<input type="button" value="뒤로" onclick="javascript:history.back();" >	
			</td>
		</tr>
     </table>
</form:form>
</body>
</html>