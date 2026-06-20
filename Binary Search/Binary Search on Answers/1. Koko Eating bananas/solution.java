class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low = 1;
        int high = 0;
        for (int i : piles) {
            high = Math.max(high, i);
        }
        
        int ans = high;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            
            if (CanEat(piles, h, mid)) {
                ans = mid;        
                high = mid - 1; 
            } else {
                low = mid + 1;    
            }
        }
        return ans;
    }

    public boolean CanEat(int[] piles, int h, int mid) {
        long hours = 0;  
        for (int i : piles) {
            hours += (i + mid - 1) / mid; 
        }
        return hours <= h;
    }
}
