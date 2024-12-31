package Practice_Question.codechief;
// import java.util.*;

// /*buzzday problem 
//     step 1 : input 
//     step 2 : find divisor
//     step 3 : getting best solution 
// */

// public class codevita4 {

//     public static void main(String[] args) {
//         //input 
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
        
//         int idItems[] = new int[n];
//         int costItems[] = new int[n];

//         for(int i =0 ; i < n ; i++){
//             idItems[i] = sc.nextInt();
//         }

//         for(int i =0 ; i < n ; i++){
//             costItems[i] = sc.nextInt();
//         }
        
//         int A = sc.nextInt();

//         int maxitemFree = 0 ;
//         int freeitemvalue = 0 ;

//         //check the whole in bruteforce manner 

//         for(int i = 0 ; i < n ; i++){
            
//             int x = idItems[i];
//             int y = costItems[i];

//             if(y > A ){
//                 continue;
//             }

//             // ArrayList<Integer> divisors = divisor(x);
//             long quantity = (long) A / y ;
//             int freeitemCount = 0;
//             int totalfreeitem = 0;

//             for(int j = 0 ; j < n; j++){
//                 if(i != j  && idItems[j] != 0 && x % idItems[j] == 0){
//                     freeitemCount += (int)quantity ;
//                     totalfreeitem += quantity * costItems[j];
//                 }
//             }

//             if( freeitemCount > maxitemFree || (freeitemCount == maxitemFree && totalfreeitem > freeitemvalue)){
//                 maxitemFree  = freeitemCount;
//                 freeitemvalue = totalfreeitem ; 
//             }

//         }

//         System.out.println(maxitemFree + " " + freeitemvalue);

//     }



    
// }

public class MergeSort {
    // Merges two subarrays of arr[].
    public static void merge(int[] arr, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        int[] leftArr = new int[n1];
        int[] rightArr = new int[n2];

        // Copy data to temp arrays
        System.arraycopy(arr, left, leftArr, 0, n1);
        System.arraycopy(arr, mid + 1, rightArr, 0, n2);

        // Merge the temp arrays back into arr[]
        int i = 0, j = 0, k = left;
        while (i < n1 && j < n2) {
            if (leftArr[i] <= rightArr[j]) {
                arr[k] = leftArr[i];
                i++;
            } else {
                arr[k] = rightArr[j];
                j++;
            }
            k++;
        }

        // Copy the remaining elements of leftArr[], if any
        while (i < n1) {
            arr[k] = leftArr[i];
            i++;
            k++;
        }

        // Copy the remaining elements of rightArr[], if any
        while (j < n2) {
            arr[k] = rightArr[j];
            j++;
            k++;
        }
    }

    // Main function that sorts arr[left..right] using merge()
    public static void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;
            mergeSort(arr, left, mid);  // Sort the first half
            mergeSort(arr, mid + 1, right);  // Sort the second half
            merge(arr, left, mid, right);  // Merge the sorted halves
        }
    }

    public static void main(String[] args) {
        int[] arr = {38, 27, 43, 3, 9, 82, 10};
        mergeSort(arr, 0, arr.length - 1);
        System.out.print("Sorted array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        // Output: Sorted array: 3 9 10 27 38 43 82
    }
}
