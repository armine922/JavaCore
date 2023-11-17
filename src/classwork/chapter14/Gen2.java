package classwork.chapter14;

public class Gen2<T> extends Gen<T> {
    Gen2(T o){
        super(o);

    }
}
 class HierDemo3{
     public static void main(String[] args) {
         Gen<Integer> iOb=new Gen<Integer>(99);
         Gen2<Integer> iOb2=new Gen2<Integer>(67);
         Gen2<String> sOb = new Gen2<String>("Hello");
         if(iOb2 instanceof Gen2<?>)
             System.out.println("iOb2 belongs to Gen2");
         if(iOb2 instanceof Gen<?>)
             System.out.println("iOb2 belongs to Gen");
         System.out.println("---------");
         if(sOb instanceof Gen2<?>)
             System.out.println("sOb belongs to Gen2");
         if(sOb instanceof Gen<?>)
             System.out.println("sOb belongs to Gen");
         System.out.println("-----------");
         if(iOb instanceof Gen2<?>)
             System.out.println("iOb belongs to Gen2");
         if(iOb instanceof Gen<?>)
             System.out.println("iOb belongs to Gen");
         System.out.println("----------");
     }
 }