package ArrayDemo;

public class singleArrayDemo2 {
    public static void main(String[] args) {
//20 byte of memory.
        int student_id[] =new int[5];

//        String student_name[] = new String[5];
//downcasting from double to integer.
        student_id[0]=(int)89.0;
        student_id[1]=12;
        student_id[2]=4;
        student_id[3]=12;
        student_id[4]=11;

//        limitation of array
//        limitation of type:we cannot assign any other then integer.

        int sizeOfArray = student_id.length;
        System.out.println("Length of the array "+sizeOfArray);
//        for(int i = 0;i < sizeOfArray;i++)
//        {
//            System.out.println("Student id is "+student_id[i]);
//
//        }

        int i = 0;
        while (i < sizeOfArray)
        {
            System.out.println("Student id is "+student_id[i]);
            i++;
        }
    }
}
