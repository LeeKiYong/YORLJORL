<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!-- taglib모음 include -->
<%@ include file="../publicFile/taglib.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<!-- ------------------------------------------- -->
<style type="text/css">
     .manbody{ 
         text-align: center;
         display: block; 
         margin: 0 auto; 
         font-size: 16px; 
         color: #999; 
     } 
     .manTitle{ 
         font-family: 'Oswald', sans-serif; 
         font-size: 30px; 
         color: #216182; 
     } 
     #manlogin { 
         display: block; 
         margin-top: 20px; 
         letter-spacing: 2px; 
     } 
     #manForm { 
         margin: 0 auto; 
         width: 459px; 
     } 
     #mid, #mpw { 
         width: 439px; 
         height: 27px; 
         background-color: #efefef; 
         border-radius: 6px; 
         border: 1px solid #dedede; 
         padding: 10px; 
         margin-top: 3px; 
         font-size: 0.9em; 
         color: #3a3a3a; 
     } 
       #mid, #mpw:focus{ 
             border: 1px solid #97d6eb; 
         } 
     
     #manSubmit{ 
         width: 127px; 
         height: 48px; 
         text-align: center; 
         border: none; 
         margin-top: 20px; 
         cursor: pointer; 
     } 
     #manSubmit:hover{ 
         color: #fff; 
         background-color: #216282; 
         opacity: 0.9; 
     } 
     #manCancel { 
         width: 127px; height: 48px; 
         text-align: center; 
         border: none; 
         margin-top: 20px; 
         cursor: pointer; 
     } 
     #manCancel:hover{ 
         color: #fff; 
         background-color: #216282; 
         opacity: 0.9; 
     }

    .modal { 
         position: fixed; 
         left: 0; 
         top: 0; 
         width: 100%; 
         height: 100%; 
         background-color: rgba(0, 0, 0, 0.5); 
         opacity: 0; 
         visibility: hidden; 
         transform: scale(1.1); 
         transition: visibility 0s linear 0.25s, opacity 0.25s 0s, transform 0.25s; 
     } 
     .modal-content { 
         position: absolute; 
         top: 50%;
         left: 50%; 
         transform: translate(-50%, -50%); 
         background-color: #2d2d2d; 
         padding: 1rem 1.5rem; 
         width: 500px;
         height: 350px; 
         border-radius: 0.5rem; 
     } 
     .close-button { 
         float: right; 
         width: 1.5rem; 
         line-height: 1.5rem; 
         text-align: center; 
         cursor: pointer; 
         border-radius: 0.25rem; 
         background-color: lightgray; 
     } 
     .close-button:hover { 
         background-color: darkgray; 
     } 
     .show-modal { 
         opacity: 1; 
         visibility: visible; 
         transform: scale(1.0); 
         transition: visibility 0s linear 0s, opacity 0.25s 0s, transform 0.25s; 
     } 
    
</style>
<!-- -------------------------------------------- -->
<link rel="stylesheet" type="text/css" href="/YORIJORI/css/mainFooter.css" />

</head>
<body>
<div class="main_footer">
	<div class="footer_content">
		<div class="content_1">
			<p class="YO_link">
				<a href="#">회사소개</a>
				<span>|</span>
				<a href="##">광고문의</a>
				<span>|</span>
				<a href="###">개인정보처리방침</a>
				<span>|</span>
				<a href="####">이용약관</a>
				<span>|</span>
				<a href="#####">고객센터</a>
				<span>|</span>
				Copyright <strong>©EZHLD</strong>  Inc. All Rights Reserved
			</p>
		</div>
		<div class="content_3">
			<p class="YO_info">
				대표 : 이인경 / E : help@10000recipe.com / F : 02) 323-5049 <br/>
				서울 금천구 가산동 371-50 에이스하이엔드타워 3차 1106-1호 <br />
				문의전화(운영시간 평일 10:00~18:00) <br />
				쇼핑문의(만개스토어) : 02-6952-7747 <br />
				서비스 이용문의 : 070-4896-6416 
			</p>
		</div>
		<div class="content_4">
			<p class="YO_info">
				(주)이지에이치엘디 / 사업자등록번호 117-81-44101 / 통신판매업신고  <br />
				제 2009-서울금천-0631호 / 벤처기업확인 / 사업자정보확인 <br />
				서울지방중소기업청 제 031134233-1-01643호
			</p>
		</div>
	</div>
	<div style="right: 0px; bottom: 0px; color: #2d2d2d;">
	<!-- ---------------------------------------- -->
	<!-- 로그인 안했을때 -->
	<c:if test="${empty authInfo && empty manauthInfo }">
	<a class = "trigger">관리자만 누르세요ㅎㅎ</a>
	</c:if>
	
     <!-- 팝업 될 레이어 -->
    <div class = "manbody">
     <div class="modal">
         <div class="modal-content">
             <span class="close-button">&times;</span>
             <h1 class="manTitle" style="color: white;">로그인</h1>
              <form:form path = "manForm" action="managerLogin" method="post" commandName="managerLoginCommand">
               <label for="manlogin" style="color: white;">Login</label>
               <form:input path="mid" />
               <form:password path="mpw" />
               <input type="submit" id ="manSubmit" value="로그인" />
               <input type="button" id="manCancel" value="취소" />
             </form:form>
         </div>
     </div>
	</div>
    <script type="text/javascript"> 
         var modal = document.querySelector(".modal"); 
         var trigger = document.querySelector(".trigger"); 
         var closeButton = document.querySelector(".close-button"); 
         var cancelButton = document.querySelector("#cancel");

        //console.log(modal);

        function toggleModal() { 
             modal.classList.toggle("show-modal"); 
         }

        function windowOnClick(event) { 
             if (event.target == modal) { 
                 toggleModal(); 
             } 
         }

        trigger.addEventListener("click", toggleModal);
         closeButton.addEventListener("click", toggleModal);
         cancel.addEventListener("click", toggleModal);
         window.addEventListener("click", windowOnClick);
     </script>
	<!-- --------------------------------------------------------- -->
	</div>
</div>
</body>
</html>