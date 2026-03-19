class Solution {
    // 1. Method name exact ga idhe undali
    public int subarraysWithKDistinct(int[] nums, int k) {
        return atMostK(nums, k) - atMostK(nums, k - 1);
    }

    // 2. Helper function
    private int atMostK(int[] nums, int k) {
        if (k == 0) return 0;
        
        int n = nums.length; // nums.size() kadhu, nums.length use cheyali
        int left = 0, right = 0;
        int count = 0;
        HashMap<Character, Integer> map = new HashMap<>(); 
        // Note: Numbers kabatti <Integer, Integer> use cheyali
        Map<Integer, Integer> counts = new HashMap<>();

        while (right < n) {
            counts.put(nums[right], counts.getOrDefault(nums[right], 0) + 1);

            while (counts.size() > k) {
                counts.put(nums[left], counts.get(nums[left]) - 1);
                if (counts.get(nums[left]) == 0) {
                    counts.remove(nums[left]);
                }
                left++;
            }
            count += (right - left + 1);
            right++;
        }
        return count;
    }
}
