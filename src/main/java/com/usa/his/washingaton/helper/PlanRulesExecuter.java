package com.usa.his.washingaton.helper;

import com.usa.his.washingaton.inputmodel.EligibilityDetermination;
import com.usa.his.washingaton.outputmodel.PlanInfo;

public interface PlanRulesExecuter {
	
	public PlanInfo getPlanEligibility(EligibilityDetermination ed) throws  Exception;

}
