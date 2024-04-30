class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0)
            return 0;

        int insertPos = 1;  // Position to insert unique elements
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {  // If current element is different from previous
                nums[insertPos] = nums[i];
                insertPos++;
            }
        }

        return insertPos;
    }

    // Test cases
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums1 = {1, 1, 2};
        System.out.println(solution.removeDuplicates(nums1));  // Output: 2, nums1 = [1, 2, _]

        int[] nums2 = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        System.out.println(solution.removeDuplicates(nums2));  // Output: 5, nums2 = [0, 1, 2, 3, 4, _, _, _, _, _]
    }
}
