package Zadanie2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class sweater {
    WebDriver driver;
    public sweater(WebDriver driver) {
        this.driver = driver;
    }
    public void sweaterAdd() throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"content\"]/section/div/article[2]/div/a/img")).click();
        driver.findElement(By.id("group_1")).sendKeys("M");
        WebElement quantity = driver.findElement(By.id("quantity_wanted"));
        Thread.sleep(1000);
        quantity.clear();
        quantity.sendKeys("5");
        driver.findElement(By.xpath("//*[@id=\"add-to-cart-or-refresh\"]/div[2]/div/div[2]/button")).click();
        Thread.sleep(2000);

    }
}
