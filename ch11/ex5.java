public class ex5
{
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
