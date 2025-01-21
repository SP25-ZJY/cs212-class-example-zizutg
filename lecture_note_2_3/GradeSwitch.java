package lecture_note_2_3;//GradeSwitch.java
//import Scanner class to use input methods
import java.util.Scanner;

public class GradeSwitch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("What is your age? ");
        int age = input.nextInt();

        switch (age) {
            case 5:
                System.out.println("You are in Kindergarten");
                break;
            case 6:
                System.out.println("You are in first grade");
                break;
            case 7:
                System.out.println("You are in second grade");
                break;
            case 8:
                System.out.println("You are in third grade");
                break;
            case 9:
                System.out.println("You are in fourth grade");
                break;
            case 10:
                System.out.println("You are in fifth grade");
                break;
            default:
                System.out.println("You are not in elementary school");
        }

    }
}
