package com.gyw.repo;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.gyw.Journey;
import com.gyw.JourneyDao;
import com.gyw.UsersDao;


public class GywMongoDao implements UsersDao, JourneyDao{
	private JourneyRepo journeyRepo;
	private UserRepo userRepo;
	
	@Autowired
	public GywMongoDao (JourneyRepo journeyRepo,UserRepo usersRepo){
		this.userRepo =usersRepo;
		this.journeyRepo =journeyRepo;
	}
	
	@Override
	public List<Journey> findJourneyByStartDate(String startDate) {
		return journeyRepo.findByStartDate(startDate);
	}
	
	@Override
	public List<Journey> findJourneyByEndDate(String endDate) {
		return journeyRepo.findByEndDate(endDate);
	}
	
	@Override
	public List<Journey> findJourneyByStartPostcode(String postcodeFrom) {
		return journeyRepo.findByPostcodeFrom(postcodeFrom);
	}
	
	@Override
	public List<Journey> findJourneyByUserName(String userName) {
		return journeyRepo.findByUserName(userName);
	}
	
	public Iterable<Journey> findall(){
		return journeyRepo.findAll();
	}
	
	
}
