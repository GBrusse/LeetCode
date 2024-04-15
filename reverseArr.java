public class reverseArr {
    public static void main (String []args){
        //take in string on ints and reverse the order of the array

        String[] arr = {"sit", "stay", "roll over", "shake", "turn"};
        String[] newArr = reverse(arr);

        for(String str: newArr) {
            System.out.println(str);
        }

    }
    public static String[] reverse (String[] arr) {
        String[] result = new String[arr.length];

        for(int i = 0; i < arr.length; i++) {
            result[i] = arr[arr.length-i-1];
        }
        return result;
    }
}
