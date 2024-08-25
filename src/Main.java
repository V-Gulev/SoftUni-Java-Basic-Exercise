import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cpus = Integer.parseInt(scanner.nextLine());
        int workers = Integer.parseInt(scanner.nextLine());
        int days = Integer.parseInt(scanner.nextLine());

        int hoursWorked = workers * days * 8;
        int cpusMade = (int) Math.floor(hoursWorked / 3);

        if (cpusMade >= cpus) {
            double profit = (cpusMade - cpus) * 110.10;
            System.out.printf("Profit: -> %.2f BGN",profit);
        } else {
            double loss = (cpus - cpusMade) * 110.10;
            System.out.printf("Losses: -> %.2f BGN",loss);
        }
    }
}
