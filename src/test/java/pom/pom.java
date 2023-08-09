package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pom {
    public WebDriver driver;
    public pom(WebDriver driver)
    {
       this.driver= driver;
        PageFactory.initElements(driver,this);

    }

    @FindBy(css = "a[title='My Account']")
    public WebElement myacc;
    @FindBy(xpath = "//a[.='Register']")
    public WebElement register;

    @FindBy(css = "#input-firstname")
    public WebElement firstname;

    @FindBy(css = "#input-lastname")
    public WebElement lastname;

    @FindBy(css = "#input-email")
    public WebElement email;

    @FindBy(css = "#input-telephone")
    public WebElement telephone;

    @FindBy(css = "#input-password")
    public WebElement password;

    @FindBy(css = "#input-confirm")
    public WebElement confpass;

    @FindBy(xpath = "//input[@name='agree']")
    public WebElement agree;

    @FindBy(xpath = "//input[@type='submit']")
    public WebElement submit;


    @FindBy(xpath = "//a[.='Login']")
    public WebElement login;

    @FindBy(css = "#input-email")
    public WebElement emaillog;

    @FindBy(css = "#input-password")
    public WebElement emailpass;

    @FindBy(xpath="//input[@type='submit']")
    public WebElement loginhome;

    public void login(String email,String emailpassword)
    {
        emaillog.sendKeys(email);
        emailpass.sendKeys(emailpassword);
        loginhome.click();
    }


}
