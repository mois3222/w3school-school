/**
 * This's principal class of this project
 * there is we gonna develop all code
 * of our project.
 * @author Moisés Buenaño Tuberquia (TheMoidbytes)
 */

/**
 * Modifier visibility -> [public || private],
 * Key word -> class,
 * body class -> {}
 * 
 */

public class Main {
    /**
     * 
     * @param args
     */
    public static void main(String[] args) {

        System.out.println("Hello world");

        /*
         * Variables
         * declares and with value assigned
         */
        String name = "Jhon";
        System.out.println(name);
        int myNum = 19;
        System.out.println(myNum);

        /*
         * Variables
         * with just declared
         * 
         */
        int myAge;
        myAge = 21;
        System.out.println(myAge);

        /*
         * final variables
         * This would be as the const variables in JavaScript
         */
        final Integer JustOneValue = 12;
        System.out.println(JustOneValue);

        // _____
        final String Myname = "Jhon";
        String secondName = "Alejandro";
        final String lastName = "Rodriguez";

        final String fullName = Myname + " " + " " + secondName + " " + lastName;

        System.out.println(fullName);

        final int y = 19, x = 1, z = 34;

        System.out.println(y + x + z);

        /* Java Data Types */
        int myNumber = 5; // Integer (whole number)
        float myFloatNum = 5.99f; // Floating point number
        char myLetter = 'D'; // Character
        boolean myBool = true; // Boolean
        String myText = "Hello"; // String

        /* Java Switch Statements */
        int choose = 2;
        switch (choose) {
            case 1:
                System.out.println(myNumber);

                break;
            case 2:
                System.out.println(myFloatNum);
                break;
            case 3:
                System.out.println(myText);
                break;
            case 4:
                System.out.println(myLetter);
                break;
            case 5:
                System.out.println(myBool);
                break;
            default:
                System.out.println("Unknown");
                /*
                 * break: it breaks the execution of code;
                 */
                break;
        }

        /* do wihile or loops */

        int index = 0;

        do {
            System.out.println("This's a new index -> " + index);
            index++;
        } while (index < 19);

        /* For loop */

        for (int i = 0; i < 4; i++) {
            System.out.println("This's currently index -> " + i);
        }

        /*
         * ForEach Loop
         */

        String[] cars = { "Volvo", "BMW", "Ford", "Mazda" };

        /*
         * for(const index of indexs){}
         * 
         */

        for (String i : cars) {
            System.out.println(i);
        }

        /* Break and Continue */

        for (int i = 0; i < 6; i++) {
            if (i == 4) {
                continue;
            }
            System.out.println(i);
        }

        int[] myNums = { 10, 10, 20, 59 };
        int[][] myMultipleNumber = { { 10, 10, 20, 59 } };
        System.out.println(myNums[2]);

        myMethod();

        myNewMethod("Juan");
        myNewMethod("Cristian");
        myNewMethod("Pablo");
        multiArgs("Moisés", 21);
        System.out.println(sum(56, 60));

        /* Method Overload */

        int rta = plusMethod(21, 78);
        double rta2 = plusMethod(21.7, 78.789);

        System.out.println(rta);
        System.out.println(rta2);

    }

    public static double plusMethod(double a, double b) {
        double c = a + b;

        return c;
    }

    public static int plusMethod(int a, int b) {
        int c = a + b;

        return c;
    }

    static void myMethod() {
        System.out.println("This is a my method");
    }

    static void myNewMethod(String fname) {
        System.out.println(fname + " Refsnes");
    }

    /**
     * 
     * @param fname
     * @param age
     */
    public static void multiArgs(String fname, int age) {
        System.out.println("Hello I am " + fname + " and my age is " + age);
    }

    public static int sum(int x, int y) {
        return x + y;
    }
}
