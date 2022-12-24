package tests;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBase;
public class Day09_Actions4 extends TestBase {
    @Test
    public void dragAndDropTest(){
        driver.get("https://jqueryui.com/droppable/");
//      And user moves the target element(Drag me to my target) in to  destination(Drop here)

//        Below elements are in the iframes so switch to iframe first
     /*
    When test fails:
    1. check locator
    2. wait issue or syncronization issue
    3. iframe --->>> THIS WAS THE ISSUE
     */
        driver.switchTo().frame(0);//switching to the first iframe

        WebElement source = driver.findElement(By.id("draggable"));
        WebElement target = driver.findElement(By.id("droppable"));
//        user Actions class to move source into target
        Actions actions = new Actions(driver);
        actions.dragAndDrop(source,target).perform();
    }
    @Test
    public void clickAndHoldTest(){
        driver.get("https://jqueryui.com/droppable/");
//      And user moves the target element(Drag me to my target) in to  destination(Drop here)

//      Below elements are in the iframes so switch to iframe first

        driver.switchTo().frame(0);//switching to the first iframe

        WebElement source = driver.findElement(By.id("draggable"));
        WebElement target = driver.findElement(By.id("droppable"));
//      user Actions class to move source into target
                Actions actions = new Actions(driver);
                actions.
                        clickAndHold(source).
                        moveToElement(target).
                        build().
                        perform();//holding the source and moving into the target

    }
    @Test
    public void moveByOffSetTest(){
        driver.get("https://jqueryui.com/droppable/");
//      And user moves the target element(Drag me to my target) in to  destination(Drop here)

//      Below elements are in the iframes so switch to iframe first

        driver.switchTo().frame(0);//switching to the first iframe

        WebElement source = driver.findElement(By.id("draggable"));
        WebElement target = driver.findElement(By.id("droppable"));
//      user Actions class to move source into target
        Actions actions = new Actions(driver);
        actions
                .clickAndHold(source)
                .moveByOffset(160,30)
                .build().perform();




    }
    @Test
    public void dragAndDropByTest() {
        driver.get("https://jqueryui.com/droppable/");
//      And user moves the target element(Drag me to my target) in to  destination(Drop here)

//      Below elements are in the iframes so switch to iframe first

        driver.switchTo().frame(0);//switching to the first iframe

        WebElement source = driver.findElement(By.id("draggable"));
        WebElement target = driver.findElement(By.id("droppable"));
//      user Actions class to move source into target
        Actions actions = new Actions(driver);
        actions.dragAndDropBy(source, 160, 30).build().perform();
    }

}
