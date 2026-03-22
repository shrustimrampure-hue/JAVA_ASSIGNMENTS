package Module8_Strings_Hashing_Bit_Manipulation_Collections;

public class Single_Number_using_XOR {
    public int singleNumber(int[] nums) {
        int result = 0;
        for(int num : nums)
            result ^= num;
        return result;
    }
    public static void main(String[] args) {
        Single_Number_using_XOR sn=new Single_Number_using_XOR();
        int[] nums = {2,2,1,3,7,7};
        System.out.println(sn.singleNumber(nums));
    }
}