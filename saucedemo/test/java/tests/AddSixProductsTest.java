package tests;

import org.junit.jupiter.api.Test;
import pages.InventoryPage;
import pages.LoginPage;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AddSixProductsTest extends BaseTest {

    @Test
    public void testAddSixProductsToCart() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("standard_user", "secret_sauce");

        InventoryPage inventoryPage = new InventoryPage(driver);

        // Add all 6 products
        inventoryPage.addBackpackToCart();
        inventoryPage.addBikeLightToCart();
        inventoryPage.addBoltTShirtToCart();
        inventoryPage.addFleeceJacketToCart();
        inventoryPage.addOnesieToCart();
        inventoryPage.addRedTShirtToCart();

        // Check the cart badge
        assertEquals("6", inventoryPage.getCartBadgeCount(), "❌ Nu s-au adăugat toate produsele în coș!");
        System.out.println("All 6 products have been successfully added to cart.\uD83D\uDED2\n  ");
    }
}
