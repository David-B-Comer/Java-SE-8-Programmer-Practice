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

     **/
}
