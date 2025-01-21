package lecture_note_2_3;//FormatString.java
//import DecimalFormat class
import java.text.DecimalFormat;

public class FormatString {
    public static void main(String[] args) {
        double oddOfWining = (double)1/12;
        System.out.println("1/2 is equal to" + oddOfWining);

        //create a new DecimalFormat object to convert chance to percentage
        DecimalFormat formatNumber = new DecimalFormat(".##");

        //print out .08 instead of 0.08333333333333333
        System.out.println("1/12 is equal to is  " + formatNumber.format(oddOfWining));

        //create a new DecimalFormat object to convert chance to percentage
        DecimalFormat formatPercentage = new DecimalFormat(".##%");

        //print out 8.33% 
        System.out.println("1/12 is equal to is  " + formatPercentage.format(oddOfWining));

        long prize = 1000000000L;
        System.out.println("Your prize is   " + prize);

        //create a new DeicmalFormat to print out number in $ format
        DecimalFormat formatCurrency = new DecimalFormat("$,###");
        System.out.println("Your prize is   " + formatCurrency.format(prize));





    }
}
