/*
 * Treasure Chandler
 * CS 16000-01 — 02/03, Fall Semester 2024 (comments: )
 * Practice Lab
 */

package lab00;

public class PracticeLab {
 
    public static void main(String[] args) {
        // declared variables
        // problem 1:
 		String firstName = "Charles";
 		String lastName = "Dickens";
        String middleName = "John Huffam";
        // problem 8:
        int iEleven = 11;
        int iThree = 3;
        double dEleven = 11;
        double dThree = 3;

        // problem 2:
        nameDisplay();

        // problem 3:
        nameDisplay(firstName, middleName, lastName);

        // problem 5:
        System.out.println("Check whether the name is Charles John-Huffam Dickens.");
        nameDisplay(firstName, "John-Huffam", lastName);

        // problem 6:
        nameDisplay(lastName, middleName, firstName);
        String mName = "J.H.";
        System.out.println(firstName + " " + mName + " " + "Dickens" + "!");

        // problem 7:
        System.out.println();
        divideDisplay();
        System.out.print("My experience:\n" + 
                        "\tThe first three expressions are integer divisions as both operands\n" +
                        "\tof the divisions return an integer; because of this, there are no\n" +
                        "\tdouble/floating numbers present. In the last three expressions, the\n" +
                        "\toperation of division returns a floating point value of a double data\n" + 
                        "\ttype, since 2., 3., and 4., are floating-point numbers of a double data\n" +
                        "\ttype. Moreover, before the division operator is processes, the compiler\n" +
                        "\tconverts 1, 11, and 5 into floating-point values of the double data type.\n" +
                        "\tThis conversion is called a widening conversion. the '+' is an operation for\n" +
                        "\tconcatenation. The symbol '/t' (forward slash t, as it won't show up in text)\n" +
                        "\tis an escape sequence, which will use the cursor to skip over to the next tab step.");

        // problem 9:
        divideDisplay(iEleven, dEleven, iThree, dThree);

        System.out.printf("%d\t%d\t%.16f\t%.16f\t%.16f\n" +
                        "%.16f\t%.16f\t%.16f\t%.16f\n" +
                        "%.1f\t%.1f\t%d\t%d\n\n",
                        iEleven/iThree, iThree/iEleven, dThree/iEleven, dEleven/iThree, iThree/dEleven, +
                        iEleven/dThree, dEleven/dThree, iEleven/(double)iThree, (double)iEleven/iThree, +
                        (double)(iEleven/iThree), (double)(iThree/iEleven), (int)(dEleven/dThree), (int)(dThree/dEleven));

        // problem 10:
        System.out.printf("(int)iEleven/dThree = %.16f\n(int)(iEleven/dThree) = %d\n(int)(iEleven/dThree * 1000)/1000.) = %.3f\n\n",
                        (int)iEleven/dThree, (int)(iEleven/dThree), (int)(iEleven/dThree * 1000)/1000.);

        // problem 11:
        squareCubeRoot(7);

        // problem 13:
        int iNumber = 8;
        int iPrime = 5;

        // problem 14:
        computeDisplay(iEleven, iThree, iNumber, iPrime);

    } /* end of main() */

    // problem 3:
    public static void nameDisplay() {

        System.out.print("Charles");
        System.out.print("Dickens");
        System.out.print("Charles ");
        System.out.print("Dickens\n");
        System.out.print("Charles" + " ");
        System.out.print("Dickens\n");
        System.out.println("Charles" + "Dickens");
        System.out.println("Charles Dickens");
        System.out.println("Charles" + " " + "Dickens");
        System.out.println("Charles " + "John Huffam" + " " + "Dickens");

    } // end of nameDisplay()

