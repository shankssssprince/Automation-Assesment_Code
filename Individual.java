package com.leaftaps.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.framework.selenium.api.design.Locators;
import com.framework.testng.api.base.ProjectSpecificMethods;

import groovy.cli.CliBuilderException;
import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class Individual extends ProjectSpecificMethods {

		public Individual enterSurName(String surName) {

			WebElement ele = locateElement(Locators.XPATH,"//input[contains(@class,'lastName compoundBLRadius')]");
			clearAndType(ele, surName);
			click(locateElement(Locators.XPATH, "(//span[text()='Save'])[2]"));
			reportStep("Last Name is entered", "PASS");
			return this;

		}
		
		public Individual validateSurName(String sName) {

			WebElement surName = locateElement(Locators.XPATH, "//span[@class='uiOutputText']");
			verifyExactText(surName, sName);
			reportStep("SurName is Validated successfully", "PASS");
			return this;
		
		}
		
		public Individual clickEdit() {
			
			click(locateElement(Locators.XPATH, "//div[@title='Edit']"));
			reportStep("Individuals option is clicked", "PASS");
			return this;
			
		}
		
		public Individual selectSalutation(String salutation) {
			
			click(locateElement(Locators.XPATH, "//a[@class='select']"));
			click(locateElement(Locators.XPATH, "//a[text()='"+salutation+"']"));
			reportStep("Salutation is selected", "PASS");
			return this;
			
		}
		
		public Individual enterFirstName(String firstName) {
			
			WebElement ele = locateElement(Locators.XPATH, "//input[contains(@class,'firstName compoundBorderBottom')]");
			clearAndType(ele, firstName);
			click(locateElement(Locators.XPATH, "(//span[text()='Save'])[2]"));
			reportStep("First Name is Entered", "PASS");
			return this;
		}
		
		public Individual validateFullName(String fullName) {
				 
		 WebElement nameSal = locateElement(Locators.XPATH, "//span[text()='"+fullName+"']");
		 verifyExactText(nameSal, fullName);
		 reportStep("Full Name is Validated", "PASS");
		 return this;
		 
		}
		

	

}
