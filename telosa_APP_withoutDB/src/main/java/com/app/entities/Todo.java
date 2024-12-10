package com.app.entities;


import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Todo {

	private int id;
    private String task;
    private boolean completed;
}
