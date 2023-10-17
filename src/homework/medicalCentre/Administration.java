package homework.medicalCentre;

import java.text.ParseException;
import java.util.Date;

import java.util.Scanner;

public class Administration {

    private static Scanner scanner = new Scanner(System.in);
    private static PatientStorage ps = new PatientStorage();
    private static DoctorStorage ds = new DoctorStorage();

    public static void main(String[] args) throws ParseException {

        boolean isRun = true;
        while (isRun) {
            printCommands();
            String command = scanner.nextLine();
            switch (command) {
                case "0":
                    isRun = false;
                    break;
                case "1":
                    System.out.println("Please input doctor's name");
                    String name = scanner.nextLine();
                    System.out.println("Please input doctor's surname");
                    String surname = scanner.nextLine();
                    System.out.println("Please input doctor's id");
                    String id = scanner.nextLine();
                    System.out.println("Please input doctor's email");
                    String email = scanner.nextLine();
                    System.out.println("Please input doctor's phonenumber");
                    String phonenumber = scanner.nextLine();
                    System.out.println("Please input doctor's profession");
                    String profession = scanner.nextLine();
                    Doctor doctor = new Doctor(name, surname, id, email, phonenumber, profession);
                    ds.add(doctor);
                    System.out.println("Doctor is added!");
                    break;
                case "2":
                    System.out.println("Please input profession to search doctor");
                    profession = scanner.nextLine();
                    ds.searchDoctorByProfession(profession);
                    break;
                case "3":
                    System.out.println("Please input id to delete the doctor");
                    id = scanner.nextLine();
                    ds.deleteById(id);
                    System.out.println("Doctor is deleted.");
                    break;
                case "4":
                    changeById();
                    break;
                case "5":
                    System.out.println("Please input patient's name");
                    name = scanner.nextLine();
                    System.out.println("Please input patient's surname");
                    surname = scanner.nextLine();
                    System.out.println("Please input patient's id");
                    id = scanner.nextLine();
                    System.out.println("Please input patient's phonenumber");
                    phonenumber = scanner.nextLine();
                    System.out.println("Please input patient's registerDate");
                    Date registerDate = new Date();
                    String registerDateStr = scanner.nextLine();
                    System.out.println("Please input patient's date of Birthday");
                    String dateofBirthdayStr = scanner.nextLine();
                    Date dateofBirthday = new Date();
                    dateofBirthday = DateUtil.stringToDate(dateofBirthdayStr);
                    ds.print();
                    System.out.println("Please choose doctor's name");
                    String doctorname = scanner.nextLine();
                    System.out.println("Please choose doctor's surname");
                    String doctorsurname = scanner.nextLine();
                    Doctor doc = ds.getByName(doctorname, doctorsurname);
                    Patient patient = new Patient(name, surname, id, phonenumber, registerDate, doc, dateofBirthday);
                    ps.add(patient);
                    System.out.println("Patient is added!");
                    break;
                case "6":
                    ds.print();
                    System.out.println("Please choose doctor's name");
                    doctorname = scanner.nextLine();
                    System.out.println("Please choose doctor's surname");
                    doctorsurname = scanner.nextLine();
                    doc = ds.getByName(doctorname, doctorsurname);
                    ps.printByDoctor(doc);
                    break;
                case "7":
                    ps.printAll();
                    break;
                default:
                    System.out.println("Invalid command!");
                    break;
            }
        }
    }


    private static void changeById() {
        System.out.println("Please input doctor's Id");
        ds.print();
        String id = scanner.nextLine();
        Doctor doc = ds.searchDoctorById(id);
        if (id == null) {
            System.out.println("Doctor doesn't exist.");
            return;
        }
        System.out.println("please input doctor's name");
        String doctorName = scanner.nextLine();
        System.out.println("please input doctor's surname");
        String doctorSurname = scanner.nextLine();
        System.out.println("please input doctor's phone");
        String doctorPhone = scanner.nextLine();
        System.out.println("please input doctor's email");
        String doctorEmail = scanner.nextLine();
        System.out.println("please input doctor's profession");
        String doctorProfession = scanner.nextLine();
        doc.setName(doctorName);
        doc.setSurname(doctorSurname);
        doc.setPhoneNumber(doctorPhone);
        doc.setEmail(doctorEmail);
        doc.setProfession(doctorProfession);
        System.out.println("Doctor updated!");


    }

    public void searchDoctorById() {
        System.out.println("Please input doctor's Id");
        String Id = scanner.nextLine();
        Doctor byId = ds.searchDoctorById(Id);

        if (byId == null) {
            System.out.println("Doctor doesn't exist");
        } else {
            System.out.println(byId);
        }
    }

    private static void printCommands() {
        System.out.println("Please input 0 to EXIT");
        System.out.println("Please input 1 to ADD Doctor");
        System.out.println("Please input 2 to SEARCH DOCTOR BY PROFESSION");
        System.out.println("Please input 3 to DELETE DOCTOR BY ID");
        System.out.println("Please input 4 to CHANGE DOCTOR BY ID");
        System.out.println("Please input 5 to ADD PATIENT");
        System.out.println("Please input 6 to PRINT ALL PATIENTS of DEFINITE DOCTOR");
        System.out.println("Please input 7 to PRINT ALL PATIENTS");


    }
}