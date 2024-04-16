public class reverseArr {
    public static void main (String []args){
        //take in string on ints and reverse the order of the array

        String[] arr = {"sit", "stay", "roll over", "shake", "turn"}; //initializes an array of strings for the program to reverse the order of
        String[] newArr = reverse(arr);//calls the 'reverse' method using 'arr' as an argument. assigns the returned array to a new array called 'newArr'.

        for(String str: newArr) {
            System.out.println(str); //this prints out each element in newArr
        }

    }
    public static String[] reverse (String[] arr) {
        String[] result = new String[arr.length]; //creates new string array called 'result' with the same length as arr

        for(int i = 0; i < arr.length; i++) { //iterates over arr
            result[i] = arr[arr.length-i-1]; //sets the index at the end of the arr array and iterate towards the beginning
        }
        return result;
    }
}
