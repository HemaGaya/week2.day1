package week2.day1;

public class SplitCharacter {
public static void main(String[] args)
{
	
	String name="Testleaf is located in twin towers teynampet";
	String[] split = name.split(" ");
	
	for (int i = 0; i < split.length; i++)
	{
		
		if(split[i].startsWith("T")|| split[i].startsWith("t")) {
			System.out.println(split[i]);
		}
	}
}}