package Zadanie2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class orderDetails {
    WebDriver driver;
    public orderDetails(WebDriver driver){
        this.driver = driver;
    }
    public void details(){
        driver.findElement(By.xpath("//*[@id=\"_desktop_user_info\"]/div/a[2]/span")).click();
        driver.findElement(By.id("history-link")).click();

    }
}
