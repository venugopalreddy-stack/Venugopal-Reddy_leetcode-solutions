
class Interest {
    double principal, rate, time;

    double calculate() {
        return (principal * rate * time) / 100;
    }
}

class Main {
    public static void main(String[] args) {
        Interest A = new Interest();

        A.principal = 1000;
        A.rate = 5;
        A.time = 2;

        System.out.println("Simple Interest: " + A.calculate());
    }
}
