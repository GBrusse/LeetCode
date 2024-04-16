public class odds {
    public static void main (String []args){
        int[] arr = {1,2,3,4,5,6,7,8,9}; //creates an array of integers for the program to use.
        EveryOther(arr); //calls the method called "EveryOther"

    }
    public static void EveryOther (int[] a) {
        for(int i = 0; i < a.length; i +=2) { //iterates through the array 'a'. increments by 2 places each time.
            System.out.println(a[i]); //prints out the element at index 'i'
        }
    }
}