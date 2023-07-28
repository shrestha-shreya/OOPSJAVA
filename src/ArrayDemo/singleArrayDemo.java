package ArrayDemo;

public class singleArrayDemo {
    public static void main(String[] args) {
//20 byte of memory.
        int student_id[] =new int[5];
//downcasting from double to integer.
        student_id[0]=(int)89.0;
        student_id[1]=12;
        student_id[2]=4;
        student_id[3]=12;
        student_id[4]=11;

//        limitation of array
//        limitation of type:we cannot assign any other then integer.
        System.out.println("Student id "+student_id[0]);





    }
}
