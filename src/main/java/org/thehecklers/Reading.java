package org.thehecklers;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.stereotype.Component;

@Component
@Entity
public class Reading {
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private int id;
	private double hum;
	private double temp;
	private long pressure;

    /*
        MH add:
	    Radioactivity levels (beta and gamma)
	    Bearing/directionality on three planes (x, y, z)
	*/

	protected Reading() {}
	
	public Reading(int id, double hum, double temp, long pressure) {
		//super();
		this.id = id;
		this.hum = hum;
		this.temp = temp;
		this.pressure = pressure;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getHum() {
		return hum;
	}

	public void setHum(double hum) {
		this.hum = hum;
	}

	public double getTemp() {
		return temp;
	}

	public void setTemp(double temp) {
		this.temp = temp;
	}

	public long getPressure() {
		return pressure;
	}

	public void setPressure(long pressure) {
		this.pressure = pressure;
	}

	@Override
	public String toString() {
		return "Reading [id=" + id + ", hum=" + hum + ", temp=" + temp + ", pressure=" + pressure + "]";
	}
}
