package com.example.demo.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
//@Table(name="board02") //테이블명 이렇게 바꿀 수 있음
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Reply {
	@Id //기본키 설정(seq를 PK로 설정)
	@GeneratedValue
	private Integer seq;
	
	//@Transient //이거쓰면 title 뺄 수 있음
	@Column(length=100) //콜름명으로 바로 들어감+사이즈도 바꿀수있음
	private String title;
	private String contents;
	private String writer;
}
