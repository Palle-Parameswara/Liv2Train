package com.livtrain.demo.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class courses {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int course_id;
	private String course1;
	private String course2;
	private int tc_fk;
	
	public int getTc_fk() {
		return tc_fk;
	}
	public void setTc_fk(int tc_fk) {
		this.tc_fk = tc_fk;
	}
	private courses() {
		
	}
	public int getCourse_id() {
		return course_id;
	}
	public void setCourse_id(int course_id) {
		this.course_id = course_id;
	}
	public String getCourse1() {
		return course1;
	}
	public void setCourse1(String course1) {
		this.course1 = course1;
	}
	public String getCourse2() {
		return course2;
	}
	public void setCourse2(String course2) {
		this.course2 = course2;
	}
	@Override
	public String toString() {
		return "courses [course_id=" + course_id + ", course1=" + course1 + ", course2=" + course2 + "]";
	}
	public courses(int course_id, String course1, String course2) {
		super();
		this.course_id = course_id;
		this.course1 = course1;
		this.course2 = course2;
	}
	
	
}
