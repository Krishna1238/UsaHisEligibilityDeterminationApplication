package com.usa.his.washingaton.helper;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

import org.drools.compiler.compiler.PackageBuilder;
import org.drools.core.RuleBase;
import org.drools.core.RuleBaseFactory;
import org.drools.core.WorkingMemory;

import com.usa.his.washingaton.inputmodel.EligibilityDetermination;
import com.usa.his.washingaton.inputmodel.SnapPlanData;
import com.usa.his.washingaton.outputmodel.PlanDenied;
import com.usa.his.washingaton.outputmodel.PlanInfo;

/**
 * This class is for snap pln.
 * @author Krishna Murari
 *
 */
public class SnapRulesExecuter implements PlanRulesExecuter {

	@Override
	public PlanInfo getPlanEligibility(EligibilityDetermination ed) throws Exception {
		
		           
		SnapRulesExecuter exe=new SnapRulesExecuter();
		         
		return exe.executeDrools(ed);
	}
	
	public PlanInfo executeDrools(EligibilityDetermination ed) throws Exception {

		PackageBuilder packageBuilder = new PackageBuilder();

		String ruleFile = "/com/usa/his/washingaton/rules/Snap.drl";
		InputStream resourceAsStream = getClass().getResourceAsStream(ruleFile);

		Reader reader = new InputStreamReader(resourceAsStream);
		packageBuilder.addPackageFromDrl(reader);
		org.drools.core.rule.Package rulesPackage = packageBuilder.getPackage();
		RuleBase ruleBase = RuleBaseFactory.newRuleBase();
		ruleBase.addPackage(rulesPackage);

		WorkingMemory workingMemory = ruleBase.newStatefulSession();
		
		SnapPlanData snapData=ed.getPlanDetails().getSnapPlanData();
		
		                        
		workingMemory.insert(snapData);
		workingMemory.fireAllRules();
		 System.out.println(snapData.getPlnInfo());
 
		
		            
		return snapData.getPlnInfo();

		
	}

}
