/*Write a program that will allow a user to enter the following details:
- Name
- Address
- Telephone number

The program should then display the above details as in the below example (notice the
alignment).
Name : your name
Address : your address
TEL : your Tel number*/

package lab1;
import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {
		Scanner scanIn = new Scanner(System.in);
		String name, address, tel;
		System.out.println("Enter your name: ");
		name=scanIn.next();
		System.out.println("Enter your address: ");
		address=scanIn.next();
		System.out.println("Enter your telephone number: ");
		tel=scanIn.next();
		System.out.println("Displaying the above details: ");
		System.out.println("Name : " + name);
		System.out.println("Address : " + address);
		System.out.println("TEL : " + tel);
		scanIn.close();

	}

}
