import java.io.*;

class date {
	private int month;
	private int day;
	private int year;
	public date() {
		this.month=month;
		this.day=day;
		this.year=year;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public void displayDate(){
		System.out.printf("Date:%d/%d/%d",month,day,year);
	}
}

-----------------
public class datetest {
	public static void main(String[] args) {
		date d = new date();
		d.setDay(26);
		d.setMonth(07);
		d.setYear(1998);
		d.displayDate();
	}
}


