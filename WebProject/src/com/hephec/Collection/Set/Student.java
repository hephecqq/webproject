package com.hephec.Collection.Set;

public class Student implements Comparable{
private String name;
private int grade;
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + grade;
	result = prime * result + ((name == null) ? 0 : name.hashCode());
	return result;
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Student other = (Student) obj;
	if (grade != other.grade)
		return false;
	if (name == null) {
		if (other.name != null)
			return false;
	} else if (!name.equals(other.name))
		return false;
	return true;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getGrade() {
	return grade;
}
public void setGrade(int grade) {
	this.grade = grade;
}
public Student(String name, int grade) {
	super();
	this.name = name;
	this.grade = grade;
}
@Override
public String toString() {
	return "Student [name=" + name + ", grade=" + grade + "]";
}
@Override
public int compareTo(Object o) {
	if(o instanceof Student){
		Student stu=(Student)o;
		return this.grade-stu.grade;
	}
	else{
		throw new ClassCastException("不是一个Student对象");
	}
}
}
