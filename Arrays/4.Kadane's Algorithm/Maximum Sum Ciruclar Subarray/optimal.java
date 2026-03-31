class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int totalSum = 0;
        int currMin = 0;
        int currMax = 0;
        int minSub = nums[0];
        int maxSub = nums[0];

        for(int num : nums){
            totalSum += num;

            currMax += num;
            maxSub = Math.max(currMax, maxSub);
            if(currMax < 0) currMax = 0;

            currMin += num;
            minSub = Math.min(currMin, minSub);
            if(currMin > 0) currMin = 0;
        }
        if(maxSub < 0)  return maxSub;

        return Math.max(maxSub, totalSum - minSub);
        
    }
}
