/*Write a program which finds out the value of a bank deposit, P, after n years given that the
annual interest on the deposit is r %, assuming that no withdrawals are made during those n
years.
P, n and r are to be input by the user.
The program must display the value of the bank deposit after each year in an appropriate format.
Note that this problem involves the calculation of compound interest.*/

package lab1;
import java.util.Scanner;

public class Ex7 {

	public static void main(String[] args) {
		Scanner scanIn = new Scanner(System.in);
		float deposit=0, years=0, interest=0;
		System.out.println("Write the value of your bank deposit: ");
		deposit=scanIn.nextFloat();
		System.out.println("Write the value for the annual interest: ");
		interest=scanIn.nextFloat();
		System.out.println("Write the value for the number of years: ");
		years=scanIn.nextFloat();
		for(int i=1; i<=years; i++) {
			deposit=deposit*(1+(interest/100));
			System.out.println("The value of the bank deposit after year " + i + ": " + deposit);
		}
		scanIn.close();

	}

}
