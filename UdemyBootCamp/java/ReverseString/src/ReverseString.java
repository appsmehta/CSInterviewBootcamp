
public class ReverseString {

	public static void main(String[] args) {
		
	}
	
	public String reverse (String str) {
		String reversed = "";
		
		char[] chars = str.toCharArray();
		for (int i = chars.length ; i > 0 ; i--)
		{
			reversed = reversed + chars[i-1];
		}
		return reversed;
	}
}
