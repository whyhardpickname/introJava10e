package ex13;

import java.util.*;

public class Course implements Cloneable
{
	private String name;
	private int capacity = 100;
	private String[] students = new String[capacity];
	private int numberOfStudents = 0;
	
	public Course(String name)
	{
		this.name = name;
	}
	
	public void addStudent(String name)
	{
		if (numberOfStudents >= capacity)
		{
			capacity = 2 * students.length;
			students = Arrays.copyOf(students, capacity);
		}
		students[numberOfStudents] = name;
		numberOfStudents++;
	}
	
	public void dropStudent(String name)
	{
		for (int i = 0; i < numberOfStudents; i++)
		{
			if (students[i].compareTo(name) == 0)
			{
				for (int j = i; j + 1 < numberOfStudents; j++)
				{
					students[j] = students[j + 1];
				}
				numberOfStudents--;
			}
		}
	}
	
	public String[] getStudents()
	{
		String[] realStudents = new String[numberOfStudents];
		
		int j = 0;
		for (int i = 0; i < numberOfStudents; i++)
		{
			realStudents[i] = students[i];
		}
		
		return realStudents;
	}
	
	public int getNumberOfStudents()
	{
		return numberOfStudents;
	}
	
	public void clear()
	{
		numberOfStudents = 0;
	}

	@Override
	protected Course clone() throws CloneNotSupportedException
	{
		Course course = (Course) super.clone();
		course.students = (String[]) students.clone();
		return course;
	}
}