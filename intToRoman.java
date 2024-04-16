public class intToRoman {
    public static String main(int num){
        int[] nums = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1}; //array of ints that represent unique values for roman numerals
        String[] rom = {"M", "CM", "D", "CD", "C", "XC", "L","XL", "X", "IX", "V", "IV", "I"}; //those unique values of roman numerals

        String result = ""; //initialize the result string that will have the roman numerals added to it

        for(int i = 0; i < nums.length; i++){ //iterates over the 'nums' array. 'i' is the index of nums.
            for(int j = 0; j < num/nums[i]; j++){
                result += rom[i]; //appends the roman numeral at index 'i' to the result string.
            }
            num = num % nums[i]; //calculates the remainder of 'num' divided by 'nums[i]'.
        }
        return result;
    }
}
