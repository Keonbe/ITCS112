import java.util.Scanner;
public class RepStrucAssessment {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        /*
        do while for the selection print
            switch if selected num
             if else
                for loop for the repetition in the num

         */
        int inputsel = 0;
        int countersel=0;
        do{
            System.out.println("[1] – Sum of Power\n[2] – Series\n[3] – Mode");
            System.out.print("Enter your choice: ");
            inputsel = console.nextInt();

            switch(inputsel){
                case 1:
                    System.out.println("\nProblem 1 - Series:\n=====================\n");
                    System.out.print("Enter x : ");
                    double xprob1 = console.nextInt();
                    System.out.print("Enter n : ");
                    double nprob1 = console.nextInt();
                    double ansprob1 = 0;
                    double counter = 0;
                    double added1 = 0;
                    while (counter != nprob1){
                        counter++;
                        ansprob1 = (Math.pow(xprob1, counter));
                        added1 += ansprob1;
                        if (counter == nprob1){
                            System.out.println("Answer = " + added1);
                        }
                    }
                    break;
                case 2:
                    int counter2 = 1;
                    int answer = 0;
                    System.out.println("\nProblem 2 - Series:\n=====================\n");
                    System.out.print("Enter n:  ");
                    int nprob2 = console.nextInt();
                    while(counter2 != nprob2){
                        System.out.print("\nInput "+nprob2+" integers: ");
                        int input2 = console.nextInt();
                        counter2++;
                        /*
                        even odd numbers; set counter; if counter is even then switch to minus, then interval
                         */
                        if (input2 % 2 == 0){
                            System.out.println("even");
                            System.out.print("\nInput "+nprob2+" integers: ");
                             input2 = console.nextInt();
                        } else System.out.println("odd");{
                            System.out.print("\nInput " + nprob2 + " integers: ");
                            input2 = console.nextInt();
                        }
                    }
                    break;
                case 3:
                    System.out.println("\nProblem 3 - Series:\n=====================\n");
                    //frequencymap. command
                    break;
            }
            if (inputsel > 1 || inputsel <=4){
                System.out.println("\n[1] – Sum of Power\n[2] – Series\n[3] – Mode\n[4] – Exit");
                System.out.print("Enter your choice: ");
                inputsel = console.nextInt();
                countersel++;

                if (inputsel == 4){
                    System.out.println("\nWritten by:\nKeanu Bembo\nAlbert Masangkay");
                    System.exit(0);
                }

                if (countersel == 2){
                    System.out.println("\nWritten by:\nKeanu Bembo\nAlbert Masangkay");
                    System.exit(0);
                }
            }
        }
        while (inputsel <= 0 || inputsel > 3);
    }
}
