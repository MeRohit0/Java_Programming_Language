package Practice_Question.codechief;

// import java.util.Scanner;

// public class codevita1 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         String s = sc.nextLine();
//         int n = s.length();

//         int v[] = new int[n];
//         for (int i = 0; i < n; ++i) {
//             v[i] = sc.nextInt();
//         }

//         int res = 0 ;
//         int lw = s.charAt(0) - '0';
//         int lwv = v[0];

//         for (int i = 0; i < v.length; i++) {
//             if(s.charAt(i)-'0' == lw){
//                 res += Math.min(lwv,v[i]);
//                 lwv = Math.max(lwv,v[i]);
//             }
//             else{
//                 lw = s.charAt(i) - '0';
//                 lwv =v[i];
//             }
//         }
//         System.out.println(res);
//     }
// }

import java.util.Scanner;

public class codevita1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read the binary string input
        String s = sc.nextLine();
        int n = s.length();

        // Initialize the array for values
        int[] v = new int[n];
        for (int i = 0; i < n; ++i) {
            v[i] = sc.nextInt();
        }

        int res = 0;

        // Initialize the first value for lw and lwv
        int lw = s.charAt(0) - '0';  // first binary digit
        int lwv = v[0];               // corresponding value

        // Loop through the string and array to compute the result
        for (int i = 1; i < n; i++) {  // Start from index 1
            if (s.charAt(i) == s.charAt(i - 1)) {  // If the binary digits are the same
                res += Math.min(lwv, v[i]);        // Add the minimum of the corresponding values
                lwv = Math.max(lwv, v[i]);        // Update the lwv to the maximum
            } else {  // If the binary digits are different
                res += Math.max(lwv, v[i]);       // Add the maximum of the current and previous values
                lw = s.charAt(i) - '0';           // Reset the current binary digit
                lwv = v[i];                       // Reset the current value
            }
        }

        // Output the result
        System.out.println(res);
    }
}

