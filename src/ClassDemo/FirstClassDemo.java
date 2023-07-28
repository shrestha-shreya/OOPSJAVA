package ClassDemo;

public class FirstClassDemo {

    int x = 90;
    int y =20;

    public static void main(String[] args) {

        FirstClassDemo obj = new FirstClassDemo();
        obj.sum();
        System.out.println(obj.x);

        FirstClassDemo obj2 = new FirstClassDemo();
        obj2.sum();



    }

    public void sum()
    {
        int a=90;
        int b=100;
        int c=b+a;
        System.out.println("Sum of two numbers "+c);
    }
}
