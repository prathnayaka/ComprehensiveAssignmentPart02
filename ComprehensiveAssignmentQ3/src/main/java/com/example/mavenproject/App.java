package com.example.mavenproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class App {
    
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.gecko.driver", "C:/Users/Piumal/Desktop/ComprehensiveAssignmentQ6/FireFox/Drivers/geckodriver.exe");
        WebDriver driver =  new FirefoxDriver();
        driver.manage().window().maximize();

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
