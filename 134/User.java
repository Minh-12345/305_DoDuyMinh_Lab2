public class User {
    private String userID;
    private String password;
    private String email;
    private String userType;

    public User(String userID, String password, String email, String userType) {
        this.userID = userID;
        this.password = password;
        this.email = email;
        this.userType = userType;
    }

    public void createUser() {
        System.out.println("User " + userID + " has been created.");
    }

    public void resetPassword(String newPassword) {
        this.password = newPassword;
        System.out.println("Password has been reset.");
    }

    
    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    public String getUserType() {
        return userType;
    }
}
