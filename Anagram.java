package week2.day1;
import java.util.Arrays;
public class Anagram {
 public static void main(String[]args) {
String text1="night";
String text2="thing";
if(text1.length()==text2.length())
{
char[] character=text1.toCharArray();
char[] character1=text2.toCharArray();
Arrays.sort(character);
Arrays.sort(character1);
boolean result = Arrays.equals(character, character1);
if(result)
{
System.out.println(text1 + " and " + text2 + " are anagram.");
}
else
{
System.out.println(text1 + " and " + text2 + " are not anagram.");
}}}}