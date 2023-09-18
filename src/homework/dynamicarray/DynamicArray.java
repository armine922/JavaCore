package homework.dynamicarray;

public class DynamicArray {

    //սա մեր հիմնական մասիվն է, որտեղ պահելու ենք ավելացվող էլեմենտները
    private int[] array = new int[10];
    //սա մեր մասիվի մեջ ավելացված էլեմենտների քանակն է
    private int size = 0;

    //ստուգել եթե մասիվի մեջ տեղ չկա-> կանչել extend()
    //և ավելացնենք
    public void add(int value) {
        this.extend(0);
        array[size++] = value;
    }

    //1․ ստեղծել հին մասիվից 10 էլեմենտ ավելի մեծ մասիվ
    //2․ քցել հին մասիվի էլեմենտները նորի մեջ
    //3․ հին մասիվի հղումը կապենք նոր մասիվի հղման հետ։
    private void extend(int size) {
        if (array.length + size > array.length) {
            int newLength = (array.length + 10);
            int newArr[] = new int[newLength];
            for (int i = 0; i < array.length; i++) {
                newArr[i] = array[i];
            }
            array = newArr;
        }
    }

    //եթե տրված ինդեքսը մեր ունեցած մասիվի ինդեքսի սահմաններում է, վերադարձնել
    // մասիվի index-երրորդ էլեմենտը։ Հակառակ դեպքում վերադարձնել -1։
    public int getByIndex(int index) {
        if (index < array.length) {
            return array[index];
        }
        if (index >= array.length || index < 0) {
            System.err.println("Array index error");

        }
        return -1;
    }

    //տպել մասիվի ավելացված էլեմենտները
    public void print() {
        if (array.length > 0) {
            for (int i = 0; i < array.length; i++) {
                System.out.print(array[i] + "|");
            }
            System.out.println();
        }

    }

}
