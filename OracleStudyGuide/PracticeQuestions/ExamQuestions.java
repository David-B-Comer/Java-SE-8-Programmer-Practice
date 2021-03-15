package PracticeQuestions;

public class ExamQuestions {

    /**

     Question # 1
     Given:

     class Product {
     double price;
     }

     public class Test {
        public void updatePrice(Product product, double price) {
            price = price * 2;
            product.price = product.price + price;
        }
        public static void main(String[] args) {
            Product prt = new Product();
            prt.price = 200;
            double newPrice = 100;

            Test t = new Test();
            t.updatePrice(prt, newPrice);
            System.out.println(prt.price + " : " + newPrice);
        }
     }

     What is the result?
     A. 200.0 : 100.0
     B. 400.0 : 200.0
     C. 400.0 : 100.0
     D. Compilation fails.


     ANSWER: C





     Question # 2
     Given the code fragment:

     if (aVar++ < 10) {
        System.out.println(aVar + " Hello World!");
     } else {
        System.out.println(aVar + " Hello Universe!");
     }

     What is the result if the integer aVar is 9?
     A. 10 Hello World!
     B. Hello Universe!
     C. Hello World!
     D. Compilation fails.


     ANSWER: A





     Question # 3
     Given the code fragment:

     public static void main(String[] args) {
        String date = LocalDate
                      .parse("2014-05-04")
                      .format(DateTimeFormatter.ISO_DATE_TIME);
        System.out.println(date);
     }

     What is the result?
     A. May 04, 2014T00:00:00.000
     B. 2014-05-04T00:00: 00. 000
     C. 5/4/14T00:00:00.000
     D. An exception is thrown at runtime.


     ANSWER: D



     Question # 4
     Given the code fragment:

     public static void main(String[] args {
        short s1 = 200;
        Integer s2 = 400;
        Long s3 = (long) s1 + s2;           //line n1
        String s4 = (String) (s3 * s2);     //line n2
        System.out.println("Sum is " + s4);
     }

     What is the result?
     A. Sum is 600
     B. Compilation fails at line n1.
     C. Compilation fails at line n2.
     D. A ClassCastException is thrown at line n1.
     E. A ClassCastException is thrown at line n2.


     ANSWER: C




     Question # 5

     What is the name of the Java concept that uses access modifiers to protect variables and hide them within a class?
     A. Encapsulation
     B. Inheritance
     C. Abstraction
     D. Instantiation
     E. Polymorphism


     ANSWER: A



     Question # 6
     Given the code fragment:

     abstract class Planet {
        protected void revolve() {              //line n1
        }

        abstract void rotate():                 //line n2
     }

     class Earth extends Planet {
        void revolve() {                        //line n3
        }

        protected void rotate() {               //line n4
        }
     }

     Which two modifications, made independently, enable the code to compile?
     A. Make the method at line n1 public.
     B. Make the method at line n2 public.
     C. Make the method at line n3 public.
     D. Make the method at line n3 protected.
     E. Make the method at line n4 public.



     ANSWER: C, D





     Question # 7
     Given:

     class Vehicle {
        String type = "4W";
        int maxSpeed = 100;

        Vehicle(String type, int maxSpeed) {
        this.type = type;
        this.maxSpeed = maxSpeed;
        }
     }

     class Car extends Vehicle {
        String trans;

        Car(String trans) {         //line n1
            this.trans = trans;
        }

        Car(String type, int maxSpeed, String trans) {
            super(type, maxSpeed);
            this(trans);            //line n2
        }
     }
     And given the code fragment:

    7.  Car c1 = new Car("Auto");
    8.  Car c2 = new Car("4W", 150, "Manual");
    9.  System.out.println(c1.type + " " + c1.maxSpeed + " " + c1.trans);
    10. System.out.println(c2.type + " " + c2.maxSpeed + " " + c2.trans);

     What is the result?
     A. 4W 100 Auto 4W 150 Manual
     B. Null 0 Auto 4W 150 Manual
     C. Compilation fails only at line n1
     D. Compilation fails only at line n2
     E. Compilation fails at both line n1 and line n2



     ANSWER: E




     Question #8
     Given the code fragment:

1.   class X {
2.      public void printFileContent() {
3.          // code goes here
4.          throw new IOException();
5.      }
6.   }
7.   public class Test {
8.      public static void main(String[] args) {
9.          X xobj = new X();
10.         xobj.printFileContent();
11.     }
12.  }



     Which two modifications should you make so that the code compiles successfully?

     A) Replace line 8 with public static void main(String[] args) throws IOException {
     B) Replace line 10 with:
        try {
            xobj.printFileContent();
        }
        catch (Exception e) { }
        catch (IOException e) { }
     C) Replace line 2 with public void printFileContent() throws IOException {
     D) Replace line 4 with throw IOException("Exception Raised");
     E) At line 11, insert throw new IOException();


     A. Option A
     B. Option B
     C. Option C
     D. Option D
     E. Option E


     ANSWER: A, C




     Question #9
     Given the following two classes:

     public class Customer {
        ElectricAccount acct = new ElectricAccount();

        public void useElectricity(double kWh) {
            acct.addKWh(kWh);
        }
     }

     public class ElectricAccount {
        private double kWh;
        private double rate = 0.07;
        private double bill;

        //line n1
     }
     How should you write methods in the ElectricAccount class at line n1 so that the member variable bill is
     always equal to the value of the member variable kwh multiplied by the member variable rate?
     Any amount of electricity used by a customer (represented by an instance of the customer class) must contribute
     to the customer's bill (represented by the member variable bill) through the method useElectricity method.
     An instance of the customer class should never be able to tamper with or decrease the value of the
     member variable bill.

     A) public void addKWh(double kWh) {
            this.kWh += kWh;
            this.bill = this.kWh*this.rate;
        }
     B) public void addKWh(double kWh) {
            if (kWh > 0) {
                this.kWh += kWh;
                this.bill = this.kWh * this.rate;
            }
        }
     C) private void addKWh(double kWh) {
            if (kWh > 0) {
                this.kWh += kWh;
                this.bill = this.kWh * this.rate;
            }
        }
     D) public void addKWh(double kWh) {
            if (kWh > 0) {
                this.kWh += kWh;
                setBill(this.kWh);
            }
        }
        public void setBill(double kWh) {
            bill = kWh*rate;
        }



     A. Option A
     B. Option B
     C. Option C
     D. Option D


     ANSWER: C





     Question #10
     Given the code fragment:

     public static void main(String[] args) {
        StringBuilder sb = new StringBuilder(5);
        String s = "";

        if (sb.equals(s)) {
            System.out.println("Match 1");
        } else if (sb.toString().equals(s.toString())) {
            System.out.println("Match 2");
        } else {
            System.out.println("No Match");
        }
     }

     What is the result?
     A. Match 1
     B. Match 2
     C. No Match
     D. A NullPointerException is thrown at runtime.




     ANSWER: B





     Question #11
     Given:

     interface Readable {
        public void readBook();
        public void setBookMark();
     }
     abstract class Book implements Readable {      // line n1
        public void readBook() { }
        // line n2
     }

     class EBook extends Book {                     // line n3
        public void readBook() { }
        // line n4
     }
     Which option enables the code to compile?

     A) Replace the code fragment at line n1 with: class Book implements Readable {
     B) At line n2 insert: public abstract void setBookMark();
     C) Replace the code fragment at line n3 with: abstract class EBook extends Book {
     D) At line n4 insert: public void setBookMark() { }

     A. Option A
     B. Option B
     C. Option C
     D. Option D


     ANSWER: C





     Question #12
     Given:

     public static void main(String[] args) {
        String ta = "A ";
        ta = ta.concat("B ");
        String tb = "C ";
        ta = ta.concat(tb);
        ta.replace('C', 'D');
        ta = ta.concat(tb);
        System.out.println(ta);
     }

     What is the result?
     A. A B C D
     B. A C D
     C. A B C C
     D. A B D
     E. A B D C



     ANSWER: C





     Question #13
     Given:

     class CD {
        int r;
        CD(int r) {
            this.r=r;
        }
     }

     class  DVD extends CD{
        int c;
        DVD(int r, int c) {
            // line n1
        }
     }
     And given the code fragment:
     DVD dvd = new DVD(10,20);

     Which code fragment should you use at line n1 to instantiate the dvd object successfully?

     A) super.r = r;
        this.c = c;
     B) super(r);
        this(c);
     C) super(r);
        this.c = c;
     D) this.c = r;
        super(c);


     A. Option A
     B. Option B
     C. Option C
     D. Option D


     ANSWER: C





     Question #14
     Given the code fragment:

     int a[] = {1,2, 3, 4, 5};
     for(XXX) {
        System.out.print(a[e]);
     }

     Which option can replace xxx to enable the code to print 135?
     A. int e = 0; e < = 4; e++
     B. int e = 0; e < 5; e + = 2
     C. int e = 1; e < = 5; e + = 1
     D. int e = 1; e < 5; e+ =2


     ANSWER: B





     Question #15
     Which statement best describes encapsulation?

     A. Encapsulation ensures that classes can be designed so that only certain fields and methods of an object are accessible from other objects.
     B. Encapsulation ensures that classes can be designed so that their methods are inheritable.
     C. Encapsulation ensures that classes can be designed with some fields and methods declared as abstract.
     D. Encapsulation ensures that classes can be designed so that if a method has an argument MyType x, any subclass of MyType can be passed to that method.


     ANSWER: A






     Question #16
     Given the code fragment from three files:

     SalesMan.java:

     package sales;
     public class SalesMan { }

     Product.java:

     package sales.products;
     public class Product { }

     Market.java:

     1. package market;
     2. // insert code here
     3. public class USMarket {
     4.     SalesMan sm;
     5.     Product p;
     6. }

     Which code fragment, when inserted at line 2, enables the code to compile?

     A) import sales.*;
     B) import java.sales.products.*;
     C) import sales;
        import sales.products;
     D) import sales.*;
        import products.*;
     E) import sales.*;
        import sales.products.*;

     A. Option A
     B. Option B
     C. Option C
     D. Option D
     E. Option E




     ANSWER: E




     Question #17
     Given the following class:

     public class CheckingAccount {
        public int amount;
        public CheckingAccount(int amount) {
            this.amount = amount;
        }
        public int getAmount() {
            return amount;
        }
        public void changeAmount(int x) {
            amount += x;
        }
     }

     And given the following main method, located in another class:

     public static void main(String[] args) {
        CheckingAccount acct = new CheckingAccount((int)(Math.random()*1000));
        // line n1
        System.out.println(acct.getAmount());
     }

     Which three lines, when inserted independently at line n1, cause the program to print a 0 balance?
     A. this.amount = 0;
     B. amount = 0;
     C. acct (0) ;
     D. acct.amount = 0;
     E. acct. getAmount () = 0;
     F. acct.changeAmount(0);
     G. acct.changeAmount(-acct.amount);
     H. acct.changeAmount(-acct.getAmount());


     ANSWER: D, G, H




     Question #18
     Given the code fragment:

     String shirts[][] = new String[2][2];
     shirts[0][0] = "red";
     shirts[0][1] = "blue";
     shirts[1][0] = "small";
     shirts[1][1] = "medium";

     Which code fragment prints red: blue: small: medium?

     A) for (int index = 1; index < 2; index++) {
            for (int idx = 1; idx < 2; idx++) {
                System.out.print(shirts[index][idx] + ":");
            }
        }
     B) for (int index = 0; index < 2; ++index) {
            for (int idx = 0; idx < index; ++idx) {
                System.out.print(shirts[index][idx] + ":");
            }
        }
     C) for (String c : colors) {
            for (String s : sizes) {
                System.out.println(s + ":");
            }
        }
     D) for (int index = 0; index < 2;) {
            for (int idx = 0; idx < 2;) {
                System.out.print(shirts[index][idx] + ":");
                idx++;
            }
            index++;
        }


     A. Option A
     B. Option B
     C. Option C
     D. Option D


     ANSWER: D






     Question #19
     Given the code fragment:

     public class Test {
        void readCard(int cardNo) throws Exception {
            System.out.println("Reading Card"):
        }
        void checkCard(int cardNo) throws RuntimeException { // line n1
            System.out.println("Checking Card");
        }
        public static void main(String[] args) {
            Test ex = new Test();
            int cardNo = 12344;
            ex.checkCard(cardNo);                              // line n2
            ex.readCard(cardNo);                               // line n3

        }
     }

     What is the result?
     A. Reading Card Checking Card
     B. Compilation fails only at line n1.
     C. Compilation fails only at line n2.
     D. Compilation fails only at line n3.
     E. Compilation fails at both line n2 and line n3.


     ANSWER: D






     Question #20
     Given the code fragment:

     3. public static void main(String[] args) {
     4.     int x = 5;
     5.     while (isAvailable(x)) {
     6.         System.out.print(x);
     7.
     8.     }
     9. }
     10.
     11. public static boolean isAvailable(int x) {
     12.    return x-- > 0 ? true : false;
     13. }


     Which modification enables the code to print 54321?
     A. Replace line 6 with System, out. print (--x) ;
     B. At line 7, insert x --;
     C. Replace line 6 with --x; and, at line 7, insert system, out. print (x);
     D. Replace line 12 With return (x > 0) ? false: true;



     ANSWER: B


     **/
}
