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


     **/
}
