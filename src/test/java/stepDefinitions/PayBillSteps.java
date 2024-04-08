package stepDefinitions;

import Pages.DialougeContent;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

public class PayBillSteps {
    DialougeContent dc= new DialougeContent();
    @Given("Navigate to bills' page")
    public void navigateToBillsPage() {
        dc.myClick(dc.payBill);
    }

    @When("Pay the different types of bills")
    public void payTheDifferentTypesOfBills(DataTable dataTable) {
        List<List<String>>listText=dataTable.asLists(String.class);
        for (int i = 0; i < listText.size(); i++) {
            WebElement textBox=dc.getWebElement(listText.get(i).get(0));
            dc.mySendKeys(textBox,listText.get(i).get(1));
        }
    }

    @And("Check payment status")
    public void checkPaymentStatus() {
        dc.myClick(dc.sendPayment);
    }

    @Then("User should confirm bills are paid and the payment list is up to date")
    public void userShouldConfirmBillsArePaidAndThePaymentListIsUpToDate() {
        dc.verifyContainsText(dc.paymentCompleteText,"Complete");
        String faturaAccountId=dc.accountIdFatura.getText();
        System.out.println("faturadi account id= "+faturaAccountId);
        dc.myClick(dc.accountOverview);
        System.out.println("faturadi account id= "+dc.accountOverviewAccountId.getText());
        Assert.assertTrue(dc.accountOverviewAccountId.getText().equals(faturaAccountId),"Account numarası faturadaki ile aynı değil");


    }
}
