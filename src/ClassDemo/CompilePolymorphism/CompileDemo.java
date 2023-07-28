package ClassDemo.CompilePolymorphism;

public class CompileDemo {
    public static void main(String[] args) {
        CompileDemo obj=new CompileDemo();
        obj.add(1,2);
        obj.add(5,6,7);
        obj.add(10.2,10.3);
        obj.add(10,12.5);
    }

    public void add(int a,int b){
        int c = a + b;
        System.out.println("sum of two number "+c);
    }

    public void add(double a,double b){
        double c = a + b;
        System.out.println("sum of two number "+c);
    }

    public void add(int a,int b,int d){
        int c = a + b+d;
        System.out.println("sum of two number "+c);
    }

    public void add(int a,double b){
        double c = a+b;
        System.out.println("Sum of two numbers "+c);
    }
}
