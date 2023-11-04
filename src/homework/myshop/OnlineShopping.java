package homework.myshop;

import java.text.ParseException;
import java.util.Date;

import homework.myshop.orders.Order;
import homework.myshop.orders.OrderStatus;
import homework.myshop.orders.OrderStorage;
import homework.myshop.orders.PaymentMethod;
import homework.myshop.product.Product;
import homework.myshop.product.ProductStorage;
import homework.myshop.product.ProductType;
import homework.myshop.user.ShopUser;
import homework.myshop.user.User;
import homework.myshop.user.UserStorage;

import java.util.Scanner;

import static homework.myshop.user.User.ADMIN;

public class OnlineShopping {

    private static Scanner scanner = new Scanner(System.in);
    private static ProductStorage ps = new ProductStorage();
    private static OrderStorage os = new OrderStorage();
    private static UserStorage us = new UserStorage();

    public static void main(String[] args) throws ParseException {
        boolean isRun = true;
        while (isRun) {
            System.out.println("Enter 0 to EXIT!");
            System.out.println("Please input 1 to REGISTER");
            System.out.println("Please input 2 to LOG IN");

            String command = scanner.nextLine();
            switch (command) {
                case "0":
                    isRun = false;
                    break;
                case "1":
                    System.out.println("Please fill the fields to REGISTER");
                    addUser();
                    break;
                case "2":
                    System.out.println("Please input email.");
                    String email = scanner.nextLine();
                    System.out.println("Please input password.");
                    String password = scanner.nextLine();
                    us.searchUserByEmailAndPassword(email, password);
                    us.getBYType();
                    String admincommand = scanner.nextLine();

                    boolean isRunAgain = true;
                    User person = User.ADMIN;
                    if (person == ADMIN) {
                        switch (admincommand) {
                            case "0":
                                isRunAgain = false;
                                break;
                            case "1":
                                System.out.println("Please enter 1 to add a product");
                                System.out.println("Please input id");
                                String id = scanner.nextLine();
                                System.out.println("Please write product name");
                                String name = scanner.nextLine();
                                System.out.println("Please give product description");
                                String description = scanner.nextLine();
                                System.out.println("Please write product price");
                                Double price = Double.parseDouble(scanner.nextLine());
                                System.out.println("Please write product stockQty");
                                Double stockQty = Double.parseDouble(scanner.nextLine());
                                String typestr = scanner.nextLine();
                                System.out.println("Please choose product type");
                                ProductType producto = ps.chooseType(typestr);
                                Product newproduct = new Product(id, name, description, price, stockQty, producto);
                                ps.add(newproduct);
                                System.out.println("Product is added!");

                                break;
                            case "2":
                                System.out.println("Enter 2 to print al products");
                                ps.print();
                                break;
                            case "3":
                                System.out.println("Please enter 3 to see all users");
                                us.print();
                                break;
                            case "4":
                                System.out.println("Please enter 4 to see all orders");
                                os.print();
                                break;
                            case "5":
                                System.out.println("Please enter 5 to se orders' status");
                                OrderStatus sold = OrderStatus.DELIVERED;
                                os.changeOrderStatus(sold);
                                break;
                        }
                        break;
                    }
                    String usercommand = scanner.nextLine();
                    person = User.USER;
                    if (person == User.USER) {
                        switch (usercommand) {
                            case "0":
                                isRunAgain = false;
                                break;
                            case "1":
                                System.out.println("Please enter 1 to print all product.");
                                ps.print();
                                break;
                            case "2":
                                System.out.println("Please enter 2 to order a product");
                                String id = scanner.nextLine();
                                String owner = scanner.nextLine();
                                ShopUser user = os.orderowner(owner);
                                String ordering = scanner.nextLine();
                                Product product = os.productbuying(ordering);
                                String datestr = scanner.nextLine();
                                Date date = new Date();
                                date = DateUtil.stringToDate(datestr);
                                double price = Double.parseDouble(scanner.nextLine());
                                String status = scanner.nextLine();
                                OrderStatus orderstatus = os.orderStatus(status);
                                double qty = Double.parseDouble(scanner.nextLine());
                                System.out.println("Please write payment method");
                                String paying = scanner.nextLine();
                                PaymentMethod paymentmethod = os.payment(paying);
                                Order neworder = new Order();
                                os.buyProduct(neworder);
                                break;
                            case "3":
                                System.out.println("Please enter 3 to print orders");
                                os.print();
                                break;
                            case "4":
                                System.out.println("Plesae enter 4 to deleate order by Id");
                                id = scanner.nextLine();
                                os.cancelOrderById(id);
                                break;

                            default:
                                System.out.println("Invalid command");
                                break;
                        }
                    }


            }
        }
    }


    private static void addUser() {
        System.out.println("Please input user's name and surname ");
        String name = scanner.nextLine();
        System.out.println("Please input user's id");
        String id = scanner.nextLine();
        System.out.println("Please input user's email");
        String email = scanner.nextLine();
        System.out.println("Please input user's password");
        String password = scanner.nextLine();
        System.out.println("Please input user's type(USER or ADMIN)");
        String typestr = scanner.nextLine();
        us.chooseType(typestr);
        User type = User.valueOf(typestr);
        ShopUser user = new ShopUser(name, id, email, password, type);
        us.add(user);
        us.print();

    }


}