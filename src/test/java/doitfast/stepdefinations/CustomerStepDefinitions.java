package doitfast.stepdefinations;

import doitfast.context.TestContext;
import doitfast.domainobjects.BillingDetails;
import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;


public class CustomerStepDefinitions {

   private final WebDriver driver;
    private final TestContext context;

    public CustomerStepDefinitions(TestContext context) {
        driver = context.driver;
        this.context = context;

    }

    @Given("my billing details are")
    public void my_billing_details_are(BillingDetails billingDetails) {
        context.billingDetails = billingDetails;
    }
}
