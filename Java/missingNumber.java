public class missingNumber{
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int expectedSum = n * (n + 1) / 2;
        int actualSum = 0; 
        
        for (int num : nums) {
            actualSum += num;
        }
        return expectedSum - actualSum;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        
        int[] nums1 = {3, 0, 1};
        int[] nums2 = {0, 1};
        int[] nums3 = {9, 6, 4, 2, 3, 5, 7, 0, 1};

        System.out.println("Output for nums1: " + solution.missingNumber(nums1));
        System.out.println("Output for nums2: " + solution.missingNumber(nums2)); 
        System.out.println("Output for nums3: " + solution.missingNumber(nums3)); 
    }
}
