package interfaces;

import java.util.*;


public class EmployeeSortTest1
{
    public static void main(String[] args)
    {
        Employee1[] staff = new Employee1[3];

        staff[0] = new Employee1("Harry Hacker",35000);
        staff[1] = new Employee1("Carl Cracker",75000);
        staff[2] = new Employee1("Tony Tester",38000);

        Arrays.sort(staff);

        for(Employee1 e : staff)
            System.out.println("name=" + e.getName() + ",salary=" + e.getSalary());
    }
}