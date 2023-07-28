package stringDemo;

public class StringDemo2 {

    public static void main(String[] args) {
        String fullname = "Selenium-HP-QTP-Grid";

        String []toolname = fullname.split("-");

        for (int i = 0;i<toolname.length;i++){
            System.out.println("Value for "+i+" is "+ toolname[i]);

            if(toolname[i].equalsIgnoreCase("selenium")){
                System.out.println("test passed");
                break;
            }
        }
    }
}
