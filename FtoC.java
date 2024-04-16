public class FtoC { //C = (°F - 32) × 5/9
    public static void main (String []args) {
        float f = Float.parseFloat(args[0]); // retrieves the first command-line argument

        double c = ((f - 32.0) * (5.0/9.0)); //does the math on said argument

        System.out.println(c); //prints out said argument that math was done upon
    }

}
