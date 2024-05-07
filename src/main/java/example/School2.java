package example;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.ArrayList;

public class School2 extends Whale implements Studyable{
    public int Sud;

public static void main(String... _Args) {
    LocalDateTime dt = LocalDateTime.of(2014, 7, 31, 1, 1, 30);
    LocalDateTime nm = LocalDateTime.of(21, 3, 21, 9, 45);
    DateTimeFormatter dt1 = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);
    Period p = Period.of(1, 2, 3);
    Period p1 = Period.ofDays(1).ofYears(2);
    System.out.println(dt1.format(dt));
    String [] sA = new String [] { "Java"};
    int index = 1;
    String [] strArr = new String [5];
    String myStr  = strArr [index];
    System.out.println(myStr);
    int y = 0;
    Whale school2 = new School2();
    String result = Studyable.a + "123";
    school2.dive();

//    do {
//            y = 1;
//            System.out.print(y++ + " ");
//        } while(y <= 10);
//    nm.plusYears(4);
//    dt.plusMonths(1);
//    dt.plusMonths(30);
//    System.out.println(dt);
//    LocalTime time = LocalTime.of(16, 30); // строка 1
//    time = time.withHour(14).plusMinutes(15);
//    System.out.println(time);
//    ArrayList<Double> points = new ArrayList<>();
//    points.add(1.1);
//    points.add(2.1);
//    points.add(3.2);
//    points.add(4.2);
//    points.add(null);
//    points.remove(1);
//    points.remove(null);
//    System.out.println(points);
//    String s1 = "java";
//   StringBuilder s2 = new StringBuilder("java");
//   //if (s1 == s2)
//         System.out.print("1");
//   if (s1.equals(s2))
//         System.out.print("2");
        }

    @Override
    public int sale() {
        return 0;
    }

    public void makeSomething(){}
    @Override
    public void work() {

    }

    @Override
    public void eat() {

    }
}

