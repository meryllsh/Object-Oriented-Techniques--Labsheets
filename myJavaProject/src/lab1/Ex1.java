/*Write a program that allows you to input a temperature in degrees Celsius and output the
corresponding value in Fahrenheit.*/

package lab1;
import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		Scanner scanIn = new Scanner(System.in);
		int degrees=0; 
		float fahrenheit=0;
		System.out.println("Input temperature in degrees: ");
		degrees=scanIn.nextInt();
		fahrenheit=(float)((degrees*((float)9/5))+32);
		System.out.println("The temperature in fahrenheit is: " + fahrenheit);
		scanIn.close();
		

	}

}
