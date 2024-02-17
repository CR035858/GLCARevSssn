package com.gl.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.gl.model.Reservation;

@Controller
@RequestMapping("/reservation")
public class ReservationController {

	
	@RequestMapping(value="/reserve",method=RequestMethod.GET)
	public String showReservationForm(Model model)
	{
		Reservation reservation = new Reservation();
		model.addAttribute("reservation", reservation);
		return "reservationForm";
	}
	
	@RequestMapping("/process")
	public String processReservationDetails(@ModelAttribute("reservation") Reservation myReservation,Model model)
	{
		model.addAttribute("confreservation", myReservation);
		return "confirmation";
		
	}
}
