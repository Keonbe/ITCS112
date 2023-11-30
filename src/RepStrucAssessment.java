import java.util.*;
public class RepStrucAssessment {
    public static void main(String[] args) {
        /*
        answer 2 problem of your choice, in one file only
        program will continue until a no response is entered
         */
        Scanner console = new Scanner(System.in);
        //initialize outside
        int menu = 0;
        int countermenu = 0;

        //do (this) while menu is not 4 || counter is not 2(2 Problems only)
        do {
            System.out.println("[1] – Sum of Power\n[2] – Series\n[3] – Mode");
            System.out.print("Enter your choice: ");
            menu = console.nextInt(); //enter selection

            switch (menu) { //do this(switch) if menu(case) is selected
                case 1: //if 1 is chosen in menu
                    System.out.println("\nProblem 1 - Series:\n=====================\n");
                    System.out.print("Enter x : ");
                    double xprob1 = console.nextInt();
                    System.out.print("Enter n : ");
                    double nprob1 = console.nextInt();
                    double ansprob1 = 0, counter1 = 0, added1 = 0;
                    while (counter1 != nprob1) {
                        counter1++;
                        ansprob1 = (Math.pow(xprob1, counter1)); //multiply raised to counter, counter increments until n is reached
                        added1 += ansprob1; //add itself
                        if (counter1 == nprob1) { //counter has reached n, then print total
                            System.out.println("Answer = " + added1);
                        }
                    }
                    countermenu++;
                    break;

                case 2: //if 2 is chosen in menu
                    System.out.println("\nProblem 2 - Series:\n=====================\n");
                    System.out.print("Enter n:  ");
                    int n = console.nextInt();
                    System.out.println("Input " + n + " integers: ");
                    int result = 0;
                    for (int i = 0; i < n; i++) { //loop until i is less than n
                        int number = console.nextInt(); //inputs a number
                        if (i % 2 == 0) { //if the number is divisible by 2 then add, else minus
                            result += number; //previous value gets added
                        } else {
                            result -= number; //previous value gets deducted
                        }
                    }
                    System.out.println("Answer = " + result); //if the conditions are false, then print
                    countermenu++;
                    break;

                case 3: //if 3 is chosen in menu
                    int counter3 = 0, counterph = 0, frequency, mode= 0, modeph= 0;
                    System.out.println("\nProblem 3 - Mode:\n=====================\n"); //most difficult but is easy
                    System.out.print("Enter a number: ");
                    int n3 = console.nextInt();
                    modeph = n3; //assign to a placeholder for reference, not included in the loop
                    do{
                        //prioritize the freq first. Compare frequency of current and previous input
                        if(counter3 > counterph){ //if counter (current) is greater than counterph (previous)
                            frequency=counter3; //frequency will be the current
                        } else frequency=counterph; //frequency will be the previous

                        //compare the input
                        if (modeph == n3){ //if the placeholder is the same is input
                            counter3++; //count the frequency it occurred
                            mode = n3; //save the number with highest freq
                        } else{ //if the placeholder is not the same as input
                            counterph = counter3; //copy
                            counter3 = 1; //reset for the next number
                            modeph = n3; //assign the input to the placeholder
                        }
                        System.out.print("Enter n: ");
                        n3 = console.nextInt();
                    }while (n3 != -1); //ask for input till -1 is entered which in turn will terminate the program
                    System.out.print("\nMode = " + mode);
                    System.out.print("\nFrequency = " + frequency);
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
                    double counter1 = 0;
                    double added1 = 0;
                    while (counter1 != nprob1) {
                        counter1++;
                        ansprob1 = (Math.pow(xprob1, counter1));
                        added1 += ansprob1;
                        if (counter1 == nprob1) {
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
                        int number = console.nextInt();
                        if (i % 2 == 0) {
                            integers += number;
                        } else {
                            integers -= number;
                        }
                    }
                    System.out.println("Answer = " + integers);
                    countermenu++;
                    break;

                case 3:
                    int counter3 = 0, counterph = 0, frequency, mode, modeph= 0;
                    System.out.println("\nProblem 3 - Mode:\n=====================\n");
                    System.out.print("Enter a number: ");
                    int n3 = console.nextInt();
                    mode = n3;
                    do{
                        if(counter3 > counterph){
                            frequency=counter3;
                        } else frequency=counterph;

                        if (mode == n3){
                            counter3++;
                            modeph = n3;
                        } else{
                            counterph = counter3;
                            counter3 = 1;
                            mode = n3;

                        }
                        System.out.print("Enter n: ");
                        n3 = console.nextInt();


                    }while (n3 != -1);
                    System.out.print("\nMode = " + modeph);
                    System.out.print("\nFrequency = " + frequency);
                    }
                    countermenu++;
                    break;

        } while (menu >= 1 || menu != 4); //repeat selection until a number greater or equal to 1 or a number not 4 is entered

        if (menu == 4) {
            System.out.println("\nWritten by:\nKeanu Bembo\nAlbert Masangkay");
            System.exit(0);
        }

        if (countermenu == 2) { //go to line 5
            System.out.println("\nWritten by:\nKeanu Bembo\nAlbert Masangkay");
            System.exit(0);
        }
        System.out.println("\nWritten by:\nKeanu Bembo\nAlbert Masangkay");
        System.exit(0);
    }

}
