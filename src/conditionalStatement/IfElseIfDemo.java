package conditionalStatement;

public class IfElseIfDemo {

    public static void main(String[] args) {
        String browser = "IE";

        if(browser.equalsIgnoreCase("Firefox")){
            System.out.println("Testcase executed on Firefox");
        }

        else if (browser.equalsIgnoreCase("Chrome")){
            System.out.println("Testcase executed on Chrome");
        }
        else{
            System.out.println("Testcase executed on IE");
        }
    }
}
