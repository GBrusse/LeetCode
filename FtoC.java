public class FtoC { //C = (°F - 32) × 5/9
    public static void main (String []args) {
        float f = Float.parseFloat(args[0]);

        double c = ((f - 32.0) * (5.0/9.0));

        System.out.println(c);
    }

}
