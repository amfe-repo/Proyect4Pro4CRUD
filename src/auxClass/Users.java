package auxClass;

/**
 *
 * @author Akme
 */
public class Users {

    private int id;
    private String name;
    private String lastName;
    private String userName;
    private String phone;
    private String email;

    
    private String password;
    
    public Users(int id, String name, String lastName, String userName, String phone, String email, String password) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.userName = userName;
        this.phone = phone;
        this.email = email;
        this.password = password;
    }
    
    public String getPassword() {
        return password;
    }
    
    public int getId() {
        return id;
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
