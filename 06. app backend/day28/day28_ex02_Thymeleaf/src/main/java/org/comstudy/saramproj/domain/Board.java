package org.comstudy.saramproj.domain;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "BOARD")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Board {
	@Id
	@GeneratedValue
	private Long seq;
	private String title;
	private String writer;
	private String content;
	private Date writeDate;
	private Long cnt;
}
