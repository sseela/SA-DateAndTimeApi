
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;
import java.time.temporal.TemporalUnit;
import java.util.TimeZone;

import com.sun.java_cup.internal.runtime.Scanner;

import sun.util.calendar.ZoneInfo;

public class DateAndTimePrac {

	public static void main(String[] args) {
		LocalDate d = LocalDate.now();
		System.out.println(d);
		
		LocalTime tt = LocalTime.now();
		System.out.println(tt);
		
		LocalDate date = LocalDate.now();
		int day = date.getDayOfMonth();
		int month = date.getMonthValue();
		int year = date.getYear();
		System.out.println(day+"-"+month+"-"+year);
		System.out.printf("%d.%d.%d", day, month, year);
		System.out.println();
		
		LocalTime time = LocalTime.now();
		System.out.println(time.getHour()+":"+time.getMinute());
		
		LocalDateTime dt = LocalDateTime.now();
		System.out.println(dt);
		int day1 = dt.getDayOfMonth();
		int month1 = dt.getMonthValue();
		int year1 = dt.getYear();
		
		int hour1 = dt.getHour();
		int min1 = dt.getMinute();
		int sec1 = dt.getSecond();
		System.out.println("Date: "+day1+"/"+month1+"/"+year1+" Time: "+hour1+":"+min1+":"+sec1);
		
		LocalDate bd = LocalDate.of(1996, 7, 22);
		LocalDate curr = LocalDate.now();
		LocalDate dd = bd.plusYears(60L);
		Period period = Period.between(bd, curr);
		Period timeyouhave = Period.between(curr, dd);
		int noOfDays = period.getYears()*365+period.getMonths()*12+period.getDays();
		int remainingDays = timeyouhave.getYears()*365+timeyouhave.getMonths()*12+timeyouhave.getDays();
		System.out.println(noOfDays);
		System.out.println(remainingDays);
		
		/*System.out.println("**********************");
		System.out.println("age calculation");
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.println("Enter your year");
		int yyyy = sc.nextInt();
		System.out.println("Enter your month");
		int mm = sc.nextInt();
		System.out.println("Enter your date");
		int ddd = sc.nextInt();
		System.out.println("you entered "+ddd+"."+mm+"."+yyyy);
		System.out.println("calculating");
		LocalDate dob1 = LocalDate.of(yyyy, mm, ddd);
		LocalDate now = LocalDate.now();
		Period period1 = Period.between(dob1, now);
		System.out.println("your age is: "+period1.getYears()+" "+period1.getMonths()+" "+period1.getDays());*/
		
		System.out.println("***********SOME IMPORTANT OPERATIONS******************");
		System.out.println("add 10 days to today's date");
		LocalDate days = LocalDate.now().plus(4, ChronoUnit.MONTHS);
		System.out.println(days.getMonthValue()+" "+days.getDayOfMonth());
		
		LocalDate today = LocalDate.now();
		LocalDate nextTuesday = today.with(TemporalAdjusters.firstDayOfNextMonth());
		System.out.println("Next sat on : " + nextTuesday);
		
		System.out.println("I want to find what will be weekend date for my next birthday");
		LocalDate dob2 = LocalDate.of(2020, 07, 22);
		LocalDate weekend = dob2.with(TemporalAdjusters.next(DayOfWeek.FRIDAY));
		System.out.println(weekend);
		
		TimeZone timeZone = ZoneInfo.getTimeZone("INDIA");
		System.out.println(timeZone.getDisplayName());
	}
}


