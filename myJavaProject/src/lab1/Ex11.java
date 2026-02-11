/*Write a program that uses nested loops to read the marks of 5 students in 3 subjects and calculate
their total marks and average.*/

package lab1;
import java.util.Scanner; 

public class Ex11 {

	public static void main(String[] args) {
		Scanner scanIn = new Scanner(System.in);
		int mark=0;
		float total=0;
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=3; j++) {
		System.out.println("Enter the mark for student " + i + " in subject " + j + ": ");
		mark=scanIn.nextInt();
		total+=mark;
			}
		}
		System.out.println("The total marks are: " + total);
		System.out.println("The average marks are: " + (total/15));
		scanIn.close();

	}

}
