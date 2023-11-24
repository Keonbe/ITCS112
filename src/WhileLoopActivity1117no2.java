import java.util.Scanner;
public class WhileLoopActivity1117no2 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Enter N: ");
        int n = console.nextInt();

        while (n >= 12 || n <= 2 ) {
            System.out.print("Invalid input: ");
            n = console.nextInt();
        }

        System.out.println("die1    die2    sum     # of rolls");

        int counter = 1;
        int sum = 0;
        while (n < 12 || n > 2) {
            if (sum != n) {
                int die1 = (int) (Math.random() * 6 + 1);
                int die2 = (int) (Math.random() * 6 + 1);
                sum = die1 + die2;
                System.out.println(die1 + "       " + die2 + "        " + sum + "       " + counter);
                counter++;
            }
        }
        System.out.print( counter + " rolls to get the sum of " + n);
    }
}
