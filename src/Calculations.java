public class Calculations{
    /* Name: Aleshinloye Damilola
     * Operating System: Windows 8
     * Editor: Blue-J
     * Java version number: 7
     * JDK: Oracle's Java-JDK
     */

    private double y;

    // this is a constructor for the Calculations class
    public Calculations(double y){
        this.y = y;
    }
    // this method calculates the sine of the numbers using the calcFactorial method
    public double calcSine(double x) {
        int k = 0;

        double num = Math.pow(x, 2 * k + 1) / calcFactorial(2 * k + 1);
        double sineX = num;
        while (Math.abs(num) >= Math.pow(10, -8)) {
            k++;
            num = Math.pow(-1, k) * Math.pow(x, 2 * k + 1) / calcFactorial(2 * k + 1);
            sineX += num;
        }
        //this returns the sine of a number 
        return sineX;

    }
    //this method calculates factorial and uses this factorial to do the calcSine 
    public long calcFactorial(int n) {
        long returnNum = 1;
        for (int i = 1; i <= n; i++) {
            returnNum *= i;
        }
        //this returns the factorial of a number
        return returnNum;
    }
    //this generates the random numbers using the sine formula
    public double genPseudoRandNum() {

        double x;

        x = (9821.0 * Math.abs(calcSine(y)) + 0.211327);
        y = x - Math.floor(x);

        return y;
    }
}
