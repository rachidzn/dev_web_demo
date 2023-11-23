package com.stitec.MyApp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.stitec.MyApp.entity.Intervenant;
import com.stitec.MyApp.service.IntervenantService;

@Controller
@RequestMapping("/intervenants")
public class IntervenantController {
	
	private IntervenantService intervenantService;
	
	//@Autowired dans le cas d un seul controlleur on peu ommettre l annotation
	public IntervenantController(IntervenantService theIntervenantService) {
		intervenantService = theIntervenantService;
	}
	
@GetMapping("/list")
public String listIntervenants(Model theModel) {
	
	//get les intervenants de la db
	
	List<Intervenant> theIntervenants = intervenantService.findAll();
	theModel.addAttribute("intervenants", theIntervenants);
	return "intervenants/list-intervenants";
}

}
