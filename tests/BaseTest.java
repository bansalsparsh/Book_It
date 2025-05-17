package tests;

import backend.BookingService;
import org.testng.annotations.BeforeClass;

public class BaseTest {
    protected BookingService service;

    @BeforeMethod
    public void setUp() {
        service = new BookingService();
    }
}
