public class GCDandLCM {



    class Solution {
        static long findGCD(long a, long b) {
            // long GCD = 1;
            while(b != 0){
                long temp = b;
                b = a% b;
                a = temp;
            }
            return a;
        }

        static Long[] lcmAndGcd(Long a, Long b) {
            long gcd = findGCD(a, b);
            long lcm = (a * b) / gcd;

            Long[] ans = new Long[2];
            ans[0] = lcm;
            ans[1] = gcd;
            return ans;
        }
    }

    public static void main(String[] args) {
        long a = 10;
        long b = 5;
        Long [] ans =  Solution.lcmAndGcd(a,b);
        System.out.println(ans);
    }

}
