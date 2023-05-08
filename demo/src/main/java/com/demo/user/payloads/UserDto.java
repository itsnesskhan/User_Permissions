package com.demo.user.payloads;

import java.util.List;

import com.demo.user.model.Roles;
import com.demo.user.model.User_Permissions;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class UserDto {

	@JsonProperty(namespace = "user_id")
	private Integer uid;
	
	@JsonProperty(namespace = "first_name")
	private String fname;
	
	@JsonProperty(namespace = "last_name")
	private String lname;
	
	private String email;
	
	private Roles role;
	
	private List<User_PermissionsDto> permissions;
}
