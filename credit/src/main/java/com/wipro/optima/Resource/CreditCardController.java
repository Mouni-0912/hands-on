package com.wipro.optima.Resource;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wipro.optima.Exception.NotFoundException;
import com.wipro.optima.Exception.LengthExceedsException;
import com.wipro.optima.credit.Credit;
import com.wipro.optima.service.CreditService;
import org.springframework.http.MediaType;

@RestController
@RequestMapping(path= "/accounts/accountsService",produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
public class CreditCardController {

	private static final Logger LOGGER=LoggerFactory.getLogger(CreditCardController.class);
	@Autowired
	private  CreditService creditservice;
	
	@GetMapping(value="/credit")
	public List<Credit> getCreditDetails() throws NotFoundException
	{
		return creditservice.FindDetails();
		
	}
	
	

	@GetMapping(path="/credit/{user-name}")
	public Credit check(@PathVariable("user-name") String username) throws LengthExceedsException
	{
		
		if(username.length() > 50)
		{
			LOGGER.error("ERROR 500:username length exceeded");
			LOGGER.warn("username shouldnot exced 50 characters");
			throw new  LengthExceedsException("username exceeds 50 characters");
			
			
		}
		else
		{
			Credit p=creditservice.getUser(username);
		return p;}
	}
	
}
