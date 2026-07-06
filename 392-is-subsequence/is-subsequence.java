class Solution {
    public boolean isSubsequence(String s, String t) {
        int i = 0;
       
         int n = t.length();
         int m = s.length();
         if(m == 0){
                return true;
            }
          for(int j = 0;j<n;j++){
            if(s.charAt(i) == t.charAt(j)){
                i++;
            }
            if(i>=m){
                return true;
            }
            
          }
          return false;
    }
}