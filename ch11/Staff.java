public class Staff extends Employee
{
    private String jobTitle;

    public Staff(String name)
    {
        super(name);
    }
    @Override
    public String toString()
    {
        return "Staff{" +
                "name='" + getName() + '\'' +
                "jobTitle='" + jobTitle + '\'' +
                '}';
    }
}
