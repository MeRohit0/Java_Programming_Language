/*
    nCr = n! / (r! * (n-r)!)
 */


public class _74_binomial_coefficient {

    public static int factorial(int n ){
        int f = 1 ; 
        for (int i = 1; i <= n ; i++) {
            f *= i ;
        }
        return f;
    }

    public static int bino_coeff(int n , int r ){
        int n_fac = factorial(n);
        int r_fac = factorial(r);
        int nmr_fac = factorial(n-r);

        int nCr = n_fac / (r_fac * nmr_fac);

        return nCr;
    }
    public static void main(String[] args) {
        System.out.println(""+bino_coeff(5, 2));
    }
}
