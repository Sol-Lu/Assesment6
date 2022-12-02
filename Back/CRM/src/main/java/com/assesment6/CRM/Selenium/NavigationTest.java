package com.Assesment6.CRM.Selenium;

import org.checkerframework.checker.nullness.qual.AssertNonNullIfNonNull;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class NavigationTest {
    WebDriver driver;

        @BeforeMethod
        public void setUpMethod() {
            driver = new ChromeDriver();
            driver.get("https://localhost:3000/");
        }


//        @AfterMethod
//        public void tearDownMethod() {
//            if (driver != null) {
//                driver.quit();
//            }
//        }

        @Test
        public void checkProfileData_dataAvailable(){
            WebElement advancedPrivate = driver.findElement(By.id("details-button"));

            if (advancedPrivate != null){
                advancedPrivate.click();
                driver.findElement(By.id("proceed-link")).click();
            }

            WebElement profileName = driver.findElement(By.xpath("//*[@id=\"content\"]/h1"));

            Assert.assertNotNull(profileName.getText());
        }

        @Test
        public void checkNavigation_changeUrlAndIntroduceData() {
            WebElement advancedPrivate = driver.findElement(By.id("details-button"));

            if (advancedPrivate != null) {
                advancedPrivate.click();
                driver.findElement(By.id("proceed-link")).click();
            }

            WebElement opportunitiesMenu = driver.findElement(By.xpath("//*[@id=\"menu\"]/a[4]"));
            opportunitiesMenu.click();

            driver.findElement(By.xpath("//*[@id=\"content\"]/div/a")).click();

            driver.findElement(By.name("opportunityname")).sendKeys("BlueProject");
            driver.findElement(By.name("entityname")).sendKeys("S.A.Green");
            driver.findElement(By.name("contact")).sendKeys("Contact1");
            driver.findElement(By.name("startdate")).sendKeys("02/02/2023");
            driver.findElement(By.name("description")).sendKeys("Project for colors");

            driver.findElement(By.xpath("//*[contains(text(),'Submit')]")).click();
        }
       }
