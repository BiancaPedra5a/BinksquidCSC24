import java.util.Scanner;

public class Accumulator1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0;
        int num;
        System.out.println ("Enter numbers (Input 0 to stop): ");
        do {
            System.out.print("Enter a number: ");
            num = input.nextInt();
            sum += num;
        } while (num != 0);
        System.out.println(" The sum is : " + sum);
    }
}



