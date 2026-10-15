class rectangle1 {
    double length, width;

    double area(){
        return length * width;
    }
}
public class rectangle {
    public static void main(String[] args){
        rectangle1 r = new rectangle1();
        r.length = 10;
        r.width = 20;

        System.out.println("Area: " + r.area());

    }
}
