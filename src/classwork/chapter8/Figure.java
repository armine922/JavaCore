package classwork.chapter8;

import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;

public class Figure {
    double dim1;
    double dim2;
    Figure(double a,double  b){
      dim1=a;
      dim2=b;
    }
    double area(){
        System.out.println("Area is not defined");
        return 0;
    }
}
