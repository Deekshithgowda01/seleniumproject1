package stepdefinition;

import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pom.pom;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

public class stepdef {

    public WebDriver driver;
        public pom po;

        public WebDriverWait wait;

        public Properties prop;


    @Given("launch the browser  url {string}")
    public void launch_the_browser_url(String url) throws IOException {

        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();
        po=new pom(driver);
        prop=new Properties();
        FileInputStream fil=new FileInputStream("C:\\Users\\deekshith.gowda\\Favorites\\intelijpractice\\manojendtoend\\src\\test\\java\\properties\\config.properties");
        prop.load(fil);
        wait=new WebDriverWait(driver, Duration.ofMinutes(3));
    }

    @Given("user click on register button")
    public void user_click_on_register_button() throws IOException {

         wait.until(ExpectedConditions.visibilityOf(po.myacc)).click();
        wait.until(ExpectedConditions.visibilityOf(po.register)).click();
    }
    @When("user start give input to all the asterick textfield")
    public void user_start_give_input_to_all_the_asterick_textfield() {
        po.firstname.sendKeys(prop.getProperty("firstname"));
        po.lastname.sendKeys(prop.getProperty("lastname"));
        po.email.sendKeys(prop.getProperty("email"));
        po.telephone.sendKeys(prop.getProperty("telephone"));
        po.password.sendKeys(prop.getProperty("password"));
        po.confpass.sendKeys(prop.getProperty("confpassword"));

    }
    @When("click on checkbox")
    public void click_on_checkbox() {
        po.agree.click();
       driver.switchTo().alert().

    }
    @When("click on continue")
    public void click_on_continue() {
        po.submit.click();

    }
    @Then("validate user is created")
    public void validate_user_is_created() {
        String ele = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1[.='Your Account Has Been Created!']"))).getText();
        System.out.println(ele);

    }
    @When("^user enters firstname (.*) and lastname (.*) and email (.*) Telephone (.*) password (.*) confpassword (.*)$")
    public void user_enters_firstname_manu_and_lastname_gowda_and_email_mau123_gmail_com_telephone_password_qwe_confpassword_qwe(String a, String b, String c,String d,String e,String f) {
        po.firstname.sendKeys(a);
        po.lastname.sendKeys(b);
        po.email.sendKeys(c);
        po.telephone.sendKeys(d);
        po.password.sendKeys(e);
        po.confpass.sendKeys(f);




    }
    public WebDriver driveu()
    {
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        return driver;

    }

}
