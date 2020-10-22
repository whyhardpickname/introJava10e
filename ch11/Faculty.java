public class Faculty extends Employee
{
    private String officeHours;
    private String lever;

    public Faculty(String name)
    {
        super(name);
    }

    @Override
    public String toString()
    {
        return "Faculty{" +
                "name='" + getName() + '\'' +
                "officeHours='" + officeHours + '\'' +
                ", lever='" + lever + '\'' +
                '}';
    }
}
