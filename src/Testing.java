//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;

import javafx.scene.control.Button;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.*;

public class Testing {
    static protected WebDriver driver;

    public static void main(String[] args) {


        String Pass;
        System.setProperty("webdriver.chrome.driver","src\\BrowserDriver\\chromedriver.exe");
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://demo.nopcommerce.com");
        driver.findElement(By.linkText("Register")).click();
        driver.findElement(By.id("FirstName")).sendKeys("Rakesh");
        driver.findElement(By.id("gender-male")).click();
        driver.findElement(By.id("LastName")).sendKeys("Mahajan");
        driver.findElement(By.id("Email")).sendKeys("test@gmail.com");
        driver.findElement(By.id("Company")).sendKeys("soft test company");
        driver.findElement(By.id("Newsletter")).click();
        driver.findElement(By.id("Password")).sendKeys("test123");
        driver.findElement(By.id("ConfirmPassword")).sendKeys("test123");
        driver.findElement(By.id("register-button")).click();
        String expectedMsg="Company Details";

        String actualMsg=driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/form/div[2]/div[1]/strong")).getText();

if(actualMsg==expectedMsg)
{
    System.out.println("Test Case is passed");
}
else
{
    System.out.println("Test Case is Failed");
}

    }
}
