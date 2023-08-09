package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pom.pom;
import stepdefinition.stepdef;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class testng extends stepdef {
@Test(dataProvider = "dataprovideru")
    public  void login(String a,String b) throws IOException {
    WebDriver d = driveu();
        prop=new Properties();
        FileInputStream fil=new FileInputStream("C:\\Users\\deekshith.gowda\\Favorites\\intelijpractice\\manojendtoend\\src\\test\\java\\properties\\config.properties");
        prop.load(fil);
    d.get(prop.getProperty("url"));
    d.manage().window().maximize();
    pom page =new pom(d);
       page.myacc.click();
       page.login.click();
       page.login(a,b);
    Assert.assertEquals("My Account",driver.getTitle());
    Assert.assertEquals("https://tutorialsninja.com/demo/index.php?route=account/account",driver.getCurrentUrl());
    Assert.assertEquals("My Account",driver.findElement(By.cssSelector("#content>h2")).getText());
    WebElement ele = driver.findElement(By.cssSelector("#content>h2"));
    System.out.println(ele.isDisplayed());


    }
    @DataProvider()
    public Object[][] dataprovideru()
    {
        return new Object[][]{{"deekshi12@gmail.com","hello@123"},{"mau123@gmail.com","123@qwe"},{"mau1234@gmail.com","123@qwe"}};
    }


}