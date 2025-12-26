package doitfast.stepdefinations;

import doitfast.apis.CartApi;
import doitfast.constants.Endpoint;
import doitfast.constants.MyConstants;
import doitfast.context.TestContext;
import doitfast.domainobjects.Product;
import doitfast.pages.PageFactoryManager;
import doitfast.pages.StorePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;


public class StoreStepDefinitions {

    private final TestContext context;
    private final StorePage storePage;

    public StoreStepDefinitions(TestContext context) {
        this.context = context;
        storePage = PageFactoryManager.getStorePage(context.driver);
    }

    @Given("I'm on the Store Page")
    public void iMOnTheStorePage() {
        storePage.load(MyConstants.STORE);
    }

    @Given("I'm a guest customer")
    public void i_m_a_guest_customer() {
        //driver = DriverFactory.getDriver();
        storePage.load(Endpoint.STORE.url);
    }

    @Given("I have a product in the cart")
    public void i_have_a_product_in_the_cart() {
        //new StorePage(driver).addToCart("Blue Shoes");  //commented to use this method through cookies
        CartApi cartApi = new CartApi(context.cookies.getCookies());
        cartApi.addToCart(1215,1);
        context.cookies.setCookies(cartApi.getCookies());
        context.cookies.injectCookiesToBrowser(context.driver);

    }
    @When("I add a {product} to the cart")
    public void iAddAToTheCart(Product product) {
        storePage.addToCart(product.getName());
    }



}