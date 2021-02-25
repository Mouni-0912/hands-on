package com.wipro.optima.service;

import java.util.List;

import com.wipro.optima.credit.Credit;

public interface IcreditService {

	public List<Credit> FindDetails();
	public Credit getUser(String username);
}
