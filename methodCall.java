// Call a Method
public class methodCall {
    static void myPrinter() {
        System.out.println("Hii i am printer");
    }
    public static void main (String[] args){
        myPrinter();
        myPrinter(); 
        myPrinter();
    }
}

// Params in method
public class Main{
    static void myMethod(String fname, int age) {
        System.out.println(fname + age);
    }
    public static void main (String[] args){
        myMethod("Swap", 18);
        myMethod("Swapnil", 184);
        myMethod("Swapil", 182);

    }
}

// Method to check can vote or not
public class Main {
    static void checkAge(int age){
        if (age > 18) {
            System.out.println("You can vote");
        } else {
            System.out.println("You can not vote");
        }
    }
        public static void main (String[] args) {
            checkAge(1);
        }
    }

// Create a method that prints numbers from 1 to 10.
class Main {
    static void printNums(int num) {
        for (int i = 1; i <= num; i++){
            System.out.println(i);
        }
    }
    public static void main (String[] args) {
        printNums(21);

    }
}

// Create a method that prints numbers from 1 to user input.
import java.util.Scanner;
class Main {
    static void printNums(int num) {
        for (int i = 1; i <= num; i++){
            System.out.println(i);
        }
    }
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter ur num");
        int n = sc.nextInt();

        printNums(n);
        }
}

// Create a method that returns sum of two numbers.
import java.util.Scanner;
class Main {
    static int sum(int n1, int n2) {
       if (n1 == 0 && n2 == 0) {
           return 0;
       } else {
           int sum = n1 + n2;
           return sum;
       }
}

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num 1");
        int n1 = sc.nextInt();
        
        System.out.println("ENter num 2");
        int n2 = sc.nextInt();
        
        int res = sum(n1, n2);
        System.out.println(res);
    }
}