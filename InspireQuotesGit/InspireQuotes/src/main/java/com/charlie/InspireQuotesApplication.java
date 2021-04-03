package com.charlie;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.charlie.dao.QuotesImplementation;
import com.charlie.dao.UsersImplementation;
import com.charlie.dao.dailyQuoteImpl;
import com.charlie.model.Quotes;
import com.charlie.model.User;

@SpringBootApplication
public class InspireQuotesApplication {

	public static void main(String[] args) {
		SpringApplication.run(InspireQuotesApplication.class, args);
		/*
		QuotesImplementation start = new QuotesImplementation();
		List<Quotes> inspiration = start.getPSDomain();

		int counter = 0;
		while(counter != inspiration.size()) {
			Quotes q1 = inspiration.get(counter);
			System.out.println(q1.getQuote());
			counter = counter+1;
			
		}
		*/
		/*UsersImplementation u = new UsersImplementation();
		u.isSignedIn("CharlzGod", "DaBest");
		*/
		/*dailyQuoteImpl dailyQuote = new dailyQuoteImpl();
		int value = dailyQuote.getHighID();
		
		System.out.println(value);
		QuotesImplementation quoteimpl = new QuotesImplementation();
		List<String> yourmum = quoteimpl.getQuoteByID(2);
		System.out.println(yourmum.get(0)+" "+yourmum.get(1));*/
		
		UsersImplementation i = new UsersImplementation();
		i.signUp("CharlzPog", "HopeWorks");
		
	}

}
