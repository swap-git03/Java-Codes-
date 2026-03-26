// Can Vote or not
import java.util.Scanner;

public class ifelse {
	
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter age");
		int age = sc.nextInt();
		
		if(age > 18) {
			System.out.println("You can vote");
		} else {
            System.out.println("You cannot vote");
        }
		
	}
}

// Even ODD
package demo;
import java.util.Scanner;
public class ifelse {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
	    System.out.println("Enter number:");
		int num = sc.nextInt();
		
		if (num%2==0) {
			System.out.println("Num is even");
		} else {
			System.out.println("Num is odd");
		}
	}
 
}

// To print the bigger number
import java.util.Scanner;
public class ifelse {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
	
		 System.out.println("Enter first number:");
	        int a = sc.nextInt();
		
		System.out.println("ENter sec number");
			int b = sc.nextInt();

		
		if(a > b) {
			System.out.println(a + " a is bigger than b " + b);
		} else {
			System.out.println(b + " b is bigger than a " + a);

		}
	}
}

