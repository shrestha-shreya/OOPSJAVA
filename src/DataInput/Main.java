package DataInput;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner data = new Scanner(System.in);
        UserInput user = new UserInput();
        int options = user.fieldSelection();
        switch (options) {
            case 1:
                user.bankingData();
                break;
            case 2:
                user.collegeData();
                break;
            case 3:
                user.schoolData();
                break;
            case 4:
                user.personalData();
                user.displayInputData();
                System.out.println("Do you want to modify your data?(Y/N):");
                String choice = data.next();
                if (choice.equalsIgnoreCase("Y")) {
                    user.modifyData();
                    user.displayInputData();
                }
                break;
            default:
                System.out.println("Invalid option!");
        }

        data.close();
    }
}