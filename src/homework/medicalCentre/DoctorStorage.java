package homework.medicalCentre;

public class DoctorStorage {
    private Doctor doctors[] = new Doctor[10];
    private int size;

    public void add(Doctor doctor) {
        if (size == doctors.length) {
            extend();
        }
        doctors[size++] = doctor;
    }

    private void extend() {
        Doctor[] tmp = new Doctor[doctors.length + 10];
        System.arraycopy(doctors, 0, tmp, 0, doctors.length);
        doctors = tmp;
    }

    public void searchDoctorByProfession(String profession) {
        if (size == 0) {
            System.out.println("List is empty.");

        }
        for (int i = 0; i < size; i++) {
            if (doctors[i].getProfession().equals(profession)) {
                System.out.println(doctors[i]);
            }
        }

    }

    public void deleteById(String id) {
        int indexById = getIndexById(id);
        searchDoctorById(id);
        if (indexById == -1) {
            System.out.println("Doctor does not exist!");
            return;
        }
        for (int i = indexById + 1; i < size; i++) {
            doctors[i - 1] = doctors[i];
        }
        size--;
    }

    Doctor searchDoctorById(String id) {
        if (size == 0) {
            System.out.println("List is empty.");
        }
        for (int i = 0; i < size; i++) {
            if (doctors[i].getId().equals(id)) {
                return doctors[i];
            }
        }
        return null;
    }


    Doctor getByName(String name, String surname) {
        for (int i = 0; i < size; i++) {
            if (doctors[i].getName().equals(name) || doctors[i].getSurname().equals(surname)) {
                return doctors[i];
            }
        }
        return null;

    }


    private int getIndexById(String id) {
        for (int i = 0; i < size; i++) {
            if (doctors[i].getId().equals(id)) {
                return i;
            }
        }
        return -1;
    }

    public void print() {
        if (size == 0) {
            System.out.println("List is empty.");
        }
        for (int i = 0; i < size; i++) {
            System.out.println(doctors[i]);
        }
    }

}
