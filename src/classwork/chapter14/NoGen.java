package classwork.chapter14;

public class NoGen {
    int num;
    NoGen(int i){
       num=i;
    }
    int getnum(){
        return num;
    }
}
class Genn<T> extends NoGen{
    T ob;
    Genn(T o, int i){
        super(i);
        ob=o;
    }
    T getob(){
        return ob;
    }
}

   class HierDemo2{
       public static void main(String[] args) {
           Genn<String> w= new Genn<String>("Wellcome",99);
           System.out.print(w.getob()+" ");
           System.out.println(w.getnum());
       }
   }