package utils;

/**
 * Utility class to store and retrieve user data during test execution
 * This allows data created in one scenario to be used in subsequent scenarios
 */
public class UserDataStore {
    private static UserDataStore instance;
    private String registeredUserEmail;
    private String registeredFirstName;
    private String registeredLastName;
    private String registeredPassword;

    private UserDataStore() {
    }

    /**
     * Get singleton instance of UserDataStore
     */
    public static UserDataStore getInstance() {
        if (instance == null) {
            instance = new UserDataStore();
        }
        return instance;
    }

    /**
     * Store the registered user's email
     */
    public void setRegisteredUserEmail(String email) {
        this.registeredUserEmail = email;
        System.out.println("✓ Stored registered user email: " + email);
    }

    /**
     * Get the registered user's email
     */
    public String getRegisteredUserEmail() {
        return this.registeredUserEmail;
    }

    /**
     * Store the registered user's first name
     */
    public void setRegisteredFirstName(String firstName) {
        this.registeredFirstName = firstName;
    }

    /**
     * Get the registered user's first name
     */
    public String getRegisteredFirstName() {
        return this.registeredFirstName;
    }

    /**
     * Store the registered user's last name
     */
    public void setRegisteredLastName(String lastName) {
        this.registeredLastName = lastName;
    }

    /**
     * Get the registered user's last name
     */
    public String getRegisteredLastName() {
        return this.registeredLastName;
    }

    /**
     * Store the registered user's password
     */
    public void setRegisteredPassword(String password) {
        this.registeredPassword = password;
    }

    /**
     * Get the registered user's password
     */
    public String getRegisteredPassword() {
        return this.registeredPassword;
    }

    /**
     * Clear all stored user data (useful for test cleanup)
     */
    public void clearAllData() {
        this.registeredUserEmail = null;
        this.registeredFirstName = null;
        this.registeredLastName = null;
        this.registeredPassword = null;
        System.out.println("✓ Cleared all stored user data");
    }
}

