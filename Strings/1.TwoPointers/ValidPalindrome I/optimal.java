class Solution {
    // this is so optimal and very efficent
    public boolean isPalindrome(String s) {
        int left = 0, right = s.length()-1;
        while(left < right){
            if(!Character.isLetterOrDigit(s.charAt(left))){
                left++;
            } else if(!Character.isLetterOrDigit(s.charAt(right))){
                right--;
            } else{
                if(Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))){
                    return false;
                }
                left++;
                right--;
            }
        }
        return true;
    }
}


// this uses regex 
class Solution {
    public boolean isPalindrome(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int left = 0, right = s.length()-1;
        while(left < right){
            if(s.charAt(left) != s.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
