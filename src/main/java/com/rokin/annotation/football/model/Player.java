package com.rokin.annotation.football.model;

import javax.validation.constraints.NotNull;

import com.rokin.annotation.football.validation.PlayerCode;

public class Player {
	private String name;
	
	@NotNull
	@PlayerCode
	private String code;

	public Player() {

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

}
