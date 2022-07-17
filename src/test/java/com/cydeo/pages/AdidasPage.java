package com.cydeo.pages;

import com.cydeo.utilities.utility_driver.Driver;
import com.github.javafaker.Faker;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

import static com.cydeo.utilities.browserUtils.browser.waitFor;
import static com.cydeo.utilities.browserUtils.browser.waitForAlertIsPresent;


public class AdidasPage {

    public AdidasPage() {
        PageFactory.initElements( Driver.getDriver(), this );
    }

    @FindBy(xpath = "//h3[@class='price-container']")
    public WebElement purchasePrice;
    @FindBy(xpath = "//a[.='Add to cart']")
    public WebElement addCart;
    @FindBy(xpath = "//tr/td[2]")
    public List<WebElement> allNamesInCart;
    @FindBy(xpath = "//tr/td[4]/a")
    public List<WebElement> allDeletesInCart;
    @FindBy(xpath = "//div/h4/a")
    List<WebElement> allBrands;

    @FindBy(xpath = "(//a[@class='nav-link'])[1]")
    public WebElement home;
    @FindBy(xpath = "//a[.='Cart']")
    public WebElement cart;


    @FindBy(xpath = "//button[.='Place Order']")
    public WebElement placeOrder;

    @FindBy(id = "name")
    public WebElement name;

    @FindBy(id = "country")
    public WebElement country;

    @FindBy(id = "city")
    public WebElement city;

    @FindBy(id = "card")
    public WebElement card;

    @FindBy(id = "month")
    public WebElement month;

    @FindBy(id = "year")
    public WebElement year;


    @FindBy(xpath = "//button[.='Purchase']")
    public WebElement purchaseButton;

    @FindBy(xpath = "//p[@class='lead text-muted ']")
    public WebElement confirmation;
    @FindBy(id = "totalp")
    public WebElement totalPrice;


    @FindBy(xpath = "//button[@class='confirm btn btn-lg btn-primary']")
    public WebElement OK;

    @FindBy(xpath = "//tbody//tr")
    public List<WebElement> allProductFromCart;

    @FindBy(xpath = "//a[text()='Phones']")
    public WebElement Phones;

    @FindBy(xpath = "//a[text()='Monitors']")
    public WebElement Monitors;

    @FindBy(xpath = "//a[text()='Laptops']")
    public WebElement Laptops;
//    When click on "Laptops" and "Sony vaio i5 "
//    When click on "Monitors" and "Apple monitor 24"
    //  When click on "Phones" and "Samsung Galaxy s6"


    public void fillForm() {
        Faker faker = new Faker();
        name.sendKeys( faker.name().fullName() );
        country.sendKeys( faker.country().name() );
        city.sendKeys( faker.country().capital() );
        card.sendKeys( faker.finance().creditCard() );
        month.sendKeys( String.valueOf( faker.number().numberBetween( 1, 12 ) ) );
        year.sendKeys( String.valueOf( faker.number().numberBetween( 2022, 2030 ) ) );

    }

    public int addProduct(String categoryName, String productName) {

         /*
        Locator for categories
        //a[.="categoryName"]
        Locator for products
        //a[.="productsName"]
         */
        String categoryLocator = "//a[.='" + categoryName + "']";
        String productLocator = "//a[.='" + productName + "']";

        Driver.getDriver().findElement( By.xpath( categoryLocator ) ).click();
        waitFor( 1 );

        Driver.getDriver().findElement( By.xpath( productLocator ) ).click();
        waitFor( 1 );

        String priceString = purchasePrice.getText();
        System.out.println( priceString );

       /*
       Time for java to make manipulation
        */
        String[] split = priceString.split( " " );
        int price = Integer.parseInt( split[0].substring( 1 ) );

        System.out.println( price );


        addCart.click();
        /*
        BrowserUtils.waitFor(2);
        Alert alert=Driver.getDriver().switchTo().alert();
        alert.accept();
        we acn use BrowserUtils method to wait alerts dynamicly
         */

        waitForAlertIsPresent( 10 );
        Alert alert = Driver.getDriver().switchTo().alert();
        alert.accept();


        home.click();

        return price;


    }


    public int removeProduct(String productName) {


        String priceForProductLocator = "//tbody//td[.='" + productName + "']/../td[3]";

        String price = Driver.getDriver().findElement( By.xpath( priceForProductLocator ) ).getText();


        String productDelete = "//tbody//td[.='" + productName + "']/../td/a";

        Driver.getDriver().findElement( By.xpath( productDelete ) ).click();

        waitFor( 3 );


        return Integer.parseInt( price );


    }

    public void add_item() {
        addCart.click();
        waitFor( 2 );
        Alert alert = Driver.getDriver().switchTo().alert();
        alert.accept();
        home.click();

    }


    public void findWhatToDelete(String deletingName) {
        for (WebElement eachNames : allNamesInCart) {
            if (eachNames.getText().equalsIgnoreCase( deletingName )) {
              String  path = "//td[.='"+deletingName+"']/following-sibling::td[2]/a";
              Driver.getDriver().findElement( By.xpath( path ) ).click();
            }
        }
    }

    public void click_on(String buttonName) {
        Actions actions = new Actions( Driver.getDriver() );
        switch (buttonName.toLowerCase()) {
            case "place order":
                actions.moveToElement( placeOrder ).click().perform();
                waitFor( 6 );
                break;
            case "purchase":
                actions.moveToElement( purchaseButton ).click().perform();
                break;
            case "ok":
                actions.moveToElement( OK ).click().perform();
                break;
            case "cart":
                actions.moveToElement( cart ).click().perform();
                break;
            case "phones":
                actions.moveToElement( Phones ).click().perform();
                break;
            case "laptops":
                actions.moveToElement( Laptops ).click().perform();
                break;
            case "monitors":
                actions.moveToElement( Monitors ).click().perform();
                break;

        }
    }

    public void clickOnBrand(String brand) {
        for (WebElement eachBrand : allBrands) {
            if (eachBrand.getText().equalsIgnoreCase( brand )) {
                eachBrand.click();
                add_item();
                break;
            }
        }
    }

}


