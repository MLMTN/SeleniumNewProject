package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;
public class Day03_Locators {
    WebDriver driver;//in the class level declare
    //eger  WebDriver setup methodun icinde olusturamazsin cunku sadece setup icin calisisir class leveldan once olusturmalisin
    @Before

    public void setUp(){

        WebDriver driver = new ChromeDriver();
        driver = new ChromeDriver();
//        IMPLICIT WAIT
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));//15 seconds wait in case needed
        driver.manage().window().maximize();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

    }
    /*
    Create a class : LocatorsIntro
    Create test method locators
    user goes to http://a.testaddressbook.com/sign_in
    Locate the elements of email textbox, password textbox, and signin button
    Enter below username and password then click sign in button
    Username :  testtechproed@gmail.com
    Password : Test1234!
    Then verify that the expected user id  testtechproed@gmail.com (USE getText() method to get the text from the page)
    Verify the Addresses and Sign Out  texts are displayed
    Find the number of total link on the page
    Sign out from the page
    */

    @Test
    public void logInTest() {
//        user goes to http://a.testaddressbook.com/sign_in

//        Locating the username and typing the password
        WebElement username = driver.findElement(By.name("username"));
        username.sendKeys("Admin");//trying Admin


        WebElement passwordName = driver.findElement(By.name("password"));
        passwordName.sendKeys("admin123");//trying admin123
        //Locating the button and clicking
        WebElement button = driver.findElement(By.tagName("button"));
        button.click();

        //Verifying the log in is successful
        //       1. we can use default page url to do
        //
       // String actualUrl = driver.getCurrentUrl();
        //String expectedUrl = "https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index";
       // Assert.assertEquals("Login Failed", expectedUrl, actualUrl);//if login successful pass, if not fail and print login failed
        driver.quit();

/*
        driver.findElement(By.name("username")).sendKeys("Admin");
        driver.findElement(By.name("password")).sendKeys("admin123");
        driver.findElement(By.name("button")).click();
        bu sekilde de kullanabilirsin WebElement contaner olusturmana gerek yok
        */
    }

       @After

                public void tearDown(){
            driver.quit();



    }
}
