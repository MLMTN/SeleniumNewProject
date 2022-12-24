import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstClass {
    public static void main(String[] args) {
//1.  Set Up Chrome Driver ISTEDIGIMIZ WEB DRIVER I KULLANIYORUZ SUAN GOOLECROME KULLANDIK
        System.setProperty("webdriver.chrome.driver","C:/Users/bulen/IdeaProjects/SeleniumNewProject/src/resources/drivers/chromedriver.exe");

//2. CREATE CHROME DRIVER
        WebDriver driver = new ChromeDriver();

 //3. WRITE YOUR TEST CASES NOW THAT WE CREATE WEBDRIVER , WE CAN AUTOMETE WEB APPLICATION
        driver.get("https://www.techproeducation.com");

        //driver.get("https://amazon.com");
        driver.getTitle();
        System.out.println("Bootcamp" + driver.getTitle() );


    }
}
