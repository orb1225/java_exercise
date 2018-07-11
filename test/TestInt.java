

public class TestInt 
{  
   

   public static void main(String[] args) 
   {
      //这个不是基本类型
      Integer a=-129;
      Integer b=-129;
    //lalalla
      //这个是基本类型
      int c=-129;
      int d=-129;

      System.out.println(a == b); //false
      System.out.println(c == d); //true
   }
}
