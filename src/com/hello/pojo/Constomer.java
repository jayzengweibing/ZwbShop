package com.hello.pojo;

public class Constomer {
	private int id;
	private String account;
	private String passwd;
	private String nickname;

	public Constomer() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public String getPasswd() {
		return passwd;
	}

	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	@Override
	public String toString() {
		return "Constomer [account=" + account + ", passwd=" + passwd + ", nickname=" + nickname + ", getAccount()="
				+ getAccount() + ", getPasswd()=" + getPasswd() + ", getNickname()=" + getNickname() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

	public Constomer(String account, String passwd, String nickname) {
		super();
		this.account = account;
		this.passwd = passwd;
		this.nickname = nickname;
	}

}
