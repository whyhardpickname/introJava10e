public class Student extends Person
{
    private String grade;

    public Student(String name)
    {
        super(name);
    }

    @Override
    public String toString()
    {
        return "Student{" +
                "name='" + getName() + '\'' +
                "grade='" + grade + '\'' +
                '}';
    }
}
