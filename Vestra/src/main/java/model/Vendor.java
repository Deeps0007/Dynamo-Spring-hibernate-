package model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name="vendors")
public class Vendor {
	
	@Id
	@GeneratedValue(strategy =GenerationType.AUTO)
	private int id;
	private String vname;
	private String vemail;
	private String pass;
	private String mob;
	private String state;
	private String city;
	private String pin;
	public String getVname() {
		return vname;
	}
	public void setVname(String vname) {
		this.vname = vname;
	}
	public String getVemail() {
		return vemail;
	}
	public void setVemail(String vemail) {
		this.vemail = vemail;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public String getMob() {
		return mob;
	}
	public void setMob(String mob) {
		this.mob = mob;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getPin() {
		return pin;
	}
	public void setPin(String pin) {
		this.pin = pin;
	}
	
	
	
	
	
	
	
	
	
	
}
