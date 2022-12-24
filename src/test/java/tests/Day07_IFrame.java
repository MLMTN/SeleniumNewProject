package tests;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBase;
public class Day07_IFrame extends TestBase {
    @Test
    public void iframeTest(){
    //Create a class: IFrame
    // Create a method: iframeTest

    // Go to https://the-internet.herokuapp.com/iframe
        driver.get("https://the-internet.herokuapp.com/iframe");

//        Verify the Bolded text contains “Editor”
//        Header is not in the iframe so do not switch to iframe
        String header = driver.findElement(By.xpath("//h3")).getText();
        Assert.assertTrue(header.contains("Editor"));

//        NOTE: textbox is in the iframe so we have to switch to teh iframe
        //Getting in the iframe
        //there are 3 ways locate switch to an iframe
        driver.switchTo().frame(0);//BY INDEX
        //driver.switchTo().frame("mce_0_ifr");//BY INDEX
       // driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='mce_0_ifr']")));//BY INDEX

//        Locate the text box
        WebElement box = driver.findElement(By.xpath("//p"));

//        Delete the text in the text box
        box.clear();//clear() is used to delete the text is the elements

//        Type “This text box is inside the iframe”
        box.sendKeys("This text box is inside the iframe");

//        So far driver is in the iframe but Elemental Selenium text is outside of the frame
        //Getting out of the frame
        driver.switchTo().parentFrame();

//       Verify the text Elemental Selenium text is displayed on the page
        Assert.assertTrue(driver.findElement(By.linkText("Elemental Selenium")).isDisplayed());//elemetin gorunup gorunmedigini test ediyor


    }
    /*
  What might be the reason for your test case to fail?
There may be wait problem. The page may be very slow. Internet maybe not fast enough.
Put some more wait. We can use explicit wait in selenium(we will learn later)
Locator might be incorrect.
Double check locator and fix if needed
Data issue. Typo in our expected values.
If there is any documentation issue, we can talk to BA to fix the document and then we can use correct expected values
Maybe there is an iframe on the page
We first need to switch to the frame
Maybe there is an alert on the page
We first need to handle the alert by accepting or dismissing
Maybe the page opens in a new tab or window
We first need to switch the target window
It may be a real bug that is caused by the latest codes.
We discuss the issue with the team then raise a bug ticket if needed
     */
}