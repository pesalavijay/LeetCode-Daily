class Solution {
    public int[] twoSum(int[] nums, int target) {
    //     for(int i=0; i<nums.length; i++){
    //         int one = target-nums[i];
    //         for(int j=i+1; j<nums.length; j++){
    //             if(nums[j] == one){
    //                 return new int[]{i,j};
    //             }
    //         }
    //     }
    //     return new int[]{};

    // optimal code
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            int complement = target - nums[i];
            if(map.containsKey(complement)){
                return new int[]{map.get(complement),i};
            }
            map.put(nums[i],i);
        }
        return new int[]{};
    }
}
