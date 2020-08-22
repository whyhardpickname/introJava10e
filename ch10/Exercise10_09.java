import java.util.*;

public class Exercise10_09
{
	public static void main(String[] args)
	{
		Course math = new Course("math");
		math.addStudent("alice");
		math.addStudent("bob");
		math.addStudent("carl");
		math.dropStudent("alice");
		
		String[] students = math.getStudents();
		for (String s : students)
		{
			System.out.print(s + " ");
		}
	}
}
