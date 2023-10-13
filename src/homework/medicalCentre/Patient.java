package homework.medicalCentre;

public class Patient extends Person {
    private String registerDate;
    private Doctor doctor;

    public Patient() {
    }

    public Patient(String name, String surname, String id, String phoneNumber, String registerDate, Doctor doctor) {
        super(name, surname, id, phoneNumber);
        this.registerDate = registerDate;
        this.doctor = doctor;
    }

    public String getRegisterDate() {
        return registerDate;
    }

    public void setRegisterDate(String registerDate) {
        this.registerDate = registerDate;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    @Override
    public String toString() {
        return "Patient{" + "name='" + this.getName() + '\'' +
                ", surname='" + this.getSurname() + '\'' +
                ", id='" + this.getId() + '\'' +
                ", phoneNumber='" + this.getPhoneNumber() + '\'' +
                "registerDate='" + this.registerDate + '\'' +
                ", doctor=" + this.doctor +
                '}';
    }
}
