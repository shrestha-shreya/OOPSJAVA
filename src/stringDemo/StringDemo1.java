package stringDemo;

public class StringDemo1 {

    public static void main(String[] args) {

        String name = "Selenium Webdriver";


        boolean status =  name.startsWith("Selenium");
        System.out.println("Status is "+status);

        String name1 = "Welcome to Java world";
        boolean status2 = name1.endsWith("world");
        System.out.println(status2);

        String actual = "Welcome to the selenium world";
        String expected = "Welcome to the world";
        boolean status3 = actual.equalsIgnoreCase(actual);
        System.out.println(status3);


    }
}
