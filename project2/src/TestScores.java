import javax.print.DocFlavor;

import java.util.Scanner;
import java.util.Random;
public class TestScores {
    public static void main(String[] args) {

        Random randsize = new Random();
        Scanner Mainmethod = new Scanner(System.in);

        int high = 3;
        int low = 10;
        final int SIZE = randsize.nextInt(high, low);
        System.out.println("enter your " + SIZE + " test scores");

        int [] testSco = new int[SIZE];
        for(int i = 0; i < SIZE; i++){
        System.out.println("Enter your test " + i + " : ");
        testSco[i] = Integer.parseInt(Mainmethod.nextLine());
        }
        char [] LetterGrade = new char[SIZE];
        for(int h = 0 ; h < SIZE; h++){
            int TestGrade = testSco[h];
             LetterGrade[h] = getLetterGrade(TestGrade);
        }

        System.out.println("------SCORES---------------GRADE-------");

        for(int i = 0; i < SIZE; i++){
        System.out.printf("%10s", testSco[i]);
            System.out.printf("%21c%n", LetterGrade[i] );
        }




    }

    public static char getLetterGrade( int testSco ) {
        if (testSco <= 100 && testSco >= 90) {
            return 'A';
        } else  if (testSco <= 89 && testSco >= 80) {
            return 'B';
        } else  if (testSco <= 79 && testSco >= 70) {
            return 'C';
        } else  if (testSco <= 69 && testSco >= 60) {
            return 'D';
        } else {
            return 'F';
        }



    }
}
