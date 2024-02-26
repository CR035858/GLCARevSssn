package com.gl.labwk15d01dem1.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.gl.labwk15d01dem1.model.CCRepDetails;
import com.gl.labwk15d01dem1.model.SupportTicket;
import com.gl.labwk15d01dem1.service.SupportTicketService;

@Controller
@RequestMapping("/cgrievance")
public class CustomerGrievanceController {
	
	@Autowired
	SupportTicketService stService;
	
	
	@RequestMapping("/welcome")
	public String sayHello(Model model)
	{
		String greetings = "Hi Good Morning/Good Day!!!";
		model.addAttribute("greetings", greetings);
		return "welcome";
	}

	@RequestMapping("/repsInfo")
	public String getCCRepInfo(Model model)
	{
		List <CCRepDetails> ccRepList = new ArrayList<>();
		CCRepDetails ccRepDetails = stService.getCCRepoDetails();
		ccRepList.add(ccRepDetails);
		model.addAttribute("ccRepList", ccRepList);
		return "cc-replist";
	}
	
	@RequestMapping("/getTicketsInfo")
	public String getTicketInfo(Model model)
	{
		List <SupportTicket> supportTickets = new ArrayList<>();
		SupportTicket supportTicket = stService.getSupportTicketInfo();
		supportTickets.add(supportTicket);
		model.addAttribute("supportTickets", supportTickets);
		return "ticketslist";
	}
	
	
}
