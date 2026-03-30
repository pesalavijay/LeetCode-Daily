class Solution {
    public int maxProduct(int[] nums) {
        int maxProduct = nums[0];
        for(int i=0; i<nums.length; i++){
            for(int j=i; j<nums.length; j++){
                int product = 1;
                for(int k=i; k<=j; k++){
                    product *= nums[k];
                    maxProduct = Math.max(maxProduct, product);
                }
            }
        }
        return maxProduct;
    }
}
