class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        int remainderCount[] = new int[k];
        remainderCount[0] = 1;
        int count = 0;
        int prefixSum = 0;
        for(int i=0; i<nums.length; i++){
            prefixSum += nums[i];
            int remainder = (prefixSum % k + k) % k;
            count += remainderCount[remainder];
            remainderCount[remainder]++;
        }
        return count;
    }
}
