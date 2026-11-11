class Solution {
    public int findNumbers(int[] nums) {
        var result = new ArrayList<String>();
        for (var num : nums) {
            if (String.valueOf(num).length() % 2 == 0) {
                result.add(String.valueOf(num));
            }
        }
        return result.size();
    }
}
