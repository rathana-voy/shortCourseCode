package io;

import java.io.Serializable;

public class Car implements Serializable{
	String model;
	String color;
	float enginPower;
	
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public float getEnginPower() {
		return enginPower;
	}
	public void setEnginPower(float enginPower) {
		this.enginPower = enginPower;
	}
	
	

}
