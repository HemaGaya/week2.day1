package week2.day1;
public class Basics
{
	public static void main(String[] args)
	{

String text="hi";//it will cut front and back space 
String rest=" sivakumar ramu   ";
System.out.println(text);
System.out.println(rest.trim());
	

//print e=2
String text1="Testleaf";
char[] CharArray=text1.toCharArray();
int count=0;
for(int i=0;i<CharArray.length;i++)
if(CharArray[i]=='e')
{
count++;
}
{
System.out.println("count e="+count);
}
//print starts with  capsT	and small t

String name="TestLeaf is Located in twin tower";
	String[] split=name.split(" ");
	{
	for(int i=0;i<split.length;i++)
	{
		if(split[i].startsWith("t")||split[i].startsWith("T"))
		{
   System.out.println(split[i]);
}}}
	
	
	
	
	//lowercase
	String text2="CHENNAI";
	String lowerCase=text2.toLowerCase();
	System.out.println(lowerCase);
	//uppercase
	String text3="hema siva";
	String upperCase=text3.toUpperCase();
	System.out.println(upperCase);
	//length
	String value="CHENNAI";
	int length=value.length();
	System.out.println(length);
	//concate
	String text4="hema";
	String text5="siva";
	String concat=text4+text5;
	System.out.println(concat);
	//equal
	String name1="Ramu";
	String name2="ramu";
	boolean equal=name1.equals(name2);
	System.out.println(equal);
	//equalsIgnorance
	String name3="Ramu";
	String name4="ramu";
	boolean equalsIgnoranceCase=name3.equalsIgnoreCase(name4);
	System.out.println(equalsIgnoranceCase);
	//contains
	String text6="chennai is too hot";
	boolean contains=text6.contains("chennai");
	System.out.println(contains);
	//equal text
	String text7="test";
	String text8="Test";
	if(text7.equals(text8))
	{
		System.out.println("both are equals");
	}
	else
	{
		System.out.println("not equals");
	}
	String value1="testleaf";
	char[] charArray=value1.toCharArray();
	for (int i=0;i<value1.length();i++)
	{
		System.out.println(charArray[i]);	}
	
}}