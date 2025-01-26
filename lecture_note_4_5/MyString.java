package lecture_note_4_5;

//MyString.java
public class MyString {
    public static void main (String [] args) {

        String name = new String("Grey Hound");

        String job = new String();
        job = "teacher";

        System.out.println(name + " is a " + job);


        System.out.println(name.length());

        System.out.println(name.indexOf("Hound"));

        System.out.println(name.indexOf(' '));

        System.out.println(name.substring(0, name.indexOf(' ')));
    }
}
