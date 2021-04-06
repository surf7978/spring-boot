package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import lombok.Data;

@Entity
@Data
@Table(name="board02") //테이블명 이렇게 바꿀 수 있음
public class Board01 {
	@Id //기본키 설정(seq를 PK로 설정)
	@GeneratedValue
	private Integer seq;
	@Transient //이거쓰면 title 뺄 수 있음
	private String title;
	private String contents;
}
