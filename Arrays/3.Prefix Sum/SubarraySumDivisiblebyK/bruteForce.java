class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        int count = 0;
        for(int i=0; i<nums.length; i++){
            for(int j=i; j<nums.length; j++){
                int sum = 0;
                for(int p=i; p<=j; p++){
                    sum += nums[p];
                }
                if(sum % k == 0){
                    count++;
                }
            }
        }
        return count;
        
    }
}

Rey this approach throws a TLE error when the array size becomes bigger in hundreds
