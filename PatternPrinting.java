import java.util.Scanner;
public class PatternPrinting{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

//Rectangle Printing

//* * * * * * *
//* * * * * * *
//* * * * * * *
//* * * * * * *
        // int row = sc.nextInt();               
        // int col = sc.nextInt();
        // for(int i=1; i<=row; i++){
        //     for(int j =1; j<=col; j++){
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }

//Square Printing

//* * * * 
//* * * * 
//* * * * 
//* * * *
        // int n = sc.nextInt();               
        // for(int i=1; i<=n; i++){
        //     for(int j =1; j<=n; j++){
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }

//1 2 3 4 
//1 2 3 4
//1 2 3 4
//1 2 3 4
        // int n = sc.nextInt();               
        // for(int i=1; i<=n; i++){
        //     for(int j =1; j<=n; j++){
        //         System.out.print(j+" ");
        //     }
        //     System.out.println();
        // }

//A B C D  ASCII value of A = 65
//A B C D
//A B C D
//A B C D
        // int n = sc.nextInt();               
        // for(int i=1; i<=n; i++){
        //     for(int j =1; j<=n; j++){
        //         System.out.print((char)(j+64)+" ");
        //     }
        //     System.out.println();
        // }
                //ORR
        // int n = sc.nextInt();               
        // for(int i=1; i<=n; i++){
        //     for(int j =65; j<=70; j++){
        //         System.out.print((char)j+" ");
        //     }
        //     System.out.println();
        // }

//a b c d      ASCII value of a = 97
//a b c d
//a b c d
//a b c d
        // int n = sc.nextInt();               
        // for(int i=1; i<=n; i++){
        //     for(int j =1; j<=n; j++){
        //         System.out.print((char)(j+96)+" ");
        //     }
        //     System.out.println();
        // }

//1 1 1 1 
//2 2 2 2
//3 3 3 3 
//4 4 4 4
        // int n = sc.nextInt();               
        // for(int i=1; i<=n; i++){
        //     for(int j =1; j<=n; j++){
        //         System.out.print(i+" ");
        //     }
        //     System.out.println();
        // }

//A A A A 
//B B B B
//C C C C
//D D D D
        // int n = sc.nextInt();               
        // for(int i=1; i<=n; i++){
        //     for(int j =1; j<=n; j++){
        //         System.out.print((char)(i+64)+" ");
        //     }
        //     System.out.println();
        // }

//a a a a
//B B B B
//c c c c
//D D D D
        // int n = sc.nextInt();
        // for(int i =1;i<=n; i++){
        //     for(int j =1; j<=n; j++){
        //         if(i%2==1){
        //             System.out.print((char)(i+96)+" ");
        //         } else {
        //             System.out.print((char)(i+64)+ " ");
        //         }
        //     }
        //     System.out.println();
        // }

//Triangle Printing 

// *
// * *
// * * *
// * * * *
        // int n = sc.nextInt();
        // for(int i=1; i<=n; i++){
        //     for(int j=1; j<=i; j++){
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }

// 1
// 1 2
// 1 2 3
// 1 2 3 4
        // int n = sc.nextInt();
        // for(int i=1; i<=n; i++){
        //     for(int j=1; j<=i; j++){
        //         System.out.print(j+ " ");
        //     }
        //     System.out.println();
        // }

// A
// A B
// A B C
// A B C D
        // int n = sc.nextInt();
        // for(int i=1; i<=n; i++){
        //     for(int j=1; j<=i; j++){
        //         System.out.print((char)(j+64) + " ");
        //     }
        //     System.out.println();
        // }

// A
// 1 2
// A B C
// 1 2 3 4
        // int n = sc.nextInt();
        // for(int i=1; i<=n; i++){
        //     for(int j=1; j<=i; j++){
        //         if(i%2==1) System.out.print((char)(j+64) + " ");
        //         else System.out.print(j + " ");
        //     }
        //     System.out.println();
        // }

// Horizontally Flipped Triangle 

