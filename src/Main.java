import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;
public class Main {
    public static void main(String[] args){
        System.setProperty("webdriver.chrome.driver","/Users/kamilzaras/Documents/Drivery/chromedriver");

        ChromeDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://eagenttst.warta.pl/");

driver.findElement(By.cssSelector("#username")).sendKeys("tn0196");
driver.findElement(By.cssSelector("#password")).sendKeys("Warta000");
driver.findElement(By.cssSelector(".btn-submit")).click();
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
driver.findElementById("bookmark_sale_property_new").click();
driver.findElementByCssSelector(".product-line-choice-container__widget__header").click();



    }
}