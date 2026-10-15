class addition {
    double value1, value2;

    double add(){
        return value1 + value2;
    }
}
public class Main{
    public static void main(String[] args){
        addition A = new addition();
        A.value1 = 10;
        A.value2 = 20;

        System.out.println("Addition of Two numbers: " + A.add());

    }
}
