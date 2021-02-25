package com.wipro.optima.credit;

public class StandingInstruction {
	private String  name;
	private String value;
	private String schdDate;
	private String canClear;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	public String getSchdDate() {
		return schdDate;
	}
	public void setSchdDate(String schdDate) {
		this.schdDate = schdDate;
	}
	public String getCanClear() {
		return canClear;
	}
	public void setCanClear(String canClear) {
		this.canClear = canClear;
	}
	@Override
	public String toString() {
		return "StandingInstruction [name=" + name + ", value=" + value + ", schdDate=" + schdDate + ", canClear="
				+ canClear + "]";
	}
	

}
