package classwork.chapter3;

public class Light {
    public static void main(String[] args) {
        int lightspeed;
        long days;
        long seconds;
        long distance;
        days=1000;
        seconds = 1000*24*60*60;
        lightspeed = 186000;
        distance = lightspeed * seconds;
        System.out.print("The light goes about " + distance);
        System.out.print(" miles ");
        System.out.println(" in " + days + " days " );
    }
}
