package interfaces;

public class Employee1 implements Comparable<Employee1>
{
    private String name;
    private double salary;

    public Employee1(String name,double salary)
    {
        this.name = name;
        this.salary = salary;
    }

    public String getName()
    {
        return name;
    }

    public double getSalary()
    {
        return salary;
    }

    public void raiseSalary(double byPercent)
    {
        double raise = salary * byPercent /100;
        salary += raise;
    }


    public int compareTo(Employee1 other)
    {
        return Double.compare(salary,other.salary);
    }

}