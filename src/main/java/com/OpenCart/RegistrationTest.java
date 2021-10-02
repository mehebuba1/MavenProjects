package com.OpenCart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegistrationTest {
    public static WebDriver driver;
    public static void main(String[] args) throws InterruptedException {
        launch_Browser();
        open_Registration_Page();
        TC_It_Should_Not_Register_If_Email_Address_Is_Empty();
        Close_Browser();
    }
    //Launch Chrome Browser
    public static void launch_Browser(){
        System.setProperty("webdriver.chrome.driver","./src/main/resources/chromedriver.exe");
        driver=new ChromeDriver();
        driver.manage().window().maximize();
    }
    //Go to Registration Page
    public static void open_Registration_Page(){
        driver.get("https://demo.opencart.com/index.php?route=account/register");
    }

    //Input all required field except email address
    public static void TC_It_Should_Not_Register_If_Email_Address_Is_Empty() throws InterruptedException {
        //Input First Name
        WebElement fName=driver.findElement(By.id("input-firstname"));
        fName.clear();
        fName.sendKeys("Kamrul");

        //Input Last Name
        WebElement lName=driver.findElement(By.id("input-lastname"));
        lName.clear();
        lName.sendKeys("Hasan");

        //Input Telephone Number
        WebElement telephone=driver.findElement(By.id("input-telephone"));
        telephone.clear();
        telephone.sendKeys("01886334279");

        //Input Password
        WebElement pass=driver.findElement(By.id("input-password"));
        pass.clear();
        pass.sendKeys("01886334279");

        //Confirm Password
        WebElement retypePass=driver.findElement(By.id("input-confirm"));
        retypePass.clear();
        retypePass.sendKeys("01886334279");

        //Check Agree checkbox
        WebElement agree=driver.findElement(By.name("agree"));
        agree.click();

        //Click on Continue button
        driver.findElement(By.cssSelector("input[type='submit']")).click();

        //Verify It does not register because email address is empty
        String error_message = driver.findElement(By.className("text-danger")).getText();
        if (error_message.contains("E-Mail Address does not appear to be valid!")){
            System.out.println("It is not registering because email address is empty. Test Passed");
        }
        else {
            System.out.println("It is registering though email address is empty. Test Failed");
        }
    }

    //Close the browser
    public static void Close_Browser(){
        driver.close();
    }
}
