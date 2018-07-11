package objectAnalyzer;

import java.util.ArrayList;


public class ObjectAnalyzerTest1
{
    public static void main(String[] args)
    {
        ArrayList<Integer> squares = new ArrayList<>();
        for (int i = 1; i <= 5; i++)
            squares.add(i * i);
        Integer s=500;
        squares.add(s);
        System.out.println(new ObjectAnalyzer1().toString(squares));
    }
}


/*

java.util.ArrayList[elementData=class 
                    java.lang.Object[]{java.lang.Integer[value=1][][],
                                       java.lang.Integer[value=4][][],
                                       java.lang.Integer[value=9][][],
                                       java.lang.Integer[value=16][][],
                                       java.lang.Integer[value=25][][],
                                       null,null,null,null,null},
                                       size=5][modCount=5][][]

*/

/*
java.util.ArrayList[elementData=class 
                    java.lang.Object[]{java.lang.Integer[value=1][][],
                                       java.lang.Integer[value=4][][],
                                       java.lang.Integer[value=9][][],
                                       java.lang.Integer[value=16][][],
                                       java.lang.Integer[value=25][][],
                                       java.lang.Integer[value=500][][],
                                       null,null,null,null},size=6][modCount=6][][]

*/