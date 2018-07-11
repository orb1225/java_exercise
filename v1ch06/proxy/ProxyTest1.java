package proxy;



import java.lang.reflect.*;
import java.util.*;



public class ProxyTest1
{
    public static void main(String[] args)
    {
        Object[] elements = new Object[1000];

        for(int i=0;i<elements.length;i++)
        {
            Integer value = i + 1;
            //接口对象
            InvocationHandler handler = new TraceHandler1(value);
            Object proxy =Proxy.newProxyInstance(null,new Class[]{ Comparable.class },handler);
            elements[i] = proxy;
          
        }

        Integer key = new Random().nextInt(elements.length)+1;
        Comparable a=(Comparable)elements[3];
        Comparable b=(Comparable)elements[4];
        a.compareTo(b);
        int result = Arrays.binarySearch(elements,key);
    
        if (result>=0) System.out.println(elements[result]);
    }
}


class TraceHandler1 implements InvocationHandler
{
    private Object target;

    public TraceHandler1(Object t)
    {
        target =t;
    }

    public Object invoke(Object proxy,Method m,Object[]args) throws Throwable
    {
        System.out.print(target);
        System.out.print("."+m.getName()+"(");
        if(args != null)
            {
                for(int i =0;i<args.length;i++)
                    {
                        System.out.print(args[i]);
                        if(i<args.length -1)System.out.print(", ");
                    }
            }
            System.out.println(")");

            System.out.println(m.invoke(target,args));
            return m.invoke(target,args);
    }
}