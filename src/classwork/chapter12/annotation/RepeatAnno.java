package classwork.chapter12.annotation;

import java.lang.reflect.*;
import  java.lang.annotation.*;
@Retention(RetentionPolicy.RUNTIME)
@Repeatable(MyRepeatedAnnos.class)
@interface MyAnnoo{
    String str() default"Testing";
    int val() default 9000;
}
@Retention(RetentionPolicy.RUNTIME)
@interface MyRepeatedAnnos{
   MyAnnoo[]value();
}
public class RepeatAnno {
    @MyAnnoo(str= "First annotation", val=-1)
    @MyAnnoo(str="Second annotation",val=100)
    public static void myMeth(String str,int i){
        RepeatAnno ob = new RepeatAnno();
        try{
            Class<?> c =ob.getClass();
            Method m = c.getMethod("myMeth", String.class, int.class);
            Annotation anno= m.getAnnotation(MyRepeatedAnnos.class);
            System.out.println(anno);
        }catch (NoSuchMethodException exc ){
            System.out.println("Method not found");
        }
    }

    public static void main(String[] args) {
        myMeth("Test",10);
    }
}
