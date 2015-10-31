package com.hephec.model;

public class Course {

	private String type;
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	private Integer id;
	private String name;
	@Override
	public String toString() {
		return "Course [type=" + type + ", id=" + id + ", name=" + name + "]";
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Course(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public Course() {
		super();
	}
	
}
