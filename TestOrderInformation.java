import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.Test;

public class TestOrderInformation {
    @Test
    public void testCrerateOrderInformationInstance(){ // existing test    }

    @Test
    public void testOrderInformation(){
        OrderInformation orderInfo = new OrderInformation();

        orderInfo.setCustomerName("Sultan");
        orderInfo.setDrinkDescription("caramel-macchiato-with-extra-shot-of-blond-espresso");
        orderInfo.setGiftCardNumber(1234);
        orderInfo.setPreferredStoreNumber(88339);

        assertEquals(orderInfo.getCustomerName(), "Sultan");
        assertEquals(orderInfo.getDrinkDescription(),
         "caramel-macchiato-with-extra-shot-of-blond-espresso");
        assertEquals(orderInfo.getGiftCardNumber(), 1234);
        assertEquals(orderInfo.getPreferredStoreNumber(), 88339);


    }
}
