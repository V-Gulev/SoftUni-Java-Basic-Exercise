import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String type = scanner.nextLine();
        int amount = Integer.parseInt(scanner.nextLine());
        int day = Integer.parseInt(scanner.nextLine());
        double pricePerCake = 0;
        switch (type) {
            case "Cake":
                if (day <= 15) {
                    pricePerCake = 24;
                } else  {
                    pricePerCake = 28.70;
                }
                break;
            case "Souffle":
                if (day <= 15) {
                    pricePerCake = 6.66;
                } else  {
                    pricePerCake = 9.80;
                }
                break;
            case "Baklava":
                if (day <= 15) {
                    pricePerCake = 12.60;
                } else  {
                    pricePerCake = 16.98;
                }
                break;
            default:
                break;
        }
        double totalPrice = pricePerCake * amount;
        if (totalPrice >= 100 && totalPrice < 200 && day <= 22) {
            totalPrice = totalPrice * 0.85;
        } else if (totalPrice >= 200 && day <= 22) {
            totalPrice = totalPrice * 0.75;
        }

        if (day <= 15) {
            totalPrice = totalPrice * 0.90;
        }
        System.out.printf("%.2f",totalPrice);
    }
}
