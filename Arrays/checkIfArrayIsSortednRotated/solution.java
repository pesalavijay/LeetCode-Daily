class Solution {
    public boolean check(int[] arr) {

        if (arr == null || arr.length < 1) {
            return false;
        }

        int countBreaks = 0;
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            if (arr[i] > arr[(i + 1) % n]) {
                countBreaks++;
            }
            if (countBreaks > 1) {
                return false;
            }
        }

        return true; 
    }
}
