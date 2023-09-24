package classwork.chapter7;

public class Stack2 {
  private  int stck[];
    private int tos;

    Stack2(int size) {

        stck = new int[size];
        tos = -1;
    }
     void push(int item) {
        if(tos==9){
            System.out.println("Stack is full");
        }
        stck[++tos]=item;
    }
    int pop(){
        if (tos<0){
            System.out.println("Stack is empty");

        }return stck[tos--];
    }

}
