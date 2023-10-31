package classwork.chapter12.annotation;
import java.lang.reflect.*;
import java.lang.annotation.*;
 @Retention(RetentionPolicy.RUNTIME)



public @interface MyAno {
     String str() default "Testing";
     int val() default 999;
}

class Metta{
     @MyAno()
    public  static void myMeth(){
         Metta ob = new Metta();
         try{
             Class<?> c=ob.getClass();
             Method m = c.getMethod("myMeth");
             MyAno ano= m.getAnnotation(MyAno.class);
             System.out.println(ano.str()+" "+ ano.val());
         }catch (NoSuchMethodException exc){
             System.out.println("Method not found");
         }
     }

    public static void main(String[] args) {
        myMeth();
    }
}