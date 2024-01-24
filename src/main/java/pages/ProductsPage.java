package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductsPage extends BasePage{

    public ProductsPage(WebDriver driver) {
        super(driver);
    }

    public By productMenu =By.xpath("//a[@href='/products']");
    public By clickfirstItem= By.xpath("(//a[@data-product-id='1'and @class='btn btn-default add-to-cart'])[1]");
    public By clicksecondItem=  By.xpath("(//a[@data-product-id='2'and @class='btn btn-default add-to-cart'])[1]");
    public By addToCartBtn=By.xpath("(//a[@data-product-id='1'and @class='btn btn-default add-to-cart'])[2]");
    public By continueShoppingBtn=By.linkText("Continue Shopping");
    public By viewCartBtn=By.xpath("(//a[@href='/view_cart'])[2]");

    public By cartitem1=By.xpath("//img[@src='get_product_picture/1']");
    public By item1Detail=By.xpath("//div[@class='product-details']");

}
