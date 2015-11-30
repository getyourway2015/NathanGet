package com.gyw.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.gyw.repo.GywMongoDao;

@Controller
public class JourneyController {

	@Autowired
	private GywMongoDao gywMongoDao;

	@RequestMapping(value = "/all")
	public String getAllJourneys(Model m) {
		m.addAttribute("journeys", gywMongoDao.findall());
		return "allJourneys";
	}
}
