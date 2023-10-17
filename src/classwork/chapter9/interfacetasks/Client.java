package classwork.chapter9.interfacetasks;

public class Client implements Callback {
    public void callback(int p){
        System.out.println("Metghod callback as " + p);
    }
    void nonIfaceMeth(){
        System.out.println("accept interface methods class can also have another methods.");
    }
}
