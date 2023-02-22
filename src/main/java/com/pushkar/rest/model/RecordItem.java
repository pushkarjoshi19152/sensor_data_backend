package com.pushkar.rest.model;

import org.springframework.stereotype.Component;

@Component
public class RecordItem {
	
	private int temprature;
	private int turbidity;
	private int ph;
	
	public RecordItem(int temprature, int turbidity, int ph) {
		super();
		this.temprature = temprature;
		this.turbidity = turbidity;
		this.ph = ph;
	}
	public RecordItem() {
		// TODO Auto-generated constructor stub
	}
	public int getTemprature() {
		return temprature;
	}
	public void setTemprature(int temprature) {
		this.temprature = temprature;
	}
	public int getTurbidity() {
		return turbidity;
	}
	public void setTurbidity(int turbidity) {
		this.turbidity = turbidity;
	}
	public int getPh() {
		return ph;
	}
	public void setPh(int ph) {
		this.ph = ph;
	}
	@Override
	public String toString() {
		return "Record [temprature=" + temprature + ", turbidity=" + turbidity + ", ph=" + ph + "]";
	}
	

}
