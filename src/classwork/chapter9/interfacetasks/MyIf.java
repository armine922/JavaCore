package classwork.chapter9.interfacetasks;

public interface MyIf {
    int getNumber();
    default String getString(){
        return "Object of String klass";
    }
}
