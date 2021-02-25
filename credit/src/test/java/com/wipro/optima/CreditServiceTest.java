package com.wipro.optima;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.when;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.boot.test.context.SpringBootTest;

import com.wipro.optima.Exception.NotFoundException;
import com.wipro.optima.Repository.CreditCardRepository;
import com.wipro.optima.credit.Credit;
import com.wipro.optima.service.CreditService;

@SpringBootTest
@RunWith(MockitoJUnitRunner.class)
public class CreditServiceTest {

	@Mock
	CreditCardRepository repo;
	
	@InjectMocks
	CreditService service=new CreditService();
	
	
	ArrayList<Credit> lt=null;
	Credit credit= new Credit();
	Credit credit1=new Credit();
	@Before
	public void init()
	{
		MockitoAnnotations.initMocks(this);
        buildService();
	}
	
	
		
	

	private void buildService() {
		// TODO Auto-generated method stub
        lt=new ArrayList<Credit>();
		credit.setUsername("andrew");
		credit.setPassword("peterson");
		credit.setCreditScore(700);
		credit1.setUsername("alice");
		credit1.setPassword("astron");
		credit1.setCreditScore(800);
		lt.add(credit);
		lt.add(credit1);
	}





	@Test
	public void testAll() {
		
		when(repo.findAll()).thenReturn(lt);
		assertEquals(2,service.FindDetails().size());
		
	}

	@Test(expected = NotFoundException.class)
	public void user_throw_exception() throws NotFoundException
	{
		
		when(repo.findByusername(Mockito.anyString())).thenReturn(null);
		service.getUser("abc");	
		
	}

	@Test
	public void testByusername() {
		
		when(repo.findByusername(Mockito.anyString())).thenReturn(credit);
		float result=service.getUser("username").getCreditScore();;
		boolean c = false;
		if(result==700.0f)
			c=true;
		assertTrue(c);
		assertEquals("andrew",service.getUser("username").getUsername());
	
		
		
	}

}