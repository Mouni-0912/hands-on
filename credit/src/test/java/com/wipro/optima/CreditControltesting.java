package com.wipro.optima;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.Before;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.boot.test.context.SpringBootTest;

import com.wipro.optima.Exception.LengthExceedsException;
import com.wipro.optima.credit.Credit;
import com.wipro.optima.Resource.CreditCardController;
import com.wipro.optima.service.CreditService;

@SpringBootTest
@RunWith(MockitoJUnitRunner.class)
public class CreditControltesting {

	
	@Mock
	private CreditService service;
	
	@InjectMocks
	CreditCardController cc=new CreditCardController();
	
	ArrayList<Credit> list=null;
	Credit credit;
	@Before
	public void init()
	{
		MockitoAnnotations.initMocks(this);
		 list= new ArrayList<Credit>();
		credit=new Credit();
		credit.setUsername("alice");
		list.add(credit);
		
	}
	@Test
	public void test() {

	
		Mockito.when(service.FindDetails()).thenReturn(list);
		assertNotNull(cc.getCreditDetails());	

		
		Mockito.when(service.FindDetails()).thenReturn(list);
	
		assertNotNull(cc.getCreditDetails());

	}

@Test
public void testingusername() throws LengthExceedsException
{
	Mockito.when(service.getUser(Mockito.anyString())).thenReturn(credit);
	
	String str =cc.check("username").getUsername();
	assertEquals(str,"alice");
}



	

}
