package equals;

public class Manager1 extends Employee1
{
    private double bonus;

    public Manager1(String name,double salary,int year,int month,int day)
    {
        super(name,salary,year,month,day);
        this.bonus=0;
    }

    public double getSalary()
    {
        double baseSalary = super.getSalary();
        return baseSalary + bonus;
    }

    public void setBonus(double bonus)
    {
        this.bonus=bonus;
    }

    public boolean equals(Object otherObject)
    {
        if(!super.equals(otherObject)) return false;
        Manager1 other=(Manager1) otherObject;
        // super.equals checked that this and other belong to the same class
        return bonus == other.bonus;
    }


    public int hashCode()
    {
        return java.util.Objects.hash(super.hashCode(),bonus);
    }

    public String toString()
    {
        return super.toString() + "[bonus=" + bonus + "]";
    }
}