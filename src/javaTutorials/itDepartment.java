package javaTutorials;

public abstract class itDepartment implements Employee {

    public static void main(String[] args) {

    }

    @Override
    public void goodies() {
        System.out.println("Laptop");
    }

    @Override
    public void work() {
        System.out.println("Automation");
    }

    @Override
    public abstract void salary();
}
