package Module5_ExceptionHandlingANDMultithreading;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class CheckedANDUncheckedException  {

    public static void main(String[] args) {

        try {
            int a = 10;
            int b = 0;
            int result = a / b;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Unchecked Exception caught: " + e);
        }

        try {
            File file = new File("test.txt");
            FileReader fr = new FileReader(file);
            fr.close();
        } catch (IOException e) {
            System.out.println("Checked Exception caught: " + e);
        }

        System.out.println("Program continues after handling exceptions.");
    }
}

