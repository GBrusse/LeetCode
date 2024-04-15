public class twoArr {
    public static void main (String []args){

        int[] b = {1,5,2,17,4}; //29
        int[] a = {20,8,2}; //30

        System.out.println(LA(a,b));
    }

    public static String LA (int[] a, int[] b) {
        int aSum = 0;
        int bSum = 0;
        String la = "neither";

        for(int i = 0; i < a.length; i++) {
            aSum += a[i];
        }
        for(int j = 0; j < b.length; j++) {
            bSum += b[j];
        }
        if(aSum > bSum) {
            return "The array 'a' has the larger sum";
        } else if(aSum < bSum) {
            return "The array 'b' has the larger sum";
        }else return "The arrays have the same sum";
    }


}
