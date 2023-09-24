import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class MainTest {
    @Test
    public void testEmptyPassword() {
        assertEquals("empty_password", Main.changePassword("", "hello@123"));
    }

    @Test
    public void testLengthErrorPassword() {
        assertEquals("length_error", Main.changePassword("a", "hello@123"));
    }

    @Test
    public void testDuplicatedPassword() {
        assertEquals("duplicated_password_error", Main.changePassword("hello@123", "hello@123"));
    }

    @Test
    public void testErrorPassword() {
        assertEquals("password_error", Main.changePassword("hello123", "hello@123"));
    }

    @Test
    public void testGoodPassword() {
        assertEquals("good_password", Main.changePassword("taol@cuopday123", "hello@123"));
    }
}
