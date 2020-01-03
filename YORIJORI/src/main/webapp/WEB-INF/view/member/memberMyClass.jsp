<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!-- 태그 라이브러리를 사용하기 위한 include -->
<%@ include file="../publicFile/taglib.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>나의 수업</title>
</head>
<body>
<div class="calnavi">
	<a href = "memberMyClass?year=${todayInfo.searchYear-1 }&month=${todayInfo.searchMonth-1}">&lt;&lt;</a>
	<a href = "memberMyClass?year=${todayInfo.beforeYear-1 }&month=${todayInfo.beforeMonth}">&lt;</a>
	<span> &nbsp; ${todayInfo.searchYear }.<c:if test="${todayInfo.searchMonth<10 }">0</c:if>${todayInfo.searchMonth } </span>
	<a href = "memberMyClass?year=${todayInfo.afterYear }&month=${todayInfo.afterMonth }">&gt;</a>
	<a href = "memberMyClass?year=${todayInfo.afterYear +1 }&month=${todayInfo.afterMonth -1 }">&gt;&gt;</a>
</div>
<table class="calBody">
	<thead>
		<tr bgcolor="#CECECE">
			<td>일</td>
			<td>월</td>
			<td>화</td>
			<td>수</td>
			<td>목</td>
			<td>금</td>
			<td>토</td>
		</tr>
	</thead>
	<tbody>
		<tr>
			<c:forEach var="dateList" items="${dateList }" varStatus="dateStatus">
				<c:choose>
					<c:when test="${dateList.value=='today' }">
						<td>
							<div>${dateList.date }</div>
							<div></div>
						</td>
					</c:when>
					<c:when test="${dateStatus.index%7 ==6 }">
						<td>
							<div>${dateList.date }</div>
							<div></div>
						</td>
					</c:when>
					<c:when test="${dateStatus.index%7==0 }">
						</tr>
						<tr>
							<td>
								<div>${dateList.date }</div>
								<div></div>
							</td>
					</c:when>
					<c:otherwise>
						<td>
							<div>${dateList.date }</div>
							<div></div>
						</td>
					</c:otherwise>
				</c:choose>
			</c:forEach>
	</tbody>
</table>
<a href = "MyClassReg" class = "clareg">[수업 등록]</a>
</body>
</html>