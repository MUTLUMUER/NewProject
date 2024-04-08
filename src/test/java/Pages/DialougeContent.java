package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DialougeContent extends ParentPage{
    public DialougeContent(){
        PageFactory.initElements(GWD.getDriver(),this);
    }
    @FindBy(xpath = "//a[text()='Register']")
    public WebElement register;

    @FindBy(id = "customer.firstName")
    public WebElement firstName;

    @FindBy(id = "customer.lastName")
    public WebElement lastName;

    @FindBy(id = "customer.address.street")
    public WebElement address;

    @FindBy(id = "customer.address.city")
    public WebElement city;

    @FindBy(id = "customer.address.state")
    public WebElement state;

    @FindBy(id = "customer.address.zipCode")
    public WebElement zipCode;

    @FindBy(id = "customer.phoneNumber")
    public WebElement phone;

    @FindBy(id = "customer.ssn")
    public WebElement ssn;

    @FindBy(id = "customer.username")
    public WebElement username;

    @FindBy(id = "customer.password")
    public WebElement pass;

    @FindBy(id = "repeatedPassword")
    public WebElement confirmPass;

    @FindBy(xpath = "(//input[@type='submit'])[2]")
    public WebElement submit;

    @FindBy(xpath = "(//input[@value='Log In'])")
    public WebElement loginButton;
    @FindBy(xpath = "//p[contains(text(),'Your account was created successfully. You are now logged in.')]")
    public WebElement successmsg;

    @FindBy(xpath = "//input[@name='username']")
    public WebElement loginUsername;

    @FindBy(xpath = "//input[@name='password']")
    public WebElement loginPass;
    @FindBy(xpath = "//b[text()='Welcome']")
    public WebElement welcomeText;

    //@FindBy(xpath = "//a[contains(text(),'Log Out')]")
    //public WebElement logout;
    @FindBy(xpath = "//a[text()='Log Out']")
    public WebElement logout;

    @FindBy(xpath = "//h1[text()='Error!']")
    public WebElement errorText;
    public WebElement getWebElement(String strElement) {

        switch (strElement) {
            case "loginButton": return this.loginButton;
            case "loginUsername" : return this.loginUsername;
            case "loginPass":return this.loginPass;
            case "logout":return this.logout;
            //case "payeeState":return this.payeeState;
            //case "payeeZipCode":return this.payeeZipCode;
            //case "payeePhoneNumber":return this.payeePhoneNumber;
            //case "payeeAccount":return this.payeeAccount;
            //case "verifyAccount":return this.payeeVerifyAccount;
            //case "payeeAmount":return this.payeeAmount;
            //case "sendPayment":return this.sendPayment;

        }

        return null;

    }
}
