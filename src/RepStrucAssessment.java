import java.util.*;
public class RepStrucAssessment {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        //initialize outside
        int menu = 0;
        int countermenu = 0;

        //do (this) while menu is not 4 || counter is not 2(2 Problems only)
        do {
            System.out.println("[1] – Sum of Power\n[2] – Series\n[3] – Mode");
            System.out.print("Enter your choice: ");
            menu = console.nextInt();

            switch (menu) {
                case 1:
                    System.out.println("\nProblem 1 - Series:\n=====================\n");
                    System.out.print("Enter x : ");
                    double xprob1 = console.nextInt();
                    System.out.print("Enter n : ");
                    double nprob1 = console.nextInt();
                    double ansprob1 = 0;
                    double counter = 0;
                    double added1 = 0;
                    while (counter != nprob1) {
                        counter++;
                        ansprob1 = (Math.pow(xprob1, counter));
                        added1 += ansprob1;
                        if (counter == nprob1) {
                            System.out.println("Answer = " + added1);
                        }
                    }
                    countermenu++;
                    break;
                case 2:
                    System.out.println("\nProblem 2 - Series:\n=====================\n");
                    System.out.print("Enter n:  ");
                    int n = console.nextInt();
                    System.out.print("\nInput " + n + " integers: ");

                    int result = 0;
                    for (int i = 0; i < n; i++) {
                        int number = console.nextInt();
                        if (i % 2 == 0) {
                            result += number;
                        } else {
                            result -= number;
                        }
                    }
                    System.out.println("Answer = " + result);
                    countermenu++;
                    break;
                case 3:

                    countermenu++;
                    break;
            }
            // print again selection
            System.out.println("\n[1] – Sum of Power\n[2] – Series\n[3] – Mode\n[4] – Exit");
            System.out.print("Enter your choice: ");
            menu = console.nextInt();

            switch (menu) {
                case 1:
                    System.out.println("\nProblem 1 - Series:\n=====================\n");
                    System.out.print("Enter x : ");
                    double xprob1 = console.nextInt();
                    System.out.print("Enter n : ");
                    double nprob1 = console.nextInt();
                    double ansprob1 = 0;
                    double counter = 0;
                    double added1 = 0;
                    while (counter != nprob1) {
                        counter++;
                        ansprob1 = (Math.pow(xprob1, counter));
                        added1 += ansprob1;
                        if (counter == nprob1) {
                            System.out.println("Answer = " + added1);
                        }
                    }
                    countermenu++;
                    break;
                case 2:
                    System.out.println("\nProblem 2 - Series:\n=====================\n");
                    System.out.print("Enter n:  ");
                    int n = console.nextInt();
                    System.out.print("\nInput " + n + " integers: ");

                    int integers = 0;
                    for (int i = 0; i < n; i++) {
                        System.out.print(", ");
                        int number = console.nextInt();
                        if (i % 2 == 0) {
                            integers += number;
                        } else {
                            integers -= number;
                            System.out.println(integers);
                        }
                    }
                    System.out.println("Answer = " + integers);
                    countermenu++;
                    break;
                case 3:
                    int numInputs, mode = 0, maxCount = 0;
                    System.out.println("\nProblem 3 - Mode:\n=====================\n");
                    System.out.print("Enter a number:  ");
                    numInputs = console.nextInt();
                        while (numInputs != -1) {
                            int count = 0;

                            for (int i = numInputs; i != -1; i++) {
                                int digit = i % numInputs;

                                int current = numInputs;
                                while (current != 0) {
                                    if (digit == current % numInputs) {
                                        count++;
                                    }
                                    current /= numInputs;
                                }
                            }

                            if (count > maxCount) {
                                maxCount = count;
                                mode = numInputs;
                            }
                            System.out.print("Enter a number:  ");
                            numInputs = console.nextInt();
                        }

                        System.out.println("The mode is: " + mode);
                        System.out.println("The frequency of the mode is: " + maxCount);


                    }
                    countermenu++;
                    break;



        } while (menu >= 1 || menu != 4);

        if (menu == 4) {
            System.out.println("\nWritten by:\nKeanu Bembo\nAlbert Masangkay");
            System.exit(0);
        }

        if (countermenu == 2) {
            System.out.println("\nWritten by:\nKeanu Bembo\nAlbert Masangkay");
            System.exit(0);
        }
    }

}
