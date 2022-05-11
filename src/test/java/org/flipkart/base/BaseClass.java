package org.flipkart.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.time.Duration;
import java.util.Properties;

public class BaseClass {
    public  static WebDriver driver;
    public static Properties pro;

    @BeforeSuite
    public void setup(){
        pro= new Properties();
        try {
            FileInputStream fileInputStream=new FileInputStream("./src/Configuration/config.properties");
            pro.load(fileInputStream);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @BeforeMethod
    public void launchApp(){
        if (pro.getProperty("Browser").equalsIgnoreCase("Chrome")){
            System.out.println("********** setting up Chrome driver **********");
            System.setProperty("webdriver.chrome.driver","./src/test/resources/Drivers/chromedriver.exe");
            ChromeOptions options = new ChromeOptions();
            //options.addArguments("--headless");
            driver = new ChromeDriver(options);

        } else {
            System.out.println("No Browser to support");
        }
        driver.manage().window().maximize();
        driver.get(pro.getProperty("url"));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @AfterMethod
    public void teardown(){
        driver.close();
        driver.quit();
    }

}
