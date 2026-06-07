class Solution {
    public int[] searchRange(int[] nums, int target) {
        int first = one(nums,target);
        int last = two(nums, target);
        return new int[]{first, last};
        
    }
    public int one(int nums[], int target){
        int low = 0;
        int high = nums.length-1;
        int min = -1;
        while(low <= high){
            int mid = low+(high-low)/2;
            if(nums[mid] == target){
                min = mid;
                high = mid-1;
            }else if(nums[mid] < target){
                low = mid+1;
            }else{
                high = mid-1;
            }

        }
        return min;
    }
    public int two(int nums[], int target){
        int low = 0;
        int high = nums.length-1;
        int max = -1;
        while(low <= high){
            int mid = low+(high-low)/2;
            if(nums[mid] == target){
                max = mid;
                low = mid+1;
            }else if(nums[mid] < target){
                low = mid+1;
            }else{
                high = mid-1;
            }
        }
        return max;
    }
}
