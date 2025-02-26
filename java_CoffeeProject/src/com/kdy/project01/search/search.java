package com.kdy.project01.search;

public class search {
	private Object place_name;
	private Object road_address_name;
	private Object phoneNum;
	private Object distance;
	
	public search() {
		// TODO Auto-generated constructor stub
	}

	public search(Object place_name, Object road_address_name, Object phoneNum, Object distance) {
		super();
		this.place_name = place_name;
		this.road_address_name = road_address_name;
		this.phoneNum = phoneNum;
		this.distance = distance;
	}
	
	public Object getPlace_name() {
		return place_name;
	}

	public void setPlace_name(Object place_name) {
		this.place_name = place_name;
	}

	public Object getRoad_address_name() {
		return road_address_name;
	}

	public void setRoad_address_name(Object road_address_name) {
		this.road_address_name = road_address_name;
	}

	public Object getPhoneNum() {
		return phoneNum;
	}

	public void setPhoneNum(Object phoneNum) {
		this.phoneNum = phoneNum;
	}

	public Object getDistance() {
		return distance;
	}

	public void setDistance(Object distance) {
		this.distance = distance;
	}
	
	
}
