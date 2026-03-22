package Module5_ExceptionHandlingANDMultithreading;
class AgeException extends Exception {
    public AgeException(String message) {
        super(message);
    }
}

public class AgeThrows {

    static void verifyAge(int age) throws AgeException {
        if (age < 18) {
            throw new AgeException("Age must be 18 or older. Provided age: " + age);
        } else {
            System.out.println("Age is valid: " + age);
        }
    }

    public static void main(String[] args) {
        try {
            verifyAge(16);
        } catch (AgeException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }

        try {
            verifyAge(20);
        } catch (AgeException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}