import java.util.Scanner;

public class BottleOfBeer {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Number of beers : ");
        int originalBeer = input.nextInt();
        int numBeer = originalBeer;
        for (int i = 0; i < originalBeer; i++) {
            numBeer -= 1;
            if (numBeer >= 2) {
                System.out.println((originalBeer - i) + " bottles of beer on the wall, " + numBeer + " bottles of beer.");
                System.out.println("Take one down and pass it around, " + numBeer + " bottles of beer on the wall.");
            } else if (numBeer <= 1) {
                System.out.println((originalBeer - i) + " bottles of beer on the wall, " + numBeer + " bottles of beer.");
                System.out.println("Take one down and pass it around, " + numBeer + " bottles of beer on the wall.");
            }
        }
        System.out.println("Go to the store and buy some more, " + originalBeer + " " + "bottles of beer on the wall.");
    }
}

