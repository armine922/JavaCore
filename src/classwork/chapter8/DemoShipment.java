package classwork.chapter8;

public class DemoShipment {
    public static void main(String[] args) {
        Shipment sh1 = new Shipment(10, 20, 15, 25, 34.56);
        Shipment sh2 = new Shipment(2, 3, 4, 0.76, 89.76);
        double vol;
        vol = sh1.volume();
        System.out.println(vol);
        System.out.println(sh1.weight);
        System.out.println(sh1.cost);
        vol = sh2.volume();
        System.out.println(vol);
        System.out.println(sh2.cost);
        System.out.println(sh2.weight);

    }
}
