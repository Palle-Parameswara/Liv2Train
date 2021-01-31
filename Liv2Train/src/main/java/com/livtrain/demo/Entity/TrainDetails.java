package com.livtrain.demo.Entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import com.sun.istack.NotNull;

@Entity
public class TrainDetails {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	@Size(max=40,message="less than 40 charecters")
	private String CenterName;
	@Size(max=12,min=12, message="exactly 12 charecters")
	private int code;
	private int capacity;
	@OneToMany(targetEntity=courses.class,cascade=CascadeType.ALL)
	@JoinColumn(name="tc_fk",referencedColumnName = "id")
	private List<courses> course;
	private String date;
	@Pattern(regexp="\\\\b[A-Z0-9._%+-]+@[A-Z0-9.-]+\\\\.[A-Z]{2,4}\\\\b")
	@NotBlank(message="enter the email")
	private String Email;
	@NotBlank(message="Enter the phone number")
	private int phone;
	@OneToMany(targetEntity=Address.class,cascade=CascadeType.ALL)
	@JoinColumn(name="ta_fk",referencedColumnName = "id")
	private List<Address> address;
	public TrainDetails()
	{
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCenterName() {
		return CenterName;
	}
	public void setCenterName(String centerName) {
		CenterName = centerName;
	}
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	public List<courses> getCourse() {
		return course;
	}
	public void setCourse(List<courses> course) {
		this.course = course;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public int getPhone() {
		return phone;
	}
	public void setPhone(int phone) {
		this.phone = phone;
	}
	public List<Address> getAddress() {
		return address;
	}
	public void setAddress(List<Address> address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "TrainDetails [id=" + id + ", CenterName=" + CenterName + ", code=" + code + ", capacity=" + capacity
				+ ", course=" + course + ", date=" + date + ", Email=" + Email + ", phone=" + phone + ", address="
				+ address + "]";
	}
	public TrainDetails(String centerName, int code, int capacity, List<courses> course, String date, String email,
			int phone, List<Address> address) {
		super();
		CenterName = centerName;
		this.code = code;
		this.capacity = capacity;
		this.course = course;
		this.date = date;
		Email = email;
		this.phone = phone;
		this.address = address;
	}
	
	
}
