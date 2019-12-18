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
<!-- 폼폼 태그를 사용하여 Command 객체 사용. 파일을 업로드 할 수 있으므로 멀티파트 ...어쩌구... -->
<form:form action="noticeWritePro" method="post" enctype="multipart/form-data" commandName="noticeCommand">
     <table cellpadding="0" cellspacing="0" > 
     	<tr>
			<td style="font-size:12" height="16" >
				<div align="center">분류</div>
			</td>
			<td>
				<select name = noticeClass size=2 multiple>
					<option value = 1>공지</option>
					<option value = 2>이벤트</option>
				</select>
			</td>
		</tr>
		<tr>
			<td style="font-size:12" height="16" >
				<div align="center">제목</div>
			</td>
			<td>
				<input type=text name = noticeTitle size="10" maxlength="10"/>
			</td>
		</tr>
		<tr>
			<td style="font-family:돋음; font-size:12" >
				<div align="center">내 용</div>
			</td>
			<td>
				<textarea name = noticeContent cols="80" rows="100" ></textarea>
			</td>
		</tr>
		<tr>
			<td style="font-family:돋음; font-size:12">
				<div align="center">파일</div>
			</td>
			<td>
				<input type="file" name="noticeFn" multiple = "multiple" />
			</td>
			
		<tr>
		<td colspan=2>			
			<input type="button" value="뒤로" onclick="javascript:history.back();">
			<input type="submit" value="등록">		
		</td>
	</tr>
     </table>
</form:form>
</body>
</html>