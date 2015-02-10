package org.elsys_bg.abonatnik.rest;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.Path;

import org.elsys_bg.abonatnik.model.Student;

@Path("abonatnik")
public class StudentResource {

	public List<Student> getAllStudents() {

		List<Student> ss = new ArrayList<Student>();
		Student std = new Student("Go6o");
		ss.add(std);
		return ss;
	}
}
