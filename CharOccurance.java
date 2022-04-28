package week2.day1;
public class CharOccurance
{
public static void main(String[]args)
{
String str = "welcome to chennai";
int count=0;
for(char character:str.toCharArray()) {
if(character=='e')
{
count++;
}
}
System.out.println(count);

}}