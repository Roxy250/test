package com.entity;

import org.springframework.data.annotation.Id;

public class entity {
@Id public int id;
public String name;

	public entity() {
		// TODO Auto-generated constructor stub
	}

	public entity(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	

}
