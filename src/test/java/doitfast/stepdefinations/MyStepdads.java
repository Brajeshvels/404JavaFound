package doitfast.stepdefinations;

import doitfast.constants.Endpoint;
import doitfast.constants.MyConstants;
import doitfast.context.TestContext;
import doitfast.domainobjects.BillingDetails;
import doitfast.domainobjects.Product;
import doitfast.pages.CartPage;
import doitfast.pages.CheckoutPage;
import doitfast.pages.StorePage;

import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;




public class MyStepdads {

    private final WebDriver driver;
    private BillingDetails billingDetails;

    public MyStepdads(TestContext context){
        //System.out.println("Step Def : " +context.scenarioName);
        driver = context.driver;
    }

//    @Given("I'm on the Store Page")
//    public void iMOnTheStorePage() {
//        //driver = DriverFactory.getDriver();
//        new StorePage(driver).load(MyConstants.STORE);
//    }

//    @When("I add a {product} to the cart")
//    public void iAddAToTheCart(Product product) {
//        new StorePage(driver).addToCart(product.getName());
//    }

//    @Then("I should see {int} {product} in the cart")
//    public void iShouldSeeInTheCart(int arg0, Product product) {
//        CartPage cp =  new CartPage(driver);
//        Assert.assertEquals(cp.getProductName(),product.getName());
//        Assert.assertEquals(cp.getProductQuantity(),arg0);
//    }
    
    //2nd testcases


//    @Given("I'm a guest customer")
//    public void i_m_a_guest_customer() {
//        //driver = DriverFactory.getDriver();
//        new StorePage(driver).load(Endpoint.STORE.url);
//    }
//    @Given("my billing details are")
//    public void my_billing_details_are(BillingDetails billingDetails) {
//       this.billingDetails = billingDetails;
//    }
//    @Given("I have a product in the cart")
//    public void i_have_a_product_in_the_cart() {
//        new StorePage(driver).addToCart("Blue Shoes");
//    }
//    @Given("I'm on the Checkout page")
//    public void i_m_on_the_checkout_page() {
//       new CartPage(driver).checkout();
//    }
//    @When("I provide billing details")
//    public void i_provide_billing_details() throws InterruptedException {
//       new CheckoutPage(driver).setBillingDetails(billingDetails);
//       Thread.sleep(4000);
//    }
//
//    @When("I place an order")
//    public void i_place_an_order() {
//       new CheckoutPage(driver).placeOrder();
//    }
//    @Then("the order should be placed successfully")
//    public void the_order_should_be_placed_successfully() {
//        Assert.assertEquals(new CheckoutPage(driver).getNotice(), "Thank you. Your order has been received.");
//
//    }

}
