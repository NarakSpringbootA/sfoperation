package com.sbf.api.model;

public class User {
	private String password;
	private String fullName;
	private String id;
	private String branch;
	private String deviceId;
	private String username;
	public User() {
		super();
	}
	public User(String password, String fullName, String id, String branch, String deviceId, String username) {
		super();
		this.password = password;
		this.fullName = fullName;
		this.id = id;
		this.branch = branch;
		this.deviceId = deviceId;
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public String getDeviceId() {
		return deviceId;
	}
	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	@Override
	public String toString() {
		return "User [password=" + password + ", fullName=" + fullName + ", id=" + id + ", branch=" + branch
				+ ", deviceId=" + deviceId + ", username=" + username + "]";
	}
		
}
