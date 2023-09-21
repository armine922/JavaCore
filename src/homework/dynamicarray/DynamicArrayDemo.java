package homework.dynamicarray;

public class DynamicArrayDemo {
    public static void main(String[] args) {


        DynamicArray da = new DynamicArray();
        da.print();
        da.add(5);
        da.add(7);
        da.add(8);
        da.add(8);
        da.add(18);
        da.add(3);
        da.print();

        da.deleteByIndex(2);
        da.print();
        da.add(0, 1);
        da.print();
        da.exists(3);

        da.getIndexByValue(4);


    }
}