import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //Variables
        double springMain;
        double fallMain;
        double summerMain;
        double winterMain;
        double totalMain;

        System.out.println("How much is the maintenance for spring?");
        springMain = scan.nextDouble();
        System.out.println("How much is the maintenance for summer?");
        summerMain = scan.nextDouble();
        System.out.println("How much is the maintenance for fall?");
        fallMain = scan.nextDouble();
        System.out.println("How much is the maintenance for winter?");
        winterMain = scan.nextDouble();
        totalMain = springMain + summerMain + fallMain + winterMain;
        System.out.println("The total maintenance cost for the year is $" + totalMain);
    }
}