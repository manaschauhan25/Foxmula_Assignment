package com.foxmula_assignment1;


public class Time {
private int hour,min,sec;
	
	Time(){
	hour=0;
	min=0;
	sec=0;
	}
	
	Time(int hour, int min, int sec){
		this.hour=hour;
		this.min=min;
		this.sec=sec;
	}
	
	Time add(Time time_to_add) {
		
		Time time=new Time();	// To initialize hour=0, min=0 and sec=0
		
		time.hour=this.hour + time_to_add.hour;
		time.min=this.min + time_to_add.min;
		time.sec=this.sec + time_to_add.sec;
		
		if(time.sec>60) {
			time.sec-=60;
			time.min++;
		}
		if(time.min>60) {
			time.min-=60;
			time.hour++;
		}
		if(time.hour>24) {
			time.hour-=24;
		}
		
		return  time;
	}
	
	void show() {
		System.out.println("The sum of both time is: "+this.hour+":"+this.min+":"+this.sec);
	}
	

}

