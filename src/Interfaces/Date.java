package Interfaces;

import Enums.Months;
import Enums.Days;

public interface Date {
	Days getDay();
	void setDay(Days day);

	int getDate();
	void setDate(int date);

	Months getMonth();
	void setMonth(Months month);

	int getYear();
	void setYear(int year);
}
