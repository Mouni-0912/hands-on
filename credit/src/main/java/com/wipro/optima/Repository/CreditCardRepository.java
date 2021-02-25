package com.wipro.optima.Repository;
import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.wipro.optima.credit.Credit;


@Repository
public interface CreditCardRepository extends MongoRepository<Credit,String> {
	
	public List<Credit> findAll();
   public Credit findByusername(String username);


}
