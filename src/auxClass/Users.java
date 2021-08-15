package auxClass;

/**
 *
 * @author Akme
 */
public class Users {

    private String name;
    private String lastName;
    private String userName;
    private String phone;
    private String email;
    
    public Users(String name, String lastName, String userName, String phone, String email) {
        this.name = name;
        this.lastName = lastName;
        this.userName = userName;
        this.phone = phone;
        this.email = email;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    
    
    
    
}
