class square {
    int value;

    int calculate() {
        return value * value;
    }
}

class Main {
    public static void main(String[] args) {
        square A = new square();

        A.value = 5;

        System.out.println("Square of a Number: " + A.calculate());
    }
}
