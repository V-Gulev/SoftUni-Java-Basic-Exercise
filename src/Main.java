import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int locations = Integer.parseInt(scanner.nextLine());
        double minedGold = 0;
        double averageGold;
        for (int i = 0; i < locations; i++) {
            double expectedAverageGold = Double.parseDouble(scanner.nextLine());
            int daysMining = Integer.parseInt(scanner.nextLine());

            for (int j = 0; j < daysMining; j++) {
                double goldMinedPerDay = Double.parseDouble(scanner.nextLine());
                minedGold += goldMinedPerDay;
            }
            averageGold = minedGold / daysMining;
            if (averageGold >= expectedAverageGold) {
                System.out.printf("Good job! Average gold per day: %.2f.%n",averageGold);
            } else {
                double neededGold = expectedAverageGold - averageGold;
                System.out.printf("You need %.2f gold.%n",neededGold);
            }
            minedGold = 0;
        }




    }
}
