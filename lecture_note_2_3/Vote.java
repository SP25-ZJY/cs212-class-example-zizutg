package lecture_note_2_3;//Vote.java
//import Scanner class to use input methods
import java.util.Scanner;

public class Vote {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("What is your age?");
        //read in an integer from user's input, store it in age
        int age = input.nextInt();

        if (age >= 18) {
            System.out.println("You can vote");
        }

    }
}
