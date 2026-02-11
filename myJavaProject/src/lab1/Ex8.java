/*Using while loops, write programs that calculates the following:
a) Sum of the first n counting numbers: 1 + 2 + 3 + .. + n
b) Sum of the first n odd numbers: 1 + 3 + 5 + .. + n
c) The number of times a whole number can be divided by 2 (using integer division) before
reaching 1.
Please note that the number n should be entered by the user.*/

package lab1;
import java.util.Scanner;

public class Ex8 {

	public static void main(String[] args) {
		Scanner scanIn = new Scanner(System.in);
		int num=0, i=1, sum=0, sum2=0, j=0, k=1;
		System.out.println("Enter the value of n: ");
		num=scanIn.nextInt();
		while(i<=num) {
			sum+=i;
			i++;
		}
		System.out.println("Sum of the first n counting numbers: " + sum);
		
		while(k<=num) {
			sum2=sum2+k;
			k=k+2;
		}
		System.out.println("Sum of the first n odd numbers: " + sum2);
		while(num>1) {
			num=num/2;
			j++;
		}
		System.out.println("The number of times a whole number can be divided by 2: " + j);
		scanIn.close();

	}

}
