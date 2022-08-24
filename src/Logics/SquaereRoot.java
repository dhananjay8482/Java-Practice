package Logics;

public class SquaereRoot {
    public static void main(String[] args) {
        int n = 40;
        int p = 3; // precision -> floating number after .
        double ans = sqrt(n,p);
        System.out.println(ans);
        System.out.printf("%.3f",ans);
    }

    public static double sqrt(int n, int p){
        int s = 0,e = n;
        double root = 0.0;

        while(s<=e){
            int m = s + (e - s)/2;
            if( m*m == n ){
                root = m;
                return m;
            }
            else if (m*m > n)
                e = m-1;
            else
                s = m+1;
        }

        double incr = 0.1;
        for (int i = 0; i < p; i++) {
            while (root*root <= n){
                root += incr;
            }
            root -= incr;
            incr /= 10;
        }
        return root;
    }

}
