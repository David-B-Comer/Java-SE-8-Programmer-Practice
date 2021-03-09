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

     **/
}
