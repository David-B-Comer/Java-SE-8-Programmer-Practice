package Chapter3;

public class ImportantStringBuilderMethods {
    /**

     charAt(), indexOf(), length(), and substring()
     These four methods work exactly the same as in the String class


     append()
     The append() method is by far the most frequently used method in StringBuilder. In fact,
     it is so frequently used that we just started using it without comment. Luckily, this method
     does just what it sounds like: it adds the parameter to the StringBuilder and returns a reference
     to the current StringBuilder. One of the method signatures is as follows:
     StringBuilder append(String str)
     Notice that we said one of the method signatures. There are more than 10 method signatures that look similar but
     that take different data types as parameters. All those methods
     are provided so you can write code like this:
     StringBuilder sb = new StringBuilder().append(1).append('c');
     sb.append("-").append(true);
     System.out.println(sb); // 1c-true
     Nice method chaining, isn’t it? append() is called directly after the constructor. By having all these method
     signatures, you can just call append() without having to convert your parameter to a String first.

     **/
}
