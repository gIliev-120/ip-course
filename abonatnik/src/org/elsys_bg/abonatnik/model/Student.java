package org.elsys_bg.abonatnik.model;

public class Student {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Student(String name) {
		this.setName(name);
	}
	public Student(){
		this.name="";
	}
}
//интерфейсЌајбонатника