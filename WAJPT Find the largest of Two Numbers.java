
class Largest {
    int value1, value2;

    int findLargest() {
        if (value1 > value2) {
            return value1;
        } else {
            return value2;
        }
    }
}

class Main {
    public static void main(String[] args) {
        Largest A = new Largest();

        A.value1 = 10;
        A.value2 = 20;

        System.out.println("Largest Number: " + A.findLargest());
    }
}
