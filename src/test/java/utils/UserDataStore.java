//package utils;
//
///**
// * Utility class to store and retrieve user data during test execution
// * This allows data created in one scenario to be used in subsequent scenarios
// */
//public class UserDataStore {
//    private static UserDataStore instance;

//    private String registeredFirstName;
//    private String registeredLastName;

//
//    private UserDataStore() {
//    }
//
//    /**
//     * Get singleton instance of UserDataStore
//     */
//    public static UserDataStore getInstance() {
//        if (instance == null) {
//            instance = new UserDataStore();
//        }
//        return instance;
//    }
//
//    /**
//     * Store the registered user's email
//     */

//
//    /**
//     * Get the registered user's email
//     */
//    public String getRegisteredUserEmail() {
//        return this.registeredUserEmail;
//    }
//
//    /**
//     * Store the registered user's first name
//     */
//    public void setRegisteredFirstName(String firstName) {
//        this.registeredFirstName = firstName;
//    }
//
//    /**
//     * Get the registered user's first name
//     */
//    public String getRegisteredFirstName() {
//        return this.registeredFirstName;
//    }
//
//    /**
//     * Store the registered user's last name
//     */
//    public void setRegisteredLastName(String lastName) {
//        this.registeredLastName = lastName;
//    }
//
//    /**
//     * Get the registered user's last name
//     */
//    public String getRegisteredLastName() {
//        return this.registeredLastName;
//    }
//
//    /**
//     * Store the registered user's password
//     */

//
//    /**
//     * Get the registered user's password
//     */
//    public String getRegisteredPassword() {
//        return this.registeredPassword;
//    }
//
//    /**
//     * Clear all stored user data (useful for test cleanup)
//     */
//    public void clearAllData() {
//        this.registeredUserEmail = null;
//        this.registeredFirstName = null;
//        this.registeredLastName = null;
//        this.registeredPassword = null;
//        System.out.println("✓ Cleared all stored user data");
//    }
//}
//
package utils;

import java.util.UUID;

public class UserDataStore {

    private static String email;
    private static String password;

    private static String registeredUserEmail;
    private static String registeredUserPassword;

    // Generate a new unique user
    public static void generateNewUser() {

        String uniqueId = UUID.randomUUID().toString().substring(0, 5);

        email = "testuser" + uniqueId + "@mail.com";
        password = "Pass@" + uniqueId + "123";
    }

    // Get generated email
    public static String getEmail() {
        return email;
    }

    // Get generated password
    public static String getPassword() {
        return password;
    }

    // Store registered email
    public static void setRegisteredUserEmail(String email) {
        registeredUserEmail = email;
        System.out.println("✓ Stored registered user email: " + email);
    }

    // Store registered password
    public static void setRegisteredUserPassword(String password) {
        registeredUserPassword = password;
        System.out.println("✓ Stored registered user password: " + password);
    }

    // Get stored registered email
    public static String getRegisteredUserEmail() {
        return registeredUserEmail;
    }

    // Get stored registered password
    public static String getRegisteredUserPassword() {
        return registeredUserPassword;
    }
}