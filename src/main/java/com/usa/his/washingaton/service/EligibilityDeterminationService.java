package com.usa.his.washingaton.service;

import com.usa.his.washingaton.inputmodel.EligibilityDetermination;
import com.usa.his.washingaton.outputmodel.PlanInfo;

public interface EligibilityDeterminationService {
	
	public PlanInfo getEligibility(EligibilityDetermination ed) throws  Exception;

}
