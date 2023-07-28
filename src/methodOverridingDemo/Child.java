package methodOverridingDemo;

public class Child extends Parent {

    public static void main(String[] args) {
       Child obj1 = new Child();
       obj1.display();

       Parent obj2 = new Parent();
       obj2.display();

       Parent obj3 = new Child();
       obj3.display();

//       Child obj4 = new Parent(); invalid
    }

    public void displayNew(){
        System.out.println("I am in Child Class display method");
    }

    public void display(){
        System.out.println("I am in Child Class display method");
    }
}
