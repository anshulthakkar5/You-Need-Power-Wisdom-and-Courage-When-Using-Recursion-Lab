package org.example;

public class App {

    public String getGreeting() {
        return "Hello World!";
    }

    // Power: calculate power using recursion
    public int power(int base, int exponent) {
        if (exponent == 0) {
            return 1;
        }
        return base * power(base, exponent - 1);
    }

    // Wisdom: sum numbers from 1 to n using recursion
    public int wisdom(int n) {
        if (n <= 1) {
            return 1;
        }
        return n + wisdom(n - 1);
    }

    // Courage: factorial using recursion
    public int courage(int n) {
        if (n <= 1) {
            return 1;
        }
        return n * courage(n - 1);
    }

    public static void main(String[] args) {
        App app = new App();

        System.out.println(app.getGreeting());
        System.out.println("Power (2^4): " + app.power(2,4));
        System.out.println("Wisdom sum (1..5): " + app.wisdom(5));
        System.out.println("Courage factorial (5!): " + app.courage(5));
    }
}
