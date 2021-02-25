package com.wipro.optima.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wipro.optima.Exception.NotFoundException;
import com.wipro.optima.Repository.CreditCardRepository;
import com.wipro.optima.credit.Credit;

@Service
public class CreditService implements IcreditService {
	
	private static final Logger LOGGER=LoggerFactory.getLogger(CreditService.class);
	
	@Autowired
	private CreditCardRepository creditcard;
	
	public List<Credit> FindDetails()
	{
		List<Credit> lc= creditcard.findAll();
		if(lc == null)
		{
			 LOGGER.error("ERROR 404");
			throw new NotFoundException("credit details not found");
		}
		   
		LOGGER.info("Credit details authentictaed successfully");
		return  lc;
	}

	public Credit getUser(String username) throws NotFoundException
	{
		
		LOGGER.debug("Authenticating  credit details by username"+ " "+username);
		
		Credit p=creditcard.findByusername(username);
		
		if(p==null)
		{
			LOGGER.error("ERROR 404: given user not found");
			throw new NotFoundException("username not found");
		}
		
		LOGGER.info("Credit card details of given user is authenticated successfully");
		     
		return p;
	}


}
