import java.util.Random;

public class Rand10 {
    public static void main(String[] args) {
        Random rand = new Random();
        int counter = 1;

        int number = rand.nextInt(100) + 1;
        int min = number;
        int max = number;

        System.out.println("Wylosowana liczba " + counter + ": " + number);

        while (counter < 10) {
            number = rand.nextInt(100) + 1;
            counter++;

            System.out.println("Wylosowana liczba " + counter + ": " + number);


            if (number < min) {
                min = number;
            }
            if (number > max) {
                max = number;
            }
        }
        System.out.println("Najmniejsza liczba: " + min);
        System.out.println("Największa liczba: " + max);
    }
}
