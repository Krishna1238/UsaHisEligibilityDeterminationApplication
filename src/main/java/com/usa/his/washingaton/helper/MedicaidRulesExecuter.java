package com.usa.his.washingaton.helper;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

import org.drools.compiler.compiler.PackageBuilder;
import org.drools.core.RuleBase;
import org.drools.core.RuleBaseFactory;
import org.drools.core.WorkingMemory;

import com.usa.his.washingaton.inputmodel.EligibilityDetermination;
import com.usa.his.washingaton.inputmodel.MedicaidPlanData;
import com.usa.his.washingaton.inputmodel.SnapPlanData;
import com.usa.his.washingaton.outputmodel.PlanInfo;
/**
 * This MedicaidPlanData rules executer.
 */
public class MedicaidRulesExecuter implements PlanRulesExecuter {

	@Override
	public PlanInfo getPlanEligibility(EligibilityDetermination ed) throws Exception {
		
		MedicaidRulesExecuter plnExecuter=new MedicaidRulesExecuter();
		
		
		return plnExecuter.executeMedicaidDrools(ed);
	}
	
	
	/**
	 * This method is for executing drools engine rule for MedicaidPlanData.
	 * @param ed
	 * @return
	 * @throws Exception
	 */
	private PlanInfo  executeMedicaidDrools(EligibilityDetermination ed) throws Exception{
		
		PackageBuilder packageBuilder = new PackageBuilder();

		String ruleFile = "/com/usa/his/washingaton/rules/Medicaid.drl";
		InputStream resourceAsStream = getClass().getResourceAsStream(ruleFile);

		Reader reader = new InputStreamReader(resourceAsStream);
		packageBuilder.addPackageFromDrl(reader);
		org.drools.core.rule.Package rulesPackage = packageBuilder.getPackage();
		RuleBase ruleBase = RuleBaseFactory.newRuleBase();
		ruleBase.addPackage(rulesPackage);

		WorkingMemory workingMemory = ruleBase.newStatefulSession();
		
		SnapPlanData snapData=ed.getPlanDetails().getSnapPlanData();
		
		MedicaidPlanData medicaidPlanData=ed.getPlanDetails().getMedicaidPlanData();
               /**
                * Sending MedicaidPlanData to drools engine.
                */
		workingMemory.insert(medicaidPlanData);
		workingMemory.fireAllRules();
		 System.out.println(medicaidPlanData.getPlnInfo());   
		return medicaidPlanData.getPlnInfo();
	}
	

}
