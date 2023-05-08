package com.demo.user.payloads.enums;

public enum PermissionsEnum {

	READ("read"),
	WRITE("write"),
	UPDATE("update"),
	DELETE("delete");
	
	private final String permission;

	private PermissionsEnum(String permission) {
		this.permission = permission;
	}

	public String getPermission() {
		return permission;
	}
	
}
