package classwork.chapter14;

public class MyClass <T extends Comparable<T>> implements MinMax<T>{
    T[] vals;
    MyClass(T[] o){
        vals=o;}
        public T min(){
            T v = vals[0];
            for(int i=0;i<vals.length;i++)
                if(vals[i].compareTo(v)<0)v=vals[i];
            return v;
        }


        public T max() {
            T v = vals[0];
            for (int i = 0; i < vals.length; i++)
                if (vals[i].compareTo(v) > 0) v = vals[i];
            return v;

        }

            }
            class GenIfDemo{
                public static void main(String[] args) {
                    Integer inums[]={3,6,2,8,6};
                    Character chs[]={'b','r','p','v'};
                    MyClass <Integer> iOb=new MyClass<Integer>(inums);
                    MyClass <Character> cOb=new MyClass<Character>(chs);
                    System.out.println(iOb.min());
                    System.out.println(iOb.max());
                    System.out.println(cOb.max());
                    System.out.println(cOb.min());
                }
            }


