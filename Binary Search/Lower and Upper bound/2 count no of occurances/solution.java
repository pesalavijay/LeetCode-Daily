class Solution {
    public int countFrequency(int[] nums, int target) {
        int firstOccurrence = findFirst(nums, target);
        
        // If the element doesn't exist, frequency is 0
        if (firstOccurrence == -1) {
            return 0; 
        }
        
        int lastOccurrence = findLast(nums, target);
        
        return lastOccurrence - firstOccurrence + 1;
    }

    private int findFirst(int[] nums, int target) {
        int low = 0, high = nums.length - 1;
        int ans = -1;
        
        while (low <= high) {
            int mid = low + (high - low) / 2;
            
            if (nums[mid] == target) {
                ans = mid;       // Record potential answer
                high = mid - 1;  // Keep searching LEFT for an earlier occurrence
            } else if (nums[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return ans;
    }

    private int findLast(int[] nums, int target) {
        int low = 0, high = nums.length - 1;
        int ans = -1;
        
        while (low <= high) {
            int mid = low + (high - low) / 2;
            
            if (nums[mid] == target) {
                ans = mid;       // Record potential answer
                low = mid + 1;   // Keep searching RIGHT for a later occurrence
            } else if (nums[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return ans;
    }
}
