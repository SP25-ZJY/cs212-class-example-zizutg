package lecture_note_4_5;//Wrapper.java

public class Wrapper {
    public static void main( String [] args )    {
        Integer n1 = 18;
        int n2 = 30;
        int n3 = n1 + n2;
        System.out.println(n3);

        //turn an Integer to a string
        String str = n1.toString();
        System.out.println(str);

        String numberString = "78";
        int number;
        number = Integer.parseInt( numberString );
        System.out.println( "number is " + number );

        boolean test = Character.isDigit( '4' );
        System.out.println( "Is 4 a digit? " + test );

        boolean test2 = Character.isDigit( 'd' );
        System.out.println( "Is d a digit? " + test2 );

    }
}
