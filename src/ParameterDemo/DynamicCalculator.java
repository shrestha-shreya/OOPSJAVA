package ParameterDemo;

public class DynamicCalculator {

    public int add(int a,int b){
        int c = a+b;
        return c;
    }

    public double sub(double x,double y){
        double z = x-y;
        return z;
    }

    public static String name(String firstName,String lastName){
        String fName = firstName + " " + lastName;
        return fName;
    }
}
