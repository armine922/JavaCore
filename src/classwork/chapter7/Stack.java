package classwork.chapter7;

public class Stack {
    private int stck[] = new int[10];
    private int tos;

    Stack() {
        tos = -1;
    }

    public void push(int item) {
        if (tos == 9) {
            System.out.println("Stack is full");
        }
        stck[++tos] = item;
    }

    public int pop() {
        if (tos < 0) {
            System.out.println("Stack is empty");
            return 0;
        } else
            return stck[tos--];
    }
}
