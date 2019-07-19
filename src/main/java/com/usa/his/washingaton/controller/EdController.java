package com.usa.his.washingaton.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.usa.his.washingaton.inputmodel.EligibilityDetermination;
import com.usa.his.washingaton.outputmodel.PlanInfo;
import com.usa.his.washingaton.service.EligibilityDeterminationService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;


@RestController
@Api
public class EdController {
	
	@Autowired
private	EligibilityDeterminationService eligibilityService;
	
	
	@PostMapping(value="/geteligibility",
			consumes= {"application/xml","application/json"},
			produces= {"application/xml","application/json"})
	@ApiOperation("This getEligibility method is for checking eligible ingo of state citizen")
	public PlanInfo getEligibility(@RequestBody EligibilityDetermination ed) {
		PlanInfo plnInfo=null;
		  System.out.println("Eligibility data :"+ed);
		    try {
		    	plnInfo=  eligibilityService.getEligibility(ed);
		    }
		    catch(Exception e) {
		    	e.printStackTrace();
		    }
		return plnInfo;
	}
	

}
