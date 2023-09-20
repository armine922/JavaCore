package homework.dynamicarray;

public class DynamicArrayDemo {
    public static void main(String[] args) {


        DynamicArray da = new DynamicArray();
        da.print();
        da.add(5);
        da.add(7);
        da.add(9);
        da.print();
        da.getByIndex(1);

    }
}