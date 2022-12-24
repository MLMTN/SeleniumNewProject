package tests;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import utilities.TestBase;

public class Day07_Alerts extends TestBase {
    /*
Go to https://testcenter.techproeducation.com/index.php?page=javascript-alerts
Create a class: AlertTest
Create setUp method
Create 3 test methods:
acceptAlert() => click on the first alert,
verify the text “I am a JS Alert” ,
click OK ,
and Verify “You successfully clicked an alert”
dismissAlert()=> click on the second alert,
verify text "I am a JS Confirm”,
click cancel,
and Verify “You clicked: Cancel”
sendKeysAlert()=> click on the third alert,
verify text “I am a JS prompt”,
type “Hello World”,
click OK,
and Verify “You entered: Hello World”
Collapse
     */
    @Test
    public void acceptAlert() throws InterruptedException {
        //acceptAlert() => click on the first alert,
        driver.get("https://testcenter.techproeducation.com/index.php?page=javascript-alerts");

        driver.findElement(By.xpath("//button[@onclick='jsAlert()']")).click();

        //verify the text “I am a JS Alert” ,
        Thread.sleep(2000); //just using hard wait to execute slower to see the steps
        String actualAlertText =  driver.switchTo().alert().getText();
        Assert.assertEquals("I am a JS Alert", actualAlertText);

        //click OK ,
        Thread.sleep(2000);
        driver.switchTo().alert().accept();

        //and Verify “You successfully clicked an alert”
        Thread.sleep(2000);
        String actualResult = driver.findElement(By.id("result")).getText();
        Assert.assertEquals("You successfully clicked an alert", actualResult);

    }
    @Test
    public void dismissAlert() throws InterruptedException {

        driver.get("https://testcenter.techproeducation.com/index.php?page=javascript-alerts");


        //dismissAlert()=> click on the second alert,
        driver.findElement(By.xpath("//button[@onclick='jsConfirm()']")).click();

        //verify text "I am a JS Confirm”,
        Thread.sleep(3000);
        String actualAlertText = driver.switchTo().alert().getText();
        Assert.assertEquals("I am a JS Confirm", actualAlertText);

        // click cancel,
        Thread.sleep(3000);
        driver.switchTo().alert().dismiss();

        //and Verify “You clicked: Cancel”
        Thread.sleep(3000);
        String actualResult = driver.findElement(By.id("result")).getText();
        Assert.assertEquals("You clicked: Cancel", actualResult);

    }
    @Test
    public void sendKeysAlert() throws InterruptedException {

        driver.get("https://testcenter.techproeducation.com/index.php?page=javascript-alerts");


        //sendKeysAlert()=> click on the third alert,
        driver.findElement(By.xpath("//button[@onclick='jsPrompt()']")).click();

        //verify text “I am a JS prompt”,
        Thread.sleep(3000);
        String actualAlertText = driver.switchTo().alert().getText();
        Assert.assertEquals("I am a JS prompt", actualAlertText);

        //type “Hello World”,
        Thread.sleep(3000);
        driver.switchTo().alert().sendKeys("Hello World");


        //click OK,
        Thread.sleep(3000);
        driver.switchTo().alert().accept();

        //and Verify “You entered: Hello World”
        Thread.sleep(3000);
        String actualResult = driver.findElement(By.id("result")).getText();
        Assert.assertEquals("You entered: Hello World", actualResult);

    }
    /*
    What is an alert?
      -Alerts are a pop up that is generated by javascript.
      -When there is an alerts, we must handle the alerts.
      -Otherwise, we cannot continue to the test execution

    How do you handle alert?
      -First we cannot inspect js alerts. We should first switch
      -to the alert and use accept() to click ok, dismiss() to
      -click cancel, sendKeys() to type, getText() to get the
      -text from the alert
     */

}