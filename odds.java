public class odds {
    public static void main (String []args){
        int[] arr = {1,2,3,4,5,6,7,8,9};
        EveryOther(arr);

    }
    public static void EveryOther (int[] a) {
        for(int i = 0; i < a.length; i +=2) {
            System.out.println(a[i]);
        }
    }
}