package practices.practice01;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBase;

public class Q09 extends TestBase {
    // Go to URL : http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html
    // Match the capitals by country.
    @Test
    public void test5() {
        driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");

        // Match the capitals by country.

        //Capitals:
        WebElement oslo = driver.findElement(By.id("box1"));
        WebElement stockholm = driver.findElement(By.id("box2"));
        WebElement washington = driver.findElement(By.id("box3"));
        WebElement copenhagen = driver.findElement(By.id("box4"));
        WebElement seoul = driver.findElement(By.id("box5"));
        WebElement rome = driver.findElement(By.id("box6"));
        WebElement madrid = driver.findElement(By.id("box7"));

        //Locate Countries
        WebElement norway = driver.findElement(By.id("box101"));
        WebElement sweden = driver.findElement(By.id("box102"));
        WebElement usa = driver.findElement(By.id("box103"));
        WebElement denmark = driver.findElement(By.id("box104"));
        WebElement southKorea = driver.findElement(By.id("box105"));
        WebElement italy = driver.findElement(By.id("box106"));
        WebElement spain = driver.findElement(By.id("box107"));

        //Drag and Drop
        Actions actions = new Actions(driver);
        actions.
                dragAndDrop(oslo, norway).
                dragAndDrop(stockholm, sweden).
                dragAndDrop(washington, usa).
                dragAndDrop(copenhagen, denmark).
                dragAndDrop(seoul, southKorea).
                dragAndDrop(rome, italy).
                dragAndDrop(madrid, spain).perform();
        /*
       //id's have rules, so can be done by using them
for(int i=1;i<8;i++){
    String sourceBox="box"+i;
    String destinationBox="box10"+i;
    WebElement source=driver.findElement(By.id(sourceBox));
    WebElement destination=driver.findElement(By.id(destinationBox));
    actions.dragAndDrop(source,destination).perform();
         */
    }



    }

