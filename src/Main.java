import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int foodKG = Integer.parseInt(scanner.nextLine());
        foodKG = foodKG * 1000;
        int foodPerDay;
        int totalFoodEaten = 0;
        while (true) {
            String input = scanner.nextLine();

            if (input.equals("Adopted")) {
                break;
            } else {
                foodPerDay = Integer.parseInt(input);
            }

            totalFoodEaten += foodPerDay;
        }

        if (totalFoodEaten > foodKG) {
            int neededFood = totalFoodEaten - foodKG;
            System.out.printf("Food is not enough. You need %d grams more.",neededFood);
        } else {
            int leftFood = foodKG - totalFoodEaten;
            System.out.printf("Food is enough! Leftovers: %d grams.",leftFood);
        }

    }
}
