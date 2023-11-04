package homework.myshop.user;

public class UserStorage {
    private ShopUser users[] = new ShopUser[100];
    private int size;

    public void add(ShopUser user) {
        if (size == users.length) {
            extend();
        }
        users[size++] = user;
    }

    public void extend() {
        ShopUser[] tmp = new ShopUser[users.length * 2];
        for (int i = 0; i < size; i++) {
            System.arraycopy(users, 0, tmp, 0, users.length);
        }
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(users[i]);
        }
    }
    public User chooseType(String typestr){
        for(int i=0;i<size;i++){
            if(users[i].getType().equals(typestr)){
                System.out.println(users[i]);
            }
    }
        return null;
    }

    public void searchUserByEmailAndPassword(String email, String password) {
        for (int i = 0; i < size; i++) {
            if (users[i].getEmail().equals(email) && users[i].getPassword().equals(password)) {

                System.out.println(users[i]);

            }
        }


        }
    public void getBYType() {
        for (int i = 0; i < size; i++) {
            if (users[i].getType().equals(User.USER)) {
                System.out.println("Please input 0 to LOG OUT");
                System.out.println("Please input 1 PRINT ALL PRODUCTS ");
                System.out.println("Please input 2 to BUY A PRODUCT");
                System.out.println("Please input 3 toPRINT MY ORDERS");
                System.out.println("Please input 4 to CANCEL PRODUCT BY ID");
                }
        }
        for(int i=0;i<size;i++) {
            if (users[i].getType().equals(User.ADMIN)) {

                System.out.println("Please input 0 to LOG OUT");
                System.out.println("Please input 1 to ADD PRODUCT");
                System.out.println("Please input 2 to PRINT PRODUCTS");
                System.out.println("Please input 3 to PRINT USERS");
                System.out.println("Please input 4 to PRINT ORDERS");
                System.out.println("Please input 5 to CHANGE ORDER STATUS");
            }
        }

    }
    }


