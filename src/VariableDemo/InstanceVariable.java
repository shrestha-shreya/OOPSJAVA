package VariableDemo;

public class InstanceVariable {

//    int roll = 10;
//    double marks = 80.5;

    int roll;
    double marks;

    int x = 0;

    public InstanceVariable(int roll,double marks){
        this.roll = roll;
        this.marks = marks;
    }

    public static void main(String[] args) {
//        InstanceVariable obj1 = new InstanceVariable();
//        obj1.show();
//        InstanceVariable obj2 = new InstanceVariable();
//        obj2.show();
//        InstanceVariable obj3 = new InstanceVariable();
//        obj3.show();

        InstanceVariable obj1 = new InstanceVariable(1,80.5);
        obj1.show();
        InstanceVariable obj2 = new InstanceVariable(2,30.5);
        obj2.show();
        InstanceVariable obj3 = new InstanceVariable(3,5.5);
        obj3.show();

    }

    public void show()
    {
        int x = 100;
        System.out.println(x);

        System.out.println("Roll number"+roll+"and marks are "+marks);
    }
}
