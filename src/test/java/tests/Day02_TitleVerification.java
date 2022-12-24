package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Day02_TitleVerification {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome,driver","C:/Users/bulen/IdeaProjects/SeleniumNewProject/src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https://www.techproeducation.com");

        //get the title
        String actualTitle = driver.getTitle();
        String expectedTitle = "Techpro Education | Online It Courses & Bootcamps";

        //Verify if page title is ""Techpro Education | Online It Courses & Bootcamps"
        if(actualTitle.equals(expectedTitle)){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
            System.out.println("ACTUAL TITLE : "+ actualTitle);
            System.out.println("BUT EXPECTED TITLE : "+expectedTitle);
        }
        driver.quit();
        /*
Manual testing to verify page title:
go to title --> right click--> inspect --> scroll down--> find <title> --> take screenshot
 */

    }

}
