package com.gyw;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
@Document(collection = "journey")
public class Journey {
	private String startDate;
	private String endDate;
	private String postcodeFrom;
	private String postcodeTo;
	private int timeTaken;
	private String startAirport;
	private String endAirport;
	private String userName;
	private String id;
	
	@Id
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getStartAirport() {
		return startAirport;
	}

	public void setStartAirport(String startAirport) {
		this.startAirport = startAirport;
	}

	public String getEndAirport() {
		return endAirport;
	}

	public void setEndAirport(String endAirport) {
		this.endAirport = endAirport;
	}

	public String getStartDate() {
		return startDate;
	}


	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getEndDate() {
		return endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public String getPostcodeFrom() {
		return postcodeFrom;
	}

	public void setPostcodeFrom(String postcodeFrom) {
		this.postcodeFrom = postcodeFrom;
	}
	
	public String getPostcodeTo() {
		return postcodeTo;
	}

	public void setPostcodeTo(String postcodeTo) {
		this.postcodeTo = postcodeTo;
	}

	public int getTimeTaken() {
		return timeTaken;
	}

	public void setTimeTaken(int timeTaken) {
		this.timeTaken = timeTaken;
	}

	
}
