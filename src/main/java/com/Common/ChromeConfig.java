package com.Common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeConfig {

    public static WebDriver driver;

    public static void main(String[] args) {
        launch_Chrome();
        close_Chrome();
        init_And_Open_URL();
    }

    public static void launch_Chrome() {
        System.setProperty("webdriver.chrome.driver","./src/main/resources/chromedriver.exe");
        driver=new ChromeDriver();
        driver.manage().window().maximize();
    }

    public static void close_Chrome() {
        driver.close();
    }

    public static void init_And_Open_URL() {
        System.setProperty("webdriver.chrome.driver","./src/main/resources/chromedriver.exe");
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.opencart.com/index.php?route=account/login");
    }
}
