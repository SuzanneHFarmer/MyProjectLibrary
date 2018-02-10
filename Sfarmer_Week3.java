package sfarmer_week3;

/** 
 * @Course: SDEV 250 ~ Java Programming I
 * @Author Name: SHF
 * @Assignment Name: sfarmer_week3
 * @Date: Feb 4, 2018
 * @Description:if/else vs switch case: 
 *              program to calculate area of various geometric shapes
 */
//Imports

import java.util.Scanner;
import static java.lang.Math.*;


//Begin Class Sfarmer_Week3
public class Sfarmer_Week3 {

    //Begin Main Method
    public static void main(String[] args) {

        //Declarations
        int squareA;
        int pentA;
        int cRadius;
        int eRadius1;
        int eRadius2;
        double squareArea;
        double pentArea;
        double circleArea;
        double ellipseArea;
        double result;
        int choice;
        
        //New scanner object
        Scanner sc = new Scanner(System.in);
        
        //Intro, user input
        System.out.print("This program will calculate the area of " + 
                "\n" + "a few geometric shapes." + "\n");
        System.out.println("Please enter a number for one of these options:");
        System.out.println("1. Square");
        System.out.println("2. Circle");
        System.out.println("3. Ellipse");
        System.out.println("4. Pentagon");
        System.out.println("5. Exit program");
        choice = sc.nextInt();
        
        switch (choice) {
            case 1:
                System.out.print("Please enter the length of " + "\n"
                + "one side of the square." + "\n");
                squareA = sc.nextInt();
                
                //Formula
                squareArea = Math.pow(squareA, 2);
                
                //Output
                System.out.print("The formula for the area of a square is " + "\n"
                    + "side^2." + "\n");
                System.out.print("The area of a square with side length " + "\n"
                    + squareA + " is " + squareArea + "." + "\n");
                break;
                
            case 2:
                System.out.println("Please enter the radius of the circle.");
                cRadius = sc.nextInt();
            
                //Formula
                circleArea = Math.PI * Math.pow(cRadius, 2);
            
                //Output
                System.out.print("The formula for the area of a circle is " + "\n"
                    + "PI * radius^2." + "\n");
                System.out.print("The area of a circle with radius " + "\n"
                    + cRadius + " is " + circleArea + " .");
                break;
                
            case 3:
                System.out.print("Please enter radius one of the ellipse.");
                eRadius1 = sc.nextInt();
                System.out.print("Please enter radius two of the ellipse.");
                    eRadius2 = sc.nextInt();
            
                //Formula
                ellipseArea = Math.PI * eRadius1 * eRadius2;
            
                System.out.print("The formula for the area of an " + "\n"
                    + "ellipse is PI * radius 1 * radius 2." + "\n");
                System.out.print("The area of an ellipse with radius " + "\n"
                    + eRadius1 + " and radius " + eRadius2 + " is " + "\n" +
                    ellipseArea + " .");
                break;
                
            case 4:
                System.out.print("Please enter the length of one side" + "\n"
                    + " of the pentagon.");
                pentA = sc.nextInt();
            
                //Formula
                pentArea = (0.25 * Math.sqrt(5 * (5 + (2 * (Math.sqrt(5)))))) * 
                    Math.pow(pentA, 2);
                System.out.print("The formula for the area of a pentagon " + "\n"
                    + "is (0.25 * (sqrt(5 * (5 + (2 + sqrt(5))))) * side^2" + "\n");
                System.out.print("The area of a pentagon with side " + pentA + "\n"
                    + " is " + pentArea + ".");
                break;
                
            case 5:
                System.out.println("Exiting program.");
                System.exit(0);
                break;
                
            default:
                System.out.println("That's not a valid value. Exiting program.");
                System.exit(1);
                break;
        }
        
//        if (choice == 1) {
//            System.out.print("Please enter the length of " + "\n"
//            + "one side of the square." + "\n");
//            squareA = sc.nextInt();
//            
//            //Formula
//            squareArea = Math.pow(squareA, 2);
//            
//            //Output
//            System.out.print("The formula for the area of a square is " + "\n"
//                + "side^2." + "\n");
//            System.out.print("The area of a square with side length " + "\n"
//                + squareA + " is " + squareArea + "." + "\n");
//        }
//        else if (choice == 2) {
//            System.out.println("Please enter the radius of the circle.");
//            cRadius = sc.nextInt();
//            
//            //Formula
//            circleArea = Math.PI * Math.pow(cRadius, 2);
//            
//            //Output
//            System.out.print("The formula for the area of a circle is " + "\n"
//                    + "PI * radius^2." + "\n");
//            System.out.print("The area of a circle with radius " + "\n"
//                + cRadius + " is " + circleArea + " .");
//        }
//        else if (choice == 3) {
//            System.out.print("Please enter radius one of the ellipse.");
//            eRadius1 = sc.nextInt();
//            System.out.print("Please enter radius two of the ellipse.");
//            eRadius2 = sc.nextInt();
//            
//            //Formula
//            ellipseArea = Math.PI * eRadius1 * eRadius2;
//            
//            System.out.print("The formula for the area of an " + "\n"
//                + "ellipse is PI * radius 1 * radius 2." + "\n");
//            System.out.print("The area of an ellipse with radius " + "\n"
//                + eRadius1 + " and radius " + eRadius2 + " is " + "\n" +
//                ellipseArea + " .");
//        }    
//        else if (choice == 4) {
//            System.out.print("Please enter the length of one side" + "\n"
//                + " of the pentagon.");
//            pentA = sc.nextInt();
//            
//            //Formula
//            pentArea = (0.25 * Math.sqrt(5 * (5 + (2 * (Math.sqrt(5)))))) * 
//                    Math.pow(pentA, 2);
//            System.out.print("The formula for the area of a pentagon " + "\n"
//                + "is (0.25 * (sqrt(5 * (5 + (2 + sqrt(5))))) * side^2" + "\n");
//            System.out.print("The area of a pentagon with side " + pentA + "\n"
//                + " is " + pentArea + ".");
//        }
//        else if (choice == 5) {
//            System.out.println("Exiting program.");
//            System.exit(0);
//        }
//        else {
//            System.out.println("That's not a valid value. Exiting program.");
//            System.exit(1);
//        }               
     
    } //End Main Method

} //End Class Sfarmer_Week3
