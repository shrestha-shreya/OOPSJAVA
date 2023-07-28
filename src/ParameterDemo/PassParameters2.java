package ParameterDemo;

public class PassParameters2 {


    public static void main(String[] args) {
        DynamicCalculator obj1 = new DynamicCalculator();
//        obj1.add(2,3);
      int sumresult = obj1.add(2,3);
        System.out.println("Addition result "+sumresult);
      double subresult = obj1.sub(5.1,1.2);
        System.out.println("Substraction result "+subresult);

        String fullName = DynamicCalculator.name("Shreya","Shrestha");
        System.out.println("Full name is "+fullName);

    }


}


