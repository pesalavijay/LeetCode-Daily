class Solution {
    public int findFloor(int[] arr, int x) {
        int low = 0;
        int high = arr.length - 1;
        int ans = -1; // Default if no floor exists
        
        while (low <= high) {
            int mid = low + (high - low) / 2;
            
            // If the element is less than or equal to x, 
            // it's a valid floor candidate.
            if (arr[mid] <= x) {
                ans = mid;       // Save the index
                low = mid + 1;   // Look right for a larger/tighter floor
            } else {
                // Element is too big, look left
                high = mid - 1;
            }
        }
        
        return ans;
    }
}
