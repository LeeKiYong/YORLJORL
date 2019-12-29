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
		
		if ($("#providerPh").val() == "") {
			$("#providerPh").focus();
			alert("공급자의 연락처를 '-'없이 입력하세요.");
			return false;
		}
		
		if ($("#providerEmail").val() == "") {
			$("#providerEmail").focus();
			alert("공급자의 이메일주소를  @까지 입력하세요.");
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

function boardTabSetting() {
    // 탭 컨텐츠 hide 후 현재 탭메뉴 페이지만 show
    //$('.tabPage').hide();
    $($('.boardCurrent').find('a').attr('href')).show();

    // BoardTab 메뉴 클릭 이벤트 생성
    $('#board_tap').click(function (event) {
        var tagName = event.target.tagName; // 현재 선택된 태그네임
        // A태그일 경우 상위 Li태그 선택, Li태그일 경우 그대로 태그 객체
        var selectedLiTag = (tagName.toString() == 'A') ? $(event.target).parent('li') : $(event.target);
        var currentLiTag = $('li[class~=boardCurrent]'); // 현재 current 클래스를 가진 탭
        var isCurrent = false; 
         
        // 현재 클릭된 탭이 boardCurrent를 가졌는지 확인
        isCurrent = $(selectedLiTag).hasClass('boardCurrent');
         
        // boardCurrent를 가지지 않았을 경우만 실행
        if (!isCurrent) {
            $($(currentLiTag).find('a').attr('href')).hide();
            $(currentLiTag).removeClass('boardCurrent');

            $(selectedLiTag).addClass('boardCurrent');
            $($(selectedLiTag).find('a').attr('href')).show();
        }

        return false;
    });
}

function recipeTabSetting() {
	//탭 컨텐츠 hide 후 현재 탭메뉴 페이지만 show
	//$('.tabPage').hide();
	$($('.recipeCurrent').find('a').attr('href')).show();
	
	// RecipeTab 메뉴 클릭 이벤트 생성
    $('#recipe_tap').click(function (event) {
        var tagName = event.target.tagName; // 현재 선택된 태그네임
        // A태그일 경우 상위 Li태그 선택, Li태그일 경우 그대로 태그 객체
        var selectedLiTag = (tagName.toString() == 'A') ? $(event.target).parent('li') : $(event.target);
        var currentLiTag = $('li[class~=recipeCurrent]'); // 현재 current 클래스를 가진 탭
        var isCurrent = false; 
         
        // 현재 클릭된 탭이 recipeCurrent를 가졌는지 확인
        isCurrent = $(selectedLiTag).hasClass('recipeCurrent');
         
        // recipeCurrent를 가지지 않았을 경우만 실행
        if (!isCurrent) {
            $($(currentLiTag).find('a').attr('href')).hide();
            $(currentLiTag).removeClass('recipeCurrent');

            $(selectedLiTag).addClass('recipeCurrent');
            $($(selectedLiTag).find('a').attr('href')).show();
        }

        return false;
    });
}

$(function () {
    // 탭 초기화 및 설정
    boardTabSetting();
    recipeTabSetting();
});
</script>

<!-- 상단 mainTop(메뉴바) include -->
<div>
	<jsp:include page="../main/mainTop.jsp" />
</div>

<body>
	<form:form action="providerModifyPro" id="frm" name="frm" method="post" commandName="proRegistCommand">
		<h3 align="center">공급자 수정</h3>
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
				<td width="400">${provider.accountsPayable }&nbsp;원</td>
			</tr>
		</table>
		<br />
		<div id="btn"
			style="text-align: center; vertical-align: middle; text-decoration: none;">
			<input type="submit" name="modify" id="modify" value="수    정" style="width:75px; height:30px; align:center;"/>
			<input type="button" value="취    소" onclick="location.href='../providerDetail'" style="width:75px; height:30px; align:center;"/>
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