package LoginPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidLogin {
    WebDriver driver=new ChromeDriver();




    public void VerifyValidLogin(){
        //WebDriver driver=new ChromeDriver();
        driver.get("https://www.saucedemo.com/v1/");


        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.className("btn_action")).click();

        //driver.quit();

    }

    public void VerifyInvalidLogin(){
        //WebDriver driver=new ChromeDriver();
        driver.get("https://www.saucedemo.com/v1/");
        driver.findElement(By.id("user-name")).sendKeys("standard12_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.className("btn_action")).click();
        //driver.quit();

    }

    public void NoLoginDetails(){
        //WebDriver driver=new ChromeDriver();
        driver.get("https://www.saucedemo.com/v1/");
        driver.findElement(By.className("btn_action")).click();
        //driver.quit();

    }


    public static void main(String[] args) {
        ValidLogin validLogin=new ValidLogin();
        validLogin.VerifyValidLogin();
        validLogin.VerifyInvalidLogin();
        validLogin.NoLoginDetails();
    }


}







