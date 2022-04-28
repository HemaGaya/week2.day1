package week2.day1;



public class ReverseEven
{

	public static void main(String[]args) {
String test="I am a software  tester";
		String[] arr = test.split(" ");
		for (int i = 0; i < arr.length; i++) {
			if(i%2==0) {
				System.out.println(arr[i]);
				System.out.println(" ");
			}
			else {
				char[] charArray = arr[i].toCharArray();
				for (int j = charArray.length-1; j>=0; j--) {
					System.out.println(charArray[j]);
				}
				System.out.println(" ");
			}
		}
	}
}