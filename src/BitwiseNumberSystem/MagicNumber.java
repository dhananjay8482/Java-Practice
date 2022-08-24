package BitwiseNumberSystem;
// AMAZON

public class MagicNumber {
/*      convert binary and add power of 5
        2nd Magic number -> 10 -> ( 5^2 * 1 ) + ( 5^1 * 0) => 25
        3rd Magic number -> 11 -> ( 5^2 * 1 ) + ( 5^1 * 1) => 30

        Solve-> Just & with target it gives last digit of that number even it decimal (internally)
        and Add power of 5 and just right shift
 */
    public static void main(String[] args) {
        int target = 6;
        int ans = 0;
        int base = 5;   // We using multiple of 5 (Magic numbers multiple)

        while(target>0){
            int last = target & 1;
            target = target >> 1;
            ans += last*base;
            base *= 5;
        }

        System.out.println(ans);
    }

}
