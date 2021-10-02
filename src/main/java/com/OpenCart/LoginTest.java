package com.OpenCart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {
    public static WebDriver driver;
    public static void main(String[] args) {
        launch_Browser();
        open_LoginPage();
        TC_Login_001();
        TC_Login_002();
        Click_Login();
        Close_Browser();
    }
    //Step#1
    public static void launch_Browser(){
        System.setProperty("webdriver.chrome.driver","./src/main/resources/chromedriver.exe");
        driver=new ChromeDriver();
        driver.manage().window().maximize();
    }
    //Step#2
    public static void open_LoginPage(){
        driver.get("https://demo.opencart.com/index.php?route=account/login");
    }

    //Step#3
    public static void TC_Login_001(){
        WebElement Email=driver.findElement(By.id("input-email"));
        Email.sendKeys("titu@example.com");
    }

    //Step#4
    public static void TC_Login_002(){
        WebElement password=driver.findElement(By.id("input-password"));
        password.sendKeys("123456");
    }

    //Step#5
    public static void Click_Login(){
        WebElement Login=driver.findElement(By.className("btn-primary"));
        Login.click();

        //Verification
        String Expected_Result="Account Login";
        String Actual_Result=driver.getTitle();

        if (Expected_Result.equals(Actual_Result)){
          System.out.println("Test Passed");
        }

        else {
            System.out.println("Test Failed");
        }
    }

    //Step#
    public static void Close_Browser(){
        driver.close();
    }
}
