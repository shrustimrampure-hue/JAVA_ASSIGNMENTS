package Module9_Recursion_Backtracking;

import java.util.*;
public class Permutations {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(result,new ArrayList<>(),nums);
        return result;
    }
    void backtrack(List<List<Integer>> res,List<Integer> temp,int[] nums){
        if(temp.size()==nums.length){
            res.add(new ArrayList<>(temp));
            return;
        }
        for(int num : nums){
            if(temp.contains(num)) continue;
            temp.add(num);
            backtrack(res,temp,nums);
            temp.remove(temp.size()-1);
        }
    }
    public static void main(String[] args){
        Permutations p=new Permutations();
        int[] nums={1,2,3};
        System.out.println(p.permute(nums));
    }
}