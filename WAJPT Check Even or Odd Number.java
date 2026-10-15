
class evenodd {
    int value;

    void check() {
        if (value % 2 == 0) {
            System.out.println("Even Number");
        } else {
            System.out.println("Odd Number");
        }
    }
}

class Main {
    public static void main(String[] args) {
        evenodd A = new evenodd();

        A.value = 7;

        A.check();
    }
}
