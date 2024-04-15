public class CtoF {
    public static void main (String []args){
        System.out.println(convert(Float.parseFloat(args[0])));
    }
    
    public static double convert (float c) {
        return ((9.0/5.0) * c) + 32.0;
    }
}