package classwork.chapter8;

abstract class Abstarct {
    abstract void callme();
    void callmetoo(){
        System.out.println("This is e definite method");
    }
}
class Sub extends  Abstarct{
   void callme(){
       System.out.println("Realization of method callme in class Sub");

    }

}