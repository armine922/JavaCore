package classwork.chapter8;

public class Shipment extends BoxWeight1 {
    double cost;

    Shipment(Shipment ob) {
        super(ob);
        cost = ob.cost;
    }

    Shipment(double w, double h,
             double d, double c, double m) {
        super(w, h, d, m);
        cost = c;
    }

    Shipment(double len, double m, double c) {
        super(len, m);
    }

    Shipment() {
        super();
        cost = -1;
    }

}
