package week4day1;



import com.framework.selenium.api.design.Locators;
import com.framework.testng.api.base.ProjectSpecificMethods;



public class Sales extends ProjectSpecificMethods{
    public Sales clickToggleMenu() {
    click(locateElement (Locators.XPATH, "//div[@class='slds-icon-waffle']"));
    reportStep("Toggle Menu is clicked", "PASS");
    return this;
    }
    
    private void reportStep(String string, String string2) {
		// TODO Auto-generated method stub
		
	}

	public CreateOpportunity clickSales() {
        click(locateElement (Locators.XPATH, "//button[@class='slds-button']"));
        click(locateElement (Locators.XPATH, "//p[text()='Sales']"));
        reportStep("Sales is Clicked", "PASS");
        return new CreateOpportunity();
        }
    
    
}

