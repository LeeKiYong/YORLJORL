<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!-- 태그 라이브러리를 사용하기 위한 include -->
<%@ include file="../publicFile/taglib.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>공지사항</title>
</head>
<body>
<form:form action="noticeUpdatePro" method="post" enctype="multipart/form-data" commandName="noticeCommand">
<table width=50% border="1" cellpadding="0" cellspacing="0" >
	<tr align="center" valign="middle">
		<td style = "font-size:12" height = "16" colspan="2">
			등록일 <fmt:formatDate value="${notice.noticeDate }" type="date"/>
		</td>
	</tr>
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
	<tr align="center" valign="middle">
		<td style = "font-size:12" height = "16">제목</td>
		<td style = "font-size:12">
			<input type =text name = noticeTitle value = ${notice.noticeTitle } />
		</td>
	</tr>
	<tr align="center" valign="middle">
		<td style = "font-size:12" height = "16">내용</td>
		<td style = "font-size:12">
			<textarea name = noticeContent>${notice.noticeContent }</textarea>
		</td>
	</tr>
	<!-- 이부분~~~~~~~
	<tr align="center" valign="middle">
		<td style = "font-size:12" height="16" >파일</td>
		<td style = "font-size:12">
			<c:forEach var = "store" items = "${store }" varStatus="status">
				<a href = "/YORIJORI/WEB-INF/view/notice/upload/${store1 }">${filename[status.index] }</a>
			</c:forEach>
		</td>
	</tr>
	 -->
	<tr align="center" valign="middle">
		<td colspan = 2>		
			<input type =submit value = "수정완료" />&nbsp;&nbsp;
			<a href = "noticeList" >목록으로</a>
		</td>
	</tr>
</table>
</form:form>
</body>
</html>