package week4day1;



public class CreateOpportunity extends ProjectSpecificMethods {



   public CreateOpportunity clickOpportunityTab() {
        click(locateElement (Locators.XPATH, "//a[@title='Opportunities']//.."));
        reportStep("Opportunity Tab is clicked", "PASS");
        return this;
        }



   public CreateOpportunity clickNewButton() {
        click(locateElement (Locators.XPATH, "//a[@class='forceActionLink']"));
        reportStep("New Button is clicked", "PASS");
        return this;
        }



   public CreateOpportunity createOppName() {
        clearAndType(locateElement (Locators.XPATH, "//input[@name='Name']"),"Salesforce Automation");
        reportStep("Opportunity name is Entered", "PASS");
        return this;
        }
    public CreateOpportunity chooseDate() {
        click(locateElement (Locators.XPATH, "//input[@name='CloseDate']"));
        clearAndType(locateElement (Locators.XPATH, "//input[@name='CloseDate']"),"09/05/2022");
        //click(locateElement (Locators.XPATH, "(//input[@class='slds-input'])[3]"));
        //click(locateElement (Locators.XPATH, "//span[text()='05']\")).click()"));
        reportStep("Close Date is Entered", "PASS");
        return this;
        }
    public CreateOpportunity selectStage() {
        click(locateElement (Locators.XPATH, "//div[@role='none']/button"));
        click(locateElement (Locators.XPATH, "//lightning-base-combobox-item[@data-value='Needs Analysis']"));
        reportStep("Stage selected", "PASS");
        return this;
    }
    public CreateOpportunity clickSave() {
        click(locateElement (Locators.XPATH, "//button[@name='SaveEdit']"));
        reportStep("Saved", "PASS");
        return this;
    }
    public CreateOpportunity verifyOpp() {
        verifyExactText(locateElement (Locators.XPATH, "//lightning-formatted-text[@slot='primaryField']"),"Shanks");
        reportStep("Opportunity Name- Shanks is Verified", "PASS");
        return this;
    }
    
}