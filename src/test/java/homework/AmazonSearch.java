package homework;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Set;

public class AmazonSearch extends HomeworkBase{
    /*
      Create a new class: AmazonSearch

       //TC02_Order the the tea pot prices, find the min, max, and average price to the nearest cent.
     */
    @Test
    public void amazonSearch(){
        driver.get("https://www.amazon.com");

        //TC01_As user I want to know how many item are there on amazon in the first page
        int size  = driver.findElements(By.xpath("//*[@id='a-page']")).size();
        System.out.println("Item: " +size);


        //after I search “porcelain teapot”?
    }
}
