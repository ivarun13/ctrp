package io.vp.projects.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.vp.projects.domain.ClinicalTrial;
import io.vp.projects.service.ClinicalService;


@RestController
public class ClinicalRestController {

	
	@Autowired
	private ClinicalService clinicalService;
	
	@RequestMapping(path="/clinicaltrials", method=RequestMethod.GET)
	public List<ClinicalTrial> getAllRecords(){
		return clinicalService.getAllRecords();
	}

}
