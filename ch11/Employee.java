import java.util.Date;

public class Employee extends Person
{
    private String office;
    private double salary;
    private Date hireDay;

    public Employee(String name)
    {
        super(name);
    }

    @Override
    public String toString()
    {
        return "Employee{" +
                "name='" + getName() + '\'' +
                "office='" + office + '\'' +
                ", salary=" + salary +
                ", hireDay=" + hireDay +
                '}';
    }
}
