/*A factory pays its workers at the rate of Rs 30 per hour if the number of hours worked (per week)
does not exceed 40. Otherwise, the hourly rate is Rs 50 for any hour worked above 40 in a given
week. Write a program that calculates the weekly wages from number of hours worked per week.*/

package lab1;
import java.util.Scanner;

public class Ex6 {

	public static void main(String[] args) {
		Scanner scanIn = new Scanner(System.in);
		int hours=0;
		System.out.println("Enter the number of hours you worked per week: ");
		hours=scanIn.nextInt();
		if(hours<0) {
			System.out.println("Error for the input of number of hours");
		}
		else if(hours<=40) {
			System.out.println("Weekly wages: " + (hours * 30));
		}
		else if(hours>40) {
			System.out.println("Weekly wages: " + ((40*30) + (hours-40) * 50));
		}
		scanIn.close();

	}

}
