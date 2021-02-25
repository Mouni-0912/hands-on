package com.wipro.optima.credit;

import java.util.List;


public class Bank {
	private String bankName;
	private String bankId;
	
	List<Account> accounts;

	

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public String getBankId() {
		return bankId;
	}

	public void setBankId(String bankId) {
		this.bankId = bankId;
	}

    public List<Account> getAccounts() {
		return accounts;
	}

	public void setAccounts(List<Account> accounts) {
		this.accounts = accounts;
	}

	@Override
	public String toString() {
		return "Bank [bankName=" + bankName + ", bankId=" + bankId + ", accounts=" + accounts + "]";
	}
	
}
