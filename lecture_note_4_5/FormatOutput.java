package lecture_note_4_5;

// FormatOutput.java
// Import the NumberFormat class
import java.text.NumberFormat;

public class FormatOutput {
    public static void main(String[] args) {
        // Calculate the odds of winning
        double oddsOfWinning = 1.0 / 12;
        System.out.println("1/12 is equal to " + oddsOfWinning);

        // Create NumberFormat objects
        NumberFormat formatNumber = NumberFormat.getInstance(); // For general number formatting
        NumberFormat formatPercent = NumberFormat.getPercentInstance(); // For percentage formatting
        NumberFormat formatCurrency = NumberFormat.getCurrencyInstance(); // For currency formatting

        // Print out 0.08 instead of 0.08333333333333333
        formatNumber.setMaximumFractionDigits(2); // Limit to 2 decimal places
        System.out.println("1/12 is equal to " + formatNumber.format(oddsOfWinning));

        // Print out 8.33%
        formatPercent.setMaximumFractionDigits(2); // Limit percentage to 2 decimal places
        System.out.println("1/12 is equal to " + formatPercent.format(oddsOfWinning));

        // Define the prize amount
        long prize = 1_000_000_000L; // Use underscores for readability in large numbers
        System.out.println("Your prize is " + prize); // Plain output

        // Print the prize amount formatted as currency
        System.out.println("Your prize is " + formatCurrency.format(prize));
    }
}
