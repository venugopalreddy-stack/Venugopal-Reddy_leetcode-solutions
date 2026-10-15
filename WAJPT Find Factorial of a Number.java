
class Factorial {
    int value;

    int calculate() {
        int fact = 1;
        for (int i = 1; i <= value; i++) {
            fact = fact * i;
        }
        return fact;
    }
}

class Main {
    public static void main(String[] args) {
        Factorial A = new Factorial();

        A.value = 5;

        System.out.println("Factorial of a Number: " + A.calculate());
    }
}
