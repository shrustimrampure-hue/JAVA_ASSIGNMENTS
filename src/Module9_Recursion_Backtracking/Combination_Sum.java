package Module9_Recursion_Backtracking;

import java.util.*;
public class Combination_Sum {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(result,new ArrayList<>(),candidates,target,0);
        return result;
    }
    void backtrack(List<List<Integer>> res,List<Integer> temp,int[] nums,int remain,int start){
        if(remain==0){
            res.add(new ArrayList<>(temp));
            return;
        }
        for(int i=start;i<nums.length && remain>=nums[i];i++){
            temp.add(nums[i]);
            backtrack(res,temp,nums,remain-nums[i],i);
            temp.remove(temp.size()-1);
        }
    }
    public static void main(String[] args){
        Combination_Sum cs=new Combination_Sum();
        int[] nums={2,3,6,7};
        System.out.println(cs.combinationSum(nums,7));
    }
}