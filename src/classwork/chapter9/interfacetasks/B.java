package classwork.chapter9.interfacetasks;

public class B implements A.NestedIf {
    public boolean isNotNegative(int x){
        return x<0?false:true;
    }
}
