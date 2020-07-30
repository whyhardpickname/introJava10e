public class CourseTest
{
	public static void main(String[] args)
	{
		Course math = new Course("math");
		
		math.addStudent("mark");
		math.addStudent("carl");
		math.addStudent("bill");
		
		System.out.println("number of students: " + math.getNumberOfStudents());
		for (int i = 0; i < math.getNumberOfStudents(); i++)
		{
			System.out.print(math.getStudents()[i] + " ");
		}
		
		System.out.println();
		System.out.println("after drop one student: ");
				
		math.dropStudent("bill");
		
		System.out.println("number of students: " + math.getNumberOfStudents());
		for (int i = 0; i < math.getNumberOfStudents(); i++)
		{
			System.out.print(math.getStudents()[i] + " ");
		}
	}
}