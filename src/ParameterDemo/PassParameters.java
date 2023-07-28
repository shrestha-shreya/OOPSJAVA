package ParameterDemo;

public class PassParameters {

    public static void main(String[] args) {
        PassParameters obj1 = new PassParameters();
//        obj1.add(2,3);
      obj1.add(2,3);
      obj1.sub(5.1,1.2);

    }

    public void add(int a,int b){
        int c = a+b;
        System.out.println("Addition "+c);
    }

    public void sub(double x,double y){
        double z = x-y;
        System.out.println("Substraction "+z);
    }
}


