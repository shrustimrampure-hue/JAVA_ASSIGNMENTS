package Module_2_Methods_and_Runtime_Concepts;

public class Method_Overloading {
    public int add(int a, int b) {
        System.out.println("Adding two integers:");
        return a + b;
    }

    public int add(int a, int b, int c) {
        System.out.println("Adding three integers:");
        return a + b + c;
    }

    public double add(double a, double b) {
        System.out.println("Adding two doubles:");
        return a + b;
    }

    public static void main(String[] args) {
        Method_Overloading math = new Method_Overloading();
        System.out.println(math.add(10, 20));
        System.out.println(math.add(10, 20, 30));
        System.out.println(math.add(5.5, 2.5));
    }
}
