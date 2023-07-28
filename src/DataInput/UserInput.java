package DataInput;

import java.util.Scanner;

public class UserInput {
    private String name;
    private int age;
    private float weight;
    private int option;
    Scanner customScanner = new Scanner(System.in);

//    this.customScanner = new Scanner(System.in);
//    public UserInput() {
//        this.customScanner = new Scanner(System.in);
//    }

    public int fieldSelection() {
        System.out.println("Select your field option: ");
        System.out.println("1.Banking");
        System.out.println("2.School");
        System.out.println("3.College");
        System.out.println("4.Personal Information \n");
        this.option = this.customScanner.nextInt();
        this.customScanner.nextLine();
        return this.option;
    }

    public void bankingData() {
        System.out.println("Enter your account number:");
        int accountNumber = this.customScanner.nextInt();
        System.out.println("Enter your account balance:");
        double accountBalance = this.customScanner.nextDouble();
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Balance: " + accountBalance);
    }

    public void collegeData() {
        System.out.println("College Selected");
        System.out.println("Enter your student ID:");
        int collegeStudentId = this.customScanner.nextInt();
        System.out.println("Enter your major:");
        String major = this.customScanner.next();
        System.out.println("Student ID: " + collegeStudentId);
        System.out.println("Major: " + major);
    }

    public void schoolData() {
        System.out.println("School Selected");
        System.out.println("Enter your student ID:");
        int studentId = this.customScanner.nextInt();
        System.out.println("Enter your grade:");
        int grade = this.customScanner.nextInt();
        System.out.println("Student ID: " + studentId);
        System.out.println("Grade: " + grade);
    }

    public void personalData() {
        System.out.println("Enter your name: ");
        this.name = this.customScanner.nextLine();
        System.out.println("Enter your age: ");
        this.age = this.customScanner.nextInt();
        System.out.println("Enter your weight: ");
        this.weight = this.customScanner.nextFloat();
        this.customScanner.nextLine();
    }

    public void modifyData() {
        System.out.println("Enter new name: ");
        this.name = this.customScanner.nextLine();
        System.out.println("Enter new  age: ");
        this.age = this.customScanner.nextInt();
        System.out.println("Enter new weight: ");
        this.weight = this.customScanner.nextFloat();
    }

    public void displayInputData() {
        System.out.println("name: " + this.name);
        System.out.println("age: " + this.age);
        System.out.println("weight: " + this.weight);
    }
}