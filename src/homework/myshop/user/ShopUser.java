package homework.myshop.user;

public class ShopUser {
    private String id;
    private String name;
    private String email;
    private String password;
    private User type;

    public ShopUser() {
    }
    public ShopUser(String name) {
    }

    public ShopUser(String name, String id, String email, String password,User type) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
        this.type = type;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public User getType() {
        return type;
    }

    public void setType(User type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "ShopUser{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", type=" + type +
                '}';
    }
}
