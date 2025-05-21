public class Calculator {
    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }

    double add(double a, double b) {
        return a + b;
    }
 
 
    
 
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        System.out.println("Add(5, 10) = " + calc.add(5, 10));
        System.out.println("Add(5, 10, 15) = " + calc.add(5, 10, 15));
        System.out.println("Add(5.5, 10.5) = " + calc.add(5.5, 10.5));
    }
}

