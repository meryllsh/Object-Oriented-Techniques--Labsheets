/*The Department of Computer Science requires a program for the conversion of exam marks to
grades. Write a program that will ask the user for his/mark for a subject and display the
corresponding grade.
70 – 100 A
60 – 69 B
50 – 59 C
40 – 49 D
< 40 F*/

package lab1;
import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		Scanner scanIn = new Scanner(System.in);
		int mark=0;
		System.out.println("Enter your mark for a subject: ");
		mark=scanIn.nextInt();
		if(mark>100) {
			System.out.println("Invalid grade");
		}
		else if(mark>=70 && mark<=100) {
			System.out.println("A");
		}
		else if(mark>=60) {
			System.out.println("B");
		}
		else if(mark>=50) {
			System.out.println("C");
		}
		else if(mark>=40) {
			System.out.println("D");
		}
		else if(mark>=0) {
			System.out.println("F");
		}
		else if(mark<0){
			System.out.println("Invalid grade");
		}
		scanIn.close();

	}

}
