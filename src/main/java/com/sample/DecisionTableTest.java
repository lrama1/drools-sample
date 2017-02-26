package com.sample;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

import com.sample.domain.PolicyHolder;

/**
 * This is a sample class to launch a rule.
 */
public class DecisionTableTest {

    public static final void main(String[] args) {
        try {
            // load up the knowledge base
	        KieServices ks = KieServices.Factory.get();
    	    KieContainer kContainer = ks.getKieClasspathContainer();
        	KieSession kSession = kContainer.newKieSession("ksession-dtables");

            // go !
        	PolicyHolder holder = new PolicyHolder();
        	holder.setAge(24);
        	holder.setNumberOfAccidents(6);
        	kSession.insert(holder);
        	
        	PolicyHolder holder2 = new PolicyHolder();
        	holder2.setAge(27);
        	holder2.setStateAddress("MI");
        	holder2.setValidLicense("N");
        	kSession.insert(holder2);
        	
            kSession.fireAllRules();
            
            System.out.println(holder.getPremium());
            System.out.println(holder2.getPremium());
        } catch (Throwable t) {
            t.printStackTrace();
        }
    }
}
