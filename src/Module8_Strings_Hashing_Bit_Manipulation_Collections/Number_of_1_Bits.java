package Module8_Strings_Hashing_Bit_Manipulation_Collections;

public class Number_of_1_Bits {
    public int hammingWeight(int n) {
        int count = 0;
        while(n != 0){
            count += n & 1;
            n >>>= 1;
        }
        return count;
    }
    public static void main(String[] args) {
        Number_of_1_Bits hw=new Number_of_1_Bits();
        System.out.println(hw.hammingWeight(11));
    }
}