public class ArrayShift {
    public static void shiftArray(int[] nums, int n) {
        int length = nums.length;
        if (length == 0 || n <= 0) {
            return; // No need to shift
        }

        // Normalize shift amount to handle shifts larger than array length
        n = n % length;
        
        // Reverse the entire array
        reverse(nums, 0, length - 1);
        
        // Reverse the first n elements
        reverse(nums, 0, n - 1);
        
        // Reverse the remaining elements
        reverse(nums, n, length - 1);
    }

    // Helper function to reverse the elements in the specified range of the array
    private static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        int shiftAmount = 3;
        
        System.out.println("Original array:");
        printArray(nums);

        shiftArray(nums, shiftAmount);

        System.out.println("\nArray after shifting " + shiftAmount + " positions:");
        printArray(nums);
    }

    public static void printArray(int[] nums) {
        for (int num : nums) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
