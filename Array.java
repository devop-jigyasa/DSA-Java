import java.util.Scanner;
public class Array{

//TWO SUM 

    // public static boolean TwoSum(int[] arr, int target){
    //     int n = arr.length;
    //     for(int i=0; i<n-1; i++){
    //         for(int j=(i+1); j<n; j++){
    //             if(arr[i]+arr[j] == target){
    //                 return true;
    //             }
    //         }
    //     }
    //     return false;
    // }
    // public static void main(String[] args){
    //     Scanner sc = new Scanner (System.in);
    //     System.out.print("Size of Array: ");
    //     int a = sc.nextInt();
    //     System.out.print("Elements of Array: " );
    //     int[] x = new int[a];
    //      for(int i = 0; i<a; i++){
    //         x[i]= sc.nextInt();
    //     }
    //     System.out.print("Target Sum: ");
    //     int b = sc.nextInt();
    //     boolean ans = TwoSum(x,b);
    //     System.out.print(ans);

//OR 

    // public static void main(String[] args){
    //     Scanner sc = new Scanner(System.in);
    //     int t = sc.nextInt();
    //     int n = sc.nextInt();
    //     int[] arr = new int[n];
    //     for(int i=0; i<n; i++){
    //         arr[i] = sc.nextInt();
    //     }
    //     boolean flag = false; 
    //     for(int i=0; i<n-1; i++){
    //         for(int j=i+1; j<n; j++){
    //             if(arr[i]+arr[j] == t){
    //                 System.out.println("Target sum found.");
    //                 flag = true;
    //             } 
    //         }
    //     }
    //     if(!flag) System.out.println("Target sum not found");

    // sc.close();
    // }

//2ND MAXIMUM ELEMENT 
    // public static void main(String[] args){
    //     int[] arr = {89, 3, 45, 956, 32, 0};
    //     int max = Integer.MIN_VALUE;
    //     int smax = Integer.MIN_VALUE;
    //     for(int i = 0; i<arr.length; i++){
    //         if(arr[i]>max) max = arr[i];
    //     }
    //     for(int i = 0; i<arr.length; i++){
    //         if(arr[i]>smax && arr[i]!=max) smax = arr[i];
    //     }
    //     System.out.println(max);
    //     System.out.println(smax);
    // }

//FOR EACH LOOP  - can't modify the elements of the array,, only traverse(print)
    // public static void main(String[] args){
    //     int[] arr = {2,4,53,5,89};
    //     for(int ele:arr){
    //         System.out.print(ele + " ");
    //     }
    // }

    // public static void main(String[] args){
    //     int[] arr = {2,4,53,5,89};
    //     for(int ele:arr){
    //         ele *= 2;      // not be able to make changes in the elments of the array so this loop will not give any result 
    //     }
    //     for(int ele:arr){
    //         System.out.print(ele + " ");
    //     }
    // }

//REVERSING OF ARRAY
    // public static void main(String[] args){
    //     int[] arr = {2,3,4,67,78,21,4};
    //     int n = arr.length;
    //     int i=0 , j= (n-1);
    //     while(i<j){                                //n even hoga to i or j kabhi equal nhi honge  and if n odd hoga to i or j ek point pe jake equal honge(mid element) but loop nhi chlega as mid elementneed not be reversed
    //         int temp = arr[i];
    //         arr[i]=arr[j];
    //         arr[j] = temp;
    //         i++;
    //         j--;
    //     }
    //     //for(int ele:arr) System.out.print(ele + " ");                   //Printing array elements by for each loop
    //     for(int k=0; k<n; k++) System.out.print(arr[k] + " ");    
    //     }

//OR

