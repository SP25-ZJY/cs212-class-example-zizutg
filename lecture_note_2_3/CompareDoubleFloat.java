package lecture_note_2_3;

public class CompareDoubleFloat {
    public static void main(String[] args) {
        double number1 = 0.1 * 8;
        double number2 = 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1;

        System.out.println("number 1 = " + number1 + " number 2 = " + number2);
        System.out.println(number2 == number2);
    }
}
