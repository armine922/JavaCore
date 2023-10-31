package classwork.chapter12.annotation;



import java.lang.reflect.*;
import java.lang.annotation.*;
@Retention(RetentionPolicy.RUNTIME)
@interface MyMarker{ }

public class Marker {
    @MyMarker
    public static void myMeth() {
        Marker ob = new Marker();
        try {Method m = ob.getClass().getMethod("myMeth");
            System.out.println("Marker annotation is present!");

    }catch (NoSuchMethodException exc ){
            System.out.println("Method not found");


            }
    }

    public static void main(String[] args) {
        myMeth();
    }
}
