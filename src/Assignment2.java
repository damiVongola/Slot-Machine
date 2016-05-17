import java.util.Scanner;
public class RandomNumberGenerator{

    public static void main(String[]args){
        /* Name: Aleshinloye Damilola
         * Operating System: Windows 8
         * Editor: Blue-J
         * Java version number: 7
         * JDK: Oracle's Java-JDK
         */
        double student;
        int option;
        //converts student to string
        String conversion;
        boolean continueLoop;

        Scanner kb = new Scanner(System.in);
        System.out.println("Enter your Student number as 0.<y_no>:");
        student = kb.nextDouble();
        conversion = student + "";
        //this creates an object from the Slot Machine class
        SlotMachine calculation = new SlotMachine(student);

        //verifies that the number is 9 digits long
        while (conversion.length() != 9) {
            System.out.println("This number is invalid");
            System.out.println("Enter number again");
            student = kb.nextDouble();
            conversion = student + "";
        }
        //ensures that the loops continue
        continueLoop = true;
        while (continueLoop == true) {

            System.out.println("Welcome to the SlotMachine Java Application!");
            System.out.println("Your choices are:");
            System.out.println("0 - leave the application!");
            System.out.println("1 - bet on figure F1 only");
            System.out.println("2 - bet on three equal figures!");
            System.out.println("3 - bet on any prize");

            System.out.println("Which option do you want?");
            option = kb.nextInt();
            if (option == 0 || option == 1 || option == 2 || option == 3) {
                //initiates the option 0
                if (option == 0) {
                    System.out.println("Thanks for playing!");
                    System.exit(1);
                }
                //gotten from play method and Slot machine class and it helps to draw figures
                int figuresDraw = calculation.play(true);
                //initiates the option 1
                if (option == 1) {
                    {
                        System.out.println("You bet on figure F1 only...!");
                    }
                    //this prints the winnings if anything is won
                    if (figuresDraw == 1) {
                        System.out.println("You won 4X dollars");

                    } else {

                        System.out.println("Sorry, you lost ! Try again ! :)");

                    }
                }
                //initiates the second option
                if (option == 2) {

                    System.out.println("You bet on three equal figures...");
                    //this prints the prizes of option 2 if anything is won
                    if (figuresDraw == 1 || figuresDraw == 2) {
                        System.out.println("You won 2X dollars");

                    } else {

                        System.out.println("Sorry, you lost ! Try again ! :)");
                    }
                }
                //initiates the option three
                if (option == 3) {
                    System.out.println("You bet on any prize...");
                    //this prints the prizes of option 3 if anything is won
                    if (figuresDraw == 1 || figuresDraw == 2 || figuresDraw == 3) {
                        System.out.println("You won X dollars");
                    } else {

                        System.out.println("Sorry, you lost ! Try again ! :)");
                    }

                }

            }

        }
    }

}
