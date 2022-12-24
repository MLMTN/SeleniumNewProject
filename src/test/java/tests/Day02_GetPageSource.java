package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.rmi.registry.Registry;
import java.time.Duration;

public class Day02_GetPageSource {
    public static void main(String[] args) {
//getPageSource() returns page source code as a string
//We might use this to verify if a certain text exist in the entire page
//Note that pageSource is not used a lot to do assertions
//Because it is too general and can lead false result
        /*
        TEST CASE:
        Test if amazon contains “Registry” on the homepage
        Create a new class : GetPageSource
        */
        //System.setProperty("webdriver.chrome.driver","C:/Users/bulen/IdeaProjects/SeleniumNewProject/src/resources/drivers/chromedriver.exe");
        //we no longer need to use System.setProperty. We can use WebDriverManager.chromedriver().setup();
        //some company /System.setProperty some company use WebDriverManager.chromedriver().setup();
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https://www.amazon.com/");
        String pageSource = driver.getPageSource();
        //System.out.println(pageSource);
        String expectedWord = "Registry";
        if(pageSource.contains(expectedWord)){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
            System.out.println("PAGE SOURCE : "+pageSource);
            System.out.println("EXPECTED WORD : "+expectedWord);
        }
        driver.quit();

    }
}
