package doitfast.stepdefinations;

import doitfast.context.TestContext;
import doitfast.domainobjects.Product;
import doitfast.pages.CartPage;
import doitfast.pages.PageFactoryManager;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class CartStepDefinitions {

    private final TestContext context;
    private final CartPage cartPage;


    public CartStepDefinitions(TestContext context) {
        this.context = context;
        cartPage = PageFactoryManager.getCartPage(context.driver);
    }


    @Then("I should see {int} {product} in the cart")
    public void iShouldSeeInTheCart(int arg0, Product product) {
        Assert.assertEquals(cartPage.getProductName(),product.getName());
        Assert.assertEquals(cartPage.getProductQuantity(),arg0);
    }

//    @Given("I'm on the Checkout page")  // shifted this method to the checkout page
//    public void i_m_on_the_checkout_page() {
//        new CartPage(driver).checkout();
//    }

}