//* * * *
//* * * 
//* * 
//*  
        // int n = sc.nextInt();         // Standard Syntax
        // for(int i = 1; i<=n; i++){
        //   for(int j=1; j<=n+1-i; j++){
        //         System.out.print("* ");
        //   }
        //   System.out.println();
        // }
                    //OR 
        // int n = sc.nextInt();
        // for(int i=1; i<=n; i++){
        //      for(int j=n; j>=i; j--){
        //         System.out.print("* ");
        //      }
        //      System.out.println();
        // }
                  //OR
        // int n = sc.nextInt();
        // int a = n;
        // for(int i=1; i<=n; i++){
        //     for(int j=1; j<=a; j++){
        //         System.out.print("* ");
        //     }
        //     a--;
        //     System.out.println();
        // }

//1234
//123
//12
//1
        // int n = sc.nextInt();         
        // for(int i = 1; i<=n; i++){
        //   for(int j=1; j<=n+1-i; j++){
        //         System.out.print(j);
        //   }
        //   System.out.println();
        // }

//4321
//321
//21
//1
        // int n = sc.nextInt();         
        // for(int i = 1; i<=n; i++){
        //   for(int j=n+1-i; j>=1; j--){
        //         System.out.print(j);
        //   }
        //   System.out.println();
        // }

//4321
//432
//43
//4
        // int n = sc.nextInt();
        // for(int i=1; i<=n; i++){
        //      for(int j=n; j>=i; j--){
        //         System.out.print(j);
        //      }
        //      System.out.println();
        // }

//abcd
//abc
//ab
//a
        // int n = sc.nextInt();         
        // for(int i = 1; i<=n; i++){
        //   for(int j=1; j<=n+1-i; j++){
        //         System.out.print((char)(j+96));
        //   }
        //   System.out.println();
        // }

//AAAA
//BBB
//CC
//D
        // int n = sc.nextInt();
        // for(int i=1; i<=n; i++){
        //       for(int j=1; j<=n+1-i; j++){
        //         System.out.print((char)(i+64));
        //       }
        //       System.out.println();
        // } 

//* * * * * *      //Hollow Rectangle 
//*         *
//*         *
//* * * * * * 

        // int row = sc.nextInt();
        // int col = sc.nextInt();
        // for(int i=1; i<=row; i++){
        //         for(int j=1; j<=col; j++){
        //                 if(i==1 || i==row || j==1 || j==col) System.out.print("* ");
        //                 else System.out.print("  ");
        //         }
        //         System.out.println();
        // }

//   *  
//   *
//* * * * *   //+ sign 
//   *
//   *
        // int n = sc.nextInt();
        // if(n%2==0) System.out.println("Enter Odd Input");
        // else{
        //    for (int i =1; i<=n; i++){
        //         for(int j=1; j<=n; j++){
        //                 if(i==(n+1)/2 || j==(n+1)/2){
        //                         System.out.print("* ");
        //                 }else System.out.print("  ");
        //         }
        //         System.out.println();
        //    }
        // }

// *       *
//   *   * 
//     *            // Cross Sign
//   *   *  
// *       *
        // int n = sc.nextInt();
        // if(n%2==0) System.out.println("Enter Odd Input");
        // else{
        //    for (int i =1; i<=n; i++){
        //         for(int j=1; j<=n; j++){
        //                 if(i==j || j==n+1-i){
        //                         System.out.print("* ");
        //                 }else System.out.print("  ");
        //         }
        //         System.out.println();
        //    }
        // }

//1
//23
//456
//78910
        // int n=sc.nextInt();
        // int a = 1;
        // for(int i=1; i<=n; i++){
        //         for(int j=1; j<=i; j++){
        //                 System.out.print(a + " ");
        //                 a++;
        //         }
        //         System.out.println();
        //}

//1
//01
//101
//0101
//10101
        // int n= sc.nextInt(); 
        // for(int i = 1; i<=n; i++){
        //         for(int j=1; j<=i; j++){
        //                 if((i+j)%2==0) System.out.print("1 ");
        //                 else System.out.print("0 ");
        //         }
        //         System.out.println();
        // }

//1
//13
//135
//1357
        // int n=sc.nextInt();
        // for(int i=1; i<=n; i++){
        //         int a = 1;
        //         for(int j=1; j<=i; j++){
        //                 System.out.print(a + " ");
        //                 a+=2;
        //         }
        //         System.out.println();
        // }

