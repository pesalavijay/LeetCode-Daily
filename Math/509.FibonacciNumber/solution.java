class Solution{
  public int feb(int n){
    if(n<=1){
      return n;
    }
    return feb(n-1)+feb(n-2);
  }
}
  
