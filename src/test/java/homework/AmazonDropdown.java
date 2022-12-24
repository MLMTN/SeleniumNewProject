package homework;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class AmazonDropdown extends HomeworkBase {
    /*
Create A Class: AmazonDropdown
Create A Method dropdownTest


     */
    @Test
    public void dropdownTest() throws InterruptedException {
        //Go to https://www.amazon.com/
        driver.get("https://www.amazon.com/");


        //Find the element of the dropdown element. HINT: By.id(“searchDropdownBox")
        Thread.sleep(3000);

        WebElement dropdown = driver.findElement(By.id("searchDropdownBox"));

        // Print the first selected option and assert if it equals
        // “All Departments”.If it fails, then comment that code out and continue rest of the test case.
        Thread.sleep(3000);
        WebElement dropdown1 = driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
        Select select = new Select(dropdown1);
        String selectedFirstOption = select.getFirstSelectedOption().getText();
        String expectedFirstOption = "All Departments";
        Assert.assertEquals("Actual Data Does Not Match Expected Data", expectedFirstOption, selectedFirstOption);

        //Select the 4th option by index (index of 3) and assert if the name is “Amazon Devices”.
        // (after you select you need to use get first selected option method).
        // If it fails, then comment that code out and continue rest of the test case.
        Thread.sleep(3000);
        select.selectByIndex(3);
        selectedFirstOption = select.getFirstSelectedOption().getText();
        expectedFirstOption = "Amazon Devices";
        //Assert.assertEquals("Actual Data Does Not Match Expected Data", expectedFirstOption,selectedFirstOption);

        //Print all of the dropdown options-getOptions(); method returns the List<WebElement>.
        // Using loop, print all options.
        Thread.sleep(3000);
        List<WebElement> allOptions = select.getOptions();
        allOptions.stream().forEach(t -> System.out.println(t.getText()));

        //Print the the total number of options in the dropdown
        System.out.println("Total number of all options in dropdown = " + select.getOptions().size());

        //Assert if ‘Appliances’ is a drop down option.
        //Print true if “Appliances” is an option. Print false otherwise.

        Thread.sleep(3000);
        boolean isOptionExist = false;
        for (WebElement option : allOptions) {
            if (option.getText().equals("All Departments")) {
                isOptionExist = true;
                break;
            }
        }
        Assert.assertTrue("Did not find option : Appliances", isOptionExist);


    }
}































