package objectAnalyzer;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;

public class TestPrimitive
{
public static void main(String[] args){

    Class stringClass=String.class;
    System.out.println("String is primitive type："+stringClass.isPrimitive());

    Class booleanClass=Boolean.class;
    System.out.println("Boolean is primitive type："+booleanClass.isPrimitive());

    Class booleanType=boolean.class;
    System.out.println("boolean is primitive type："+booleanType.isPrimitive());

    Class byteType=byte.class;
    System.out.println("byte is primitive type："+byteType.isPrimitive());

    Class charType=char.class;
    System.out.println("char is primitive type："+charType.isPrimitive());

    Class shortType=short.class;
    System.out.println("short is primitive type："+shortType.isPrimitive());

    Class intType=int.class;
    System.out.println("int is primitive type："+intType.isPrimitive());

    Class longType=long.class;
    System.out.println("long is primitive type："+longType.isPrimitive());

    Class floatType=float.class;
    System.out.println("float is primitive type："+floatType.isPrimitive());

    Class doubleType=double.class;
    System.out.println("double is primitive type："+doubleType.isPrimitive());

    Class DoubleType=Double.class;
    System.out.println("Double is primitive type："+DoubleType.isPrimitive());

    String arr[]=new String[10];
    Class cl = arr.getClass();
    System.out.println(cl.isArray());

    ArrayList<Integer> squares = new ArrayList<>();
    Class c2 = squares.getClass();
    System.out.println(c2.getClass()+"dada");
    System.out.println(c2.isArray());

}
}