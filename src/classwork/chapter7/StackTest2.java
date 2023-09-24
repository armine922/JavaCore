package classwork.chapter7;

public class StackTest2 {
    public static void main(String[] args) {


    Stack2 mystack1 =new Stack2(5);
    Stack2 mystack2 =new Stack2(8);
    for(int i=0;i<5;i++) mystack1.push(i);
    for(int i=0;i<8;i++) mystack2.push(i);
        System.out.println("Mystack1 include");
        for(int i=0;i<5;i++)
            System.out.println(mystack1.pop());
        System.out.println("Mystack2 includes");
        for(int i=0;i<8;i++)
            System.out.println(mystack2.pop());
}}
