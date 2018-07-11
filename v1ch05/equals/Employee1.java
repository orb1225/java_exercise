package equals;

import java.time.*;
import java.util.Objects;

public class Employee1
{
    private String  name;
    private double salary;
    private LocalDate hireDay;

    public Employee1(String name,double salary,int year,int month,int day)
    {
        this.name=name;
        this.salary=salary;
        hireDay=LocalDate.of(year,month,day);
    }

    public String getName()
    {
        return name;
    }

    public double getSalary()
    {
        return salary;
    }

    public LocalDate getHireDay()
    {
        return hireDay;
    }

    public void raiseSalary(double byPercent)
    {
        double raise=salary * byPercent / 100;
        salary += raise;
    }

    public boolean equals(Object otherObject)
    {
        //检查对象是否相同
        if(this==otherObject) return true;

        //如果传入的显式参数是null,则一定返回false
        if(otherObject == null) return false;

        //如果他们的类不相同，他们一定不相等
        if(this.getClass() != otherObject.getClass()) return false;

        //现在我们知道otherObject是一个非空的Employee,getclass可以准确知道他的类。
        Employee1 other =(Employee1) otherObject;

        //检测是否他们的私有域相同。name是字符串类型的,其实是对象比较,需要equals。
        //salary是基本类型,直接用==判断,hireDay也是对象，所以用equals比较。
        return Objects.equals(name,other.name) && salary==other.salary && Objects.equals(hireDay,other.hireDay);
    }

    public int hashCode()
    {
        return Objects.hash(name,salary,hireDay);
    }

    public String toString()
    {
        return getClass().getName() +"[name=" + name + ",salary=" + salary + ",hireDay=" + hireDay + "]";
    }

}