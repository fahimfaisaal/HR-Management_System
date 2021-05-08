package Classes;

import Enums.Days;
import Enums.Months;

import java.util.Scanner;

public class Date implements Interfaces.Date {
	private Days day = null;
	private int date = 0;
	private Months month = null;
	private int year = 0;
	private final Scanner scan = new Scanner(System.in);

	private final Months[] months = {
		Months.JAN,
		Months.FEB,
		Months.MAR,
		Months.APR,
		Months.MAY,
		Months.JUN,
		Months.JUL,
		Months.AUG,
		Months.SEP,
		Months.OCT,
		Months.NOV,
		Months.DEC
	};

	private final Days[] days = {
		Days.SAT,
		Days.SUN,
		Days.MON,
		Days.TUE,
		Days.WED,
		Days.THU,
		Days.FRI
	};

	public void displayDays() {
		StringBuilder days = new StringBuilder();

		for (int i = 1; i < 8; i++) {
			days.append(i).append(".").append(this.days[i - 1]).append("\n");
		}

		System.out.print(days);
	}

	@Override
	public Days getDay() {
		return this.day;
	}

	@Override
	public void setDay(Days day) {
		this.day = day;
	}

	public void setDayByUser(String event) {
		while (true) {
			this.displayDays();

			System.out.print("Select " + event + " day: ");
			int day = scan.nextInt();

			if (day > 7 || day < 1) {
				System.out.println("\n__Error, Day is Invalid!__\n");
				continue;
			}

			this.setDay(this.days[day - 1]);
			break;
		}
	}

	@Override
	public int getDate() {
		return this.date;
	}

	@Override
	public void setDate(int date) {
		this.date = date;
	}

	public void setDateByUser(String event) {
		while(true) {
			System.out.print("Enter " + event + " Date: ");

			int date = scan.nextInt();

			if (date > 31 || date < 1) {
				System.out.println("\n__Error, Date is Invalid!__\n");
				continue;
			}

			this.setDate(date);
			break;
		}
	}

	public void displayMonths() {
		StringBuilder months = new StringBuilder();

		for (int i = 1; i < 13; i++) {
			months.append(i).append(". ").append(this.months[i - 1]).append("\n");
		}

		System.out.print(months);
	}

	@Override
	public Months getMonth() {
		return this.month;
	}

	@Override
	public void setMonth(Months month) {
		this.month = month;
	}

	public void setMonthByUser(String event) {
		while (true) {
			this.displayMonths();
			System.out.print("Select " + event + " Month: ");

			int month = scan.nextInt();
			if (month > 12 || month < 1) {
				System.out.println("\n__Error, Month is Invalid!__\n");

				continue;
			}

			this.setMonth(this.months[month - 1]);
			break;
		}
	}

	@Override
	public int getYear() {
		return this.year;
	}

	@Override
	public void setYear(int year) {
		this.year = year;
	}

	public void setYearByUser(String event) {
		while (true) {
			System.out.print("Enter " + event + " year: ");
			int year = scan.nextInt();

			if (year < 0 || year > 2022) {
				System.out.println("\n__Error, Year is Invalid!__\n");
				continue;
			}

			this.setYear(year);
			break;
		}
	}

	@Override
	public String toString() {
		return "Date {" + '\n' +
		" day = " + this.getDay() + ",\n" +
		" date = " + this.getDate() + ",\n" +
		" month = " + this.getMonth() + ",\n" +
		" year = " + this.getYear() + ",\n" +
		'}';
	}
}
