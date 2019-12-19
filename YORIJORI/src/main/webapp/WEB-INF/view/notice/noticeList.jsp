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
<!-- 공지 게시판 리스트 테이블 -->
<table width=100% border="1" cellpadding="0" cellspacing="0" align="center">
<!-- 게시글이 없을 시 나오지않고, 있을 시 리스트가 생성되도록 태그 사용 -->
<c:if test="${! empty notice }">
	<tr align="center" valign="middle" >	
		<td width="10%" height="29">분류</td>
		<td width="40%" height="29">제목</td>
		<td width="10%" height="29">작성일</td>
	</tr>
	<c:forEach var="notice" items="${notice }" varStatus="status" >
	<tr align="left" valign="middle" >	
		<td width="10%" height="29">${notice.class }</td>
		<td width="40%" height="29">
			<a href = "noticeDetail?num=${notice.noticeNum }">${notice.noticeTitle }
				<!-- 첨부파일이 있을 경우 제목 옆에 지정이미지 송출. 29*29픽셀..테이블 세로 길이와 맞춘다고 맞췄습니다. 깨질시 삭제. -->
				<c:if test="${ notice.noticeFn != null }">
					<img src="https://i.imgur.com/scZbIyY.png" />
				</c:if>
			</a>
		</td>
		<td width="10%" height="29">
		<fmt:formatDate value="${notice.noticeDate }" pattern="yyyy-MM-dd" />
		</td>
	</tr>
	</c:forEach>
</c:if>
<c:if test="${ empty boards }">
	<tr align="center" valign="middle" >
		<td align=right colspan="2">
			<font size=2>등록된 글이 없습니다.</font>
		</td>
	</tr>
</c:if>			
</table>
<!-- 테이블 밖으로 등록 버튼을 이동. CSS 정렬 및 꾸미기를 위해 Class값 설정 -->
<a href= "noticeWrite" class = aNotice>글쓰기</a>
<!-- 이하는 페이징 -->
<table>
<tr>
	<td>
	<c:if test="${ page <= 1}">
		[이전]&nbsp;
	</c:if>
	<c:if test="${ page > 1}">
		<a href="noticeList?page=${ page -1}">[이전]</a>
	</c:if>
	<c:forEach var="i" begin="${startPage }" end="${endPage }"  step="1">
		<a href="noticeBoardList?page=${ i}">[${ i}]&nbsp;</a>
	</c:forEach>
	<c:if test="${page >= maxPage }">
	[이후]&nbsp;
	</c:if>
	<c:if test="${page < maxPage }">
	<a href="noticeBoardList?page=${ page +1}">[이후]</a>
	</c:if>
	</td>
</tr>
</table>					
</body>
</html>