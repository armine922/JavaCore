package homework.medicalCentre;

public class PatientStorage {
    private Patient patients[] = new Patient[10];
    private int size;

    public void add(Patient patient) {
        if (size == patients.length) {
            extend();
        }
        patients[size++] = patient;
    }

    public void extend() {
        Patient[] tmp = new Patient[patients.length + 10];
        System.arraycopy(patients, 0, tmp, 0, patients.length);

    }

    public void printByDoctor(Doctor doc) {
        for (int i = 0; i < size; i++) {
            if (patients[i].getDoctor().equals(doc)) {
                System.out.println(patients[i]);
            }
        }
    }

    public void printAll() {
        for (int i = 0; i < size; i++) {
            System.out.println(patients[i]);
        }
    }

    public Patient getById(String id) {
        for (int i = 0; i < size; i++) {
            if (patients[i].getId().equals(id)) {
                return patients[i];
            }
        }
        return null;
    }

}
