package com.example.myjyb;

public class Xuanj {
	private String title;
	private String time;
private String place;
private String pub_time;
	private String content;
	public Xuanj( String title, String time,String place,String pub_time,String content) {
	this.title=title;
	this.time=time;
	this.place=place;
	this.pub_time=pub_time;
	this.content=content;
	}
	
	
	public String getTitle() {
		return title;
	}


	public String getTime() {
		return time;
	}
	
	public String getPlace (){
		
		return place;
		
	}
public String getPub_time (){
		
		return pub_time;
		
	}
public String getContent (){
	
	return content;
	
}
	
	
	
}