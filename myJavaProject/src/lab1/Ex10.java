/*Write a program which continuously asks the user to key in positive numbers and displays the
square root of these numbers.
The program stops if the user types in a negative number.*/

package lab1;
import java.util.Scanner; 
import java.lang.Math;

public class Ex10 {

	public static void main(String[] args) {
		Scanner scanIn = new Scanner(System.in);
		float num=0;
		do {
		System.out.println("Enter a positive number: ");
		num=scanIn.nextFloat();
		if(num>0) {
			System.out.println("The square root of the number is: " + Math.sqrt(num));

		}
		}
		while(num>0);
			System.out.println("Program stops.");
	
		
		scanIn.close();

	}

}
