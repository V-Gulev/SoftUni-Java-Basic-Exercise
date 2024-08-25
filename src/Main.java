import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cats = Integer.parseInt(scanner.nextLine());
        int smallCats = 0;
        int mediumCats = 0;
        int bigCats = 0;
        double foodEaten = 0;
        for (int i = 0; i < cats; i++) {
            int cat = Integer.parseInt(scanner.nextLine());

            if (cat >= 100 && cat < 200) {
                smallCats++;
            } else if (cat >= 200 && cat < 300) {
                mediumCats++;
            } else if (cat >= 300 && cat < 400) {
                bigCats++;
            }

            foodEaten += cat;
        }

        foodEaten = foodEaten / 1000;
        double neededMoney = foodEaten * 12.45;
        System.out.printf("Group 1: %d cats.%nGroup 2: %d cats.%nGroup 3: %d cats.%nPrice for food per day: %.2f lv.",smallCats,mediumCats,bigCats,neededMoney);

    }
}
