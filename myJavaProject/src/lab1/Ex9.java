/*Write a program that uses a while loop to determine how long it takes for an investment to double
at a given interest rate. The input will be an annualized interest rate, and the output is the number
of years it takes an investment to double.
Note: the amount of the initial investment does not matter; you can use MUR 100.*/

package lab1;
import java.util.Scanner;

public class Ex9 {

	public static void main(String[] args) {
		Scanner scanIn = new Scanner(System.in);
		int rate=0, i=0, sum=100;
		System.out.println("Enter the value for the annualised rate(in %): ");
		rate=scanIn.nextInt();
		while(sum>0) {
			sum=sum-rate;
			i=i+1;
		}
		System.out.println("Number of years it takes for an investment to double: " + i );
		scanIn.close();

	}

}
