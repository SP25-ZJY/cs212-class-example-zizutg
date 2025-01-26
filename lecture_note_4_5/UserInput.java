package lecture_note_4_5;

import java.util.Scanner;

public class UserInput {
    public static void main( String [] args ){

        //create a scanner obj to read from standard input (keyboard)
        Scanner input = new Scanner( System.in );
        System.out.print( "Your name? " );

        //read a string from input, stop at the first white space
        String name = input.next( );
        System.out.println( "Your name is " + name );

        System.out.print( "Your age? " );
        int age = input.nextInt( );
        age++;
        System.out.println( "Next year, You will be " + age );

        //input stream is: \n
        String garbage = input.nextLine( );

        System.out.print( "What are you saying? " );
        String sentence = input.nextLine( );
        System.out.println( "You said: " + sentence );

    }
}
