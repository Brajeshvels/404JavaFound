package doitfast.factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverFactory {

    //public static WebDriver driver;

  // private static final ThreadLocal<WebDriver> driver = new ThreadLocal<>();

    public static WebDriver initializeDriver(String browser){
        WebDriver driver;
        switch (browser) {
          case "chrome" -> driver = new ChromeDriver();
          case "firefox" -> driver = new FirefoxDriver();
          default -> throw new RuntimeException("INVALID BROWSER : " + browser);
      }
      driver.manage().window().maximize();
     // DriverFactory.driver.set(driver);
       return driver;
    }


//    public static WebDriver getDriver(){
//        return driver.get();
//    }
}
