package homework.medicalCentre;

public class Doctor extends Person {
    private String email;
    private String profession;

    public Doctor() {
    }

    public Doctor(String name, String surname) {
        super();
    }

    public Doctor(String name, String surname, String id, String phoneNumber, String email, String profession) {
        super(name, surname, id, phoneNumber);
        this.email = email;
        this.profession = profession;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Doctor{" +
                "name='" + this.getName() + '\'' +
                ", surname='" + this.getSurname() + '\'' +
                ", id='" + this.getId() + '\'' +
                ", phoneNumber='" + this.getProfession() + '\'' +
                "email='" + this.email + '\'' +
                ", profession='" + this.profession + '\'' +
                '}';


    }

}
