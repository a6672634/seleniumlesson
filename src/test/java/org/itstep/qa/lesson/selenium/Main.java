package org.itstep.qa.lesson.selenium;

import org.apache.http.util.Asserts;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver",
                "src/main/resources/chromedriver243.exe");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("http://hflabs.github.io/suggestions-demo/");
        //тут должна быть проверка на открытие страницы
        WebElement field = driver.findElement(By.id("fullname"));
        field.sendKeys("Петров Петр Петрович");
        driver.findElement(By.id("email"))
                .sendKeys("blabla@hotmail.com");
        driver.findElement(
                By.xpath("//*[@id=\"feedback-form\"]/div[5]/button"))
                .click();
        WebElement feedback = driver
                .findElement(By.id("feedback-message"));
        //итоговая проверка
    }
}
