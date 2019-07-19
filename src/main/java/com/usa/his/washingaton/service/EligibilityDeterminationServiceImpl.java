package com.usa.his.washingaton.service;

import java.lang.reflect.Method;

import org.springframework.stereotype.Service;

import com.usa.his.washingaton.helper.PlanRulesExecuter;
import com.usa.his.washingaton.inputmodel.EligibilityDetermination;
import com.usa.his.washingaton.outputmodel.PlanInfo;

@Service
public class EligibilityDeterminationServiceImpl implements EligibilityDeterminationService{

	@Override
	public PlanInfo getEligibility(EligibilityDetermination ed) throws Exception {
		
		//PlanRulesExecuter ecuter=new SnapRulesExecuter();
	String planName=ed.getCitigenData().getPlanSelected();
	
	//Geting class name..
	  Class cls=Class.forName("com.usa.his.washingaton.helper."+planName+"RulesExecuter");
		
	  //creatin object of class..
	  PlanRulesExecuter rulesExecuter=(PlanRulesExecuter) cls.newInstance();
	  
	  /**
	   * geting method name
	   * Passing method parameter type clss.
	   * Here EligibilityDetermination is the method parameter.
	   */
	  Method method=cls.getDeclaredMethod("getPlanEligibility",EligibilityDetermination.class);
	   
	      PlanInfo plnInfo=(PlanInfo)method.invoke(rulesExecuter, ed);  
		
		return plnInfo;
	}

}
