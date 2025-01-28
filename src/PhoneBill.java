import java.util.Scanner;

public class PhoneBill {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double totalAmountOfTextMessages = scanner.nextDouble();
        double totalAmountOfMinutes = scanner.nextDouble();

        int additionalMessagesCount = 0;
        int additionalMinutesCount = 0;

        double additionalMessagesCost = 0;
        double additionalMinutesCost = 0;

        for (int i = 1; i < totalAmountOfTextMessages + 1; i++) {
            if (i > 20) {
                additionalMessagesCount += 1;
                additionalMessagesCost += 0.06;
            }
        }

        for (int i = 1; i < totalAmountOfMinutes + 1; i++) {
            if (i > 60) {
                additionalMinutesCount += 1;
                additionalMinutesCost += 0.10;
            }
        }

        double salesTax = (additionalMessagesCost + additionalMinutesCost) * 0.2;
        double totalBill = 12 + additionalMessagesCost + additionalMinutesCost + salesTax;

        System.out.printf("%d additional messages for %.2f levas%n", additionalMessagesCount, additionalMessagesCost);
        System.out.printf("%d additional minutes for %.2f levas%n", additionalMinutesCount, additionalMinutesCost);
        System.out.printf("%.2f additional taxes%n", salesTax);
        System.out.printf("%.2f total bill", totalBill);
    }
}
