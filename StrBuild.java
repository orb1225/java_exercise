public class StrBuild{
public static void main(String[]args){
//有时候需要由较短的字符串构建一个字符串，那假如用+的方式，每次连接字符串，都会构建一个新的String对象，耗时还浪费空间，所以使用StringBuilder可以避免这个问题发生。
StringBuilder builder=new StringBuilder();
String ch="hello";
String sh="helloo";
builder.append(ch);
builder.append(sh);
System.out.println(builder.toString());

}
}
