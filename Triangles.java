import java.util.Scanner;

public class Triangles {

    public static void main(String[] args) {

        //*** asking for size
        Scanner input = new Scanner(System.in);
        System.out.print("Enter size of triangle (Between 1-50) : ");
        int size = input.nextInt();

        //*** keeping size between 1-50
        while (size == 0 || size < 0 || size > 50) {
            System.out.print("Please enter a size between 1-50" + "\n" + "enter size : ");
            size = input.nextInt();
        }
        //*** asking for Character

        System.out.println("Enter fill character: ");
        char fillCharacter = input.next().charAt(0);

        //***creates the triangle
        for (int i = 0; i < size; i++) {
            for (int j = size + 1; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 0; k < (2 * i - 1); k++) {
                System.out.print(fillCharacter);
            }
            System.out.println();
        }

    }
}
