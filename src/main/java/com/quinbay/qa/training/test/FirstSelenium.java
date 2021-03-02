package com.quinbay.qa.training.test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import java.util.concurrent.TimeUnit;
public class FirstSelenium {

    private String viewcart="//a[@href='https://www.edgewordstraining.co.uk/demo-site/cart/'][text()='Cart']";
    private String searchbox="//input[contains(@id,'0')]";
    private String dismiss="//a[@class='woocommerce-store-notice__dismiss-link']";
    private String vneck="//img[@src='https://www.edgewordstraining.co.uk/demo-site/wp-content/uploads/2018/03/vneck-tee.jpg']";
    private String addtocart="//button[@value=38]";
    private String checkout="//a[@href='https://www.edgewordstraining.co.uk/demo-site/checkout/'][@class=\"checkout-button button alt wc-forward\"]";
    private String payment="//input[@id='payment_method_cod']";
    private String placeorder="//button[@id=\"place_order\"]";
    private String firstname="//input[@id=\"billing_first_name\"]";
    private String lastname="//input[@id=\"billing_last_name\"]";
    private String company="//input[@id=\"billing_company\"]";
    private String door="//input[@id='billing_address_1']";
    private String city="//input[@id='billing_city']";
    private String postcode="//input[@id='billing_postcode']";
    private String email="//input[@id='billing_email']";
    private String phone="//input[@id='billing_phone']";
    private String createaccount="//input[@id='createaccount']";
    private String pass="//input[@id='account_password']";
    private String drpcountry="//select[@class='country_to_state country_select select2-hidden-accessible']";
    private String state="//select[@id=\"billing_state\"]";
    WebDriver driver;

    FirstSelenium(String driverloc,String driverval) throws InterruptedException {
        System.setProperty(driverloc,driverval);
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("https://www.edgewordstraining.co.uk/demo-site/");
        Thread.sleep(2000);
    }
    public void searchboxmethod(String searchvalue) {
        ((ChromeDriver) driver).findElementByXPath(searchbox).click();
        ((ChromeDriver) driver).findElementByXPath(searchbox).sendKeys(searchvalue);
        ((ChromeDriver) driver).findElementByXPath(searchbox).submit();
    }
    public void dismissbutton() {
        ((ChromeDriver) driver).findElementByXPath(dismiss).click();
    }
    public void vneckselect() {
        ((ChromeDriver) driver).findElementByXPath(vneck).click();
    }
    public void addcart()
    {
        ((ChromeDriver) driver).findElementByXPath(addtocart).click();
    }
    public void viewcartmethod() {
        ((ChromeDriver) driver).findElementByXPath(viewcart).click();
    }
    public void checkoumethod() {
        ((ChromeDriver) driver).findElementByXPath(checkout).click();
    }

    public void adddetails(String fname,String lname,String cname,String coname,String dname,String ciname,String sname,String pcode,String ename,String pname,String passname)
    {
        ((ChromeDriver) driver).findElementByXPath(firstname).click();
        ((ChromeDriver) driver).findElementByXPath(firstname).sendKeys(fname);
        ((ChromeDriver) driver).findElementByXPath(lastname).click();
        ((ChromeDriver) driver).findElementByXPath(lastname).sendKeys(lname);
        ((ChromeDriver) driver).findElementByXPath(company).click();
        ((ChromeDriver) driver).findElementByXPath(company).sendKeys(cname);
        new Select(((ChromeDriver) driver).findElementByXPath(drpcountry)).selectByVisibleText(coname);
        ((ChromeDriver) driver).findElementByXPath(door).click();
        ((ChromeDriver) driver).findElementByXPath(door).sendKeys(dname);
        ((ChromeDriver) driver).findElementByXPath(city).click();
        ((ChromeDriver) driver).findElementByXPath(city).sendKeys(ciname);
        new Select(((ChromeDriver) driver).findElementByXPath(state)).selectByVisibleText(sname);
        ((ChromeDriver) driver).findElementByXPath(postcode).click();
        ((ChromeDriver) driver).findElementByXPath(postcode).sendKeys(pcode);
        ((ChromeDriver) driver).findElementByXPath(email).click();
        ((ChromeDriver) driver).findElementByXPath(email).sendKeys(ename);
        ((ChromeDriver) driver).findElementByXPath(phone).click();
        ((ChromeDriver) driver).findElementByXPath(phone).sendKeys(pname);
        ((ChromeDriver) driver).findElementByXPath(createaccount).click();
        ((ChromeDriver) driver).findElementByXPath(pass).click();
        ((ChromeDriver) driver).findElementByXPath(pass).sendKeys(passname);
    }


    public void payandplace() throws InterruptedException {
        ((JavascriptExecutor) driver).executeScript("arguments[0].checked = true;", ((ChromeDriver) driver).findElementByXPath(payment));
        ((ChromeDriver) driver).findElementByXPath(placeorder).submit();
        Thread.sleep(300000);
        driver.close();
    }
    }

