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



     insert()
     The insert() method adds characters to the StringBuilder at the requested index and
     returns a reference to the current StringBuilder. Just like append(), there are lots of
     method signatures for different types. Here’s one:
     StringBuilder insert(int offset, String str)
     Pay attention to the offset in these examples. It is the index where we want to insert the
     requested parameter.
     3: StringBuilder sb = new StringBuilder("animals");
     4: sb.insert(7, "-"); // sb = animals5: sb.insert(0, "-"); // sb = -animals6: sb.insert(4, "-"); // sb = -ani-mals
     7: System.out.println(sb);
     Line 4 says to insert a dash at index 7, which happens to be the end of sequence of characters. Line 5 says to
     insert a dash at index 0, which happens to be the very beginning.
     Finally, line 6 says to insert a dash right before index 4. The exam creators will try to trip
     you up on this. As we add and remove characters, their indexes change. When you see a
     question dealing with such operations, draw what is going on so you won’t be confused.




     delete() and deleteCharAt()
     The delete() method is the opposite of the insert() method. It removes characters from
     the sequence and returns a reference to the current StringBuilder. The deleteCharAt()
     method is convenient when you want to delete only one character. The method signatures
     are as follows:
     StringBuilder delete(int start, int end)
     StringBuilder deleteCharAt(int index)
     The following code shows how to use these methods:
     StringBuilder sb = new StringBuilder("abcdef");
     sb.delete(1, 3); // sb = adef
     sb.deleteCharAt(5); // throws an exception
     First, we delete the characters starting with index 1 and ending right before index 3. This
     gives us adef. Next, we ask Java to delete the character at position 5. However, the remaining value is only four
     characters long, so it throws a StringIndexOutOfBoundsException.




     reverse()
     After all that, it’s time for a nice, easy method. The reverse() method does just what it
     sounds like: it reverses the characters in the sequences and returns a reference to the current
     StringBuilder. The method signature is as follows:
     StringBuilder reverse()
     The following code shows how to use this method:
     StringBuilder sb = new StringBuilder("ABC");
     sb.reverse();
     System.out.println(sb);
     As expected, this prints CBA. This method isn’t that interesting. Maybe the exam creators
     like to include it to encourage you to write down the value rather than relying on memory
     for indexes.
     **/
}
