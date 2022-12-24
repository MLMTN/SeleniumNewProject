package tests;

import org.junit.Assert;
import org.junit.Test;
import utilities.TestBase;

import java.nio.file.Files;
import java.nio.file.Paths;

public class Day09_FileExistTest extends TestBase {
    @Test
    public void isExistTest(){
        /*
        Class: FileExistTest
Method: isExist

         */
        String userDir= System.getProperty("user.dir"); //==> gives the path of the current project folder
        System.out.println(userDir);//C:\Users\bulen\IdeaProjects\SeleniumNewProject

        String userHome= System.getProperty("user.home");///==>gives you the user folder
        System.out.println(userHome);//C:\Users\bulen

       // Pick a file on your desktop
       // And verify if that file exist on your computer or not

        //String pathOfFile = userHome + "/Desktop/logo/jpeg"; //for Mac
        String pathOfFile = userHome + "\\Downloads\\logo.jpeg";  //window
        System.out.println(pathOfFile);

        boolean isExist = Files.exists(Paths.get(pathOfFile));//returns TRUE if file exists. FALSE if file doesn't exists
        Assert.assertTrue(isExist);
    }
}
