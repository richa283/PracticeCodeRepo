package math;

public class CalculateMoney {
    public int totalMoney(int n) {
        int weeks = n / 7; // Calculate the number of complete weeks
        int extraDays = n % 7; // Calculate remaining days after complete weeks

        int total = 28 * weeks + 7 * (weeks - 1) * weeks / 2; // Calculate total money for complete weeks
        total += (extraDays * (extraDays + 1)) / 2 + weeks * extraDays; // Add money for remaining days
        return total;
    }

    public static void main(String[] args) {
        CalculateMoney cm = new CalculateMoney();
        int n = 10; // Number of days
        int output = cm.totalMoney(n);

        System.out.println("After " + n + " days, the total is: " + output);
    }
}
