package classwork.chapter9.p1;

 class SamePackage {
    SamePackage(){
        Protection p = new Protection();
        System.out.println("Konstruction of the same package");
        System.out.println(p.n);
        System.out.println(p.n_pub);
        System.out.println(p.n_pro);

    }
}
