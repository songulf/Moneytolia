package stepDefinitions;

import factory.DriverFactory;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pages.ProductsPage;
import utils.ConfigReader;

import java.util.Properties;

public  class ProductStepDefinition {

    private DriverFactory driverFactory;
    private ConfigReader configReader;
    private Properties prop;
    private WebDriver driver;

    private ProductsPage productspage=new ProductsPage(DriverFactory.getDriver());

        @When("Launch browser")
        public void launchBrowser() {

            String browserName = prop.getProperty("browser");
            DriverFactory driverFactory = new DriverFactory();
            driver = driverFactory.init_driver(browserName);
     }

        @When("Navigate to url {string}")
        public void navigateToUrlHttpAutomationexerciseCom() {
            DriverFactory.getDriver().get("https://automationexercise.com/");
        }

        @And("Verify that home page is visible successfully")
        public void verifyThatHomePageIsVisibleSuccessfully() {
            Assert.assertTrue(driver.findElement(By.linkText("Home")).isDisplayed());

        }

        @And("Click {string} button")
        public void clickProductsButton() {
            productspage.click(productspage.productMenu);

        }

        @And("Hover over first product and click {string}")
        public void hoverOverFirstProductAndClickAddToCart() {
            productspage.click(productspage.clickfirstItem);

        }
        @And("Click {string} button")
        public void continueShoppingButton() {
        productspage.click(productspage.continueShoppingBtn);

         }

        @And("Hover over second product and click {string}")
        public void hoverOverSecondProductAndClickAddToCart() {

            productspage.click(productspage.clicksecondItem);

        }
        @Then("Verify both products are added to Cart")
        public void verifyThatBothProductsAreAddedToCart() {

            String cartitem1=driver.findElement(By.xpath("//a[@href='/product_details/1']")).getText();
            Assert.assertEquals(cartitem1,"Blue Top") ;
            String cartitem2=driver.findElement(By.xpath("//a[@href='/product_details/2']")).getText();
            Assert.assertEquals(cartitem2,"Men Tshirt") ;

    }

    }

