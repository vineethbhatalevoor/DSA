class Solution {
    public int[] buildArray(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            int oldValue = nums[i];
            int newValue = nums[nums[i]] % 1000; 

            nums[i] = oldValue + 1000 * newValue;
        }
        for (int i = 0; i < n; i++) {
            nums[i] /= 1000;
        }

        return nums;
    }
}