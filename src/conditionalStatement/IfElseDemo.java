package conditionalStatement;

        public class IfElseDemo {

            public static void main(String[] args) {
                String browser = "Chrome";

                if(browser.equalsIgnoreCase("Firefox")){
                    System.out.println("Testcase executed on Firefox");
                }

                else{
                    System.out.println("Testcase executed on Chrome");

                }
            }
        }
//equalsIgnoreCase ignore the uppercase or lower case.
