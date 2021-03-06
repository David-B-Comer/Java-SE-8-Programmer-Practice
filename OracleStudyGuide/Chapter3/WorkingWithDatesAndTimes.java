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





     Up to now, we’ve been like a broken record telling you that Java counts
     starting with 0. Well, months are an exception. For months in the new date
     and time methods, Java counts starting from 1 like we human beings do.
     When creating a time, you can choose how detailed you want to be. You can specify just
     the hour and minute, or you can add the number of seconds. You can even add nanoseconds if you want to be very precise. (A nanosecond is a billionth of a second—you probably
     won’t need to be that specifi c.)
     LocalTime time1 = LocalTime.of(6, 15); // hour and minute
     LocalTime time2 = LocalTime.of(6, 15, 30); // + seconds
     LocalTime time3 = LocalTime.of(6, 15, 30, 200); // + nanoseconds
     These three times are all different but within a minute of each other. The method signatures are as follows:
     public static LocalTime of(int hour, int minute)
     public static LocalTime of(int hour, int minute, int second)
     public static LocalTime of(int hour, int minute, int second, int nanos)
     Finally, we can combine dates and times:
     LocalDateTime dateTime1 = LocalDateTime.of(2015, Month.JANUARY, 20, 6, 15, 30);
     LocalDateTime dateTime2 = LocalDateTime.of(date1, time1);
     The fi rst line of code shows how you can specify all the information about the
     LocalDateTime right in the same line. There are many method signatures allowing you
     to specify different things. Having that many numbers in a row gets to be hard to read,
     though. The second line of code shows how you can create LocalDate and LocalTime
     objects separately fi rst and then combine them to create a LocalDateTime object.
     This time there are a lot of method signatures since there are more combinations. The
     method signatures are as follows:
     public static LocalDateTime of(int year, int month,
     int dayOfMonth, int hour, int minute)
     public static LocalDateTime of(int year, int month,
     int dayOfMonth, int hour, int minute, int second)
     public static LocalDateTime of(int year, int month,
     int dayOfMonth, int hour, int minute, int second, int nanos)
     public static LocalDateTime of(int year, Month month,
     int dayOfMonth, int hour, int minute)
     public static LocalDateTime of(int year, Month month,
     int dayOfMonth, int hour, int minute, int second)
     public static LocalDateTime of(int year, Month month,
     int dayOfMonth, int hour, int minute, int second, int nanos)
     public static LocalDateTime of(LocalDate date, LocalTime)
     Did you notice that we did not use a constructor in any of the examples? The date and
     time classes have private constructors to force you to use the static methods. The exam
     creators may try to throw something like this at you:
     LocalDate d = new LocalDate(); // DOES NOT COMPILE
     Don’t fall for this. You are not allowed to construct a date or time object directly.
     Another trick is to see what happens when you pass invalid numbers to of(). For example:
     LocalDate.of(2015, Month.JANUARY, 32) // throws DateTimeException
     You don’t need to know the exact exception that’s thrown, but it’s a clear one:
     java.time.DateTimeException: Invalid value for DayOfMonth
     (valid values 1 - 28/31): 32






     Creating Dates in Java 7 and Earlier
     You can see some of the problems with the “old way” in the following table. There
     wasn’t a way to specify just a date without the time. The Date class represented both the
     date and time whether you wanted it to or not. Trying to create a specifi c date required
     more code than it should have. Month indexes were 0 based instead of 1 based, which
     was confusing.There’s an old way to create a date. In Java 1.1, you created a specifi c Date with this: Date
     jan = new Date(2015, Calendar.JANUARY, 1);. You could use the Calendar class
     beginning with Java 1.2. Date exists mainly for backward compatibility and so that
     Calendar can work with code—making the “new way” the third way. The “new way” is
     much better so it looks like this is a case of the third time is the charm!

                                                                    Old way                                             New way (Java 8 and later)

     Importing                                                      import java.util.*;                                 import java.time.*;

     Creating an object with the current date                       Date d = new Date();                                LocalDate d = LocalDate.now();


     Creating an object with the current date and time Date         d = new Date();                                     LocalDateTime dt = LocalDateTime.now();


     Creating an object representing January 1, 2015                Calendar c = Calendar.getInstance();                LocalDate jan = LocalDate.of(2015, Month.JANUARY, 1);
                                                                    c.set(2015, Calendar. JANUARY, 1);
                                                                    Date jan = c.getTime();
                                                                    or
                                                                    Calendar c = new GregorianCalendar(2015,
                                                                    Calendar. JANUARY, 1);
                                                                    Date jan = c.getTime();


     Creating January 1, 2015 without the constant                  Calendar c = Calendar.getInstance();                LocalDate jan = LocalDate.of(2015, 1, 1)
                                                                    c.set(2015, 0, 1);
                                                                    Date jan = c.getTime();









     Manipulating Dates and Times
     Adding to a date is easy. The date and time classes are immutable, just like String was.
     This means that we need to remember to assign the results of these methods to a reference
     variable so they are not lost.
     12: LocalDate date = LocalDate.of(2014, Month.JANUARY, 20);
     13: System.out.println(date); // 2014-01-20
     14: date = date.plusDays(2);
     15: System.out.println(date); // 2014-01-22
     16: date = date.plusWeeks(1);
     17: System.out.println(date); // 2014-01-29
     18: date = date.plusMonths(1);
     19: System.out.println(date); // 2014-02-28
     20: date = date.plusYears(5);
     21: System.out.println(date); // 2019-02-28
     This code is nice because it does just what it sounds like. We start out with January 20,
     2014. On line 14, we add two days to it and reassign it to our reference variable. On line 16,
     we add a week. This method allows us to write clearer code than plusDays(7). Now date is
     January 29, 2014. On line 18, we add a month. This would bring us to February 29, 2014.
     However, 2014 is not a leap year. (2012 and 2016 are leap years.) Java is smart enough to
     realize February 29, 2014 does not exist and gives us February 28, 2014 instead. Finally, line
     20 adds fi ve years.
     There are also nice easy methods to go backward in time. This time, let’s work with
     LocalDateTime.
     22: LocalDate date = LocalDate.of(2020, Month.JANUARY, 20);
     23: LocalTime time = LocalTime.of(5, 15);
     24: LocalDateTime dateTime = LocalDateTime.of(date, time);
     25: System.out.println(dateTime); // 2020-01-20T05:15
     26: dateTime = dateTime.minusDays(1);
     27: System.out.println(dateTime); // 2020-01-19T05:15
     28: dateTime = dateTime.minusHours(10);
     29: System.out.println(dateTime); // 2020-01-18T19:15
     30: dateTime = dateTime.minusSeconds(30);
     31: System.out.println(dateTime); // 2020-01-18T19:14:30
     Line 25 prints the original date of January 20, 2020 at 5:15 a.m. Line 26 subtracts a
     full day, bringing us to January 19, 2020 at 5:15 a.m. Line 28 subtracts 10 hours, showing
     that the date will change if the hours cause it to and brings us to January 18, 2020 at 19:15
     (7:15 p.m.). Finally, line 30 subtracts 30 seconds. We see that all of a sudden the display
     value starts displaying seconds. Java is smart enough to hide the seconds and nanoseconds
     when we aren’t using them.
     It is common for date and time methods to be chained. For example, without the print
     statements, the previous example could be rewritten as follows:
     LocalDate date = LocalDate.of(2020, Month.JANUARY, 20);
     LocalTime time = LocalTime.of(5, 15);
     LocalDateTime dateTime = LocalDateTime.of(date2, time)
     .minusDays(1).minusHours(10).minusSeconds(30);
     When you have a lot of manipulations to make, this chaining comes in handy. There are
     two ways the exam creators can try to trick you. What do you think this prints?
     LocalDate date = LocalDate.of(2020, Month.JANUARY, 20);
     date.plusDays(10);
     System.out.println(date);
     It prints January 20, 2020. Adding 10 days was useless because we ignored the result.
     Whenever you see immutable types, pay attention to make sure the return value of a
     method call isn’t ignored.
     The exam also may test to see if you remember what each of the date and time objects
     includes. Do you see what is wrong here?
     LocalDate date = LocalDate.of(2020, Month.JANUARY, 20);
     date = date.plusMinutes(1); // DOES NOT COMPILE
     LocalDate does not contain time. This means you cannot add minutes to it. This can be
     tricky in a chained sequence of additions/subtraction operations, so make sure you know
     which methods can be called on which of the three objects.




     Methods in LocalDate, LocalTime, and LocalDateTime

                                Can call on LocalDate?          Can call on LocalTime?              Can call on LocalDateTime?

     plusYears/minusYears       Yes                             No                                  Yes
     plusMonths/minusMonths     Yes                             No                                  Yes
     plusWeeks/minusWeeks       Yes                             No                                  Yes
     plusDays/minusDays         Yes                             No                                  Yes
     plusHours/minusHours       No                              Yes                                 Yes
     plusMinutes/minusMinutes   No                              Yes                                 Yes
     plusSeconds/minusSeconds   No                              Yes                                 Yes
     plusNanos/minusNanos       No                              Yes                                 Yes







     Manipulating Dates in Java 7 and Earlier
     As you look at all the code in the following table to do time calculations in the “old way,”
     you can see why Java needed to revamp the date and time APIs! The “old way” took a lot
     of code to do something simple.


                                Old way                                     New way (Java 8 and later)
     Adding a day               public Date addDay(Date date) {             public LocalDate addDay(LocalDate date) {
                                Calendar cal = Calendar                     return date.plusDays(1); }
                                .getInstance();
                                cal.setTime(date);
                                cal.add(Calendar.DATE, 1);
                                return cal.getTime(); }

     Subtracting a day          public Date subtractDay(Date date) {        public LocalDate subtractDay(LocalDate date) {
                                Calendar cal = Calendar                     return date.minusDays(1); }
                                .getInstance();
                                cal.setTime(date);
                                cal.add(Calendar.DATE, -1);
                                return cal.getTime(); }







     Formatting Dates and Times
     The date and time classes support many methods to get data out of them:
     LocalDate date = LocalDate.of(2020, Month.JANUARY, 20);
     System.out.println(date.getDayOfWeek()); // MONDAY
     System.out.println(date.getMonth()); // JANUARY
     System.out.println(date.getYear()); // 2020
     System.out.println(date.getDayOfYear()); // 20
     We could use this information to display information about the date. However, it would
     be more work than necessary. Java provides a class called DateTimeFormatter to help us
     out. Unlike the LocalDateTime class, DateTimeFormatter can be used to format any type of
     date and/or time object. What changes is the format. DateTimeFormatter is in the package
     java.time.format.
     LocalDate date = LocalDate.of(2020, Month.JANUARY, 20);
     LocalTime time = LocalTime.of(11, 12, 34);
     LocalDateTime dateTime = LocalDateTime.of(date, time);System.out.println(date
     .format(DateTimeFormatter.ISO_LOCAL_DATE));
     System.out.println(time.format(DateTimeFormatter.ISO_LOCAL_TIME));
     System.out.println(dateTime.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));
     ISO is a standard for dates. The output of the previous code looks like this:
     2020-01-20
     11:12:34
     2020-01-20T11:12:34
     This is a reasonable way for computers to communicate, but probably not how you want
     to output the date and time in your program. Luckily there are some predefi ned formats
     that are more useful:
     DateTimeFormatter shortDateTime =
     DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
     System.out.println(shortDateTime.format(dateTime)); // 1/20/20
     System.out.println(shortDateTime.format(date)); // 1/20/20
     System.out.println(
     shortDateTime.format(time)); // UnsupportedTemporalTypeException
     Here we say we want a localized formatter in the predefi ned short format. The last line
     throws an exception because a time cannot be formatted as a date. The format() method is
     declared on both the formatter objects and the date/time objects, allowing you to reference
     the objects in either order. The following statements print exactly the same thing as the
     previous code:
     DateTimeFormatter shortDateTime =
     DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
     System.out.println(dateTime.format(shortDateTime));
     System.out.println(date.format(shortDateTime));
     System.out.println(time.format(shortDateTime));





     Parsing Dates and Times
     Now that you know how to convert a date or time to a formatted String, you’ll fi nd it easy
     to convert a String to a date or time. Just like the format() method, the parse() method
     takes a formatter as well. If you don’t specify one, it uses the default for that type.
     DateTimeFormatter f = DateTimeFormatter.ofPattern("MM dd yyyy");
     LocalDate date = LocalDate.parse("01 02 2015", f);
     LocalTime time = LocalTime.parse("11:22");
     System.out.println(date); // 2015-01-02
     System.out.println(time); // 11:22
     Here we show using both a custom formatter and a default value. This isn’t common,
     but you might have to read code that looks like this on the exam. Parsing is consistent in
     that if anything goes wrong, Java throws a runtime exception. That could be a format that
     doesn’t match the String to be parsed or an invalid date.

     **/
}
