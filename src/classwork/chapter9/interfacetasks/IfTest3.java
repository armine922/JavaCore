package classwork.chapter9.interfacetasks;

public class IfTest3 {
        public static void main(String[] args) {
            IntStack mystack;
            DynStack ds = new DynStack(5);
            FixedStack fs= new FixedStack(8);
            mystack =ds;
            for(int i=0;i<12;i++) mystack.push(i);
            mystack=fs;
            for(int i=0;i<8;i++) mystack.push(i);
            System.out.println("Mystack1 includes");
            mystack=ds;
            for(int i=0;i<12;i++)
                System.out.println(mystack.pop());
            System.out.println("Mystack2 includes");
            mystack=fs;
            for(int i=0;i<8;i++)
                System.out.println(mystack.pop());
        }
    }



