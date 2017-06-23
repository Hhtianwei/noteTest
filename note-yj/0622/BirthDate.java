package com.shsxt.jie;

public class BirthDate {
	int day;
	int month;
	int year;
	public BirthDate(int d,int m,int y){
		day = d;
		month = m;
		year = y;
	}
	void setDay(int d){
		day = d;
	}
	void setMonth(int m){
		month = m;
	}
	void setYear(int y){
		year = y;
	}
	int getDay(){
		return day;
	}
	int getMonth(){
		return month;
	}
	int getYear(){
		return year;
	}
	void disPlay(){
			System.out.println(day+"-"+month+"-"+year);
	}
}
