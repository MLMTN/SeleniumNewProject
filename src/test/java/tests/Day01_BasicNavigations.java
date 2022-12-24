package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Day01_BasicNavigations {
    public static void main(String[] args) {

//1. STEP SET UP //KENDI PATH INI CVOPYALARKEN CROME U KULLANACAKSIN FAKAT BENIM EXTRA BILGISAYAR KULLANICI PATH INI DE EKLEMEM GEREKIYOR
        System.setProperty("webdriver.chrome,driver","C:/Users/bulen/IdeaProjects/SeleniumNewProject/src/resources/drivers/chromedriver.exe");

//2. STEP "CREATE
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

//STEP 3: WRITE TEST SCRIPS

/*
Steps:
Create a new class under : BasicNavigations
Create main method
Set Path
Create chrome driver
Maximize the window
Open google home page https://www.walmart.com/.
On the same class, Navigate to amazon home page https://www.amazon.com/
Navigate back to walmart
Navigate forward to amazon
Refresh the page
Close/Quit the browser
 */
        driver.get("https://www.walmart.com");
        driver.navigate().to("https://www.amazon.com/");//ayni brwser da aciyor
        driver.navigate().back(); //geldigi sayfaya geri doner
        driver.navigate().forward();//geri amazon a doner
        driver.navigate().refresh();//sayfayi yeniliyor
        //driver.close();//tek sayfayi kapatir son calisani kapatir
        driver.quit();//acilan tum browserlari kapaatir active olan all windowslari kapatir





    }
}
