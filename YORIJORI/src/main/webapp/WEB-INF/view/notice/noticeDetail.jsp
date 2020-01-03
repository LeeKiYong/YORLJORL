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
<table width=50% border="1" cellpadding="0" cellspacing="0" >
	<tr align="left" valign="middle">
		<td height = "16" colspan="2">
			등록일 <fmt:formatDate value="${notice.noticeDate }" type="date"/>
		</td>
	</tr>
	<tr align="center" valign="middle">
		<td height = "16">분류</td>
		<td >${notice.noticeClass }</td>
	</tr>
	<tr align="center" valign="middle">
		<td height = "16">제목</td>
		<td>${notice.noticeTitle }</td>
	</tr>
	<tr align="center" valign="middle">
		<td height = "16">내용</td>
		<td >${notice.noticeContent }</td>
	</tr>
	<!-- 파일 없애 없애없애
	<tr align="center" valign="middle">
		<td style = "font-size:12" height="16" >파일</td>
		<td style = "font-size:12">
			<c:forEach var = "store" items = "${store }" varStatus="status">
				<a href = "/YORIJORI/WEB-INF/view/notice/upload/${store1 }">${filename[status.index] }</a>
			</c:forEach>
		</td>
	</tr>
	 -->
	<tr align="right" valign="middle">
		<td colspan = 2>		
			<a href = "noticeUpdate?num=${notice.noticeNum }" >수정</a> &nbsp;
			<a href = "noticeDelete?num=${notice.noticeNum }" >삭제</a> &nbsp;
			<a href = "noticeList" >목록으로</a>
		</td>
	</tr>
</table>
</body>
</html>