package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Day02_WebDriverManager {
    public static void main(String[] args) {

        //System.setProperty("webdriver.chrome.driver","C:/Users/bulen/IdeaProjects/SeleniumNewProject/src/resources/drivers/chromedriver.exe");
         //we no longer need to use System.setProperty. We can use WebDriverManager.chromedriver().setup();
        //some company /System.setProperty some company use WebDriverManager.chromedriver().setup();
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://www.techproeducation.com");
        driver.quit();
    }
}
