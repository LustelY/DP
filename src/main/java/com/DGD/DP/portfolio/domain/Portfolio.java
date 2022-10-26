package com.DGD.DP.portfolio.domain;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class Portfolio {
	private int portfolio_idx; // 프로젝트 게시글 index_num
	private String userId; // 작성자
	private String projectName; // 프로젝트명
	private String projectType; // 프로젝트 구분(프론트/백/디자인/웹/앱...)
	// 어느정도 완성되면 추후에 자료 조사해서 추가할 것 : 인공지능 / 빅데이터 / 기계자동화 / 핀테크 / 게임 / 서버 / 영상편집 / 포토샵 / 일러스트 / 기타.....
	private	String teamName;
	private String member;
	private int period;
	private String serviceUrl; // 웹서비스 중일시 url 혹은 플레이스토어 주소 등..
	private String project_func; // 프로젝트 전체 주요 기능 소개
	private String project_skill; // 프로젝트 전체 사용 스택(HTML, CSS, JS, Jquery, 등등)
	private String my_func; // 개인이 담당한 기능 소개
	private String my_skill; // 개인이 담당한 기능에 사용된 스택
	private String image; // 프로젝트 소개 이미지
	private String description; // 프로젝트 소개 이미지 별 설명
	private Date createDate; // 생성일시
	private Date updateDate; // 수정일시
	private long readCount; // 조회수
	
	public Portfolio() {
		super();
	}
}
