package com.example.auto.Services;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.model.Student;

@Service
public class StudentHandler {
	
	public String CreateStudent(Student student) throws FileNotFoundException, IOException  {
		List<Student> allStudents;
		try {
			allStudents = ReadFile();
		} catch (Exception e) {
			//At first time
			allStudents = new ArrayList<Student>();
			e.printStackTrace();
		}
		allStudents.add(student);
		WriteToFile(allStudents);
		return "Success";
	}
	
	public  List<Student> GetAllStudents() throws ClassNotFoundException, IOException {
		List<Student> allStudents = ReadFile();
		return allStudents;
	}
	
	public List<Student> getByNameOrRoll(String somePart) throws ClassNotFoundException, IOException {
		List<Student> allStudents = ReadFile();
		List<Student> searchedStudents = new ArrayList<Student>();
		for (Student student : allStudents) {
			if(student.getName().contains(somePart))
				searchedStudents.add(student);
			else if(student.getRollNo().contains(somePart))
				searchedStudents.add(student);
		}
		return searchedStudents;
	}

	public void WriteToFile(List<Student> allStudents) throws FileNotFoundException, IOException {
		
		
		File f = new File("./src/main/resources/local-File-Storage/Data.txt");
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(f));
		oos.writeObject(allStudents);
		System.out.println("Written successfuly");
		oos.flush();
		oos.close();
	}

	public ArrayList<Student> ReadFile() throws IOException, ClassNotFoundException {
		File f = new File("./src/main/resources/local-File-Storage/Data.txt");
		ObjectInputStream inn = new ObjectInputStream(new FileInputStream(f));
		@SuppressWarnings("unchecked")
		ArrayList<Student> AllStudents = (ArrayList<Student>) inn.readObject();
		inn.close();
		System.out.println("Read successfuly");
		return AllStudents;
	}
}
