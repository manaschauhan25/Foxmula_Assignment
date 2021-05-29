package com.foxmula_assignment1;

public class Problem1 extends Time {

	public static void main(String[] args) {
		Time time1=new Time(13,45,0);
		Time time2=new Time(12,55,0);
		Time added_time=time1.add(time2);
		added_time.show();
	}
}
