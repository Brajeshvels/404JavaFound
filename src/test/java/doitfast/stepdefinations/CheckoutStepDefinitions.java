package doitfast.stepdefinations;

import doitfast.constants.Endpoint;
import doitfast.context.TestContext;
import doitfast.pages.CheckoutPage;
import doitfast.pages.PageFactoryManager;
import io.cucumber.java.en.*;
import org.testng.Assert;

public class CheckoutStepDefinitions {

    private final CheckoutPage checkout;
    private final TestContext context;


    public CheckoutStepDefinitions(TestContext context) {
        this.context = context;
        checkout = PageFactoryManager.getCheckoutPage(context.driver);

    }

    @When("I provide billing details")
    public void i_provide_billing_details() throws InterruptedException {
        checkout.setBillingDetails(context.billingDetails);
        Thread.sleep(4000);
    }

    @When("I place an order")
    public void i_place_an_order() {
        checkout.placeOrder();
    }
    @Then("the order should be placed successfully")
    public void the_order_should_be_placed_successfully() {
        Assert.assertEquals(checkout.getNotice(), "Thank you. Your order has been received.");

    }

    @Given("I'm on the Checkout page")
    public void i_m_on_the_checkout_page() {
       // new CartPage(driver).checkout();
        checkout.load(Endpoint.CHECKOUT.url);
    }
}
