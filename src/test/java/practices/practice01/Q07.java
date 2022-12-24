package practices.practice01;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import utilities.TestBase;

public class Q07 extends TestBase {
    @Test
    public void test3() throws InterruptedException {
        /*
    Given
        Go to "http://webdriveruniversity.com/Popup-Alerts/index.html"
    When
        Click "CLICK ME" of JavaScript Alert
    And
        Get the pop-up text
    Then
        Verify that message is "I am an alert box!"
    When
        Accept pop-up
     */

        // Go to "http://webdriveruniversity.com/Popup-Alerts/index.html"
        driver.get("http://webdriveruniversity.com/Popup-Alerts/index.html");

        // Click "CLICK ME" of JavaScript Alert
        driver.findElement(By.id("button1")).click();

        //Get the pop-up text
        Thread.sleep(2000);
        String alertText = driver.switchTo().alert().getText();

        //Verify that message is "I am an alert box!"
        Assert.assertEquals("I am an alert box!", alertText);

        //Accept pop-up
        driver.switchTo().alert().accept();


    }

}
