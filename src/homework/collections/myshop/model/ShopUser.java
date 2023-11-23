package homework.collections.myshop.model;

import homework.myshop.enums.UserType;

import java.io.Serializable;
import java.util.Objects;

public class ShopUser implements Serializable {
    private String id;
    private String name;
    private String email;
    private String password;
    private UserType type;

    public ShopUser() {
    }
    public ShopUser(String name) {
    }

    public ShopUser(String name, String id, String email, String password,UserType type) {
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

    public UserType getType() {
        return type;
    }

    public void setType(UserType type) {
        this.type = type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ShopUser shopUser = (ShopUser) o;
        return Objects.equals(id, shopUser.id) &&
                Objects.equals(name, shopUser.name) &&
                Objects.equals(email, shopUser.email) &&
                Objects.equals(password, shopUser.password) &&
                type == shopUser.type;
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, name, email, password, type);
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

