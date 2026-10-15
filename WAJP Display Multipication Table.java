
class Multiplication {
    int value;

    void display() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(value + " x " + i + " = " + (value * i));
        }
    }
}

class Main {
    public static void main(String[] args) {
        Multiplication A = new Multiplication();

        A.value = 5;

        A.display();
    }
}
