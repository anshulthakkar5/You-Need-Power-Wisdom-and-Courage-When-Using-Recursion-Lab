package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void appHasAGreeting() {
        App classUnderTest = new App();
        assertNotNull(classUnderTest.getGreeting(), "app should have a greeting");
    }

    @Test
    void testPower() {
        App app = new App();
        assertEquals(16, app.power(2,4));
    }

    @Test
    void testWisdom() {
        App app = new App();
        assertEquals(15, app.wisdom(5));
    }

    @Test
    void testCourage() {
        App app = new App();
        assertEquals(120, app.courage(5));
    }
}
