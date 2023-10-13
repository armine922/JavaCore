package homework.medicalCentre;

public class Person {
   private String name;
   private String surname;
   private String id;
   private String phoneNumber;

    public Person() {
    }

    public Person(String name, String surname, String id, String phoneNumber) {
        this.name = name;
        this.surname = surname;
        this.id = id;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", id='" + id + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}

