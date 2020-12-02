package Chapter3;

public class WorkingWithDatesAndTimes {
    /**

     In Java 8, Oracle completely revamped how we work with dates and times. You can still
     write code the “old way,” but those classes aren’t on the exam. We’ll mention the “old way”
     in real-world scenarios so that you can learn the “new way” more easily if you fi rst learned
     Java before version 8. Even if you are learning Java starting with version 8, this will help
     you when you need to read older code. Just know that the “old way” is not on the exam.
     As with an ArrayList, you need an import statement to work with the date and time classes.
     Most of them are in the java.time package. To use it, add this import to your program:
     import java.time.*; // import time classes
     In the following sections, we’ll look at creating, manipulating, and formatting dates and times.



     Creating Dates and Times
     In the real world, we usually talk about dates and time zones as if the other person is
     located near us. For example, if you say “I’ll call you at 11:00 on Tuesday morning,” we
     assume that 11:00 means the same thing to both of us. But if you live in New York and we
     live in California, you need to be more specifi c. California is three hours earlier than New
     York because the states are in different time zones. You would instead say, “I’ll call you at
     11:00 EST on Tuesday morning.” Luckily, the exam doesn’t cover time zones, so discussing
     dates and times is easier.
     When working with dates and times, the fi rst thing to do is decide how much information you need. The exam gives you three choices:
     LocalDate Contains just a date—no time and no time zone. A good example of
     LocalDate is your birthday this year. It is your birthday for a full day regardless of what
     time it is.
     LocalTime Contains just a time—no date and no time zone. A good example of
     LocalTime is midnight. It is midnight at the same time every day.
     LocalDateTime Contains both a date and time but no time zone. A good example of
     LocalDateTime is “the stroke of midnight on New Year’s.” Midnight on January 2 isn’t
     nearly as special, and clearly an hour after midnight isn’t as special either.
     Oracle recommends avoiding time zones unless you really need them. Try to act as if
     everyone is in the same time zone when you can. If you do need to communicate across
     time zones, ZonedDateTime handles them.
     Ready to create your fi rst date and time objects?
     System.out.println(LocalDate.now());
     System.out.println(LocalTime.now());
     System.out.println(LocalDateTime.now());
     Each of the three classes has a static method called now() that gives the current date and
     time. Your output is going to depend on what date/time you run it and where you live. The
     authors live in the United States, making the output look like the following when run on
     January 20 at 12:45 p.m.:
     2015-01-20
     12:45:18.401
     2015-01-20T12:45:18.401
     The key is to notice the type of information in the output. The fi rst one contains only a
     date and no time. The second contains only a time and no date. This time displays hours,
     minutes, seconds, and nanoseconds. The third contains both date and time. Java uses T to
     separate the date and time when converting LocalDateTime to a String.



     Wait—I Don’t Live in the United States
     The exam recognizes that exam takers live all over the world and will not ask you about
     the details of United States date and time formats.
     In the United States, the month is written before the date. The exam won’t ask you about
     the difference between 02/03/2015 and 03/02/2015. That would be mean and not internationally friendly,
     and it would be testing your knowledge of United States dates rather
     than your knowledge of Java. That said, our examples do use United States date and time
     formats as will the questions on the exam. Just remember that the month comes before
     the date. Also, Java tends to use a 24-hour clock even though the United States uses a
     12-hour clock with a.m./p.m.



     Now that you know how to create the current date and time, let’s look at other specific
     dates and times. To begin, let’s create just a date with no time. Both of these examples
     create the same date:
     LocalDate date1 = LocalDate.of(2015, Month.JANUARY, 20);
     LocalDate date2 = LocalDate.of(2015, 1, 20);
     Both pass in the year, month, and date. Although it is good to use the Month constants
     (to make the code easier to read), you can pass the int number of the month directly.
     Just use the number of the month the same way you would if you were writing the date
     in real life.
     The method signatures are as follows:
     public static LocalDate of(int year, int month, int dayOfMonth)
     public static LocalDate of(int year, Month month, int dayOfMonth)
     Month is a special type of class called an enum. You don’t need to know about enums on
     the OCA exam and can just treat them as constants.

     **/
}
