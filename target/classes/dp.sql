-- Portfolio
CREATE TABLE PORTFOLIO(
	portfolio_idx	INT				PRIMARY KEY		AUTO_INCREMENT,
	userId			VARCHAR(15)		NOT NULL,
	projectName		VARCHAR(20)		NOT NULL,
--	projectType		VARCHAR() 		NOT NULL,	-- 여러개 체크하면.. 크기를 얼마로 지정해야되는거지
	teamName		VARCHAR(10)		NOT NULL,
	member			INT				NOT NULL,
	period			INT				NOT NULL,	-- 주단위 입력
	serviceUrl		VARCHAR(50)		NOT NULL
--	project_func	VARCHAR(300)	NOT NULL,
--	project_skill	VARCHAR()		NOT NULL,
--	my_func			VARCHAR(300)	NOT NULL,	-- 내가 만든 기능
--	my_skill		VARCHAR()		NOT NULL,
--	image							NOT NULL,	-- 프로젝트 이미지
--	description		VARCHAR(100)	NOT NULL,	-- 이미지 설명		
--	attachedFile					NOT NULL	-- 첨부파일
)

SELECT * FROM PORTFOLIO;