package homework.employee;

public class EmployeeStorage {
    private Employee[] men = new Employee[10];
    private int size;

    public void add(Employee employee) {
        if (size == men.length) {
            extend();
        }
        men[size++] = employee;

    }

    public void searchById(String keyWord) {
        for (int i = 0; i < size; i++) {
            if (men[i].getEmployeeId().contains(keyWord)) {
                System.out.println(men[i].getName() + " " + men[i].getSurname() +
                        " " + men[i].getCompany() + " " + men[i].getPosition() + " " + men[i].getSalary() + " ");
            }

        }

    }

    public void deleteById(String keyword) {
        for (int i = 0; i < size; i++) {
            if (men[i].getEmployeeId().contains(keyword)) {
                Employee tmp = men[i];
                men[i] = men[i + 1];
                men[i + 1] = tmp;
                System.out.println(tmp);
            }
        }
        size--;

    }

    public void changeById(String keyword) {
        for (int i = 0; i < size; i++) {
            if (men[i].getEmployeeId().contains(keyword)) {
                System.out.println(men[i].getName() + " " + men[i].getSurname() +
                        " " + men[i].getCompany() + " " + men[i].getPosition() + " " + men[i].getSalary() + " ");

            }

        }


    }

    public void searchByCompany(String keyWord) {
        for (int i = 0; i < size; i++) {
            if (men[i].getCompany().contains(keyWord)) {
                System.out.println(men[i].getName() + " " + men[i].getSurname() +
                        " " + men[i].getCompany() + " " + men[i].getPosition() + " " + men[i].getSalary() + " ");
            }
        }

    }

    public void print() {
        if(size==0){
            System.out.println("List is empty.");
        }

        for (int i = 0; i < size; i++) {
            System.out.println(men[i].getName() + " " +
                    men[i].getSurname() + " " + men[i].getCompany() + " " + men[i].getEmployeeId() + " " +
                    men[i].getCompany() + " " + men[i].getPosition() + " ");
        }

    }


    private void extend() {
        Employee[] tmp = new Employee[men.length + 10];
        System.arraycopy(men, 0, tmp, 0, men.length);
        men = tmp;
    }

}
