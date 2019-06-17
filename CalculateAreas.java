package calculateareas;

import java.util.Scanner;

public class CalculateAreas {

    public static void main(String[] args) {
//      Scanner object
        Scanner input = new Scanner(System.in);
        double length, sideLength, sideNumber;
        System.out.println("Select the shape to calculate the area: Pentagon[1]\tHexagon[2]\tPolygon[3]\t");
        byte selection = input.nextByte();

        while (selection < 1 || selection > 3) {
            System.out.print("Invalid input! Try again...\t");
            selection = input.nextByte();
        }

        switch (selection) {

            case 1:
                //      Convery the message to enter the length of the pentagon.
                System.out.print("Enter the length from the center to a vertex: \t");
                //      Prompts the user to enter the length from the center to a vertex.
                length = input.nextDouble();
                //      Calculating the side of the pentagon.
                sideLength = 2 * length * Math.sin(Math.PI / 5);
                //      Displaying the reasult in the output consol.
                System.out.printf("\nThe side of the pentagon is %.2f.\n", 2 * length * Math.sin(Math.PI / 5));
                System.out.printf("The area of the pentagon is %.2f.\n\n", (5 * Math.pow(sideLength, 2) / (4 * Math.tan(Math.PI / 5))));
                break;

            case 2:

                //      Convery the message to enter the length of a side
                System.out.print("Enter the length of a side: \t");
                //      Prompts the user to enter the length of a side
                length = input.nextDouble();
                //      Displaying the reasult in the output consol
                System.out.printf("The area of the hexagon is %.2f\n\n", (6 * Math.pow(length, 2)) / (4 * Math.tan(Math.PI / 6)));
                break;

            case 3:
                //      Convery the message to enter the number of sides
                System.out.print("Enter the number of sides: \t");
                //      Prompts the user to enter the length of a side
                sideNumber = input.nextDouble();
                //      Convery the message to enter the side length
                System.out.print("Enter the length of a side: \t");
                sideLength = input.nextDouble();
                //      Displaying the reasult in the output consol
                System.out.printf("The area of the polygon is %.2f\n\n", (sideNumber * Math.pow(sideLength, 2))
                        / (4 * Math.tan(Math.PI / sideNumber)));
                break;

            default:
                System.out.println("Invalid input value!");
        }
    }

}
