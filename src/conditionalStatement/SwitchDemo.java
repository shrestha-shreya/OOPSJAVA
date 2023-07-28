package conditionalStatement;

public class SwitchDemo {

    public static void main(String[] args) {

        int x = 10;

        switch(x){
            case 1:
                System.out.println("performance is poor");
                break;

            case 2:
                System.out.println("Slow Performance");
                break;

            case 3:
                System.out.println("Meeting expectation");
                break;

            case 4:
                System.out.println("Well Performed");
                break;

            default:
                System.out.println("You are fired");

        }


    }
}
