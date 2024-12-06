package com.step.stepDefination;


import java.util.concurrent.TimeUnit;

import org.junit.rules.Timeout;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Stepdefination {

    WebDriver driver;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        
    }



    @Given("Enter Amazon url")
    public void enter_amazon_url() {
        driver.get("https://www.flipkart.com/");
    }

    @Given("click on search button")
    public void click_on_search_button() {
        driver.findElement(By.xpath("//input[@class='Pke_EE']")).sendKeys("iphone11");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
    }

    @When("I enter username and password")
    public void i_enter_username_and_password() {
        System.out.println("Entered username and password");
    }

    @When("click on login button")
    public void click_on_login_button() {
        System.out.println("Able to login");
    }

    @Then("User able to login amazon homepage")
    public void user_able_to_login_amazon_homepage() {
        System.out.println("User is on Amazon home page");
    }
}
