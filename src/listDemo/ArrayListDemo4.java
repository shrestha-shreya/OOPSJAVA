package listDemo;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo4 {

    public static void main(String[] args) {
        ArrayList obj1 = new ArrayList();

        obj1.add(7878788);
        obj1.add('M');
        obj1.add("selenium Webdriver");
        obj1.add("selenium Webdriver");
        obj1.add(12.23);



        Iterator itr = obj1.iterator();
        while(itr.hasNext()){
            Object value = itr.next();
            System.out.println("Values are "+value);
        }
    }






}
