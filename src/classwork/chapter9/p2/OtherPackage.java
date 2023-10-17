package classwork.chapter9.p2;

import classwork.chapter9.p1.Protection;

class OtherPackage {
    OtherPackage(){
        Protection p = new Protection();
        System.out.println("Konstruction from another package.");
        System.out.println(p.n_pub);
    }
}
