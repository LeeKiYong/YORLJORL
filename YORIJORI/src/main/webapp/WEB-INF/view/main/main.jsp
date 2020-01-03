<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!-- taglib모음 include -->
<%@ include file="../publicFile/taglib.jsp" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title><spring:message code="site.name" /></title>
<link rel="stylesheet" type="text/css" href="/YORIJORI/css/main.css" />
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
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
</head>
<body>

<!-- 상단 mainTop(메뉴바) include -->
<div>
	<jsp:include page="mainTop.jsp" />
</div>
<!-- 메인 본문 -->
<div class="div_container">
	<!-- 메인 왼쪽 -->
    <div class="div_left">
    	<div>
		<jsp:include page="sideNav.jsp" />
	</div>
    	<!-- 게시판 탭 메뉴 -->
    	<div class="board" style="border: 2px solid black; height:300px; margin:5px;">
		   	<div class="board_tap" id="board_tap">
		   		<ul>
		   			<li class="tap_menu boardCurrent">
		   				<a href="" >공지사항</a>
		   			</li>
		   			<li class="tap_menu">
		   				<a href="">이벤트</a>
		   			</li>
		   			<li class="tap_menu">
		   				<a href="">XXX</a>
		   			</li>
		   			<li class="tap_menu">
		   				<a href="">YYY</a>
		   			</li>
		   		</ul>
		   	</div>
		</div>
		
		<!-- 강의클래스 메뉴  >> 동영상이 들어갑니다. -->
		<div class="cook_class" style="border:2px solid black; height:200px; margin:5px;">
			쿠킹 클래스 동영상이 들어가는 부분.
		</div>
		
		<!-- 추천레시피 탭 메뉴 -->
		<div class="recommand_recipe" style="border: 2px solid black; height:300px; margin:5px;">
			<div class="recipe_tap" id="recipe_tap">
				<ul>
		   			<li class="tap_menu recipeCurrent">
		   				<a href="" >한식</a>
		   			</li>
		   			<li class="tap_menu">
		   				<a href="">중식</a>
		   			</li>
		   			<li class="tap_menu">
		   				<a href="">일식</a>
		   			</li>
		   			<li class="tap_menu">
		   				<a href="">양식</a>
		   			</li>
		   		</ul>
			</div>
		</div>
		
    </div>
    <!-- 메인 오른쪽 -->
    <div class="div_right">
    	<!-- 로그인 div -->
    	<div class="login_area" style="margin-top: 5px; border: 2px solid black;">
	    	<!-- 로그인되지 않았을 때 -->
	    	<c:if test="${empty authInfo && empty manauthInfo }">
	    	<div class="main_login" style="margin:5px;">
	    		<p>로그인 버튼을 눌러주세요.</p>
				<a href="loginForm">
					<button class="w3-button w3-black w3-round-xlarge" style="width:290px; ">로그인</button>
				</a>
				<div>
					<a href="regist">회원가입</a>&nbsp;&nbsp;&nbsp;&nbsp;
					<a href="##" class="" >아이디</a>&middot;
					<a href="###" class="" >비밀번호 찾기</a>
	    		</div>
	    	</div>
	    	</c:if>
	    	<!-- 로그인 됐을 때 -->
	    	<c:if test="${!empty authInfo || !empty manauthInfo }">
	    	<div class="main_loginSuccess">
	    		<c:if test="${!empty authInfo }">
	    		<strong>${authInfo.name } 님</strong>
	    		<a href = "chefSignUp">쉐프신청</a> | 
	    		</c:if>
	       		<c:if test="${!empty manauthInfo }">
	    			<strong>${manauthInfo.manNameA } 님</strong>
		<%-- 		<a href = "chefSignUpList?managerNum=${manauthInfo.managerNum }">신청목록보기</a>	 --%>    		
	    			<div>
	    				<a href="participationList">참가신청승인</a>
	    			</div>
	    		</c:if>
	    		<div style="text-align:right;">
	    			<button class="w3-button w3-black w3-round-xlarge" 
	    			style="width:90px" onclick="location.href='logout'">로그아웃</button>
	    		</div>
	    	</div>
	    	</c:if>
    	</div>
    	<!-- 광고 및 이벤트 div -->
    	<div class="main_event&Ad" style="margin-top:30px">
	    	<div class="div_eventBaner1">
	    		<a href="#" >
	    			<img class="img_setting" src="/YORIJORI/images/이벤트예시2.jpg" alt="이벤트배너1" />
	    		</a>	
	    	</div>
	    	<div class="div_eventBaner2">
	    		<a href="##">
	    			<img class="img_setting" src="/YORIJORI/images/이벤트예시3.jpg" alt="이벤트배너2" />
	    		</a>
	    	</div>
	    	<div class="div_adBaner1">
	    		<a href="###">
	    			<img  class="img_setting" src="/YORIJORI/images/광고예시3.jpg" alt="광고배너1" />
	    		</a>
	    	</div>
	    	<div class="div_adBaner2">
	    		<a href="####">
	    			<img class="img_setting" src="/YORIJORI/images/광고예시2.jpg" alt="광고배너2" />
	    		</a>
	    	</div>
    	</div>
	</div>
</div>
<div>
	==================================================================
	<div>
		<jsp:include page="mainFooter.jsp" />
	</div>
</div>
</body>
</html>


