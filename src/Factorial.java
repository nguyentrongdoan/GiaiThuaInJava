import java.util.Scanner;

public class Factorial {
    public static long factorial(int N) {
        if (N >= 0) {
            if (N <= 1)
                return 1;
            else
                return N * factorial(N - 1);
        }else {
            return -1;
        }
    }

    public static void main(String[] args) {
        System.out.println("Factorial calculation program");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number to calculate factorial:");
        int N = input.nextInt();

        long fact = factorial(N);
        System.out.println("The factorial of N is: " + fact);
    }
}
