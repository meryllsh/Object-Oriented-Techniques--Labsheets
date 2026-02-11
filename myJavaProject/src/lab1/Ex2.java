/*Write a program to read an amount of currency in dollars and the exchange rate of dollars (in
Rupees). The program should output the corresponding amount in rupees. Assume the $:Rs
conversion rate is 1:35 .*/

package lab1;
import java.util.Scanner; 

public class Ex2 {

	public static void main(String[] args) {
		Scanner scanIn = new Scanner(System.in);
		int dollars=0, rupees=0;
		System.out.println("Enter the amount of currency in dollars: ");
		dollars=scanIn.nextInt();
		rupees=dollars*35;
		System.out.println("The amount in rupees is: " + rupees);
		scanIn.close();

	}

}