// Vertically Flipped Triangle

//   *        
//  **
// ***
//****
        // int n = sc.nextInt();
        // for(int i=1; i<=n; i++){
        //         for(int j=1; j<=(n-i); j++){
        //                 System.out.print("  ");
        //         }
        //         for(int j=1; j<=i; j++){
        //                 System.out.print("* ");
        //         }
        //         System.out.println();
        // } 
               //OR
        // int n = sc.nextInt();
        // for(int i=1; i<=n; i++){
        //         for(int j=1; j<=n; j++){
        //                 if((i+j)>n) System.out.print("* ");
        //                 else System.out.print("  ");
        //         }
        //         System.out.println();
        // }

//   1
//  12
// 123
//1234
        // int n=sc.nextInt();
        // for(int i = 1; i<=n; i++){
        //         for(int j=1; j<=(n-i); j++){
        //                 System.out.print("  ");
        //         }
        //         for(int j=1; j<=i; j++){
        //                 System.out.print(j+ " ");
        //         }
        //         System.out.println();
        // }
//   A
//  BB
// CCC
//DDDD
        // int n=sc.nextInt();
        // for(int i = 1; i<=n; i++){
        //         for(int j=1; j<=(n-i); j++){
        //                 System.out.print("  ");
        //         }
        //         for(int j=1; j<=i; j++){
        //                 System.out.print((char)(i+64)+ " ");
        //         }
        //         System.out.println();
        // }

//   ****
//  ****
// ****
//****
        // int n=sc.nextInt();
        // for(int i = 1; i<=n; i++){
        //         for(int j=1; j<=(n-i); j++){
        //                 System.out.print("  ");
        //         }
        //         for(int j=1; j<=n; j++){
        //                 System.out.print("* ");
        //         }
        //         System.out.println();
        // }

//****
// ***
//  **
//   *
        // int n=sc.nextInt();
        // for(int i = 1; i<=n; i++){
        //         for(int j=1; j<=(i-1); j++){
        //                 System.out.print("  ");
        //         }
        //         for(int j=1; j<=(n-i+1); j++){
        //                 System.out.print("* ");
        //         }
        //         System.out.println();
        // }
              //OR
        // int n = sc.nextInt();
        // for(int i=1; i<=n; i++){
        //         for(int j=1; j<=n; j++){
        //                 if(j>=i) System.out.print("* ");
        //                 else System.out.print("  ");
        //         }
        //         System.out.println();
        // } 
        
//   *
//  ***
// *****
//*******
        // int n = sc.nextInt();
        // for(int i=1; i<=n; i++){
        //         for(int j=1; j<=(n-i); j++){
        //                 System.out.print("  ");
        //         }
        //         for(int j=1; j<=(2*i-1); j++){
        //                 System.out.print("* ");
        //         }
        //         System.out.println();
        // }
               //OR
        // int n = sc.nextInt();
        // int nsp= n-1, nst = 1;
        // for(int i=1; i<=n; i++){
        //         for(int j=1; j<=nsp; j++){
        //                 System.out.print("  ");
        //         }
        //         for(int j=1; j<=nst; j++){
        //                 System.out.print("* ");
        //         }
        //         nsp--;
        //         nst+=2;
        //         System.out.println();
        // }

//   1
//  222
// 33333
//4444444
        // int n = sc.nextInt();
        // int nsp= n-1, nsd = 1;
        // for(int i=1; i<=n; i++){
        //         for(int j=1; j<=nsp; j++){
        //                 System.out.print("  ");
        //         }
        //         for(int j=1; j<=nsd; j++){
        //                 System.out.print(i+" ");
        //         }
        //         nsp--;
        //         nsd+=2;
        //         System.out.println();
        // }

//   1
//  123
// 12345
//1234567
        // int n = sc.nextInt();
        // int nsp= n-1, nsd = 1;
        // for(int i=1; i<=n; i++){
        //         for(int j=1; j<=nsp; j++){
        //                 System.out.print("  ");
        //         }
        //         for(int j=1; j<=nsd; j++){
        //                 System.out.print(j+" ");
        //         }
        //         nsp--;
        //         nsd+=2;
        //         System.out.println();
        // }
        sc.close();
    }
}
