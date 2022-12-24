package tests;

import org.junit.Assert;
import org.junit.Test;

public class Day03_Assertions {


        @Test
        public void assertions(){
            /*
            What is assertion in testing?
            Assertion is done to check if expected result is equals to actual result.
            -expected == actual--> pass
            -expected!= actual--> fail

            --------------
            assertEquals("expected","actual");
            assertTrue(true);--> pass
            assertTrue(false);--> fail
            assertFalse(false)-->pass
            assertFalse(true)-->fail
            ---------------

             */

            Assert.assertEquals(5,5);

            if("Java".contains("apple")){
                System.out.println("Pass");
            }else{
                System.out.println("Fail");
            }
            Assert.assertEquals("java","java");//test is fail eger farkli olursa
            Assert.assertEquals("java".contains("j"),true);

            Assert.assertTrue("java".contains("j"));
            Assert.assertFalse("Java".contains("j"));
           // TEST EXECUTION STOPS IF ONE THE ASSERTION FAILS. THIS IS CALLED HARD ASSERTIOS
//        TEST EXECUTION CONTINUES EVEN IF TEST VERRIFICATION FAILS. VERIFICATION MEANS LIKE IF STATEMENT
//        What is difference between Assertion and Verification?
//        Assertion stops after assertion fails. Verification continues even after verification fails
//        Junit assertions are hard assertion. If statement is verification
//        NOTE: TestNG has soft assertion as well. We will learn it in TestNG
            /*
            There are 8 selenium locators to locate an element.
             1.id
             2.name
              3.className
             TagName
            linkText
            partialLinkText
             xpath ->There are multiple ways to write xpath
              css      ->There are multiple ways to write css
             */


    }
}
