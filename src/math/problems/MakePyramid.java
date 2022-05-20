package math.problems;
import java.util.Scanner;
public class MakePyramid {

    /*   Implement a large Pyramid of stars in the screen with java.

     *
     * *
     * * *
     * * * *
     * * * * *
     * * * * * *

     */

    public void main(String args[]) {
        int rows;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number of rows");
        rows = scan.nextInt();
        System.out.println("Enter Sympol for use");
        char ch = scan.next().charAt(0);
//outer for loop
        for (int i = 1; i <= rows; i++) {//iterates trough rows in pyramid
            for (int j = i; j < rows; j++) {//innr for loop 1
                System.out.print(" ");//print space
            }
            for (int k = 1; k < 2 * i; k++) {//inner for loop 2
                if (i == rows || (k == 1 || k == 2 * i - 1)) {
                    System.out.print(ch);
                } else {
                    System.out.print(ch);//otherwise print input charactor
                }
            }
            System.out.println();//move to next line
        }
    }
}
