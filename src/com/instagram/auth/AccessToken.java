package com.instagram.auth;

public class AccessToken {
	String token;
	
	public AccessToken(String token) {
		this.setTokenString(token);
	}
	
	public String getTokenString() {
		return token;
	}

	public void setTokenString(String token) {
		this.token = token;
	}
}
