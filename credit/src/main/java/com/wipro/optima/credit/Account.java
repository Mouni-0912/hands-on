package com.wipro.optima.credit;

import java.util.List;

public class Account {
	private String accountType;
	private String accountNumber;
	private String accountTitle;
	
	private float creditLimit;
	private float availableCredit;
	private float totalBalanceDue;
	private float minBalanceDue;
	private float apr;
	private String dueDate;
	private String accountID;
	private int standingInst;
	private int balance;
	private int minBalance;
	private double interestRate;
	private int availableBalance;
	private boolean automatedSITransations;
	
	
	private List<StandingInstruction> standingInstructions;
	

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getAccountTitle() {
		return accountTitle;
	}

	public void setAccountTitle(String accountTitle) {
		this.accountTitle = accountTitle;
	}

	public float getCreditLimit() {
		return creditLimit;
	}

	public void setCreditLimit(float creditLimit) {
		this.creditLimit = creditLimit;
	}

	public float getAvailableCredit() {
		return availableCredit;
	}

	public void setAvailableCredit(float availableCredit) {
		this.availableCredit = availableCredit;
	}

	public float getTotalBalanceDue() {
		return totalBalanceDue;
	}

	public void setTotalBalanceDue(float totalBalanceDue) {
		this.totalBalanceDue = totalBalanceDue;
	}

	public float getMinBalanceDue() {
		return minBalanceDue;
	}

	public void setMinBalanceDue(float minBalanceDue) {
		this.minBalanceDue = minBalanceDue;
	}

	public float getApr() {
		return apr;
	}

	public void setApr(float apr) {
		this.apr = apr;
	}

	public String getDueDate() {
		return dueDate;
	}

	public void setDueDate(String dueDate) {
		this.dueDate = dueDate;
	}

	public String getAccountID() {
		return accountID;
	}

	public void setAccountID(String accountID) {
		this.accountID = accountID;
	}

	public int getStandingInst() {
		return standingInst;
	}

	public void setStandingInst(int standingInst) {
		this.standingInst = standingInst;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public int getMinBalance() {
		return minBalance;
	}

	public void setMinBalance(int minBalance) {
		this.minBalance = minBalance;
	}

	public double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}

	public int getAvailableBalance() {
		return availableBalance;
	}

	public void setAvailableBalance(int availableBalance) {
		this.availableBalance = availableBalance;
	}

	public boolean isAutomatedSITransations() {
		return automatedSITransations;
	}

	public void setAutomatedSITransations(boolean automatedSITransations) {
		this.automatedSITransations = automatedSITransations;
	}

	public List<StandingInstruction> getStandingInstructions() {
		return standingInstructions;
	}

	public void setStandingInstructions(List<StandingInstruction> standingInstructions) {
		this.standingInstructions = standingInstructions;
	}
	@Override
	public String toString() {
		return "Account [accountType=" + accountType + ", accountNumber=" + accountNumber + ", accountTitle="
				+ accountTitle + ", creditLimit=" + creditLimit + ", availableCredit=" + availableCredit
				+ ", totalBalanceDue=" + totalBalanceDue + ", minBalanceDue=" + minBalanceDue + ", apr=" + apr
				+ ", dueDate=" + dueDate + ", accountID=" + accountID + ", standingInst=" + standingInst + ", balance="
				+ balance + ", minBalance=" + minBalance + ", interestRate=" + interestRate + ", availableBalance="
				+ availableBalance + ", automatedSITransations=" + automatedSITransations + ", standingInstructions="
				+ standingInstructions + "]";
	}


}
