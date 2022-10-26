<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page session="false" %>
<!-- 비로그인 -->

<!DOCTYPE html>
<html lang="ko">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0, minimum-scale=1, maximum-scale=1, user-scalable=no">
  <title>개발자 포트폴리오</title>
  <link rel="stylesheet" href="<c:url value='/resources/css/common/style_min.css'/>">
  <link rel="stylesheet" href="<c:url value='/resources/css/portfolio/addPortfolio.css'/>">
  
  
  <!--		※※※※ 이거 안해도되네.. 뭐지?? ※※※※
   <script type="text/javascript" src="DP/resources/js/portfolio/portfolio.js"></script>
   -->
</head>
<body>

  <!-- //헤더바 -->
  <header>
    <div class="header">
      <div class="l_menu">
        <a href="#" class="logo"><img src="" alt="">로고위치</a>
        <a href="#" class="menu portfolio">포트폴리오</a>
        <a href="#" class="menu board">게시판</a>
      </div>

      <div class="m_search">
        <div class="search">
          <input type="text" placeholder="검색어를 입력하세요.">
        </div>
      </div>

      <div class="r_join">
        <button class="auth_btn"><a href="#" class="auth_btn join_btn add_portfolio">포트폴리오 등록</a></button>
        <a href="#" class="auth_btn login_btn">로그인</a>
      </div>

    </div>
  </header>
  <!-- 헤더바// -->

  <!-- 모달 -->
<!--   <form method="post" modelAttribute="AddPortfolio">  -->
  <form method="post" action="AddPortfolio">
  	<div class="modal hidden">
	    <div class="bg"></div>
		<div class="modalBox">
      	<p>(*) 부분은 필수 항목입니다.</p>
		<ul>
	        <li>프로젝트명(*)<input type="text" class="projectName" placeholder="프로젝트명 등록"></li>
        	<li>프로젝트 구분(*)
          		<div>
		            <label>프론트엔드
              			<input type="checkbox" name="front-end">
            		</label>
              		<label>백엔드
		                <input type="checkbox" name="back-end">
              		</label>
              		<label>웹디자인
	                	<input type="checkbox" name="webdesign">
              		</label>
              		<label>WEB
		                <input type="checkbox" name="web">
              		</label>
            	</div>
        	</li>
        	<li>팀명  <input type="text" class="teamName" placeholder="팀 작업시 입력"></li>
        	<li>팀 인원
          		<select class="member" name="member">
		            <option value="1">1명
            		<option value="2">2명
            		<option value="3">3명
            		<option value="4">4명
            		<option value="5">5명
            		<option value="6">6명
            		<option value="7">7명
            		<option value="8">8명
            		<option value="9">9명
            		<option value="10">10명
          		</select>
       		</li>
        	<li>개발기간  <input type="text" class="period" placeholder="주 단위로 입력해주세요"></li>
        	<li>URL(웹관련 프로젝트)  <input type="text" class="serviceUrl" placeholder="서비스 중일시 url 입력"></li>
        	<fieldset>※ 프로젝트 단위 ※
          		<li>주요 기능  <input type="textarea" placeholder="주요 기능 간략 소개">
		            <ul> 사용 스택
                		<li>
                  		<p>사용 언어</p>
                  		<label>C
		                    <input type="checkbox" name="C">
                  		</label>
                  		<label>C++
		                    <input type="checkbox" name="C++">
                  		</label>
                  		<label>Java
		                    <input type="checkbox" name="Java">
                  		</label>
                  		<label>Python
		                    <input type="checkbox" name="Python">
                  		</label>
                  		<label>기타
		                    <input type="text" name="p_lang_etc">
                  		</label>
                		</li>
                		<li>
	                  		<p>IDE(개발도구)</p>
                  			<label>Eclipse
	                    		<input type="checkbox" name="eclipse">
                  			</label>
                  			<label>VSCode
	                    		<input type="checkbox" name="VSC">
                  			</label>
                  			<label>ATOM
	                    		<input type="checkbox" name="atom">
                  			</label>
                  			<label>IntelliJ
			                   	<input type="checkbox" name="IntelliJ">
                  			</label>
                  			<label>기타
	                    		<input type="text" name="p_ide_etc">
    	              		</label>
                		</li>
                		<li>
	                  		<p>DBMS</P>
                   			<label>Oracle
	                    		<input type="checkbox" name="oracle">
                   			</label>
                    		<label>MySQL
	                      		<input type="checkbox" name="MySQL">
                    		</label>
                    		<label>PostgreSQL
	                      		<input type="checkbox" name="PostgreSQL">
                    		</label>
                    		<label>MongoDB
	                      		<input type="checkbox" name="MongoDB">
                   			</label>
                    		<label>MariaDB
		                      	<input type="checkbox" name="MariaDB">
    	                	</label>
        	            	<label>기타
	                      		<input type="text" name="p_ide_etc">
                    		</label>
                		</li>
            		</ul>
          		</li>
     		</fieldset>
		</ul>
    	<div>
			<button class="submit modal_btn">등록</button>
			<button class="closeBtn modal_btn">
				<a href="main">취소</a>
			</button>
      	</div>
		</div>
  	</div>
  </form>
    <script>
    const open = () => {
      document.querySelector(".modal").classList.remove("hidden");
    }

    const close = () => {
      document.querySelector(".modal").classList.add("hidden");
    }

    document.querySelector(".add_portfolio").addEventListener("click", open);
    document.querySelector(".closeBtn").addEventListener("click", close);
    document.querySelector(".bg").addEventListener("click", close);
  </script>
  <!-- //modal 영역 -->

</body>
</html>
