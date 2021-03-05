public class Module01 {
    private boolean prime[];

    public void sieveOfEratosthenes(int n) {
        // create array prime[0...n]
        // a value in prime[i] is true if it is a prime
        boolean prime[] = new boolean[n+1];

        // set all entries as true, since default boolean is false
        for (int i = 0; i < n; i++) {
            prime[i] = true;
        }

        // begin at 2 since it is the first prime number
        // always start with the multiple of the value like 3 => start at 9
        // when the multiple of itself is bigger than the max number, then there's no more prime
        for (int p = 2; p*p <= n; p++) {
            if (prime[p] == true) {
                System.out.print(p + ", ");

                // set all multiples of p to false
                for (int i = p*p; i <= n; i += p) {
                    prime[i] = false;
                }
            }

        }
        this.prime = prime;
    }

    public void sophieGermainPrime(int n) {
        sieveOfEratosthenes(n);
        System.out.println();
        System.out.print("These primes are Sophie-Germain-Primes:");
        for (int p = 2; p <= 10; p++) {
            if (prime[p] == true && prime[2*p+1] == true) {
                System.out.print(p + ", ");
            }
        }
    }
}