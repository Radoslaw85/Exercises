package Zadanie1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class delete {
    WebDriver driver;
    public delete(WebDriver driver) {
        this.driver = driver;
    }
    public String deleteAddress (){
        driver.findElement(By.xpath("//*[@id=\"address-25451\"]/div[2]/a[2]")).click();
        WebElement tekst = driver.findElement(By.xpath("//*[@id=\"notifications\"]/div/article/ul/li"));
        return tekst.getText();



    }
}
