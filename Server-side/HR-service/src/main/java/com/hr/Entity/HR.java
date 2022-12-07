package com.hr.Entity;

import java.util.ArrayList;
import java.util.List;

public class HR {
	private Long userId;
	private String name;
	private String phone;
	private List<Resource> resource = new ArrayList<>();
	
	public List<Resource> getResource() {
		return resource;
	}
	public void setResource(List<Resource> resource) {
		this.resource = resource;
	}
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public HR(Long userId, String name, String phone, List<Resource> resource) {
		super();
		this.userId = userId;
		this.name = name;
		this.phone = phone;
		this.resource = resource;
	}
	public HR() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "HR [userId=" + userId + ", name=" + name + ", phone=" + phone + ", resource=" + resource + "]";
	}
	public HR(Long userId, String name, String phone) {
		super();
		this.userId = userId;
		this.name = name;
		this.phone = phone;
	}
	
	

	
}
