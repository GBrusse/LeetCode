public class triplets {
    public static void main (String []args){

        int[] a = {1,2,3}; //initializes int array a
        int[] b = {3,2,1}; //initializes int array b

        int[] result = compareTriplets(a, b); //calls the 'compareTriplets' method with arrays 'a' and 'b'

        System.out.println("Alice's score: " + result[0]);
        System.out.println("Bob's score: " + result[1]);

    }

    public static int[] compareTriplets(int[] a, int[] b) {
        int[] result = {0,0}; //initializes the result array with both values set to 0 points
            for(int i = 0; i < 3; i++) {
                if(a[i] > b[i]) { //compare the 'i'th elements of the arrays 'a' and 'b'.
                    result[0] +=1;
                } else if (a[i] < b[i]) {
                    result[1] +=1;
                }
            }
        return result;
    }
}
