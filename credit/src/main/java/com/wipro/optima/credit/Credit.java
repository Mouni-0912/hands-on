package com.wipro.optima.credit;

import java.util.List;

public class Credit {
	private String id;
	private String username;
	private String password;
	private String UIN;
	private float creditScore;
	
	private List<Bank> banks;
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
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
	public String getUIN() {
		return UIN;
	}
	public void setUIN(String uIN) {
		this.UIN = uIN;
	}
	public float getCreditScore() {
		return creditScore;
	}
	public void setCreditScore(float creditScore) {
		this.creditScore = creditScore;
	}
	public List<Bank> getBanks() {
		return banks;
	}
	public void setBanks(List<Bank> banks) {
		this.banks = banks;
	}
	
	@Override
	public String toString() {
		return "Credit [username=" + username + ", password=" + password + ", UIN=" + UIN + ", creditScore="
				+ creditScore + ", banks=" + banks + "]";
	}
	


}
