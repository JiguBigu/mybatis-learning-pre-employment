package com.neo.model;

import java.io.Serializable;
/**
 * @author Jigubigu
 * @version 1.0
 * @date 2019/9/25 17:30
 */

public class User implements Serializable {

	private static final long serialVersionUID = 1L;
	private Long id;
	private String userName;
	private String userSex;
	private String className;

	public User() {
		super();
	}

	public User(Long id, String userName, String userSex) {
		this.id = id;
		this.userName = userName;
		this.userSex = userSex;
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserSex() {
		return userSex;
	}

	public void setUserSex(String userSex) {
		this.userSex = userSex;
	}

	@Override
	public String toString() {
		return "User{" +
				"id=" + id +
				", userName='" + userName + '\'' +
				", userSex='" + userSex + '\'' +
				'}';
	}
}