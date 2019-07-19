package com.usa.his.washingaton.helper;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

import org.drools.compiler.compiler.PackageBuilder;
import org.drools.core.RuleBase;
import org.drools.core.RuleBaseFactory;
import org.drools.core.WorkingMemory;

import com.usa.his.washingaton.inputmodel.CcapPlanData;
import com.usa.his.washingaton.inputmodel.EligibilityDetermination;
import com.usa.his.washingaton.outputmodel.PlanInfo;
/**
 * Ccap Plan executer class..
 * @author Krishna Murari
 *
 */
public class CcapRulesExecuter implements PlanRulesExecuter {

	@Override
	public PlanInfo getPlanEligibility(EligibilityDetermination ed) throws Exception {
		
		CcapRulesExecuter executeCcap=new CcapRulesExecuter();
		       
		/**
		 * Executing drools method..
		 */
		return executeCcap.executeDrools(ed);
	}
	
	
	
	public PlanInfo executeDrools(EligibilityDetermination ed) throws Exception {
		
		PackageBuilder packageBuilder = new PackageBuilder();

		String ruleFile = "/com/usa/his/washingaton/rules/Ccap.drl";
		InputStream resourceAsStream = getClass().getResourceAsStream(ruleFile);

		Reader reader = new InputStreamReader(resourceAsStream);
		packageBuilder.addPackageFromDrl(reader);
		org.drools.core.rule.Package rulesPackage = packageBuilder.getPackage();
		RuleBase ruleBase = RuleBaseFactory.newRuleBase();
		ruleBase.addPackage(rulesPackage);

		WorkingMemory workingMemory = ruleBase.newStatefulSession();
		/**
		 * injecting Ccap plan data to drools file
		 */
		CcapPlanData ccapPlnData=ed.getPlanDetails().getCcapPlanData();
		
		workingMemory.insert(ccapPlnData);
		workingMemory.fireAllRules();
		 System.out.println(ccapPlnData.getPlnInfo());
		
		return ccapPlnData.getPlnInfo();
	}

}
