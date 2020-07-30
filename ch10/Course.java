public class Course
{
	private String name;
	private String[] students = new String[100];
	private int numberOfStudents = 0;
	
	public Course(String name)
	{
		this.name = name;
	}
	
	public void addStudent(String name)
	{
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
					students[j + 1] = students[j];
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
}