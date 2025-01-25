package Practice_Question.codechief;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// public class codevita42 {
//     public static List<Integer> findDivisors(int K) {
//         List<Integer> divisors = new ArrayList<>();
//         for (int i = 1; i <= K; i++) {
//             if (K % i == 0) {
//                 divisors.add(i);
//             }
//         }
//         return divisors;
//     }
//     public static void main(String[] args) {
//         // Scanner to read input
//         Scanner scanner = new Scanner(System.in);
        
//         // Read input values
//         int N = scanner.nextInt(); // Number of items
//         int[] itemIDs = new int[N];
//         int[] costs = new int[N];
        
//         // Read item IDs
//         for (int i = 0; i < N; i++) {
//             itemIDs[i] = scanner.nextInt();
//         }
        
//         // Read costs
//         for (int i = 0; i < N; i++) {
//             costs[i] = scanner.nextInt();
//         }
        
//         // Read available money
//         int A = scanner.nextInt();
        
//         // Variables to track the best result
//         int maxFreeItems = 0;
//         int maxTotalValue = 0;

//         // Iterate over each item to check the free items that can be obtained
//         for (int i = 0; i < N; i++) {
//             int idToBuy = itemIDs[i];
//             int costToBuy = costs[i];
            
//             // If Veda cannot afford this item, skip it
//             if (costToBuy > A) {
//                 continue;
//             }

//             // Find all divisors of item ID
//             List<Integer> divisors = findDivisors(idToBuy);
//             int freeItemCount = 0;
//             int totalFreeItemsValue = 0;
            
//             // Check which items are free based on the divisors
//             for (int j = 0; j < N; j++) {
//                 if (divisors.contains(itemIDs[j])) {
//                     freeItemCount++; // This item is free
//                     totalFreeItemsValue += costs[j]; // Add to the total value of free items
//                 }
//             }

//             // Now, compare the number of free items and the total value
//             if (freeItemCount > maxFreeItems || (freeItemCount == maxFreeItems && totalFreeItemsValue > maxTotalValue)) {
//                 maxFreeItems = freeItemCount;
//                 maxTotalValue = totalFreeItemsValue;
//             }
//         }

//         // Output the result: maximum free items and their total worth
//         System.out.println(maxFreeItems + " " + maxTotalValue);
//     }

// }

import java.util.*;  
  
public class codevita42 {  
   public static void main(String[] args) {  
      Scanner sc = new Scanner(System.in);  
  
      int n = sc.nextInt();  
      int[] ids = new int[n];  
      int[] costs = new int[n];  
      for (int i = 0; i < n; i++) ids[i] = sc.nextInt();  
      for (int i = 0; i < n; i++) costs[i] = sc.nextInt();  
      int A = sc.nextInt();  
  
      int maxFreeItems = 0;  
      long maxFreeWorth = 0;  
  
      for (int i = 0; i < n; i++) {  
        int id = ids[i];  
        int y = costs[i];  
        if (y > A) continue;  
  
        long quantity = (long) A / y;  
        int freeItems = 0;  
        long freeWorth = 0;  
  
        for (int j = 0; j < n; j++) {  
           if (i != j && ids[j] != 0 && id % ids[j] == 0) {  
              freeItems += (int) quantity;  
              freeWorth += quantity * costs[j];  
           }  
        }  
  
        if (freeItems > maxFreeItems || (freeItems == maxFreeItems && freeWorth > maxFreeWorth)) {  
           maxFreeItems = freeItems;  
           maxFreeWorth = freeWorth;  
        }  
      }  
  
      System.out.print(maxFreeItems + " " + maxFreeWorth);  
   }  
}