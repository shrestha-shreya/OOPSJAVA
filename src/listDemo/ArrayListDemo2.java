package listDemo;

import java.util.ArrayList;

public class ArrayListDemo2 {

    public static void main(String[] args) {
        ArrayList obj1 = new ArrayList();

        obj1.add(7878788);
        obj1.add('M');
        obj1.add("selenium Webdriver");
        obj1.add("selenium Webdriver");
        obj1.add(12.23);


        int myListSize = obj1.size();
        for (int i = 0;i<myListSize;i++ ){
            System.out.println("values from array list are "+obj1.get(i));
        }

//        for(Object abc:obj1){
//            System.out.println("Values are "+obj1);
//        }
    }






}
