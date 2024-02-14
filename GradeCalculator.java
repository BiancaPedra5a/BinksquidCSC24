import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        //Created a scanner for user input
        Scanner input = new Scanner(System.in);
        //set grade to zero
        double grade = 0;
        System.out.println("What is your class grade? ");
        grade = input.nextDouble();
        if (grade >= 92) {
            System.out.println("Your letter grade is A ");
        } else if (grade >= 89) {
            System.out.println(" Your letter grade is a A- ");
        } else if (grade >= 87) {
            System.out.println(" Your letter grade is a B+ ");
        } else if (grade >= 82) {
            System.out.println(" Your letter grade is a B ");
        } else if (grade >= 79) {
            System.out.println(" Your letter grade is a B- ");
        } else if (grade >= 77) {
            System.out.println(" Your letter grade is a C+ ");
        } else if (grade >= 72) {
            System.out.println(" Your letter grade is a C");
        } else if (grade >= 69) {
            System.out.println(" Your letter grade is a C- ");
        } else if (grade >= 67) {
            System.out.println(" Your letter grade is a D+ ");
        } else if (grade >= 60) {
            System.out.println(" Your letter grade is a D ");
        } else if (grade < 60) {
            System.out.println(" Your letter grade is a F ");
        }
    }
}