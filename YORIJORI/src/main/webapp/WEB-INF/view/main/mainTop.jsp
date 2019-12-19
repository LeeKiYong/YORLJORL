<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!-- taglib모음 include -->
<%@ include file="../publicFile/taglib.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title></title>
<link rel="stylesheet" type="text/css" href="/YORIJORI/css/mainTop.css" />
<script type="text/javascript">
$(function() {
	$(".mainTop_nav a").mouseover(function() {
		$(".mainTop_navigation").stop().animate({height:250}, 100);
		$(".mainTop_navigation").css( "border-bottom", "2px solid #da304f" );
		$(".mainTop_nav2").css("display", "inline-block")
	});
		
	$(".mainTop_navigation").mouseleave(function() {
		$(".mainTop_navigation").stop().animate({height:45}, 100);
		$(".mainTop_nav2").css("display", "none")
	});
		
	$(this).hide();
});	

</script>
</head>
<body>
<div class="mainTop_Header">
	<div class="mainTop_logo">
		<a href="main" >
			<img src="/YORIJORI/images/요리조리로고.png" alt="메인로고" style="margin-top: 10px;" />
		</a>
	</div>
	<div class="mainTop_navigation" style="border-bottom: 2px solid rgb(218, 48, 79);">
		<div class="mainTop_nav">
			<ul>
				<li style="width:150;">
					<a class="menuLink" href="recipeMain">레시피</a>
					<ul class="mainTop_nav2" style="width: 150;">
						<li>1</li>
						<li>2</li>
						<li>3</li>
						<li>4</li>
					</ul>
				</li>
				<li>|</li>
				<li style="width:150;">
					<a class="menuLink" href="##">클래스</a>
					<ul class="mainTop_nav2" style="width: 150;">
						<li>1</li>
						<li>2</li>
						<li>3</li>
						<li>4</li>
					</ul>
				</li>
				<li>|</li>
				<li style="width:150;">
					<a class="menuLink" href="###">쇼핑몰</a>
					<ul class="mainTop_nav2" style="width: 150;">
						<li>1</li>
						<li>2</li>
						<li>3</li>
						<li>4</li>
					</ul>
				</li>
				<li>|</li>
				<li style="width:150;">
					<a class="menuLink" href="contest">경연대회</a>
					<ul class="mainTop_nav2" style="width: 150;">
						<li>1</li>
						<li>2</li>
						<li>3</li>
						<li>4</li>
					</ul>
				</li>
				<li>|</li>
				<li style="width:150;">
					<a class="menuLink" href="#####">QnA</a>
					<ul class="mainTop_nav2" style="width: 150;">
						<li>1</li>
						<li>2</li>
						<li>3</li>
						<li>4</li>
					</ul>
				</li>
			</ul>
		</div>
	</div>
</div>
</body>
</html>