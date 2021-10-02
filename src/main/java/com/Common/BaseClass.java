package com.Common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass extends MethodClass{

    public static WebDriver driver;

    public static void main(String[] args) {
        init_Browser_And_Open_opencart_URL();
    }

    public static void init_Browser_And_Open_opencart_URL() {
        System.setProperty("webdriver.chrome.driver","./src/main/resources/chromedriver.exe");
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.opencart.com/");
    }
}
