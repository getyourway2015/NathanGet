package com.gyw.web;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.gyw.Journey;
import com.gyw.repo.GywMongoDao;

public class TestJourneys {

	private GywMongoDao repo;

	@Before
	public void setup() {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(
				"testUsers.xml");
		repo = (GywMongoDao) ctx.getBean("JourneyDao");
	}

	@Test 
	public void oneJourneysOn10thDecember() {
		assertEquals(1, repo.findJourneyByStartDate("15/5/2015").size());
	}
	
	@Test 
	public void oneJourneyForUserNameNathan() {
		assertEquals(1, repo.findJourneyByUserName("nathan").size());
	}
	
	

}