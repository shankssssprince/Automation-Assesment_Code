package com.leaftaps.testcases;



import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



import com.framework.testng.api.base.ProjectSpecificMethods;
import com.leaftaps.pages.LoginPage;



public class assessment3 extends ProjectSpecificMethods{



       @BeforeTest
        public void createOpportunity() {
            testcaseName = "createOpportunity";
            testDescription ="Verify create opportunity";
            authors="Shanks";
            category ="Prince";
        }
    
    @Test(dataProvider = "fetchData")
    public void createOpportunity(String username, String password) {
        new LoginPage()
        .enterUsername(username)
        .enterPassword(password)
        .clickLogin()
        .verifyHomePage()
        .clickToggleMenu()
        .clickSales()
        .clickOpportunityTab()
        .clickNewButton()
        .createOppName()
        .chooseDate()
        .selectStage()
        .clickSave()
        .verifyOpp();



   }



}

