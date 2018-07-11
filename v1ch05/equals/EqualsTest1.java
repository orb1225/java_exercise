package equals;



public class EqualsTest1
{
    public static void main(String[] args)
    {
        Employee1 alice1 = new Employee1("Alice Adams",75000, 1987, 12, 15);
        Employee1 alice2 = alice1;
        Employee1 alice3 = new Employee1("Alice Adams", 75000, 1987, 12, 15);
        Employee1 bob =new Employee1("Bob Brandson",50000, 1989, 10, 1);
        //true
        System.out.println("alice1 == alice2: " + (alice1 == alice2));
        //false
        System.out.println("alice1 == alice3: " + (alice1 == alice3));
        //true
        System.out.println("alice1.equals(alice3): " + alice1.equals(alice3)); 
        //false
        System.out.println("alice1.equals(bob): " + alice1.equals(bob));

        System.out.println("bob.toString(): " + bob);

        Manager1 carl = new Manager1("Carl Cracker", 80000, 1987, 12, 15);
        Manager1 boss = new Manager1("Carl Cracker", 80000, 1987, 12, 15);
        boss.setBonus(5000);
        System.out.println("boss.toString(): " + boss);
        //false
        System.out.println("carl.equals(boss): " + carl.equals(boss));

        System.out.println("alice1.hashCode(): " + alice1.hashCode());
        System.out.println("alice3.hashCode(): " + alice3.hashCode());
        System.out.println("bob.hashCode(): " + bob.hashCode());
        System.out.println("carl.hashCode(): " + carl.hashCode());


    }
}