package com.demo.user.payloads;

import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class User_PermissionsDto {

	@Id
	@JsonProperty(namespace = "permission_id")
	private Integer pid;
	
	@JsonProperty(namespace = "permission_name")
	private String pname;
}
