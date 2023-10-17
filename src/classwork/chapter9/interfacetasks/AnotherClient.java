package classwork.chapter9.interfacetasks;

public class AnotherClient implements Callback {
    public void callback(int p){
        System.out.println("Another variant of method ccallback");
        System.out.println(p*p);
    }
}
