import java.util.Scanner;
public class WhileLoopActivity1117no1 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int num = (int) (Math.random() * 100 + 1);
        System.out.println("Enter your guess: ");
        int guess = console.nextInt();

        while (guess != num){
            if(guess > num){
                System.out.println("Too High");
                System.out.println("Enter your guess: ");
                guess = console.nextInt();
            } else if (guess < num){
                System.out.println("Too Low");
                System.out.println("Enter your guess: ");
                guess = console.nextInt();
            }
            if (guess == num){
                System.out.println("You are correct!, Secret Number is " + num);
            }
        }

    }
}