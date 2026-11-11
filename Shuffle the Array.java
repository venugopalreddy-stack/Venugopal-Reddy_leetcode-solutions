class Solution {
    public int[] shuffle(int[] nums, int n) {

        int[] ans = new int[2 * n];

        for (int k = 0; k < n; k++) {

            ans[2 * k] = nums[k];
            ans[2 * k + 1] = nums[n + k];
        }

        return ans;
    }
}
