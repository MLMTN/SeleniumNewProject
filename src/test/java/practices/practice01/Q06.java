package practices.practice01;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q06 extends TestBase {
    /*
    Given
        Go to https://www.jqueryscript.net/demo/Easy-iFrame-based-Twitter-Emoji-Picker-Plugin-jQuery-Emoojis/
    When
        Click on the "Animals and Nature" emoji
    And
        Click all the "Animals and Nature"  emoji elements
    And
        Fill the form
    And
        Press the apply button
    Then
        Verify "code" element is displayed
     */
    @Test
    public void test2(){
       //  Go to https://www.jqueryscript.net/demo/Easy-iFrame-based-Twitter-Emoji-Picker-Plugin-jQuery-Emoojis/
        driver.get("https://www.jqueryscript.net/demo/Easy-iFrame-based-Twitter-Emoji-Picker-Plugin-jQuery-Emoojis/");

        //First switch into iframe
        WebElement emojisIframe = driver.findElement(By.id("emoojis"));
        driver.switchTo().frame(emojisIframe);

        //Click on the "Animals and Nature" emoji
        driver.findElement(By.xpath("(//span[@data-upgraded=',MaterialRipple'])[2]")).click();

        //Click all the "Animals and Nature"  emoji elements
        List<WebElement> emojis = driver.findElements(By.xpath("//div[@id='nature']/div/img"));//64 elements
        System.out.println(emojis.size());
        // for (WebElement w: emojis){
            //w.click();

            //Using lambda is recommended
           // emojis.stream().forEach(t->t.click()); lamda da kullanabilirsin lambda expression
            emojis.forEach(WebElement::click);  //ya da method referensess

            //Get out of the iFrame
            driver.switchTo().defaultContent();

            //Fill the form
            List<WebElement> inputs = driver.findElements(By.xpath("//input")); //11 inputs
            List<String> words = new ArrayList<>(Arrays.asList("This", "iframe","example","looks","really","funny", "does","not","it","?","!"));

            for (int i = 0; i< inputs.size(); i++){
                inputs.get(i).sendKeys(words.get(i));


            }
        // Press the apply button
        driver.findElement(By.id("send")).click();

            // Verify "code" element is displayed
        WebElement code = driver.findElement(By.id("code"));
        Assert.assertTrue(code.isDisplayed());



        }




    }



