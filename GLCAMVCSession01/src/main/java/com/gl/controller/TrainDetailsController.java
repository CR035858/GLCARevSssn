package com.gl.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.gl.model.TrainDetails;
import com.gl.service.TrainDetailService;

@Controller
@RequestMapping("/trains")
public class TrainDetailsController {
	
	@Autowired
	TrainDetailService trainService;
	
	@RequestMapping("/list")
	public String getAllTrains(Model model)
	{
		List <TrainDetails> trains = trainService.getAllTrainsSvc();
		model.addAttribute("trains", trains);
		return "trainsPage";
	}

}
