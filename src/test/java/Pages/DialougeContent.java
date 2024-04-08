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

    @FindBy(xpath = "//a[text()='Bill Pay']")
    public WebElement payBill;

    @FindBy(xpath = "//input[@name='payee.name']")
    public WebElement payName;

    @FindBy(xpath = "//input[@name='payee.address.street']")
    public WebElement payAddress;

    @FindBy(xpath = "//input[@name='payee.address.city']")
    public WebElement payCity;

    @FindBy(xpath = "//input[@name='payee.address.state']")
    public WebElement payState;
    @FindBy(xpath = "//input[@name='payee.address.zipCode']")
    public WebElement payZipCode;

    @FindBy(xpath = "//input[@name='payee.phoneNumber']")
    public WebElement payPhoneNumber;

    @FindBy(xpath = "//input[@name='payee.accountNumber']")
    public WebElement payAccount;

    @FindBy(xpath = "//input[@name='verifyAccount']")
    public WebElement payVerifyAccount;

    @FindBy(xpath = "//input[@name='amount']")
    public WebElement payAmount;

    @FindBy(xpath = "//input[@value='Send Payment']")
    public WebElement sendPayment;

    @FindBy(xpath = "//h1[text()='Bill Payment Complete']")
    public WebElement paymentCompleteText;

    @FindBy(xpath = "//span[@id='fromAccountId']")
    public WebElement accountIdFatura;

    @FindBy(xpath = "//a[text()='Accounts Overview']")
    public WebElement accountOverview;

    @FindBy(xpath = "//a[@class='ng-binding']")
    public WebElement accountOverviewAccountId;






    public WebElement getWebElement(String strElement) {

        switch (strElement) {
            case "loginButton": return this.loginButton;
            case "loginUsername" : return this.loginUsername;
            case "loginPass":return this.loginPass;
            case "logout":return this.logout;
            case "payBill":return this.payBill;
            case "payName":return this.payName;
            case "payAddress":return this.payAddress;
            case "payCity":return this.payCity;
            case "payState":return this.payState;
            case "payZipCode":return this.payZipCode;
            case "payPhoneNumber":return this.payPhoneNumber;
            case "payAccount":return this.payAccount;
            case "payVerifyAccount":return this.payVerifyAccount;
            case "payAmount":return this.payAmount;








        }

        return null;

    }
}
