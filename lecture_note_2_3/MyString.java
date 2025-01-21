package lecture_note_2_3;

//MyString.java
public class MyString {
    public static void main (String [] args) {

        String name = new String("Hoang Bui");

        String job = new String();
        job = "teacher";

        System.out.println(name + " is a " + job);


        System.out.println(name.length());

        System.out.println(name.indexOf("Bui"));

        System.out.println(name.indexOf(' '));

        System.out.println(name.substring(0, name.indexOf(' ')));
    }
}
