package inheritance;

import org.junit.Test;
import static org.junit.Assert.*;

public class ShopTest {
    @Test public void testShopConscturctor(){
        Shop newShop = new Shop("Wendy's Bike Shop", "Kind staff and great service", 3);
        assertEquals("name should be Wendy's Bike Shop", "Wendy's Bike Shop", newShop.name);
    }

    @Test public void testShopString() {
        Shop newShop = new Shop("Wendy's Bike Shop", "Kind staff and great service", 3);
        assertEquals("Here is the result of toString.", "Name: Wendy's Bike Shop Description: Kind staff and great service Price: 3", newShop.toString());
    }
}