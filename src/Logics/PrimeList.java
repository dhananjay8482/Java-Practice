package Logics;

// Gives the prime numbers between 1 to n ;
// By eliminating factors of 2 , 3, ... until square root
// And rest array is prime

public class PrimeList {

    public static void main(String[] args) {
        int n = 40;
        boolean[] primes = new boolean[n+1]; // By default Array stores False
        sieve(n, primes);
    }

//    false in array means num is positive;
    public static void sieve( int n, boolean[] primes ){
        for (int i = 2; i*i <=n ; i++) {
            if(!primes[i])
                for(int j = i*2; j<=n; j+=i)
                    primes[j]=true;
        }

        for(int i = 2; i<=n; i++)
            if(!primes[i])
                System.out.print(i + " ");

    }


}
