package Module9_Recursion_Backtracking;

import java.util.*;
public class Generate_Parentheses {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        backtrack(result,"",0,0,n);
        return result;
    }
    void backtrack(List<String> res,String cur,int open,int close,int n){
        if(cur.length()==2*n){
            res.add(cur);
            return;
        }
        if(open<n)
            backtrack(res,cur+"(",open+1,close,n);
        if(close<open)
            backtrack(res,cur+")",open,close+1,n);
    }
    public static void main(String[] args) {
        Generate_Parentheses g=new Generate_Parentheses();
        System.out.println(g.generateParenthesis(3));
    }
}