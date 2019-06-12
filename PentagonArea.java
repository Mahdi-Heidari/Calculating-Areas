package pentagonarea;

import java.util.Scanner;

public class PentagonArea {

    public static void main(String[] args) {

        //      Convery the message to enter the length of the pentagon.
        System.out.print("Enter the length from the center to a vertex: \t");
//      Creating an object.
        Scanner input = new Scanner(System.in);
//      Prompting the user to enter the length from the center to a vertex.
        double length = input.nextDouble();
//      Calculating the side of the pentagon.
        double side = 2 * length * Math.sin(Math.PI / 5);
//      Displaying the reasult in the output consol.
        System.out.printf("\nThe side of the pentagon is %.2f.\n", 2 * length * Math.sin(Math.PI / 5));
        System.out.printf("The area of the pentagon is %.2f.\n\n", (5 * Math.pow(side, 2) / (4 * Math.tan(Math.PI / 5))));

    }

}
