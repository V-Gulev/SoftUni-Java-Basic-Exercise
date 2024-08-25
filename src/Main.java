import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int buckets = Integer.parseInt(scanner.nextLine());
        int rolls = Integer.parseInt(scanner.nextLine());
        double priceGloves = Double.parseDouble(scanner.nextLine());
        double priceBrush = Double.parseDouble(scanner.nextLine());

        double totalBucket = buckets * 21.50;
        double totalRoll = rolls * 5.20;
        int gloves = (int) Math.ceil(0.35 * rolls);
        int brushes = (int) Math.floor(0.48 * buckets);
        double totalGloves = priceGloves * gloves;
        double totalBrushes = priceBrush * brushes;
        double total = totalBrushes + totalGloves + totalBucket + totalRoll;
        double delivery = total / 15;
        System.out.printf("This delivery will cost %.2f lv.",delivery);

    }
}
