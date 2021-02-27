package PracticeQuestions;

public class questions {

    /**

     1. Given the following:
1.  int []a = {1,2,3,4,5,6};
2. int i = a.length -1;
3.
4.  while(i>=0){
5.      System.out.print(a[i]);
6.      i--;
7.  }

     What is the result?
     65432
     12345
     Nothing
     An exception could be thrown at runtime.
     654321
     123456



     2. Given the following:
1.  class Ex6{
2.      public static void main(String[] args){
3.      int x = 0, y=10;
4.          try{
5.              y /=x;
6.              }
7.      System.out.print("/ by 0");
8.          catch(Exception e){
9.      System.out.print("error");
10.     }
11. }  }

     What is the result?
     0
     Compilation fails.
     Error
     No output
     An uncaught exception is thrown at runtime.




     3. Given the following:

     A and E are classes
     B and D are interfaces
     C is an abstract class

     Which statements are true? (Choose three)
     class F implements B,C{ }
     class F implements B,D{ }
     class F extends E{ }
     class F extends A,E{ }
     class F implements B{ }




     4. Given the following:

     A and E are classes
     B and D are interfaces

     Which statements are true? (Choose two)
     interface F implements B,D{ }
     interface F implements D{ }
     interface F extends E{ }
     interface F extends B,D{ }
     interface F extends D{ }




     5. Given the following:
1.  class Ex1{
2.      public static void main(String[] args) {
3.      int a[] =  { 1,2,3,4};
4.      System.out.print(a instanceof Object);
5.     }
6.   }

     What is the result?

     NOTE: The keyword "instanceof" is use to check whether an object is of a particular type.
     Length of this array is 3.
     Will produce output as false.
     Compilation fails due to error at line 4.
     Will produce output as true.
     Compilation fails due to error at line 3.




     6. Given the following:
1.  class Ex1{
2.      public static void main(String[] args) {
3.      int a[] =  { 1,2,053,4};
4.      int b[][] = { {1,2,4}, {2,2,1}, {0,43,2}};
5.      System.out.print(a[3]==b[0][2] );
6.      System.out.print("" + (a[2]==b[2][1]));
7.     }
8.   }


     What is the result?
     false true
     Compilation fails.
     true false
     true true
     false false




     7. Given the following:
1.  class Ex1{
2.      public static void main(String[] args) {
3.      int a[][] =  new int[3][0];
4.      a[1] = new int[]{1,2,3};
5.      a[2] = new int[]{4,5};
6.      System.out.print(a[1][1];
7.     }
8.   }

     What is the output?
     Compilation fails due to line 3.
     5
     3
     2
     Compilation fails due to line 4.
     An exception will be thrown in runtime.

     **/
}
