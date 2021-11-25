import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

class DatabaseTest {
    @Test
    public void mustReturnName() {
        Database.getDatabase().setConnection("192.158.1.38");
        assertEquals("192.158.1.38", Database.getDatabase().getConnection());
    }


    @Test
    public void mustReturnPassword() {
        Database.getDatabase().setPassword("e8o*0f6blL!y4^VL");
        assertEquals("e8o*0f6blL!y4^VL", Database.getDatabase().getPassword());
    }
}