    // public static void main(String[] args){
    //     int[] arr = {2,3,4,67,78,21,4};
    //     int n = arr.length;
    //     for(int i=0; i<(n/2); i++){
    //         int temp = arr[i];
    //         arr[i] = arr[n-1-i];     // swaping of arr[i] and arr[n-1-i] till n/2(n=even..no isues, n=odd..no issues as the middle element will be left without traversing which no need to be traversed)
    //         arr[n-1-i] = temp;
    //     }
    //     for(int i=0; i<n; i++) System.out.print(arr[i] + " ");
    // }

//REVERSE PART OF ARRAY   eg - reverse only 4,67,78,21
    // public static void main(String[] args){
    //     int[] arr = {2,3,4,67,78,21,4};
    //     int n = arr.length;
    //     int i=2 , j= 5;
    //     while(i<j){                                
    //         int temp = arr[i];
    //         arr[i]=arr[j];
    //         arr[j] = temp;
    //         i++;
    //         j--;
    //     }
    //     //for(int ele:arr) System.out.print(ele + " ");                   //Printing array elements by for each loop
    //     for(int k=0; k<n; k++) System.out.print(arr[k] + " ");    
    //     }

//Rotate Array
// //Brute Force - Left Rotate 
//      public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int[] arr = new int[n];
//         for(int i=0; i<n; i++){
//             arr[i] = sc.nextInt();
//         }
//         int d = sc.nextInt();
//         int x = 1; 
//         while(x<=d){
//             int temp = arr[0];
//             for(int i=0; i<n-1; i++){
//             arr[i]=arr[i+1];
//             }
//             arr[n-1]=temp;
//             x++;
//         }
//         for(int p : arr) System.out.print (p + " ");
//      }

// //Brute Force - Right Rotate 
//      public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int[] arr = new int[n];
//         for(int i=0; i<n; i++){
//             arr[i] = sc.nextInt();
//         }
//         int d = sc.nextInt();
//         int x = 1; 
//         while(x<=d){
//             int temp = arr[n-1];
//             for(int i= n-1; i>0; i--){
//             arr[i]=arr[i-1];
//             }
//             arr[0]=temp;
//             x++;
//         }
//         for(int p : arr) System.out.print (p + " ");
//      }

//Reverse Algorithm
    //  public static void main(String[] args){
    //     Scanner sc = new Scanner(System.in);
    //     int n = sc.nextInt();
    //     int[] arr = new int[n];
    //     for(int i = 0; i<n; i++){
    //         arr[i] = sc.nextInt();
    //     }
    //     int d = sc.nextInt();
    //     leftR(arr,d);
    //     for(int x : arr) System.out.print(x + " ");
    //  }
    //  public static void leftR(int[] arr, int d){
    //     int n = arr.length;
    //     d %= n;
    //     reverse(arr, 0, d-1);   // reverse(arr, 0,n-1) ; reverse (arr, 0, d-1) ; reverse(arr, d, n-1) for Right Rotate
    //     reverse(arr, d, n-1);   
    //     reverse(arr, 0, n-1);
    //  }
    //  public static void reverse(int[] arr, int start, int end){
    //     while(start<end){
    //         int temp = arr[start];
    //         arr[start] = arr[end];
    //         arr[end] = temp;
    //         start++;
    //         end--;
    //     }
    //  }

//Missing element in Array when range of elements of array is 1 to n and size of array is n-1
    // public static void main(String[] args){
    //     Scanner sc = new Scanner(System.in);
    //     int n = sc.nextInt();
    //     int[] arr = new int[n-1];
    //     for(int i=0; i<n-1; i++){
    //         arr[i]=sc.nextInt();
    //     }
    //     int nsum = n*(n+1)/2;
    //     int arrsum = 0;
    //     for(int i = 0; i<n-1; i++){
    //         arrsum += arr[i];
    //     }
    //     int mis_num = nsum-arrsum;
    //     System.out.print(mis_num);
    // }

//Segregate 0s and 1s in an array
    // public static void main(String[] args){
    //     Scanner sc = new Scanner(System.in);
    //     int n = sc.nextInt();
    //     int[] arr = new int[n];
    //     for(int i = 0; i<n; i++){
    //         arr[i] = sc.nextInt();
    //     }
    //     int count = 0;
    //     for(int i=0; i<n; i++){
    //         if(arr[i] ==0) count++;
    //     }
    //     for(int i=0; i<count; i++){
    //         arr[i] =0;
    //     }
    //     for(int i =count; i<n; i++){
    //         arr[i] = 1;
    //     }
    //     for(int i=0; i<n; i++){
    //     System.out.print(arr[i] + " ");
    //     }
    // }

// 2 Pointer Approach
    // public static void main(String[] args){
    //     Scanner sc = new Scanner(System.in);
    //     int n = sc.nextInt();
    //     int[] arr = new int[n];
    //     for(int i = 0; i<n; i++){
    //         arr[i]= sc.nextInt();
    //     }
    //     segregate(arr);
    //     for(int i = 0; i<n; i++){
    //     System.out.print(arr[i] + " ");
    //     }
    // }
    // public static void segregate(int[] arr){
    //     int n = arr.length;
    //     int i = 0, j=n-1;
    //     while(i<j){
    //         if(arr[i]==0) i++;
    //         else if(arr[j]==1) j--;
    //         else if(arr[i]==1 && arr[j]==0){
    //             arr[i]=0; arr[j]=1;
    //             i++; j--;
    //         }
    //     }
    // }

//Wave Array
    // public static void main(String[] args){
    //     Scanner sc = new Scanner(System.in);
    //     int n = sc.nextInt();
    //     int[] arr = new int[n];
    //     for(int i=0; i<n; i++){
    //         arr[i] = sc.nextInt();
    //     }
    //     for(int i=0; i<n; i+=2){
    //         int temp = arr[i];
    //         arr[i] = arr[i+1];
    //         arr[i+1] = temp;
    //     }
    //     for(int i=0; i<n; i++) System.out.print(arr[i] + " ");
    // }
//check if array is sorted
    // public static void main(String[] args){
    //     System.out.println("Started");
    //     int[] arr = {1,2,33,45};
    //     boolean flag = true;
    //     for(int i=0; i<arr.length-1;i++){
    //         if(arr[i]>arr[i+1]){
    //             flag = false;
    //             break;
    //         }
    //     }
    //     if(flag == true) System.out.println("ARRAY SORTED");
    //     else System.out.println("NOT SORTED");
    // }
} 
