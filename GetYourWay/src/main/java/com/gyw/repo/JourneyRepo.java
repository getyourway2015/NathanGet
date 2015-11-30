package com.gyw.repo;

import java.util.Date;
import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.gyw.Journey;
import com.gyw.User;

public interface JourneyRepo extends CrudRepository<Journey, Integer> {
	
	public List<Journey> findByStartDate(String startDate);
	public List<Journey> findByEndDate(String endDate);
	public List<Journey> findByPostcodeFrom(String postcodeFrom);
	public List<Journey> findByPostcodeTo(String postcodeTo);
	public List<Journey> findByTimeTaken(int timeTaken);
	public List<Journey> findByStartAirport(String startAirport);
	public List<Journey> findByEndAirport(String endAirport);
	public List<Journey> findByUserName(String userName);
	

}
