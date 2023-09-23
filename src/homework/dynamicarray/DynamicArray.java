package homework.dynamicarray;

public class DynamicArray {

    //սա մեր հիմնական մասիվն է, որտեղ պահելու ենք ավելացվող էլեմենտները
    private int[] array = new int[10];
    //սա մեր մասիվի մեջ ավելացված էլեմենտների քանակն է
    private int size = 0;

    //ստուգել եթե մասիվի մեջ տեղ չկա-> կանչել extend()
    //և ավելացնենք
    public void add(int value) {
        if (size == array.length) {
            this.extend();
        }
        array[size++] = value;
    }

    //1․ ստեղծել հին մասիվից 10 էլեմենտ ավելի մեծ մասիվ
    //2․ քցել հին մասիվի էլեմենտները նորի մեջ
    //3․ հին մասիվի հղումը կապենք նոր մասիվի հղման հետ։
    private void extend() {
        int newLength = (array.length + 10);
        int newArr[] = new int[newLength];
        for (int i = 0; i < size; i++) {
            newArr[i] = array[i];
        }
        array = newArr;

    }

    //եթե տրված ինդեքսը մեր ունեցած մասիվի ինդեքսի սահմաններում է, վերադարձնել
    // մասիվի index-երրորդ էլեմենտը։ Հակառակ դեպքում վերադարձնել -1։
    public int getByIndex(int index) {
        if (index >= size || index < 0) {
            System.out.println("Array index error");
            return 0;
        }
        return array[index];
    }

    //տպել մասիվի ավելացված էլեմենտները
    public void print() {
        if (size > 0) {
            for (int i = 0; i < size; i++) {
                System.out.print(array[i] + "|");
            }

        }
        System.out.println();

    }

    //ջնջել մասիվի index-երորդ էլեմենտը
//եթե չկա նման ինդեքսով էլեմենտ, տպել, որ չկա նման էլեմենտ
    public void deleteByIndex(int index) {

        int value = this.array[index];
        for (int i = index + 1; i < this.size; i++) {
            array[i - 1] = array[i];

        }
        this.size--;
        if (index >= array.length || index < 0) {
            System.out.println("Array index error");

        }
    }


    //տրված value-ն դնելու ենք տրված index-ով էլեմենտի տեղը։
//Հին արժեքը կկորի
//եթե նման ինդեքսով էլեմենտ չկա, գրում ենք որ չկա։
    public void set(int index, int value) {
        array[index] = value;
        if (index >= array.length || index < 0) {
            System.out.println("Array index error");
        }
    }

    //ավելացնել տրված value-ն տրված ինդեքսում, իսկ էղած էլեմենտները մի հատ աջ տանել։
//Եթե չկա նման ինդեքս, տպել որ չկա
    public void add(int index, int value) {
        for (int i = size - 1; i >= index; i--) {
            array[i + 1] = array[i];
        }

        array[index] = value;
        this.size++;
        if (index >= size || index < 0) {
            System.out.println("Array index error");
        }
    }

    //Վերադարձնել true եթե տրված value-ն կա մեր մասիվի մեջ, եթե ոչ false
    public boolean exists(int value) {
        for (int i = 0; i < size; i++) {

            if (array[i] == value) {

                array[i] = value;
                return true;
            }


        }
        return false;
    }

    //Վերադարձնել տրված value-ի ինդեքսը, եթե շատ կա տվյալ թվից, վերադարձնել առաջին ինդեքսը։
//եթե չկա, -1
    public int getIndexByValue(int value) {
        for (int i = 0; i < size; i++) {

            if (array[i] == value) {
                array[i] = value;
                System.out.println(i + " ");
                break;
            }

        }
        return 0;


    }
}
