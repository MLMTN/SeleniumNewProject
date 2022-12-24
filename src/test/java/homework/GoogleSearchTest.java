package homework;

import org.junit.After;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import javax.xml.transform.Result;
import java.util.List;

public class GoogleSearchTest extends HomeworkBase{
    /*
Create a new class : GoogleSearchTest
Create Test method and complete the following task.

     */

    @Test
    public void googleTest(){
        //When user goes to https://www.google.com/
        driver.get("https://www.google.com/");

        //Search for “porcelain teapot”
        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys("porcelain teapot", Keys.ENTER);
        //And print how many related results displayed on Google
        WebElement aboutResult = driver.findElement(By.id("result-stats"));
        System.out.println(aboutResult.getText());


    }
    //Then create 3 different test methods using the following names. And Go to google.
    //Close the browser after each test
    @Test
    public void googleTitle(){
        //titleTest =>Verify if google title = “Google”
        driver.get("https://www.google.com/");
        Assert.assertEquals("Google", driver.getTitle());

       driver.quit();
    }
    @Test
    public void googleImgDisplay() {
        //imageTest => Verify if google image displays or not
        driver.get("https://www.google.com/");
        WebElement imgGoogle = driver.findElement(By.id("hplogo"));
        Assert.assertTrue(imgGoogle.isDisplayed());
        driver.quit();
    }
    @Test
            public void GmailVerify(){
        //gmailLinkTest => Verify if the Gmail link is displayed or not
        driver.get("https://www.google.com/");
        WebElement gmailVerify = driver.findElement(By.className("gb_j"));
        Assert.assertTrue(gmailVerify.isDisplayed());


    }

}
