class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int maxSoFar = 0;
        int minSoFar = 0;
        int currMinimum = 0;
        int currMaximum = 0;

        for(int num : nums){
            currMinimum += num;
            minSoFar = Math.min(currMinimum, minSoFar);
            if(currMinimum > 0){
                currMinimum = 0;
            }

            currMaximum += num;
            maxSoFar = Math.max(currMaximum, maxSoFar);
            if(currMaximum < 0){
                currMaximum = 0;
            }
        }
        return Math.max(maxSoFar, Math.abs(minSoFar));
    }
}
