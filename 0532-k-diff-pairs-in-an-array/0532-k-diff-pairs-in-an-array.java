class Solution {
    public int findPairs(int[] nums, int k) {
        if (k < 0) return 0;

        Arrays.sort(nums);
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) continue;

            int target = nums[i] + k;
            int l = i + 1, r = nums.length - 1;

            while (l <= r) {
                int mid = l + (r - l) / 2;

                if (nums[mid] == target) {
                    count++;
                    break;
                } 
                else if (nums[mid] < target) {
                    l = mid + 1;
                } 
                else {
                    r = mid - 1;
                }
            }
        }
        return count;
    }
}