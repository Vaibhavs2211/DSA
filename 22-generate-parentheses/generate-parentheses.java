class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        StringBuilder temp = new StringBuilder();

        backtrack(0,0,n,temp,res);

        return res;
    }

    private void backtrack(int open, int close ,int n ,StringBuilder temp,List<String> res){
            if(open == n && close == n){
                res.add(temp.toString());
                return;
            }

            //Add
            if(open<n)
            {
                  temp.append("(");
                  backtrack(open+1,close,n,temp,res);
                  temp.deleteCharAt(temp.length()-1);

            }
            if(close<open){
                temp.append(")");
                backtrack(open,close+1,n,temp,res);
                temp.deleteCharAt(temp.length()-1);
                
            }
    }
}