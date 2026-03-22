package Module_4_Advanced_Java_Concepts;
public class StringBufferStringBuilder {
    public static void main(String[] args) {

        String str = "Hello";
        str.concat(" World");
        System.out.println("String after concat: " + str);

        str = str.concat(" World");
        System.out.println("String after reassignment: " + str);

        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" World");
        System.out.println("StringBuilder after append: " + sb);

        StringBuffer sbf = new StringBuffer("Hello");
        sbf.append(" World");
        System.out.println("StringBuffer after append: " + sbf);
    }
}

