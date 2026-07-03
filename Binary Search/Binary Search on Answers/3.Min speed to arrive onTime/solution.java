class Solution {
    public int minSpeedOnTime(int[] dist, double hour) {
        if (hour <= dist.length - 1) {
            return -1;
        }
        
        int left = 1;
        int right = 10000000; 
        int minSpeed = -1;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (canReachInTime(dist, hour, mid)) {
                minSpeed = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return minSpeed;
    }
    
    private boolean canReachInTime(int[] dist, double hour, int speed) {
        double time = 0.0;
        int n = dist.length;
        for (int i = 0; i < n - 1; i++) {
            time += (dist[i] + speed - 1) / speed;
        }
        time += (double) dist[n - 1] / speed;
        return time <= hour;
    }
}
