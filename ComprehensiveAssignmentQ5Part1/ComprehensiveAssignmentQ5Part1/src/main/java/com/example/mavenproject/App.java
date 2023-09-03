package com.example.mavenproject;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.google.common.annotations.VisibleForTesting;


public class App {

    public static WebDriver driver;
    
    @BeforeMethod
    public void testLogin() throws InterruptedException {

        System.setProperty("webdriver.gecko.driver", "C:/Users/Piumal/Desktop/ComprehensiveAssignmentQ6/FireFox/Drivers/geckodriver.exe");
        WebDriver driver =  new FirefoxDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void testStep() throws InterruptedException{

        driver.get("https://www.makemytrip.com");

        Thread.sleep(8000);

        driver.findElement(By.xpath("//a[@id='webklipper-publisher-widget-container-notification-close-div']")).click();



        By logo_element = By.xpath("//a[@class='mmtLogo makeFlex']");
        boolean isLogoDisplayed = driver.findElement(logo_element).isDisplayed();
        
        if (isLogoDisplayed)
            {
            System.out.println("Image displayed.");
            }
            else
            {
            System.out.println("Image not displayed.");
            }
        

        driver.quit();


        
    }


}
