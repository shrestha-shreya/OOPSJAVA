package javaTutorials;

public class HR extends itDepartment {

    public static void main(String[] args) {

//        1st scenario
        HR obj = new HR();
        obj.goodies();
        obj.work();
        obj.salary();
//        obj.bonus();

//        2nd scenario
        itDepartment it = new HR();
        it.goodies();
        it.work();
        it.salary();

//        3rd scenario
//        itDepartment it1 = new itDepartment();
//        If your class is not fully implemented then we will not allow you to create object.
//        Interface we don't have single method implemennted.
//        Interface is 100% abstract class as it has all method as abstract method.
//        abstract class can have abstract method and non abstract method.

    }
    @Override
    public void salary() {
        System.out.println("Salary is  lakhs per annum");
    }

    public void bonus() {
        System.out.println("Bonus is 1 lakh");
    }
}
