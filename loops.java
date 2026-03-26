// Print 1 to 10 using for loop
public class loops {
    public static void main(String[] args){
        for(int i = 0; i < 10; i++) {
            System.out.println(i);
        }
    }
}

// Print 10 to 1 using for loop

package demo;

public class loops {

	public static void main(String[] args) {
		for(int i = 10; i > 0; i--) {
			System.out.println(i);
		}
	}

}


//Print even numbers from 1 to 20

package demo;

public class loops {
	public static void main(String[] args) {
		for(int i=1; i<=20; i++) {
			if (i%2==0) {
				System.out.println(i);
			}
			
		}
	}
}

// Find sum of 1-10 numbers

class Main {
    public static void main (String[] args){
    int sum = 0;
        for( int i=1; i<=10; i++){
            sum = sum + i;
        }
        System.out.println(sum);
        
    }
}


// Print multiplication table of a number
import java.util.Scanner;
public class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");

        int num = sc.nextInt();
        int mult = 1;
        for (int i=1; i<=10; i++){
            mult = i * num;
            System.out.println("--------------");
            System.out.println(mult);
        }
    }
}