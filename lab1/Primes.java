public class Primes {
    public static void main(String[] args) {
        for (int i = 2; i <= 100; i++) {
            if (isPrime(i))
                System.out.println(i);
        }
    }

    public static boolean isPrime(int value) {
        for (int i = 2; i < value; i++) {
           if (value % i == 0)
               return false;
        }
        return true;
    }
}
