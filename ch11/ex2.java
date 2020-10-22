public class ex2
{
    public static void main(String[] args)
    {
        Person person = new Person("markchern");
        Student student = new Student("markwang");
        Employee employee = new Employee("markzhao");
        Faculty faculty = new Faculty("markqian");
        Staff staff = new Staff("markli");

        System.out.println(person);
        System.out.println(student);
        System.out.println(employee);
        System.out.println(faculty);
        System.out.println(staff);
    }
}
