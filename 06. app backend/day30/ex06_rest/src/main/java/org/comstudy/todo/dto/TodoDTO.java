package org.comstudy.todo.dto;

import org.comstudy.todo.domain.TodoEntity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class TodoDTO {
	private String id; // 오브젝트 아이디
	private String userId;
	private String title;
	private boolean done;
}