import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class TestOrderInformation {
    @Test
    public void testOrderInformation(){
        OrderInformation order = new OrderInformation();

        order.setCustomerName("Sultan");
        order.setGiftCardID(1234);
        order.setOrderInformaion("American Coffee");
        order.setReceiptInformation(1234656);

        assertEquals("Sultan", order.getCustomerName());
        assertEquals(1234, order.getGiftCardID());
        assertEquals("American Coffee", order.getOrderInformaion());
        assertEquals(1234656, order.getReceiptInformation());

    }

    @Test
    public void testCreateOrderInformation(){
        OrderInformation order = new OrderInformation();
    }
}
