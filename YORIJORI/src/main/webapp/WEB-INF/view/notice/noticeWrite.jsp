<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!-- 태그 라이브러리를 사용하기 위한 include -->
<%@ include file="../publicFile/taglib.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>공지 글쓰기</title>
</head>
<body>
<form:form action="noticeWritePro" method="post" enctype="multipart/form-data" command="noticeCommand">
     <table cellpadding="0" cellspacing="0" > 
     	<tr>
			<td style="font-size:12" height="16" > 
				<div align="center">분류</div>
			</td>
			<td>
				<select name = "notice1">
					<option value = 공지>공지</option>
					<option value = 이벤트>이벤트</option>
				</select>
			</td>
		</tr>
		<tr>
			<td style="font-size:12" height="16" >
				<div align="center">제목</div>
			</td>
			<td>
				<input type=text name = "notice2" size="10" maxlength="10"/>
			</td>
		</tr>
		<tr>
			<td style="font-family:돋음; font-size:12" >
				<div align="center">내 용</div>
			</td>
			<td>
				<textarea name = "notice3" cols="80" rows="50" ></textarea>
			</td>
		</tr>
		<!-- 이클립스 오류로 인해 파일 업로드는 일단 없앱니다..공지사항에 파일 업로드가 필요한가요? 모르겟다
		<tr>
			<td style="font-family:돋음; font-size:12">
				<div align="center">파일</div>
			</td>
			<td>
				<input type="file" name="notice4" multiple = "multiple" />
			</td>
		-->	
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