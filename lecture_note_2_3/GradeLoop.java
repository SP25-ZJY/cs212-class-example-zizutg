package lecture_note_2_3;//GradeLoop.java
//import Scanner class to use input methods
import java.util.Scanner;

public class GradeLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int grade;
        System.out.println("Enter a valid grade (0-100): ");
        grade = input.nextInt();

        while(grade < 0 || grade > 100){
            System.out.println("Enter a valid grade (0-100): ");
            grade = input.nextInt();
        }

        do {
            System.out.println("Enter a valid grade (0-100): ");
            grade = input.nextInt();
        }while(grade < 0 || grade > 100);



    }
}
