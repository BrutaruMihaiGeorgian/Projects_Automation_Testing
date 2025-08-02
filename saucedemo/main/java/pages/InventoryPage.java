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

    // Selectors for menu and logout
    private By menuButton = By.id("react-burger-menu-btn");
    private By logoutLink = By.id("logout_sidebar_link");

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

    // Method to navigate to the cart page
    public void goToCart() {
        driver.findElement(cartIcon).click();
    }

    // Returns the number of items in the cart badge
    public String getCartBadgeCount() {
        if (driver.findElements(cartBadge).size() > 0) {
            return driver.findElement(cartBadge).getText();
        } else {
            return "0";
        }
    }

    // Opens menu and clicks logout
    public void openMenuAndClickLogout() {
        driver.findElement(menuButton).click();

        // Simple wait for menu to appear (consider replacing with WebDriverWait)
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        driver.findElement(logoutLink).click();
    }
}


