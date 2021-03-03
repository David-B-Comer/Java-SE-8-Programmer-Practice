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

ANSWER: 654321

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

ANSWER: Compilation fails


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

ANSWER:      class F implements B,D{ }
             class F extends E{ }
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

ANSWER:       interface F extends B,D{ }
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

ANSWER: Will produce output as true


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

ANSWER: true true



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

ANSWER: 2


     8. Which of the following are legal identifiers? (Choose three)

     getSize
     _4_
     1stName
     @name
     $

ANSWER: getSize, _4_, $

     9. Given the following:
1.   class Ex1{
2.     int a=10;
3.       public static void main(String[] args) {
4.      new Ex1().print();
5.   }
6.   public void print(){
7.        int a = 8;
8.        System.out.print(a + " ");
9.        }
10.  }

     What is the result?
     Compilation fails.}
     8
     Output is unpredictable.
     18
     10

ANSWER: 8

     10. Given the following:
1.   class Ex1{
2.     static int x = 10;
3.     public static void main(String[] args) {
4.      for(int x=0;x<5;x++){
5.    }
6.        System.out.print(x);
7.      }
8.    }


     What is the result?
     A runtime exception will be thrown.
     Compilation fails.
     10
     5
     4

ANSWER: 10

     11. Given the following:
1.   class Person{
2.   Person(String s,int i ){
3.        ++pid;
4         name=s;
5.        age=i;
6.        }
7.      static int pid;
8.      int age;
9.      String name;
10.       }
11.   class Test{
12.       public static void main(String args[]){
13.       Person p1 = new Person("John" , 22);
14.       Test te = new Test();
15.       Person p2 = te.change(p1);
16.       System.out.println(p2.pid +" "+ps.name+ " "+p2.age);
17        System.out.print(p1.pid +" " p1.name+" "+ p1.age);
18.    }
19.    private Person change(Object o){
20.       Person p2 = (Person)o;
21.       p2.age = 25;
22.       return p2;
23.       }
24.       }


     What is the result?
     1 John 22 1 John 22
     ClassCastException is thrown at runtime.
     Compilation fails.
     1 John 25 1 John 22
     1 John 25 1 John 25




     12. Given the following:
1.   class Ex1{
2.   public static void main(Striung args[]){
3.   int x = 10;
4.   int y = new Ex1().change(x);
5.        System.out.print(x+y);
6.   }
7.   int change(int x){
8.   x=12;
9.   return x;
10.  }
11.  }


     What is the result?
     Compilation fails.
     An exception is thrown at runtime.
     24
     20
     22




     13. Given the following:
1.   class S{
2.   public static void main(String [] args){
3.   String s = "Java";
4.   s.conccat(" SE 6");
5.   s.replace('6','7');
6.   System.out.print(s);
7.   }
8.   }


     What is the result?
     Java SE
     Java SE 7
     Java
     Java SE 6
     Compilation fails.



     14. Given the following:
1.   class S{
2.   public static void main(String [] args){
3.   String s = "Java";
4.   s.conccat(" SE 6");
5.   s.toLowerCase();
6.   System.out.print(s);
7.   //how many?
8.   }
9.   }



     What is the result?
     5
     3
     1
     4
     2




     15. Given the following:
1.   class Ex1{
2.      public static void main(String[] args) {
3.     new Ex1().pass();
4.     }
5.
6.   public void pass(){
7.     int a =10 , b=20;
8.     print(a) ;
9.     }
10.
11.  public void print(int a){
12.    int c = b/a;
13.    System.out.print(c);
14.    }
15.  }


     What is the result?
     Compilation fails due to an error on line 8.
     Compilation fails due to an error on line 12.
     2
     Compilation fails due to an error on line 7.
     0

     **/
}
