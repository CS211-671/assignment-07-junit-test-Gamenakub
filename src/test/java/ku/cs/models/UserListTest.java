package ku.cs.models;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserListTest {

    @Test
    @DisplayName("User should be found in UserList")
    public void testUserListFindUser() {
        // TODO: add 3 users to UserList
        UserList users = new UserList();
        users.addUser("wannabegame", "HiHi__9634");
        users.addUser("thapython", "SunLoveGame-2547");
        users.addUser("pwt_keam", "Keam@29102547");
        // TODO: find one of them
        User user = users.findUserByUsername("wannabegame");
        // TODO: assert that UserList found User
        String expected = "wannabegame";
        String actual = user.getUsername();
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("User can change password")
    public void testUserCanChangePassword() {
        // TODO: add 3 users to UserList
        UserList users = new UserList();
        users.addUser("wannabegame", "HiHi__9634");
        users.addUser("thapython", "SunLoveGame-2547");
        users.addUser("pwt_keam", "Keam@29102547");
        // TODO: change password of one user
        users.changePassword("pwt_keam", "Keam@29102547", "KeamL0VE-Game1st");
        // TODO: assert that user can change password
        User user = users.findUserByUsername("pwt_keam");
        assertTrue(user.validatePassword("KeamL0VE-Game1st"));
    }

    @Test
    @DisplayName("User with correct password can login")
    public void testUserListShouldReturnObjectIfUsernameAndPasswordIsCorrect() {
        // TODO: add 3 users to UserList
        UserList users = new UserList();
        users.addUser("wannabegame", "HiHi__9634");
        users.addUser("thapython", "SunLoveGame-2547");
        users.addUser("pwt_keam", "Keam@29102547");
        // TODO: call login() with correct username and password
        User user = users.login("wannabegame", "HiHi__9634");
        // TODO: assert that User object is found
        User actual = users.findUserByUsername("wannabegame");
        assertEquals(actual, user);
    }

    @Test
    @DisplayName("User with incorrect password cannot login")
    public void testUserListShouldReturnNullIfUsernameAndPasswordIsIncorrect() {
        // TODO: add 3 users to UserList
        UserList users = new UserList();
        users.addUser("wannabegame", "HiHi__9634");
        users.addUser("thapython", "SunLoveGame-2547");
        users.addUser("pwt_keam", "Keam@29102547");
        // TODO: call login() with incorrect username or incorrect password
        User user = users.login("wannabegame", "HiHi__9632");
        // TODO: assert that the method return null
        assertNull(user);
    }

    @Test
    public void testAddUser(){
        UserList users = new UserList();
        users.addUser("wannabegame", "HiHi__9634");
        User user = users.findUserByUsername("wannabegame");
        String expected = "wannabegame";
        String actual = user.getUsername();
        assertEquals(expected, actual);
    }





}