package listDemo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ArrayListDemo6 {

    public static void main(String[] args) {
        List<String> obj1 = new ArrayList<String>();

       obj1.add("Mukesh");
       obj1.add("Selenium");
       obj1.add("HP QTP");

       for(String v:obj1){
           System.out.println("values are "+v);
       }
    }






}
