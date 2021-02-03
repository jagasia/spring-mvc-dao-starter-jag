package model;

import java.text.SimpleDateFormat;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

@NamedQuery(name = "byCompany", query = "select v from Vehicle v where v.company=:company")
@Entity
@Table(name = "VEHICLE")
public class Vehicle {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int id;
	@Column(name = "name")
	private String name;
	private String type;
	private String company;
	@Transient
	private SimpleDateFormat sdf;
	
	public Vehicle() {}
	public Vehicle(int id, String name, String type, String company) {
		super();
		this.id = id;
		this.name = name;
		this.type = type;
		this.company = company;
	}
	public Vehicle(String name, String type, String company) {
		super();
		this.name = name;
		this.type = type;
		this.company = company;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	@Override
	public String toString() {
		return "Vehicle [id=" + id + ", name=" + name + ", type=" + type + ", company=" + company + "]";
	}
	
}
