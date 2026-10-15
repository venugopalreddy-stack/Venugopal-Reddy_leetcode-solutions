
class Student {
    int rollNo;
    String name;

    void display() {
        System.out.println(rollNo);
        System.out.println(name);
    }
}

class Main {
    public static void main(String[] args) {
        Student A = new Student();
        Student B = new Student();

        A.rollNo = 101;
        A.name = "Ravi";

        B.rollNo = 102;
        B.name = "Rahul";

        A.display();
        B.display();
    }
}