    /**
     * @param fName     String class, first name
     * @param mName     String class, middle name
     * @param lastName  String class
     */
    // problem 4:
    public static String nameDisplay(String fName, String mName, String lastName) {
        // observation of the outputs from the print(), println().=, and println() methods
        System.out.println(); // leaves a line space and goes to the next line
        System.out.print(fName); // in this case, fName is a reference variable
        System.out.print(" ");
        System.out.print(mName);
        System.out.print(" " + lastName + "\n");
        System.out.print(fName + " " + mName + " " + lastName + "\n");
        System.out.println(fName + " " + mName + " " + lastName);
        System.out.println(lastName + ", " + fName + " " + mName);
        System.out.printf("My full name is %s %s %s.\n", fName, mName, lastName);
        System.out.printf("My name is %s %s %s.\n", lastName, fName, mName);
        System.out.printf("\"My name is \"%s, %s %s.\"\"\n", lastName, fName, mName);

        return "End of tasks!";
    } // end of nameDisplay(String fName, String mName, String lastName)

    public static void divideDisplay() {
        System.out.println();
        System.out.printf("1/2\t11/3\t4/5\t1/2.\t11/3.\t\t\t4./5\n");
        System.out.println(1/2 + "\t" + 11/3 + "\t" + 4/5 + "\t"
                        + 1/2. + "\t" + 11/3. + "\t" + 4./5); 
        System.out.println();
        System.out.printf("1/2 = %d,\t11/3 = %d,\t4/5 = %d,\t" + 
                        "1/2. = %.1f,\t11/3. = %.16f,\t4./5 = %f\n",
                        1/2, 11/3, 4/5, 1/2., 11/3., 4./5);
    } // end of divideDisplay()

    /**
     * 
     * @param i11       int class, integer 11
     * @param d11       double class, double 11
     * @param i3        int class, integer 3
     * @param d3        double class, double 3
     */
    // problem 9:
    public static void divideDisplay(int i11, double d11, int i3, double d3) {
        System.out.printf("\n\n" +
                        "i11/i3 = %d,\ti3/i11 = %d,\td3/i11 = %.6f,\t" +
                        "d11/i3 = %.6f,\ti3/d11 = %.6f\n\n",
                        i11/i3, i3/i11, d3/i11, d11/i3, i3/d11);
    } // end of divideDisplay(int i11, double d11, int i3, double d3)

    /**
     * 
     * @param num       int class, number to calculate the 
     *                  square and cube root of
     */
    // problem 11:
    public static void squareCubeRoot(int num) {
        System.out.println("sqrt(" + num + ") = " + Math.sqrt(num));
        System.out.println("cbrt(" + num + ") = " + Math.cbrt(num) + "\n");

        // problem 12:
        System.out.printf("sqrt(%d) = %.2f\n" +
                        "cbrt(%d) = %.2f\n\n",
                        num, Math.sqrt(num), num, Math.cbrt(num));
        System.out.printf("sqrt(%d) = %.4f\n" +
                        "cbrt(%d) = %.4f\n\n",
                        num, Math.sqrt(num), num, Math.cbrt(num));
    } // end of squareCubeRoot(int num)

    /**
     * 
     * @param i11       int class, integer 11
     * @param i3        int class, integer 3
     * @param iNumber   int class, integer 8
     * @param iPrime    int class, integer 5
     */
    // problem 14:
    private static void computeDisplay(int i11, int i3, int iNumber, int iPrime) {
        System.out.printf("iEleven / 2 * 2 = %d\n" + 
                        "iThree * iNumber + iEleven / iPrime = %d\n" +
                        "iThree / iEleven - iNumber + iThree * iPrime = %d\n" +
                        "iEleven / (2 * 2) = %d\n" +
                        "iThree * (iNumber + iEleven) / iPrime = %d\n" +
                        "iThree / (iEleven - iNumber) + iThree * iPrime = %d\n" +
                        "iThree / (iEleven - iNumber + iThree) * iPrime = %d\n" +
                        "iThree / iEleven - (iNumber + iThree) * iPrime = %d\n",
                        i11 / 2 * 2, +
                        i3 * iNumber + i11 / iPrime, +
                        i3 / i11 - iNumber + i3 * iPrime, +
                        i11 / (2 * 2), +
                        i3 * (iNumber + i11 / iPrime), +
                        i3 / (i11 - iNumber) + i3 * iPrime, +
                        i3 / (i11 - iNumber + i3) * iPrime, +
                        i3 / i11 - (iNumber + i3) * iPrime);
    } // end of computeDisplay(int i11, int i3, int iNumber, int iPrime)
 
} // end of PracticeLab