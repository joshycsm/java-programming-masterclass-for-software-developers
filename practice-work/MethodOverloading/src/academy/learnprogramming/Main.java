package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        int newScore = calculateScore("Tim", 500);
        System.out.println("newScore = " + newScore);
        calculateScore(75);
        calculateScore();

        /*
        Create a method called calcFeetAndInchesToCentimeters
        It needs to have two parameters.
        feet is teh first parameter, inches is the second parameter

        You should validate that the first parameter feet is >= 0
        You should validate that the 2nd parameter inches is >= 0 and <=12
        return -1 from the method if either of the above is not true

        If the parameters are valid, then calculate how many centimetres
        compromise the feet and inches passed to this method and return that value.

        Create a 2nd method of the same name but with only one parameter
        inches is the parameter
        validate that its >=0
        But if it's valid, then calculate how many feet are in the inches
        and then here is the tricky part
        call the other overloaded method passing the correct feet and inches
        calculated so that it can calculate correctly.
        hints: Use double for your number datatype is probably a good idea
        1 inch = 2.54cm and one foot = 12 inches
        use the link I give you to confirm your code is calculating correctly.
        Calling another overloaded method just requires you to use the
        right number of parameters
         */
        
//        int centimeterTotal =

        double centimeterTotal = calcFeetAndInchesToCentimeters(30);
        System.out.println("centimeterTotal = " + centimeterTotal);

        double centimeterTotal2 = calcFeetAndInchesToCentimeters(5, 4);
        System.out.println("centimeterTotal2 = " + centimeterTotal2);

        calcFeetAndInchesToCentimetersAlt(6, 0);
        calcFeetAndInchesToCentimetersAlt(7, 5);
        calcFeetAndInchesToCentimetersAlt(-10, 5);
        calcFeetAndInchesToCentimetersAlt(0, 5);
        calcFeetAndInchesToCentimetersAlt(2, -10);
        calcFeetAndInchesToCentimetersAlt(2, 13);

        double centimeters = calcFeetAndInchesToCentimetersAlt(6, 14);
        if (centimeters < 0.0) {
            System.out.println("Invalid parameters");
            System.out.println("centimeters = " + centimeters);
        }

        calcFeetAndInchesToCentimetersAlt(100);
        calcFeetAndInchesToCentimetersAlt(157);
        calcFeetAndInchesToCentimetersAlt(-10);

    }

    // alternate solution
    public static double calcFeetAndInchesToCentimetersAlt(double feet, double inches) {
        if (feet < 0 || inches < 0 || inches > 12) {
            System.out.println("Invalid feet or inches parameters");
            return -1;
        }

        double centimeters = (feet * 12) * 2.54;
        centimeters += inches * 2.54;
        System.out.println(feet + " feet, " + inches + " inches = " + centimeters + " cm");
        return centimeters;
    }

    public static double calcFeetAndInchesToCentimetersAlt(double inches) {
        if (inches < 0) {
            return -1;
        }

        double feet = (int) inches / 12;
        double remainingInches = (int) inches % 12;
        System.out.println(inches + " inches is equal to " + feet + " feet and " + remainingInches + " inches");
        return calcFeetAndInchesToCentimetersAlt(feet, remainingInches);
    }

    // my solution
    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
        if (feet >= 0 && inches >= 0 && inches <= 12) {
            double inchConversion = feet * 12;
            double inchTotal = inchConversion + inches;
            double centimeterTotal = inchTotal * 2.54;
            return centimeterTotal;
        }
        return -1;
    }
    public static double calcFeetAndInchesToCentimeters(double inches) {
        if (inches >= 0) {
            double centimeterTotal = inches * 2.54;
            return centimeterTotal;
        }
        return -1;
    }



    public static int calculateScore(String playerName, int score) {
        System.out.println("Player " + playerName + " scored " + score + " points");
        return score *1000;
    }
    public static int calculateScore(int score) {
        System.out.println("Unnamed Player scored " + score + " points");
        return score *1000;
    }
    public static int calculateScore() {
        System.out.println("No player name, no player score");
        return 0;
    }


}
