package com.Common;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MethodClass {
    public WebDriver driver;
    WebDriverWait wait = new WebDriverWait(driver, 10);


    /*=================================Navigate to Login Page================================================*/
    public void openLoginPage()
    {
        //Navigate Top Menu
        WebElement myAccount=driver.findElement(By.linkText("My Account"));
        myAccount.click();

        wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Login")));
        driver.findElement(By.linkText("Login")).click();
    }


    /*=================================Navigate to Registration Page================================================*/
    public void openRegistrationPage() throws InterruptedException {
        //Navigate Top Menu
        WebElement myAccount=driver.findElement(By.className("dropdown"));
        myAccount.click();
        Thread.sleep(10000);

        wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Register")));
        driver.findElement(By.linkText("Register")).click();
        Thread.sleep(10000);
    }
}
