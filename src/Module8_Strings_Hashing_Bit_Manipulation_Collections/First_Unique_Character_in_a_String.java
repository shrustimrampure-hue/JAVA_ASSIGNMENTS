package Module8_Strings_Hashing_Bit_Manipulation_Collections;

public class First_Unique_Character_in_a_String {
    public int firstUniqChar(String s) {
        int[] count = new int[26];
        for(char c : s.toCharArray())
            count[c - 'a']++;
        for(int i=0;i<s.length();i++)
            if(count[s.charAt(i)-'a']==1)
                return i;
        return -1;
    }
    public static void main(String[] args) {
        First_Unique_Character_in_a_String obj=new First_Unique_Character_in_a_String();
        System.out.println(obj.firstUniqChar("leetcode"));
    }
}