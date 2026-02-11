/*In Wonderland a man distribute his monthly salary among his family as follows:
• Half the salary goes on general expenditure in the house
• one third of the remainder is spent on his car
• Out of the rest, one third is saved while the remaining part is shared among members of the
family so that parents get twice as much as the children.
Write a program that allows you to input the salary of a person and the number of children he has
and output the pocket money obtained by one of the parents and one child.*/

package lab1;
import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		Scanner scanIn = new Scanner(System.in);
		float salary=0, children=0;
		float a_children=0, a_parent=0, remaining=0;
		System.out.println("Input the salary of a person: ");
		salary=scanIn.nextInt();
		System.out.println("Input the number of children that person has: ");
		children=scanIn.nextInt();
		remaining = (float)(salary - (salary/2.0) - ((float)1/3)*(salary/2.0) - ((float)1/3.0)*(float)(salary - (salary/2.0) - ((float)1/3)*(salary/2.0)));
		a_children = remaining/(2+children);
		a_parent = remaining - (a_children*children);
		System.out.println("Pocket money obtained by one of the parents: " + a_parent );
		System.out.println("Pocket money obtained by one of the children: " + a_children );
		scanIn.close();

	}

}
