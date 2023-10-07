package homework.employee;

import java.util.Scanner;

public class EmployeeDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        EmployeeStorage es = new EmployeeStorage();
        boolean isRun = true;
        while (isRun) {
            System.out.println("Input 0 to EXIT");
            System.out.println("Input 1 to ADD EMPLOYEE");
            System.out.println("Input 2 to PRINT ALL EMPLOYEE");
            System.out.println("Input 3 to SEARCH EMPLOYEE BY ID");
            System.out.println("Input 4 to SEARCH EMPLOYEE BY COMPANY NAME");
            System.out.println("Input 5 to DELETE EMPLOYEE BY ID");
            System.out.println("Input 6 to CHANGE EMPLOYEE BY ID");
            String command = scanner.nextLine();
            switch (command) {
                case "0":
                    isRun = false;
                    break;
                case "1":
                    System.out.println("Please input employee's name");
                    String name = scanner.nextLine();
                    System.out.println("Please input employee's surname");
                    String surname = scanner.nextLine();
                    System.out.println("Please input employee's ID");
                    String employeeId = scanner.nextLine();
                    System.out.println("Please input the count of salary");
                    double salary = Double.parseDouble(scanner.nextLine());
                    System.out.println("Please input the name of company");
                    String company = scanner.nextLine();
                    System.out.println("Please input employee's position");
                    String position = scanner.nextLine();
                    Employee employee = new Employee(name, surname, employeeId, salary, company, position);
                    es.add(employee);
                    System.out.println("Employee exists");
                    break;
                case "2":
                    System.out.println("Input 2 for Employees list");
                    es.print();
                    break;
                case "3":
                    System.out.println("Please input employeeId.");
                    String keyWord = scanner.nextLine();
                    es.searchById(keyWord);

                    break;
                case "4":
                    System.out.println("Please input Company Name");
                    keyWord = scanner.nextLine();
                    es.searchByCompany(keyWord);
                    break;
                case "5":
                    System.out.println("Please input ID to delete Employee ");
                    keyWord = scanner.nextLine();
                    es.deleteById(keyWord);
                    System.out.println("EMPLOYEE DELETED");
                    break;
                case "6":
                    System.out.println("Please input Id to change data");
                    keyWord = scanner.nextLine();
                    es.searchById(keyWord);
                    es.deleteById(keyWord);
                    System.out.println("Please input employee's name");
                    name = scanner.nextLine();
                    System.out.println("Please input employee's surname");
                    surname = scanner.nextLine();
                    System.out.println("Please input employee's ID");
                    employeeId = scanner.nextLine();
                    System.out.println("Please input the count of salary");
                    salary = Double.parseDouble(scanner.nextLine());
                    System.out.println("Please input the name of company");
                    company = scanner.nextLine();
                    System.out.println("Please input employee's position");
                    position = scanner.nextLine();
                    employee = new Employee(name, surname, employeeId, salary, company, position);
                    es.add(employee);
                    System.out.println("Employee changed");
                    break;
                default:
                    System.out.println("Invalid command.Try again!");
            }
        }
    }
}
