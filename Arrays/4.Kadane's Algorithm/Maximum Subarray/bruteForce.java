int maxi = Integer.MIN_VALUE;
for (int i = 0; i < n; i++) {
    for (int j = i; j < n; j++) {
        int sum = 0;
        for (int k = i; k <= j; k++) 
          sum += arr[k];
          maxi = Math.max(maxi, sum);
    }
}
