//write a program to print "hello" in the method , instance variable and argument passes must be same 

class HelloI{
String word;
public static void main(String args[])
{
HelloI obj=new HelloI();
obj.method("Hello");
}
public void method(String word)
{
this.word=word;
System.out.print(word);
}
}