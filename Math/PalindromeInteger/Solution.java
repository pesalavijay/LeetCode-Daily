class Solution {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        int og = x;
        long reversed = 0;
        while(x != 0){
            int digit = x%10;
            reversed = (reversed*10)+digit;
            x /= 10;
        }
        if(reversed > Integer.MAX_VALUE || reversed < Integer.MIN_VALUE){
            return false;
        }

        if(reversed == og){
            return true;
        }
        return false;
    }
}
