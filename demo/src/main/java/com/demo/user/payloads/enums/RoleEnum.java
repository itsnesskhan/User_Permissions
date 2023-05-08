package com.demo.user.payloads.enums;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public enum RoleEnum {

	CONSUMER("consumer"),
	ADMIN("admin"),
	MANAGER("manager");
	
	private final String role;

	public String getRole() {
		return role;
	}
}
