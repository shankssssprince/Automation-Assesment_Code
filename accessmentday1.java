import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class accessmentday1 {



   public static void main(String[] args) {
        // TODO Auto-generated method stub
        
        
        
        WebDriverManager.chromedriver().setup();



       ChromeOptions options =new ChromeOptions();
        options.addArguments("disable-notifications");
        ChromeDriver driver = new ChromeDriver(options);
        
        driver.manage().window().maximize();



     //url
        driver.get("https://login.salesforce.com");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        
        //enter username & password
        
        driver.findElement(By.id("username")).sendKeys("ramkumar.ramaiah@testleaf.com");
        driver.findElement(By.id("password")).sendKeys("Password$123");
        
        //login
        driver.findElement(By.id("Login")).click();
        
        //Click on toggle menu button from the left corner
        
        driver.findElement(By.xpath("//div[@class='slds-r5']")).click();       
        
        
        //Click  App Launcher
        driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
        
        //view all
        
        driver.findElement(By.xpath("//button[text()='View All']")).click();
        
        //sales
        
        driver.findElement(By.xpath("//p[text()='Sales']")).click();
        
                
        //Click on Opportunity tab
        driver.findElement(By.xpath("//a[@title='Opportunities']//..")).click();
        
        
        //Click on New button
        driver.findElement(By.xpath("//a[@class='forceActionLink']")).click();



       WebElement val = driver.findElement(By.xpath("//input[@name='Name']"));
        val.sendKeys("Salesforce - Shankari");
        String typed = val.getAttribute("value");
        System.out.println(typed);
        driver.findElement(By.xpath("//input[@name='CloseDate']")).sendKeys("8/03/2022");
        driver.findElement(By.xpath("//div[@role='none']/button")).click();
        driver.findElement(By.xpath("//lightning-base-combobox-item[@data-value='Needs Analysis']")).click();
        driver.findElement(By.xpath("//button[text()='Save']")).click();
    }



}