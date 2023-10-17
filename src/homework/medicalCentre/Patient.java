package homework.medicalCentre;

import java.util.Date;

public class Patient extends Person {
    private Date registerDate;
    private Doctor doctor;
    private Date dateofBirthday;

    public Patient() {
    }

    public Patient(String name, String surname, String id, String phoneNumber, Date registerDate, Doctor doctor, Date dateofBirthday) {
        super(name, surname, id, phoneNumber);
        this.registerDate = registerDate;
        this.doctor = doctor;
        this.dateofBirthday = dateofBirthday;
    }

    public Date getDateofBirthday() {
        return dateofBirthday;
    }

    public void setDateofBirthday(Date dateofBirthday) {
        this.dateofBirthday = dateofBirthday;
    }

    public Date getRegisterDate() {
        return registerDate;
    }

    public void setRegisterDate(Date registerDate) {
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
                "registerDate=" + registerDate +
                ", doctor=" + doctor +
                ", dateofBirthday=" + dateofBirthday +
                '}';
    }
}
