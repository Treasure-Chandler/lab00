/*
 * Treasure Chandler
 * CS 16000-01 — 02/03, Fall Semester 2024 (comments: )
 * Practice Lab
 */

package lab00;

public class PracticeLab {
 
    public static void main(String[] args) {
        // problem 1:
        // declared variables
 		String firstName = "Charles";
 		String lastName = "Dickens";
        String middleName = "John Huffam";

        // problem 2:
        nameDisplay();

        // problem 3:
        nameDisplay(firstName, middleName, lastName);

        // problem 5:
        System.out.println("\n Check whether the name is Charles John-Huffam Dickens.");
        nameDisplay(firstName, "John-Huffam", lastName);

        // problem 6:
        nameDisplay(lastName, middleName, firstName);
        String mName = "J.H.";
        System.out.println(firstName + " " + mName + " " + "Dickens" + "!");

        // problem 7:
        System.out.println();
        divideDisplay();

        // String statement = "My experience:\n" + 
        //                     "\tThe first three expressions are integer divisions as both operands\n" +
        //                     "\tof the divisions return an integer; because of this, there are no\n" +
        //                     "\tdouble/floating numbers present. In the last three expressions, the\n" +
        //                     "\toperation of division returns a floating point value of a double data\n" + 
        //                     "\ttype, since 2., 3., and 4., are floating-point numbers of a double data\n" +
        //                     "\ttype. Moreover, before the division operator is processes, the compiler\n" +
        //                     "\tconverts 1, 11, and 5 into floating-point values of the double data type.\n" +
        //                     "\tThis conversion is called a widening conversion. the '+' is an operation for\n" +
        //                     "\tconcatenation. The symbol '/t' (forward slash t, as it won't show up in text)\n" +
        //                     "\tis an escape sequence, which will use the cursor to skip over to the next tab step.";
        // System.out.print(statement);
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
     } // end of divideDisplay()
 
} // end of PracticeLab