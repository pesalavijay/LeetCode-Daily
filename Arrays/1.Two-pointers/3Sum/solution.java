class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
       for(int i=0; i<nums.length; i++){
        if(i>0 && nums[i] ==  nums[i-1]) continue;
        int first = i+1, last=nums.length-1;
        while(first < last){
            int sum = nums[i]+nums[first]+nums[last];
            if(sum == 0){
                result.add(Arrays.asList(nums[i],nums[first],nums[last]));
                first++;
                last--;
                while(first < last && nums[first] == nums[first-1]) first++;
                while(first < last && nums[last] == nums[last+1]) last--;
            }else if(sum < 0){
                first++;
            }else{
                last--;
            }
        }
       }
       return result;
    }
}
