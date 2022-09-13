package com.leaftaps.pages;

import com.framework.selenium.api.design.Locators;
import com.framework.testng.api.base.ProjectSpecificMethods;

public class HomePage extends ProjectSpecificMethods{
	

	
	public SFIndividualPage verifyHomePage() {
		verifyDisplayed(locateElement(Locators.CLASS_NAME, "slds-icon-waffle"));
		reportStep("Homepage is loaded", "pass");
		return new SFIndividualPage();
	}
	
	
	
}
