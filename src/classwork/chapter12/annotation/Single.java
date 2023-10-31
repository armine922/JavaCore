package classwork.chapter12.annotation;

import java.lang.reflect.*;
import java.lang.annotation.*;
@Retention(RetentionPolicy.RUNTIME)
@interface MySingle{
    int value();
}


 class Single {
    @MySingle(100)

    public static void myMeth(){
       Single ob = new Single();
       try{
           Method m = ob.getClass().getMethod("myMeth");
           if(m.isAnnotationPresent(MyMarker.class))
               System.out.println("MyMarker annotation is present.");
       }catch(NoSuchMethodException exc){
           System.out.println("Method not found");
       }
    }

    public static void main(String[] args) {
        myMeth();
    }
}
