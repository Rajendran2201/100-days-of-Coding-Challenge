import java.util.Scanner;

public class twinPrimeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the lower limit of the range: ");
        int lowerLimit = scanner.nextInt();

        System.out.print("Enter the upper limit of the range: ");
        int upperLimit = scanner.nextInt();

        System.out.println("Twin Prime Numbers in the range " + lowerLimit + " to " + upperLimit + ":");

        findAndDisplayTwinPrimes(lowerLimit, upperLimit);

    }

    static boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    static void findAndDisplayTwinPrimes(int lowerLimit, int upperLimit) {
        for (int i = lowerLimit; i <= upperLimit - 2; i++) {
            if (isPrime(i) && isPrime(i + 2)) {
                System.out.println("(" + i + ", " + (i + 2) + ")");
            }
        }
    }
}
