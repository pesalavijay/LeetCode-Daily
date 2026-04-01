class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int prefixSum = 0;
        int minSum = 0;
        int maxSum = 0;
        for(int num : nums){
            prefixSum += num;
            if(prefixSum > maxSum) maxSum = prefixSum;
            if(prefixSum < minSum) minSum = prefixSum;
        }
        return maxSum - minSum;
    }
}
