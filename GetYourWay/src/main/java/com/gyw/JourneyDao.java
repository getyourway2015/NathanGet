package com.gyw;

import java.util.Date;
import java.util.List;



public interface JourneyDao {
	

	public abstract List<Journey> findJourneyByStartDate(String startDate );
	public abstract List<Journey> findJourneyByEndDate(String endDate );
	public abstract List<Journey> findJourneyByStartPostcode(String postcodeFrom );
	public abstract List<Journey> findJourneyByUserName(String userName );
	


}
