package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class BookingAPITests extends BaseTest {

    @Test
    public void testUserRegistration() {
        boolean result = service.registerUser("user123");
        Assert.assertTrue(result);
    }

    @Test
    public void testBookingValidRoom() {
        service.registerUser("user456");
        boolean result = service.bookRoom("user456", "101");
        Assert.assertTrue(result);
    }

    @Test
    public void testDoubleBookingSameRoom() {
        service.registerUser("user789");
        service.bookRoom("user789", "102");
        boolean result = service.bookRoom("user789", "102");
        Assert.assertFalse(result);
    }

    @Test
    public void testBookingInvalidRoom() {
        service.registerUser("user321");
        boolean result = service.bookRoom("user321", "999");
        Assert.assertFalse(result);
    }

    @Test
    public void testGetAvailableRooms() {
        service.registerUser("user654");
        service.bookRoom("user654", "103");
        Assert.assertFalse(service.getAvailableRooms().contains("103"));
    }

    @Test
    public void testGetUserBookings() {
        service.registerUser("user777");
        service.bookRoom("user777", "102");
        Assert.assertTrue(service.getUserBookings("user777").contains("102"));
    }
}
