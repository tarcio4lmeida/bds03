package com.devsuperior.bds03.dto;

import com.devsuperior.bds03.entities.Role;

import java.io.Serializable;

public class RoleDTO implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String authority;
	
	public RoleDTO(Long id, String authority) {
		super();
		this.id = id;
		this.authority = authority;
	}
	public RoleDTO(Role role) {
		super();
		this.id = role.getId();
		this.authority = role.getAuthority();
	}
	
	public RoleDTO() {
		super();
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getAuthority() {
		return authority;
	}
	
	public void setAuthority(String authority) {
		this.authority = authority;
	}
	
}
