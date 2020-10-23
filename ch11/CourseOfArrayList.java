import java.util.ArrayList;

public class CourseOfArrayList
{
    private String courseName;
    private ArrayList<String> students;

    public CourseOfArrayList(String courseName)
    {
        this.courseName = courseName;
        students = new ArrayList<String>();
    }

    public String getCourseName()
    {
        return courseName;
    }

    public ArrayList<String> getStudents()
    {
        return students;
    }

    public void addStudent(String student)
    {
        students.add(student);
    }

    public void dropStudent(String student)
    {
        students.remove(student);
    }

    public int getNumberOfStudents()
    {
        return students.size();
    }

    public static void main(String[] args)
    {
        CourseOfArrayList math = new CourseOfArrayList("math");
        math.addStudent("mark");
        math.addStudent("lisa");
        math.addStudent("bob");
        math.dropStudent("bob");

        for (String s : math.getStudents())
        {
            System.out.print(s + " ");
        }
    }
}
