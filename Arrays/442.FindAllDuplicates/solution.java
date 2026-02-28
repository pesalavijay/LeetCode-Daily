class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        Arrays.sort(nums);
        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++){
                if(nums[i] == nums[i+1]){
                    return Arrays.asList(nums[i], nums[i+1]);
                }
            }
        }
        return new ArrayList<>();
    }
}
