package classwork.chapter9.p2;

import classwork.chapter9.p1.Protection;

class Protection2 extends Protection {
    Protection2(){
        System.out.println("Konst from another package.");
        System.out.println(n_pro);
        System.out.println(n_pub);
    }
}
