import java.util.Scanner;

public class DogYears {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int humanYears = scanner.nextInt();

        int dogYears = 0;

        for (int i = 0; i < humanYears; i++) {

            if (i == 0 || i == 1) {
                dogYears += 10;

            } else {
                dogYears += 4;

            }
        }

        System.out.println(dogYears);

    }
}
