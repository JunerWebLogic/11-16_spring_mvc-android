package com.springmvc.entity;

public class UserEntity {
	private String username;// �û���
	private String password;// ����
	private String nickname;// �ǳ�
	private String gender;// �Ա�
	private String age;// ����

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "UserEntity [username=" + username + ", password=" + password + ", nickname=" + nickname + ", gender="
				+ gender + ", age=" + age + "]";
	}

}
