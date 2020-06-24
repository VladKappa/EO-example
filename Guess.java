import java.util.Scanner;

class Guess {
    int number() {
        System.out.print("Guess a nubmer in 0..99 range: ");
        return new Scanner(System.in).nextInt();
    }
}
