package tests;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WindowType;
import utilities.TestBase;

public class Day08_WindowHandle2 extends TestBase {

    @Test
    public void newWindowTest() throws InterruptedException {
        //open techproeducation on window 1
        Thread.sleep(5000);
        driver.get("https://www.techproeducation.com/");
        String techProTitle = driver.getTitle();
        Assert.assertTrue(techProTitle.contains("Techpro Education"));
        String techProHandle = driver.getWindowHandle();

        //open amazon on a window 2
        Thread.sleep(5000);
        driver.switchTo().newWindow(WindowType.WINDOW);//create a new window and switches to that window automatically
        driver.get("https://www.amazon.com");
        String amazonTitle = driver.getTitle();
        Assert.assertTrue(amazonTitle.contains("Amazon"));
        String amazonHandle = driver.getWindowHandle();//getting window 2 id

        //open  linkedin on a new window 3
        Thread.sleep(5000);
        driver.switchTo().newWindow(WindowType.WINDOW);//create a new window and switches to that window automatically
        driver.get("https://www.linkedin.com");
        String linkedinTitle = driver.getTitle();
        Assert.assertTrue(linkedinTitle.contains("LinkedIn"));
        String linkedinHandle = driver.getWindowHandle();//getting window 2 id

        Thread.sleep(5000);
        //Switch back to Techpro
        driver.switchTo().window(techProHandle);
        System.out.println("TechPro : "+ driver.getWindowHandle());

        Thread.sleep(5000);
        //Switch back to Amazon
        driver.switchTo().window(amazonHandle);
        System.out.println("Amazon : " + driver.getCurrentUrl());

        Thread.sleep(5000);
        //Switch back to linkedin
        driver.switchTo().window(linkedinHandle);
        System.out.println("LinkedIn : " + driver.getCurrentUrl());


    }
    @Test
    public void newTabTest() throws InterruptedException {
        //open techproeducation on TAB 1
        Thread.sleep(5000);
        driver.get("https://www.techproeducation.com/");
        String techProTitle = driver.getTitle();
        Assert.assertTrue(techProTitle.contains("Techpro Education"));
        String techProHandle = driver.getWindowHandle();

        //open amazon on a Tab 2
        Thread.sleep(5000);
        driver.switchTo().newWindow(WindowType.TAB);//create a new TAB and switches to that TAB automatically
        driver.get("https://www.amazon.com");
        String amazonTitle = driver.getTitle();
        Assert.assertTrue(amazonTitle.contains("Amazon"));
        String amazonHandle = driver.getWindowHandle();//getting TAB 2 id

        //open  linkedin on a new TAB 3
        Thread.sleep(5000);
        driver.switchTo().newWindow(WindowType.TAB);//create a new TAB and switches to that TAB automatically
        driver.get("https://www.linkedin.com");
        String linkedinTitle = driver.getTitle();
        Assert.assertTrue(linkedinTitle.contains("LinkedIn"));
        String linkedinHandle = driver.getWindowHandle();//getting TAB 2 id

        Thread.sleep(5000);
        //Switch back to Techpro
        driver.switchTo().window(techProHandle);
        System.out.println("TechPro : "+ driver.getWindowHandle());

        Thread.sleep(5000);
        //Switch back to Amazon
        driver.switchTo().window(amazonHandle);
        System.out.println("Amazon : " + driver.getCurrentUrl());

        Thread.sleep(5000);
        //Switch back to linkedin
        driver.switchTo().window(linkedinHandle);
        System.out.println("LinkedIn : " + driver.getCurrentUrl());




    }

}
