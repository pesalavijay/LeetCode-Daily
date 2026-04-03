class Solution {
    public String longestPalindrome(String s) {
        if(s.length() < 2) return s;
        String maxStr =s.substring(0,1);
        int maxLen = 1;

        for(int i=0; i<s.length(); i++){
            for(int j=i+1; j<s.length(); j++){
                String sub = s.substring(i, j+1);
                if(sub.length() > maxLen && isPalindrome(sub)){
                    maxLen = sub.length();
                    maxStr = sub;
                }
            }
        } 
        return maxStr;
    }
    public boolean isPalindrome(String sub){
        int left = 0, right= sub.length()-1;
        while(left < right){
            if(sub.charAt(left) != sub.charAt(right)) return false;
            left++;
            right--;
        }
        return true;
    }
}
