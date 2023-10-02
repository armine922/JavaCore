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
                    es.search1(keyWord);
                    break;
                case "4":
                    System.out.println("Please input Company Name");
                    keyWord = scanner.nextLine();
                    es.search2(keyWord);
                    break;
                default:
                    System.out.println("Invalid command.Try again!");
            }
        }
    }
}
