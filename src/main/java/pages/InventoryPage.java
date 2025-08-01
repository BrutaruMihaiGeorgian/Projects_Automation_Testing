package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class InventoryPage {
    private WebDriver driver;

    // Selectors for "Add to cart" buttons on popular products (6 products)
    private By addBackpackButton = By.id("add-to-cart-sauce-labs-backpack");
    private By addBikeLightButton = By.id("add-to-cart-sauce-labs-bike-light");
    private By addBoltTShirtButton = By.id("add-to-cart-sauce-labs-bolt-t-shirt");
    private By addFleeceJacketButton = By.id("add-to-cart-sauce-labs-fleece-jacket");
    private By addOnesieButton = By.id("add-to-cart-sauce-labs-onesie");
    private By addRedTShirtButton = By.id("add-to-cart-test.allthethings()-t-shirt-(red)");

    // Selector for cart icon (to navigate to cart page)
    private By cartIcon = By.className("shopping_cart_link");

    // Selector for cart badge (shows number of items in cart)
    private By cartBadge = By.className("shopping_cart_badge");

    public InventoryPage(WebDriver driver) {
        this.driver = driver;
    }

    public void addBackpackToCart() {
        driver.findElement(addBackpackButton).click();
    }

    public void addBikeLightToCart() {
        driver.findElement(addBikeLightButton).click();
    }

    public void addBoltTShirtToCart() {
        driver.findElement(addBoltTShirtButton).click();
    }

    public void addFleeceJacketToCart() {
        driver.findElement(addFleeceJacketButton).click();
    }

    public void addOnesieToCart() {
        driver.findElement(addOnesieButton).click();
    }

    public void addRedTShirtToCart() {
        driver.findElement(addRedTShirtButton).click();
    }

    // Method to navigate to the cart page by clicking the cart icon
    public void goToCart() {
        driver.findElement(cartIcon).click();
    }

    // Returns the number shown in the cart badge (number of items in cart)
    public String getCartBadgeCount() {
        if (driver.findElements(cartBadge).size() > 0) {
            return driver.findElement(cartBadge).getText();
        } else {
            return "0";
        }
    }
}
