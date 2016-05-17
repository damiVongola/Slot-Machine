public class SlotMachine{
    /* Name: Aleshinloye Damilola
     * Operating System: Windows 8
     * Editor: Blue-J
     * Java version number: 7
     * JDK: Oracle's Java-JDK
     */

    static double y;
    //this is a constructor for the SlotMachine class
    public SlotMachine (double student){
        this.y = student;
    }

    public  int play (boolean printIt) {
        //this creates a new object in the calculations class and the constructor from the calculations class accepts the arguement y
        Calculations calc = new Calculations(y);

        double figure1;
        double figure2;
        double figure3;

        y = calc.genPseudoRandNum();
        figure1 = (y * 5) + 1;
        y = calc.genPseudoRandNum();
        figure2 = (y * 5) + 1;
        y = calc.genPseudoRandNum();
        figure3 = (y * 5) + 1;
        //Using Math.floor to ensure that number is less than or equal to 5
        double finalFigure1 = Math.floor(figure1);
        double finalFigure2 = Math.floor(figure2);
        double finalFigure3 = Math.floor(figure3);
        long roundedFigure1 = Math.round(finalFigure1);
        long roundedFigure2 = Math.round(finalFigure2);
        long roundedFigure3 = Math.round(finalFigure3);
        //printIt is from the drawFigures method and it prints the figures drawn.
        if(printIt == true){
            System.out.println("Figures drawn: " + "F" + roundedFigure1
                + " " + "F" + roundedFigure2 + " " + "F"+ roundedFigure3);
        }

        if (roundedFigure1 == 1 && roundedFigure2 == 1 && roundedFigure3 == 1) {

            int firstNumber = 1;
            return firstNumber;
        } else {
            if (roundedFigure1 == roundedFigure2 && roundedFigure2 == roundedFigure3) {
                int secondNumber = 2;
                return secondNumber;
            } else {
                if (roundedFigure1 == roundedFigure2 || roundedFigure2 == roundedFigure3|| roundedFigure1 == roundedFigure3) {
                    int thirdNumber = 3;
                    return thirdNumber;
                } else {

                    int nonApplicable = 0;
                    return nonApplicable;
                }
            }

        }

    }

}
