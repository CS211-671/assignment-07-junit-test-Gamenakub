package ku.cs.models;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {

    @Test
    @DisplayName("Password should not store in plain text")
    public void testPasswordIsNotStoreInPlainText() {
        User user = new User("user01", "plain-p@ssw0rd");
        String actual = user.getPassword();
        String unexpected = "plain-p@ssw0rd";
        assertNotEquals(unexpected, actual);
    }

    @Test
    @DisplayName("Password should be verified by plain text")
    public void testPasswordShouldBeVerified() {
        User user = new User("user01", "plain-p@ssw0rd");
        boolean actual = user.validatePassword("plain-p@ssw0rd");
        assertTrue(actual);
    }

    @Test
    public void testSetPassword() {
        User user = new User("user01", "plain-p@ssw0rd");
        user.setPassword("notplain-p@ssw0rd");
        boolean actual = user.validatePassword("notplain-p@ssw0rd");
        assertTrue(actual);
    }

    @Test
    public void testIsUsername() {
        User user = new User("user01", "plain-p@ssw0rd");
        boolean actual = user.isUsername("user01");
        assertTrue(actual);
    }
}