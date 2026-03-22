package Module9_Recursion_Backtracking;

import java.util.*;
public class Subsets {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(result,new ArrayList<>(),nums,0);
        return result;
    }
    void backtrack(List<List<Integer>> res,List<Integer> temp,int[] nums,int start){
        res.add(new ArrayList<>(temp));
        for(int i=start;i<nums.length;i++){
            temp.add(nums[i]);
            backtrack(res,temp,nums,i+1);
            temp.remove(temp.size()-1);
        }
    }
    public static void main(String[] args){
        Subsets ss=new Subsets();
        int[] nums = {1,2,3};
        System.out.println(ss.subsets(nums));
    }
}