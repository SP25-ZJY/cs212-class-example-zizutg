package lecture_note_4_5;

//MathWiz.java
public class MathWiz {
    public static void main( String [] args ) {
        // sqrt is a static method of the Math class
        double sqrtOf2 = Math.sqrt( 2 );
        System.out.println( "Square root of 2 is " + sqrtOf2 );

        System.out.println( "Pi is " + Math.PI );
        System.out.println( "E is " + Math.E );

        double result = Math.pow( 2, 3 );
        System.out.println( "2 to the power 3 is " + result );


        System.out.println(Math.round(Math.random() * 100));



    }
}
